package com.neuq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neuq.db.DBUtil;

/**
 * 取得MySQL插入数据后自增长的ID值,暂时用不到，以后再说
 * @author chaizhi
 *
 */
public class GetLastInsertId {
	
	
public static int getLastInsertId(String tablename) {
	   
	int id=0;
	//取得最近一次插入的ID值，高并发状态下不可以
	String sql="select max(id) from ?";
	Connection con=DBUtil.getConnection();
	PreparedStatement ps=null;
	ResultSet rs=null;
	try {
		ps = con.prepareStatement(sql);
		ps.setString(1, tablename);
	    rs=ps.executeQuery();
		
		while (rs.next()) {
			id=rs.getInt("id");
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		DBUtil.CloseConnection(rs, ps, con);
	}
	return id;
	
}


}
