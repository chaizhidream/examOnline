package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuq.bean.Student;
import com.neuq.bean.StudentGrade;
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
		Student info=null;
		String sql = "select * from Student where username = ? and pwd=?";
		pst = con.prepareStatement(sql);
		pst.setString(1, username);
		pst.setString(2,pwd);
		rs = pst.executeQuery();
		if(rs.next()) {
			info=new Student();
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
	public Student showuserinfo(String username) throws SQLException {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		con = DBUtil.getConnection();
		
		Student u=new Student();
		String sql="select * from student where username = ?";
		pst = con.prepareStatement(sql);
		pst.setString(1, username);
		rs = pst.executeQuery(sql);
		while (rs.next()) {

			u.setId(rs.getInt("id"));
			u.setUsername(rs.getString("username"));
			u.setName(rs.getString("name"));
			u.setSex(rs.getString("sex"));
			u.setEmail(rs.getString("email"));
            u.setTelephone(rs.getString("telephone"));
            u.setStudentclass(rs.getString("studentclass"));
			System.out.println(u.toString());

		}
		return u;
	}

	@Override
	public List<StudentGrade> stucj(String username) throws SQLException {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		con = DBUtil.getConnection();
		ArrayList<StudentGrade> list = new ArrayList<StudentGrade>();
		try {
			String sql="select * from studentgrade where username=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, username);
			rs = pst.executeQuery();
			while (rs.next()) {
				StudentGrade sg=new StudentGrade();
				sg.setId(rs.getInt(1));
				sg.setUsername(rs.getString(2));
				sg.setXztscore(rs.getInt(3));
				sg.setTktscore(rs.getInt(4));
				sg.setBctscore(rs.getInt(5));
				sg.setPapername(rs.getString(6));
				list.add(sg);
				System.out.println(sg.getUsername());
	}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		DBUtil.CloseConnection(rs, pst, con);
	}
		return list;


}}
