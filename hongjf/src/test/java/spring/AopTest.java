package spring;

import com.hongjf.aop.A;
import com.hongjf.aop.C;
import com.hongjf.aop.Config;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName AopTest
 * @Author hongjf
 * @Date 2021/6/20 下午3:15
 * @Version 1.0
 */
public class AopTest {

	@Test
	public void aopTest() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		C bean = ac.getBean(C.class);
		C bean1 = ac.getBean(C.class);
		bean.printf();

	}

}
