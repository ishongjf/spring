package com.shadow.util;

import com.shadow.info.UserInfo;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class BeanInfoUtil {
	public static void setProperty(UserInfo userInfo, String userName)throws Exception{
		PropertyDescriptor propDesc=new PropertyDescriptor(userName,UserInfo.class);
		Method methodSetUserName=propDesc.getWriteMethod();
		methodSetUserName.invoke(userInfo, "son road ");
		System.out.println("set userName:"+userInfo.getUserName());
	}


	public static void setPropertyByIntrospector(UserInfo userInfo,String userName)throws Exception{
		BeanInfo beanInfo= Introspector.getBeanInfo(UserInfo.class);
		PropertyDescriptor[] proDescrtptors=beanInfo.getPropertyDescriptors();
		if(proDescrtptors!=null&&proDescrtptors.length>0){
			for(PropertyDescriptor propDesc:proDescrtptors){
				if(propDesc.getName().equals(userName)){
					Method methodSetUserName=propDesc.getWriteMethod();
					methodSetUserName.invoke(userInfo, "alan");
					System.out.println("set userName:"+userInfo.getUserName());
					break;
				}
			}
		}
	}


}
