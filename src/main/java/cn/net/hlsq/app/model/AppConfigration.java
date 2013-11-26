package cn.net.hlsq.app.model;

/**
 * 配置文件
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月26日 下午4:02:04
 */
public class AppConfigration extends BaseModel {
	private static AppConfigration instance = null;
	private String type;

	public AppConfigration() {
		this.setTableName("configration");
	}

	public static synchronized AppConfigration getInstance() {
		if (instance == null) {
			instance = new AppConfigration();
		}
		return instance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
