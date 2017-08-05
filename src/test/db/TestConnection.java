package test.db;

import java.sql.Connection;

import com.neuq.db.DBUtil;
/**
 * 用来测试远程数据库连接是否正常
 * @author chaizhi
 *
 */
public class TestConnection {
public static void main(String[] args) {
	Connection con=DBUtil.getConnection();
	System.out.println(con.toString());
}
}
