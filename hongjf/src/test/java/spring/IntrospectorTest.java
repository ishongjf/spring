package spring;

import com.hongjf.introspector.Config;
import com.hongjf.introspector.User;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Introspector
 * @Author hongjf
 * @Date 2021/5/22 下午7:37
 * @Version 1.0
 */
@Slf4j
public class IntrospectorTest {

	Map<String, PropertyDescriptor> propertyDescriptorMap = new HashMap<>(16);

	@SneakyThrows
	@Test
	public void introspectorTest() {
		User user = new User();
		BeanInfo beanInfo = Introspector.getBeanInfo(User.class);
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
			propertyDescriptorMap.put(propertyDescriptor.getName(), propertyDescriptor);
		}
		PropertyDescriptor age = propertyDescriptorMap.get("age");
		Method writeMethod = age.getWriteMethod();
		writeMethod.invoke(user, 18);
		Method readMethod = age.getReadMethod();
		Object read = readMethod.invoke(user);
		log.info(">>>>>>>>user:[{}]", user);
		log.info(">>>>>>>>read:[{}]", read);
	}

	@Test
	public void springInject(){
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
	}

}
