package spring;

import com.hongjf.register.Config;
import com.hongjf.beanDefinition.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName BeanDefinitonTest
 * @Author hongjf
 * @Date 2021/5/12 下午4:37
 * @Version 1.0
 */
public class BeanDefinitionTest {

	@Test
	public void createBeanTest() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
	}

	@Test
	public void initMethodTest() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		AnnotatedGenericBeanDefinition beanDefinition = new AnnotatedGenericBeanDefinition(C.class);
		beanDefinition.setInitMethodName("init");
		ac.registerBeanDefinition("c", beanDefinition);
		ac.refresh();
	}

	@Test
	public void propertyValueTest() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		AnnotatedGenericBeanDefinition beanDefinition = new AnnotatedGenericBeanDefinition(C.class);
		beanDefinition.getPropertyValues().add("a", new A());
		ac.registerBeanDefinition("c", beanDefinition);
		ac.refresh();
	}

	@Test
	public void factoryMethodTest() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(A.class);
		AnnotatedGenericBeanDefinition beanDefinition = new AnnotatedGenericBeanDefinition(C.class);
		beanDefinition.setFactoryBeanName("a");
		beanDefinition.setFactoryMethodName("c");
		ac.registerBeanDefinition("c", beanDefinition);
		ac.refresh();
	}

	@Test
	public void dependsOnTest() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		AnnotatedGenericBeanDefinition a = new AnnotatedGenericBeanDefinition(A.class);
		a.setDependsOn("c");
		ac.registerBeanDefinition("a", a);
		AnnotatedGenericBeanDefinition c = new AnnotatedGenericBeanDefinition(C.class);
		ac.registerBeanDefinition("c", c);
		ac.refresh();
	}

	@Test
	public void constructorTest() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		AnnotatedGenericBeanDefinition c = new AnnotatedGenericBeanDefinition(C.class);
		c.getConstructorArgumentValues().addIndexedArgumentValue(0, "hhhh");
		c.getConstructorArgumentValues().addIndexedArgumentValue(1, "jjjj");
		ac.registerBeanDefinition("c", c);
		ac.refresh();
	}

	@Test
	public void constructorTest1() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(A.class, B.class, E.class, F.class);
		AnnotatedGenericBeanDefinition c = new AnnotatedGenericBeanDefinition(C.class);
		c.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
		ac.registerBeanDefinition("c", c);
		ac.refresh();
	}

}
