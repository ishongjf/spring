package spring;

import com.hongjf.initialize.Config;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName InitializeTest
 * @Author hongjf
 * @Date 2021/7/18 下午2:10
 * @Version 1.0
 */
public class InitializeTest {

	@Test
	public void initializeTest() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
	}

}
