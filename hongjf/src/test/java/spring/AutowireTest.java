package spring;

import com.hongjf.autowire.A;
import com.hongjf.autowire.Config;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName AutowireTest
 * @Author hongjf
 * @Date 2021/7/6 下午1:29
 * @Version 1.0
 */
public class AutowireTest {

	@Test
	public void autowireByType(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(Config.class);
		ac.refresh();
		A a = (A) ac.getBean("a");
		a.print();
	}

}
