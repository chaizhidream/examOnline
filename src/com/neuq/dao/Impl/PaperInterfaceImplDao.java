package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuq.bean.Mistakes;
import com.neuq.bean.Paper;
import com.neuq.dao.I.PaperInterfaceDao;
import com.neuq.db.DBUtil;

public class PaperInterfaceImplDao implements PaperInterfaceDao{
	private static Connection con = DBUtil.getConnection();
	private static PreparedStatement pst = null;
	private static ResultSet rs = null;
	boolean b=false;
	@Override
	public boolean insert(Paper paper) {
		 String sql="insert into  Paper values (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	        try {
				pst=con.prepareStatement(sql);			
	        	pst.setDate(1, paper.getStarttime());
				pst.setDate(2, paper.getEndtime());
				pst.setString(3, paper.getPapername());
				pst.setInt(4, paper.getXzt1());
				pst.setInt(5, paper.getXzt2());
				pst.setInt(6, paper.getXzt3());
				pst.setInt(7, paper.getXzt3());
				pst.setInt(8, paper.getXzt4());
				pst.setInt(9, paper.getXzt5());
				pst.setInt(10, paper.getXzt6());
				pst.setInt(11, paper.getTkt1());
				pst.setInt(12, paper.getTkt2());
				pst.setInt(13, paper.getTkt3());
				pst.setInt(14, paper.getTkt4());
				pst.setInt(15, paper.getTkt5());
				pst.setInt(16, paper.getTkt6());
				pst.setInt(17, paper.getBct1());
				pst.setInt(18, paper.getBct2());				
				int n=pst.executeUpdate();		
				if(n>0) {
					b=true;
				}
	        	} catch (SQLException e) {
					e.printStackTrace();
				}
	        finally {
				DBUtil.CloseConnection(rs, pst, con);
			}
			return b;
	}

	@Override
	public boolean delete(Paper paper) {
		String sql = "delete from Paper  where id = ? ";
		try {
		pst=con.prepareStatement(sql);
		pst.setInt(1, paper.getId());
		int n = pst.executeUpdate();
		if(n>0) {
			b = true;
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pst, con);
		}
		return b;
	}

	//@Override
	//public boolean update(Paper paper) {
		
	//}

	@Override
	public List<Paper> select() {
		Paper pap=new Paper();
		List<Paper> list  = new ArrayList<Paper>();	
		String sql = "select * from Paper";
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			if(rs.next()) {
				pap.setId(rs.getInt(1));
				pap.setStarttime(rs.getDate(2));
				pap.setEndtime(rs.getDate(3));
				pap.setPapername(rs.getString(4));
				pap.setXzt1(rs.getInt(5));
				pap.setXzt2(rs.getInt(6));
				pap.setXzt3(rs.getInt(7));
				pap.setXzt4(rs.getInt(8));
				pap.setXzt5(rs.getInt(9));
				pap.setXzt6(rs.getInt(10));
				pap.setTkt1(rs.getInt(11));
				pap.setTkt2(rs.getInt(12));
				pap.setTkt3(rs.getInt(13));
				pap.setTkt4(rs.getInt(14));
				pap.setTkt5(rs.getInt(15));
				pap.setTkt6(rs.getInt(16));
				pap.setBct1(rs.getInt(17));
				pap.setBct2(rs.getInt(18));
				list.add(pap);
		}} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pst, con);
		}
		return list;
	}

	@Override
	public List<Paper> select(String questionpoint) {
		Paper pap=new Paper();
		List<Paper> list  = new ArrayList<Paper>();	
		String sql = "select * from Paper where questionpoint=?";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, questionpoint);
			rs = pst.executeQuery();
			if(rs.next()) {
				pap.setId(rs.getInt(1));
				pap.setStarttime(rs.getDate(2));
				pap.setEndtime(rs.getDate(3));
				pap.setPapername(rs.getString(4));
				pap.setXzt1(rs.getInt(5));
				pap.setXzt2(rs.getInt(6));
				pap.setXzt3(rs.getInt(7));
				pap.setXzt4(rs.getInt(8));
				pap.setXzt5(rs.getInt(9));
				pap.setXzt6(rs.getInt(10));
				pap.setTkt1(rs.getInt(11));
				pap.setTkt2(rs.getInt(12));
				pap.setTkt3(rs.getInt(13));
				pap.setTkt4(rs.getInt(14));
				pap.setTkt5(rs.getInt(15));
				pap.setTkt6(rs.getInt(16));
				pap.setBct1(rs.getInt(17));
				pap.setBct2(rs.getInt(18));
				list.add(pap);
		}} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pst, con);
		}
		return list;
	}

}
