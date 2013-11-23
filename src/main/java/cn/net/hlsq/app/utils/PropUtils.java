package cn.net.hlsq.app.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 获得常量信息的工具类
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月23日 下午3:22:19
 */
public final class PropUtils {
	private static String root = "/cn/net/hlsq/conf/";
	private static Properties prop = null;
	private static String propName = null;

	public static String getValue(String fileName, String key) {

		if (fileName != null && !fileName.equals(propName)) {
			propName = fileName;
			prop = new Properties();
			try {
				prop.load(getInputStream(propName));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return prop.getProperty(key);
	}

	private static InputStream getInputStream(String fileName) throws FileNotFoundException {
		return new FileInputStream(PropUtils.class.getResource("/").getPath() + root
				+ (fileName.endsWith(".properties") ? fileName : fileName + ".properties"));
	}

	public static void main(String[] args) {
		System.out.println(PropUtils.getValue("main", "app.name"));
	}
}
