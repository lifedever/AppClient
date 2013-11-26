package cn.net.hlsq.app.model;

public class BaseModel {
	private int id;
	private String tableName;

	public int getId() {
		return id;
	}

	public String getTableName() {
		return tableName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}
