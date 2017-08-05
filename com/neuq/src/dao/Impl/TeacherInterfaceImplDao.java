package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuq.bean.Student;
import com.neuq.bean.Teacher;
import com.neuq.dao.I.TeacherInterfaceDao;

public class TeacherInterfaceImplDao implements TeacherInterfaceDao{

	@Override
	/**
	 * 教师查询个人信息
	 */
	public Teacher select(Teacher t, Connection con) throws SQLException {
		Teacher info=new Teacher();
		PreparedStatement pst=null;
		ResultSet rs = null;
		String sql = "select * from Teacher where username = ?";
		pst = con.prepareStatement(sql);
		pst.setString(1, t.getTeachername());
		rs = pst.executeQuery();
		if(rs.next()) {
			info.setTeachername(rs.getString(2));
			info.setPwd(rs.getString(3));
			info.setName(rs.getString(4));
			info.setSex(rs.getString(5));
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
		pst.setString(6, s.getTelephone());
		pst.setString(7, s.getEmail());
		int n = pst.executeUpdate();
		if(n>0) {
			b = true;
		}
		pst.close();
		return b;
	}

	@Override
	/**
	 * 修改教师个人信息仅密码
	 */
	public boolean updata(Teacher t, Connection con) throws SQLException {
		PreparedStatement pst=null;
		boolean b = false;
		String sql = "updata Teacher set pwd = ? where username = ?";
		pst.setString(1, t.getPwd());
		pst.setString(2, t.getTeachername());
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

	@Override
	/**
	 * 教师查询学生列表
	 */
	public List<Student> select(String sc, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		Student info = new Student();
		PreparedStatement pst=null;
		List<Student> list  = new ArrayList<Student>();	
		ResultSet rs = null;
		String sql = "select * from Student where studentclass= ? ";
		pst = con.prepareStatement(sql);
		pst.setString(1, sc);
		rs = pst.executeQuery();
		if(rs.next()) {
			info.setUsername(rs.getString(2));
			info.setName(rs.getString(4));
			info.setSex(rs.getString(5));
			info.setStudentclass(rs.getString(6));
			info.setTelephone(rs.getString(7));
			info.setEmail(rs.getString(8));
			list.add(info);
		}
		pst.close();
		rs.close();
		return list;
	}



}
