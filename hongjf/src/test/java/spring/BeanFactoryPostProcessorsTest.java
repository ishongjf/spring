package spring;

import com.hongjf.BeanFactoryPostProcessors.A;
import com.hongjf.BeanFactoryPostProcessors.B;
import com.hongjf.BeanFactoryPostProcessors.BeanFactoryPostProcessorConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName BeanFactoryPostProcessorsTest
 * @Author hongjf
 * @Date 2021/5/14 下午1:54
 * @Version 1.0
 */
public class BeanFactoryPostProcessorsTest {

	@Test
	public void propertySourceTest() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfig.class);
		BeanFactoryPostProcessorConfig bean = ac.getBean(BeanFactoryPostProcessorConfig.class);
		System.out.println("");
	}

	@Test
	public void importTest(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfig.class);
		ac.getBean(B.class);
		ac.getBean(A.class);
		System.out.println("");
	}

	@Test
	public void interfacesTest(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfig.class);
		System.out.println("");
	}


	@Test
	public void superclassTest(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfig.class);
		System.out.println("");
	}

}
