package spring;

import com.hongjf.register.Config;
import com.hongjf.register.A1;
import com.hongjf.register.B1;
import com.hongjf.register.MyBeanNameGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName AnnotatedTest
 * @Author hongjf
 * @Date 2021/5/5 下午9:22
 * @Version 1.0
 */
public class AnnotatedTest {


	@Test
	public void scanTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//context.scan("com.hongjf.register");
		context.register(Config.class);
		context.refresh();
		for (String beanDefinitionName : context.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}
	}


	@Test
	public void supplierTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		RootBeanDefinition beanDefinition = new RootBeanDefinition(A1.class);
		//spring使用supplier替代静态工厂方法factory-method
		//使用了supplier之后，spring在创建bean的时候，会调用supplier方法创建对象，而不会根据beanDefinition的class创建
		//所以supplier只会创建一个对象
		beanDefinition.setInstanceSupplier(A1::createB1);
		context.registerBeanDefinition("a1", beanDefinition);
		context.refresh();
//		context.getBean(A1.class);
		context.getBean(B1.class);
		System.out.println("");
	}

	@Test
	public void beanNameTestGenerator() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//设置bean的名称生成策略
		context.setBeanNameGenerator(new MyBeanNameGenerator());
		context.register(A1.class);
		context.refresh();
		System.out.println("");
	}

}
