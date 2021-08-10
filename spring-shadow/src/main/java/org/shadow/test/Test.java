package org.shadow.test;

import lombok.extern.slf4j.Slf4j;
import org.shadow.dao.MDao;
import org.shadow.dao.MemberDao;
import org.shadow.util.CInvocationHandler;
import org.shadow.util.ProxyCustom;

/**
 * 静态代理的缺点：
 * 1、会产生很多的代理类
 * 2、产生的代理类只能代理既定的接口
 *
 *
 */
@Slf4j(topic = "e")
public class Test {

	public static void main(String[] args) {
		MDao mDao = new MemberDao();


		/**
		 * newProxyInstance
		 * 1、他会产生一段字符串 代理类的源码
		 * 2、把这个字符串输出到一个.java（$Proxy.java）文件当中
		 * 3、会把这个$Proxy.java动态编译他成为一个$Proxy.class
		 * 4、会通过一个类加载器把这个$Proxy.class加载到JVM当中
		 * 5、Class.foranme("xxxx").newInstance 反射实例化这个对象 proxyObject
		 *
		 * 6----直接产生了再内存当中字节码
		 *
		 */

//		CInvocationHandler cInvocationHandler = new CInvocationHandlerImpl(new MemberDao());
//
//		MDao cdao = (MDao) ProxyCustom.createProxy(MDao.class,cInvocationHandler);
//		System.out.println(cdao.query(1, "zlzlzl"));


//		MDao.class.getMethod("del",new Class[]{int.class,String.class});
//
//		Mdao.class.getMethod("query",new Class[]{int.class,String.class});
//
//
//		MDao dao = (MDao) Proxy.newProxyInstance(Test.class.getClassLoader(),
//						new Class[]{MDao.class},
//						new CustomInvocationHandler(mDao));
//
//
//
//
//
//		log.debug(dao.query(1,"aaa"));


	}
}
