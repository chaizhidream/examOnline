package com.neuq.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	static Connection con = null;// 创建一个数据库连接
    static PreparedStatement pr = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	static ResultSet rs = null;// 创建一个结果集对象
	
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

	
		try {
			con = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

	public static void CloseConnection(ResultSet rs, PreparedStatement pr, Connection con) {
		try {
			// 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
			// 注意关闭的顺序，最后使用的最先关闭
			if (rs!= null)
				rs.close();
			if (pr != null)
				pr.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//System.out.println("已经关闭数据库连接");
		}
		
	}
	
	

}
