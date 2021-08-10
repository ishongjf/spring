package spring;

import com.hongjf.BeanFactoryPostProcessors.BeanFactoryPostProcessorConfig;
import com.hongjf.BeanFactoryPostProcessors.K;
import com.hongjf.createBean.A;
import org.aopalliance.intercept.Interceptor;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.beans.Introspector;

/**
 * @ClassName GetBeanTest
 * @Author hongjf
 * @Date 2021/5/17 下午5:00
 * @Version 1.0
 */
public class GetBeanTest {

	@Test
	public void beanNamesType(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfig.class);
		String[] beanNamesForType = ac.getBeanNamesForType(K.class);
		System.out.println("");
	}

	@Test
	public void createBean(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(A.class);
		ac.refresh();
	}

}
