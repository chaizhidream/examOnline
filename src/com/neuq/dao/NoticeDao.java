package com.neuq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neuq.db.DBUtil;


public class NoticeDao {
	public boolean update(String information) throws SQLException {
		Connection con = DBUtil.getConnection();
	    PreparedStatement pst = null;
		String sql="update  notice set information=?";
		pst=con.prepareStatement(sql);
		pst.setString(1, information);
		int n = pst.executeUpdate();		
		return n>0;
}
	
	
	public String select() throws SQLException {
		String information=null;
		Connection con = DBUtil.getConnection();
	    PreparedStatement pst = null;
		String sql="select * from notice";
		pst=con.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		if (rs.next()) {
			information=rs.getString(1);
		}
		
		return information;
		}
}
