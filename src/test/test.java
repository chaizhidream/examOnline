package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neuq.db.DBUtil;

public class test {
public static void main(String[] args) {
	Connection connection=DBUtil.getConnection();
	String sql="select * from studentgrade";
	try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
	ResultSet rS=preparedStatement.executeQuery();
	while (rS.next()) {
		System.out.println(rS.getString("score"));
	}
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
