package cn.net.hlsq.app.constant;

/**
 * properties配置文件枚举
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月23日 下午3:38:28
 */
public enum PropEnum {
	MAIN("main");// 软件信息

	private String propName;

	public String getPropName() {
		return propName;
	}

	public void setPropName(String propName) {
		this.propName = propName;
	}

	PropEnum(String propName) {
		this.propName = propName;
	}
}
