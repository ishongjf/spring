package org.shadow.util;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ProxyCustom {

	/**
	 * 他能返回一个对象--符合我们期望的代理对象
	 * class文件
	 * java 文件
	 * 代码
	 *
	 * io 把我们的代码写道一个.java文件当中，然后再手动把这个。java文件编译
	 * 编译完成之后肯定会产生一个.class文件，继而把这个class文件loader到JVM当中
	 * 然后通过反射区实例化这个对象，最终返回出去
	 *
	 * @return
	 */
	public static Object createProxy(Class infce,CInvocationHandler cInvocationHandler){
		//方法的字符串
		String methodStr = "";
		//换行+一个tab
		String rt = "\r\n";
		String tab= "\t";
		String r="\n";

		//获取接口当中的所有方法，方便后面遍历方法构建代理类的字符串
		Method[] methods = infce.getMethods();
		//每个方法的返回类型
		String rtype="";
		//表示该方法有几个参数
		int args=0;

		for(Method m : methods) {
			//得到方法的返回类型的字符串
			rtype=m.getReturnType().getSimpleName();
			//参数的字符串 有可能有参或者无参-----（mname(int p0,String p1)）
			//int p0,String p1
			String argsStr="";
			//最后执行invoke方法的时候需要传入的参数值
			String argsValueStr="";
			//得到这个方法所有的参数个数
			int parameterCount = m.getParameterCount();
			Class[] classesParamArr=null;
			//再反射得到目标方法的时候需要的参数个数和类型的字符串
			String getMethodParamStr= "new Class[]{";
			if (parameterCount>0){
				classesParamArr= new Class[parameterCount];
				//得到所有的参数个数和类型
				Class<?>[] parameterTypes = m.getParameterTypes();
				int pc=0;
				for (Class<?> parameterType : parameterTypes) {
					//classesParamArr[pc]=parameterType;
					getMethodParamStr+=parameterType.getSimpleName()+".class,";
					argsStr+=parameterType.getSimpleName()+" p"+pc+",";
					argsValueStr+="p"+pc+",";
					pc++;
				}
				//截取最后一个逗号
				getMethodParamStr= getMethodParamStr.substring(0,getMethodParamStr.length()-1);


				//截取最后一个逗号
				argsStr=argsStr.substring(0,argsStr.length()-1);

				//截取最后一个逗号
				argsValueStr=argsValueStr.substring(0,argsValueStr.length()-1);
			}

			getMethodParamStr+="}";
			boolean flag=false;
			String endReturnStr="";
			String returnStr= "";
			if(!rtype.equals("void")){
				returnStr ="return ";
				endReturnStr ="return null;";
				flag=true;
			}

			String convertStr="";
			if(flag){
				 convertStr ="("+rtype+") ";
			}


			methodStr += r+tab+"@Override" + rt +
					tab+"public " + rtype +" "+ m.getName() + "("+argsStr+") {" + rt +
					tab+tab+"try {" + rt +
					tab+tab+tab+"Method md = " + infce.getSimpleName() + ".class.getMethod(\"" + m.getName() + "\","+getMethodParamStr+");" + rt +

					tab+tab+tab+returnStr+ convertStr+"h.invoke(this, md,new Object[]{"+argsValueStr+"});" + rt +
					tab+tab+"}catch(Exception e) {"+rt+
					tab+tab+tab+"e.printStackTrace();" + r + tab+tab+"}"+r+
					tab+tab+tab+endReturnStr+r+
					tab+"}";
		}

		String src =
				"package org.shadow.proxy;" +  rt +
						"import java.lang.reflect.Method;" + rt +
						"import "+infce.getName()+";" + rt +
						"import org.shadow.util.CInvocationHandler;" + rt +
						"public class $Proxy1 implements " + infce.getSimpleName() + "{" + rt +
						"\tCInvocationHandler h;" + rt +
						"\tpublic $Proxy1(CInvocationHandler h) {" + rt +
						"\t\tthis.h = h;" + rt +
						"\t}" + rt +




						methodStr +
						"\n}";




		//把产生的源代码输出到.java文件当中通过IO

		File root = new File("d:/org/shadow/proxy/");
		if(!root.exists()){
			root.mkdirs();
		}
		String fileName =
				"d:/org/shadow/proxy/$Proxy1.java";
		File f = new File(fileName);
		if(!f.exists()){
			try {
				f.createNewFile();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		FileWriter fw = null;
		try {
			fw = new FileWriter(f);
			fw.write(src);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}



		//把Java原文件编译成class文件
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(fileName);
		JavaCompiler.CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		t.call();
		try {
			fileMgr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


		//从磁盘或者网络上面加载一个类文件到JVM
		URL[] urls = new URL[0];
		try {
			urls = new URL[] {new URL("file:/d:/")};
			URLClassLoader ul = new URLClassLoader(urls);
			Class c = ul.loadClass("org.shadow.proxy.$Proxy1");
			Constructor declaredConstructor = c.getDeclaredConstructor(CInvocationHandler.class);
			Object proxy = declaredConstructor.newInstance(cInvocationHandler);
			return proxy;


		} catch (Exception e) {
			e.printStackTrace();
		}



		//$Proxy1

		return null;
	}
}
