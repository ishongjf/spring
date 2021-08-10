package spring;

import com.hongjf.constructor.Config;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName ConstructorTest
 * @Author hongjf
 * @Date 2021/6/25 下午4:17
 * @Version 1.0
 */
@Slf4j
public class ConstructorTest {

	@Test
	public void constructorTest() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		log.info(">>>>>>>>>>>>>>>>>>>>");
	}

	/**
	 * 基于构造方法的循环引用测试
	 * 测试类：F、G、CircularDependenciesFactoryPostProcessor
	 */
	@Test
	public void circularDependencies() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		log.info(">>>>>>>>>>>>>>>>>>>>");
	}

}
