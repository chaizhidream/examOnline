package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.neuq.bean.Student;
import com.neuq.dao.I.StudentInterfaceDao;
import com.neuq.db.DBUtil;

public class StudentInterfaceImplDao implements StudentInterfaceDao{
	private static PreparedStatement pst = null;
	private static ResultSet rs = null;
	boolean b=false;
	@Override
	/**
	 *查询学生信息
	 */
	public Student select(Student s,Connection con) throws SQLException {
		Student info=new Student();
		String sql = "select * from Student where username = ?";
		pst = con.prepareStatement(sql);
		pst.setString(1, s.getUsername());
		rs = pst.executeQuery();
		if(rs.next()) {
			info.setUsername(rs.getString(2));
			info.setPwd(rs.getString(3));
			info.setName(rs.getString(4));
			info.setSex(rs.getString(5));
			info.setStudentclass(rs.getString(6));
			info.setTelephone(rs.getString(7));
			info.setEmail(rs.getString(8));
		}
		DBUtil.CloseConnection(rs, pst, con);
		return info;
	}

	@Override
	/**
	 * 增加学生
	 */
	public boolean insert(Student s, Connection con) throws SQLException {
		String sql = "insert into Student values (null,?,?,?,?,?,?,?,3)";
		pst=con.prepareStatement(sql);
		pst.setString(1, s.getUsername());
		pst.setString(2, s.getPwd());
		pst.setString(3, s.getName());
		pst.setString(4, s.getSex());
		pst.setString(5, s.getStudentclass());
		pst.setString(6,s.getTelephone());
		pst.setString(7,s.getEmail());
		int n = pst.executeUpdate();
		if(n>0) {
			b = true;
		}
		DBUtil.CloseConnection(rs, pst, con);
		return b;
	}

	@Override
	/**
	 * 修改学生信息
	 */
	public boolean updata(Student s, Connection con) throws SQLException {
		String sql = "updata Student set pwd = ? where username = ?";
		pst=con.prepareStatement(sql);
		pst.setString(1, s.getPwd());
		pst.setString(2, s.getUsername());
		int n = pst.executeUpdate();
		if(n>0) {
			b = true;
		}
		DBUtil.CloseConnection(rs, pst, con);
		return b;
	}

	@Override
	/**
	 * 删除学生
	 */
	public boolean delete(Student s, Connection con) throws SQLException {
		String sql = "delete from Student  where username = ?";
		pst=con.prepareStatement(sql);
		pst.setString(1, s.getUsername());
		int n = pst.executeUpdate();
		if(n>0) {
			b = true;
		}
		DBUtil.CloseConnection(rs, pst, con);
		return b;
	}

	@Override
	public Student login(String username, String pwd) throws SQLException {
		Connection con = DBUtil.getConnection();
		Student info=new Student();
		String sql = "select * from Student where username = ? and pwd=?";
		pst = con.prepareStatement(sql);
		pst.setString(1, username);
		pst.setString(2,pwd);
		rs = pst.executeQuery();
		if(rs.next()) {
			info.setUsername(rs.getString(2));
			info.setPwd(rs.getString(3));
			info.setName(rs.getString(4));
			info.setSex(rs.getString(5));
			info.setStudentclass(rs.getString(6));
			info.setTelephone(rs.getString(7));
			info.setEmail(rs.getString(8));
		}
		DBUtil.CloseConnection(rs, pst, con);
		return info;
	}



}
