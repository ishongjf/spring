package spring;

import com.hongjf.transaction.Config;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName TransactionTest
 * @Author hongjf
 * @Date 2021/7/7 下午10:06
 * @Version 1.0
 */
public class TransactionTest {

	@Test
	public void test(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
	}

}
