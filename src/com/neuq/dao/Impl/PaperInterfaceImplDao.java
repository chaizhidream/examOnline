package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	        	pst.setDate(1, (java.sql.Date)paper.getStarttime());
				pst.setDate(2, (java.sql.Date)paper.getEndtime());
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
			while(rs.next()) {
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
			while(rs.next()) {
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
	public List<Paper> showbeforePaper() {
		//已经结束的考试
		List<Paper> before=new ArrayList<Paper>();
		//设置日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// new Date()为获取当前系统时间
		String d=df.format(new Date());		
		String sql="select * from paper";
		Connection con=DBUtil.getConnection();
		PreparedStatement pr =null;
		ResultSet rs =null;
		Paper p=new Paper();
		try {
			 pr = con.prepareStatement(sql);
			 rs = pr.executeQuery();
			 while (rs.next()) {
				//对象赋值
				 //17个对象
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
				 p.setTkt1(rs.getInt(11));
				 p.setTkt2(rs.getInt(12));
				 p.setTkt3(rs.getInt(13));
				 p.setTkt4(rs.getInt(14));
				 p.setTkt5(rs.getInt(15));
				 p.setTkt6(rs.getInt(16));
				 p.setBct1(rs.getInt(17));
				 p.setBct2(rs.getInt(18));
				if (p.getStarttime().toString().compareTo(d)<0) {
					before.add(p);
				}
			 }		 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
            DBUtil.CloseConnection(rs, pr, con);
		}
		return before;	
	}
	@Override
	public List<Paper> showafterPaper() {
		//未来的考试
		List<Paper> after=new ArrayList<Paper>();
		//设置日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// new Date()为获取当前系统时间
		String d=df.format(new Date());		
		String sql="select * from paper";
		Connection con=DBUtil.getConnection();
		PreparedStatement pr =null;
		ResultSet rs =null;
		Paper p=new Paper();
		try {
			 pr = con.prepareStatement(sql);
			 rs = pr.executeQuery();
			 while (rs.next()) {
				//对象赋值
				 //17个对象
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
				 p.setTkt1(rs.getInt(11));
				 p.setTkt2(rs.getInt(12));
				 p.setTkt3(rs.getInt(13));
				 p.setTkt4(rs.getInt(14));
				 p.setTkt5(rs.getInt(15));
				 p.setTkt6(rs.getInt(16));
				 p.setBct1(rs.getInt(17));
				 p.setBct2(rs.getInt(18));
				 if (p.getStarttime().toString().compareTo(d)>0) {
					after.add(p);
				}}}	 
		 catch (SQLException e) {
			e.printStackTrace();
		} finally {
            DBUtil.CloseConnection(rs, pr, con);
		}
		return after;	
	}
	
	@Override
	public List<Paper> shownowPaper() {
		//当前可以进行的考试
		List<Paper> now=new ArrayList<Paper>();
		//设置日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// new Date()为获取当前系统时间
		String d=df.format(new Date());		
		String sql="select * from paper";
		Connection con=DBUtil.getConnection();
		PreparedStatement pr =null;
		ResultSet rs =null;
		Paper p=new Paper();
		try {
			 pr = con.prepareStatement(sql);
			 rs = pr.executeQuery();
			 while (rs.next()) {
				//对象赋值
				 //17个对象
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
				 p.setTkt1(rs.getInt(11));
				 p.setTkt2(rs.getInt(12));
				 p.setTkt3(rs.getInt(13));
				 p.setTkt4(rs.getInt(14));
				 p.setTkt5(rs.getInt(15));
				 p.setTkt6(rs.getInt(16));
				 p.setBct1(rs.getInt(17));
				 p.setBct2(rs.getInt(18));				
				if(p.getStarttime().toString().compareTo(d)<0&&p.getEndtime().toString().compareTo(d)>0) {
					now.add(p);						 		 
		} }}catch (SQLException e) {
			e.printStackTrace();
		} finally {
            DBUtil.CloseConnection(rs, pr, con);
		}
		return now;	
	}

}
