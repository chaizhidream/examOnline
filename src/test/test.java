package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neuq.bean.Paper;
import com.neuq.db.DBUtil;
import com.neuq.util.QuestionInstance;

public class test {
public static void main(String[] args) {
	Connection connection=DBUtil.getConnection();
	Paper p=new Paper(); 
	String sql="select * from paper";
	
	try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
	ResultSet rs=preparedStatement.executeQuery();
	while (rs.next()) {
	
		System.out.println(rs.getInt(1));
		System.out.println(rs.getDate(2));
		System.out.println(rs.getDate(3));
		System.out.println(rs.getString(4));

		for (int i = 5; i < 22; i++) {
			System.out.println(rs.getInt(i));
		}
		
		
		 p.setId(rs.getInt(1));
		 p.setStarttime(rs.getDate(2));
		 p.setEndtime(rs.getDate(3));
		 p.setPapername(rs.getString(4));
		 p.setXzt1(rs.getInt(5));
		 p.setXzt2(rs.getInt(6));
		 p.setXzt3(rs.getInt(7));
		 p.setXzt4(rs.getInt(8));
		 p.setXzt5(rs.getInt(9));
		 p.setXzt6(rs.getInt(10));
		 p.setXzt7(rs.getInt(11));
		 p.setXzt8(rs.getInt(12));
		 p.setXzt9(rs.getInt(13));
		 p.setXzt10(rs.getInt(14));
		 p.setTkt1(rs.getInt(15));
		 p.setTkt2(rs.getInt(16));
		 p.setTkt3(rs.getInt(17));
		 p.setTkt4(rs.getInt(18));
		 p.setTkt5(rs.getInt(19));
		 p.setBct1(rs.getInt(20));
		 p.setBct2(rs.getInt(21));		
	System.out.println(p.toString());
	System.out.println(QuestionInstance.changeToPaperString(p).toString());
	}
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
