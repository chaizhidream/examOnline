package com.neuq.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 数据库连接类，配置文件为“db.properties”
 *
 */
public class DBUtil {
	private static Properties prt = null;
	private static String driver = null;
	private static String url = null;
	private static String user = null;
	private static String pwd = null;

	static {
	
		try {
			prt = new Properties();
			InputStream in = DBUtil.class.getClassLoader().getResourceAsStream("com/neuq/db/db.properties");
            prt.load(in);
			driver = prt.getProperty("driver");
			url = prt.getProperty("url");
			user = prt.getProperty("user");
			pwd = prt.getProperty("pwd");
			Class.forName(driver);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

}
