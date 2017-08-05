package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.Student;
import com.neuq.dao.I.StudentInterfaceDao;
import com.neuq.db.DBUtil;

public class StudentInterfaceImplDao implements StudentInterfaceDao{

	@Override
	/**
	 *查询学生信息
	 */
	public Student select(Student s,Connection con) throws SQLException {
		// TODO Auto-generated method stub
		Student info=new Student();
		PreparedStatement pst=null;
		ResultSet rs = null;
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
		pst.close();
		rs.close();
		return info;
	}

	@Override
	/**
	 * 增加学生
	 */
	public boolean insert(Student s, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pst=null;
		boolean b = false;
		String sql = "insert into Student values (null,?,?,?,?,?,?,?,3)";
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
		pst.close();
		return b;
	}

	@Override
	/**
	 * 修改学生信息
	 */
	public boolean updata(Student s, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pst=null;
		boolean b = false;
		String sql = "updata Student set pwd = ? where username = ?";
		pst.setString(1, s.getPwd());
		pst.setString(2, s.getUsername());
		int n = pst.executeUpdate();
		if(n>0) {
			b = true;
		}
		pst.close();
		return b;
	}

	@Override
	/**
	 * 删除学生
	 */
	public boolean delete(Student s, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pst=null;
		boolean b = false;
		String sql = "delete from Student  where username = ?";
		pst.setString(1, s.getUsername());
		int n = pst.executeUpdate();
		if(n>0) {
			b = true;
		}
		pst.close();
		return b;
	}


}
