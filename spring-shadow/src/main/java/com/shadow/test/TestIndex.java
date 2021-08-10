package com.shadow.test;

import com.shadow.info.UserInfo;
import com.shadow.util.BeanInfoUtil;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;
import xx.B;
import com.shadow.app.Appconfig;
import com.shadow.service.IndexService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j(topic = "e")
public class TestIndex {
	public static void main(String[] args) {

		/*try {
			BeanInfoUtil.setPropertyByIntrospector(new UserInfo(),"userName");
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		AnnotationConfigApplicationContext
				ac
				= new AnnotationConfigApplicationContext(Appconfig.class);
////
//		GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
//		genericBeanDefinition.setBeanClass(B.class);
//
//
//		AnnotatedGenericBeanDefinition ag= new AnnotatedGenericBeanDefinition(B.class);
//		AnnotationMetadata metadata = ag.getMetadata();
//		log.debug(Component.class.getSimpleName()+"");
//		System.out.println(metadata.hasAnnotation("org.springframework.stereotype.Component"));
//		log.debug("serviceName-{}");
	}
}
