package cn.net.hlsq.app.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring bean工具类
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月23日 下午7:00:06
 */
public final class BeanUtils {
	private static ApplicationContext applicationContext;
	static {
		applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
	}

	public static Object getBean(String beanName) {
		return applicationContext.getBean(beanName);
	}
}
