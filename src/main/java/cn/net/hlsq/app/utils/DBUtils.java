package cn.net.hlsq.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 数据库连接工具类
 * 
 * @author gefangshuai
 * @email gefangshuai@163.com
 * @createDate 2013年11月23日 下午2:56:00
 */
public final class DBUtils {
	static {
		String driver = "org.sqlite.JDBC";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 打开连接
	 * 
	 * @author gefangshuai
	 * @return
	 */
	public static Connection getConnection() {
		String url = "jdbc:sqlite:app.db";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	/**
	 * 关闭连接
	 * 
	 * @author gefangshuai
	 * @param rs
	 * @param stmt
	 * @param con
	 */
	public static void close(ResultSet rs, Statement stmt, Connection con) {
		try {
			if (rs != null)
				rs.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			if (stmt != null)
				stmt.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			if (con != null)
				con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * 打印查询结果
	 * 
	 * @author gefangshuai
	 * @param rs
	 */
	public static void printRs(ResultSet rs) {
		try {
			StringBuffer sb = new StringBuffer();
			ResultSetMetaData meta = rs.getMetaData();
			int cols = meta.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= cols; i++) {
					sb.append(meta.getColumnName(i) + "->");
					sb.append(rs.getString(i) + "  ");
				}
				sb.append("\n");
			}
			System.out.print(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
