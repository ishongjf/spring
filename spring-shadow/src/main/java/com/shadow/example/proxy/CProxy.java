package com.shadow.example.proxy;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

public class CProxy {
	public static Object newProxyInstance(Class infce, CInvocationHandler h) throws Exception { //JDK6 Complier API, CGLib, ASM
		String methodStr = "";
		String rt = "\r\n";
		String tab= "\t";
		String r="\n";

		Method[] methods = infce.getMethods();

		String rtype="";
		int args=0;

		for(Method m : methods) {
			String argsStr="";
			String argsValueStr="";
			int parameterCount = m.getParameterCount();
			Class[] classesParamArr=null;
			String getMethodParamStr= "new Class[]{";
			if (parameterCount>0){
				classesParamArr= new Class[parameterCount];
				Class<?>[] parameterTypes = m.getParameterTypes();
				int pc=0;
				for (Class<?> parameterType : parameterTypes) {
					//classesParamArr[pc]=parameterType;
					getMethodParamStr+=parameterType.getSimpleName()+".class,";
					argsStr+=parameterType.getSimpleName()+" p"+pc+",";
					argsValueStr+="p"+pc+",";
					pc++;
				}
				getMethodParamStr= getMethodParamStr.substring(0,getMethodParamStr.length()-1);
				getMethodParamStr+="}";
				argsStr=argsStr.substring(0,argsStr.length()-1);
				argsValueStr=argsValueStr.substring(0,argsValueStr.length()-1);
			}
			rtype=m.getReturnType().getSimpleName();
			String returnStr= "";
			if(!rtype.equals("void")){
				returnStr ="return ";
			}
			methodStr += tab+"@Override" + rt +
					tab+"public " + rtype +" "+ m.getName() + "("+argsStr+") {" + rt +
					tab+tab+"try {" + rt +
					tab+tab+tab+"Method md = " + infce.getSimpleName() + ".class.getMethod(\"" + m.getName() + "\","+getMethodParamStr+");" + rt +
					tab+tab+tab+returnStr+" h.invoke(this, md,new Object[]{"+argsValueStr+"}).toString();" + rt +
					tab+tab+"}catch(Exception e) {"+rt+
					tab+tab+tab+"e.printStackTrace();" + r + tab+tab+"}"+r+
					tab+tab+"return null;"+r+
					tab+"}";
		}

		String src =
				"package com.shadow.proxy;" +  rt +
						"import java.lang.reflect.Method;" + rt +
						"import "+infce.getName()+";" + rt +
						"import com.shadow.example.proxy.CInvocationHandler;" + rt +
						"public class $Proxy1 implements " + infce.getSimpleName() + "{" + rt +
						"\tCInvocationHandler h;" + rt +
						"    public $Proxy1(CInvocationHandler h) {" + rt +
						"        this.h = h;" + rt +
						"    }" + rt +




						methodStr +
						"\n}";
		File root = new File("d:/com/shadow/proxy/");
		if(!root.exists()){
			root.mkdirs();
		}
		String fileName =
				"d:/com/shadow/proxy/$Proxy1.java";
		File f = new File(fileName);
		if(!f.exists()){
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();

		//compile
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(fileName);
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		t.call();
		fileMgr.close();

		//load into memory and create an instance
		URL[] urls = new URL[] {new URL("file:/d:/")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.shadow.proxy.$Proxy1");
		System.out.println(c);

		Constructor ctr = c.getConstructor(CInvocationHandler.class);
		Object m = ctr.newInstance(h);
		//m.move();

		return m;
	}
}