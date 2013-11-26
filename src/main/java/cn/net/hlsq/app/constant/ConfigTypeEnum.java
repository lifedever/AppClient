package cn.net.hlsq.app.constant;

public enum ConfigTypeEnum {

	LOCAL("1"), // 本地方式
	FTP("2");

	private String type;

	ConfigTypeEnum(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
