package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuq.bean.Mistakes;
import com.neuq.dao.I.MistakesInterfaceDao;
import com.neuq.db.DBUtil;

public class MistakeInterfaceImplDao implements MistakesInterfaceDao{
	private static Connection con = DBUtil.getConnection();
	private static PreparedStatement pst = null;
	private static ResultSet rs = null;
	boolean b=false;
	@Override
	public boolean insert(Mistakes mistakes) {
		
        String sql="insert into  Mistakes values (null,?,?,?)";
        try {
			pst=con.prepareStatement(sql);			
        	pst.setString(1, mistakes.getUsername());
			pst.setString(2, mistakes.getQuestiontype());
			pst.setInt(3, mistakes.getQuestionid());
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
	public boolean delete(Mistakes mistakes) {
		String sql = "delete from Mistakes  where username = ? and questiontype=? and questionid=?";
		try {
		pst=con.prepareStatement(sql);
		pst.setString(1, mistakes.getUsername());
		pst.setString(2, mistakes.getQuestiontype());
		pst.setInt(3, mistakes.getQuestionid());
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

	@Override
	public List<Mistakes> selectxzt(String username) {
		Mistakes mis=new Mistakes();
		List<Mistakes> list  = new ArrayList<Mistakes>();	
		String sql = "select * from Mistakes where username= ? and questiontype = 1";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, username);
			rs = pst.executeQuery();
			while(rs.next()) {
				mis.setId(rs.getInt(1));
				mis.setUsername(rs.getString(2));
				mis.setQuestiontype(rs.getString(3));
				mis.setQuestionid(rs.getInt(4));
				list.add(mis);
		}} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pst, con);
		}
		return list;
	}

	@Override
	public List<Mistakes> select(String username, String questionpoint) {
		Mistakes mis=new Mistakes();
		List<Mistakes> list  = new ArrayList<Mistakes>();	
		String sql = "select * from Mistakes where username= ? and questionpoint=?";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2, questionpoint);
			rs = pst.executeQuery();
			while(rs.next()) {
				mis.setId(rs.getInt(1));
				mis.setUsername(rs.getString(2));
				mis.setQuestiontype(rs.getString(3));
				mis.setQuestionid(rs.getInt(4));
				list.add(mis);
		}} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pst, con);
		}
		return list;
	}



	@Override
	public List<Mistakes> selecttkt(String username) {
		Mistakes mis=new Mistakes();
		List<Mistakes> list  = new ArrayList<Mistakes>();	
		String sql = "select * from Mistakes where username= ? and questiontype = 2";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, username);
			rs = pst.executeQuery();
			while(rs.next()) {
				mis.setId(rs.getInt(1));
				mis.setUsername(rs.getString(2));
				mis.setQuestiontype(rs.getString(3));
				mis.setQuestionid(rs.getInt(4));
				list.add(mis);
		}} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pst, con);
		}
		return list;
	}
/**
 * 编程题错题传入仍需商讨
 */
	@Override
	public List<Mistakes> selectbct(String username) {
		Mistakes mis=new Mistakes();
		List<Mistakes> list  = new ArrayList<Mistakes>();	
		String sql = "select * from Mistakes where username= ? and questiontype = 3";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, username);
			rs = pst.executeQuery();
			while(rs.next()) {
				mis.setId(rs.getInt(1));
				mis.setUsername(rs.getString(2));
				mis.setQuestiontype(rs.getString(3));
				mis.setQuestionid(rs.getInt(4));
				list.add(mis);
		}} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pst, con);
		}
		return list;
	}

}
