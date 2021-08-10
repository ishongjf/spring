package spring;

import com.hongjf.beanPostProcessor.A;
import com.hongjf.beanPostProcessor.Config;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName BeanPostProcessorTest
 * @Author hongjf
 * @Date 2021/5/20 上午11:09
 * @Version 1.0
 */
public class BeanPostProcessorTest {

	@Test
	public void beanPostProcessorTest(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		context.getBean(A.class).printf();
		context.close();
	}

}
