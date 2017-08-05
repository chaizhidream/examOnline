package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuq.bean.Manager;
import com.neuq.bean.Student;
import com.neuq.bean.Teacher;
import com.neuq.dao.I.ManagerInterfaceDao;

public class ManagerInterfaceImplDao implements ManagerInterfaceDao {

	/**
	 * 查询所有教师，此处可做分页
	 */
	@Override
	public List<Teacher> select(Connection con) throws SQLException {
		// TODO Auto-generated method stub
		Teacher info = new Teacher();
		PreparedStatement pst=null;
		List<Teacher> list  = new ArrayList<Teacher>();	
		ResultSet rs = null;
		String sql = "select * from Teacher ";
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		if(rs.next()) {
			info.setTeachername(rs.getString(2));
			info.setName(rs.getString(4));
			info.setSex(rs.getString(5));
			info.setTelephone(rs.getString(6));
			info.setEmail(rs.getString(7));
			list.add(info);
		}
		pst.close();
		rs.close();
		return list;

	}

	/**
	 * 添加教师
	 */
	@Override
	public boolean insert(Teacher t, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pst=null;
		boolean b = false;
		String sql = "insert into Teacher values (null,?,?,?,?,?,?,2)";
		pst.setString(1, t.getTeachername());
		pst.setString(2, t.getPwd());
		pst.setString(3, t.getName());
		pst.setString(4, t.getSex());
		pst.setString(5, t.getTelephone());
		pst.setString(6, t.getEmail());
		int n = pst.executeUpdate();
		if(n>0) {
			b = true;
		}
		pst.close();
		return b;
	}

	/**
	 * 删除教师
	 */
	@Override
	public boolean delete(Teacher t, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pst=null;
		boolean b = false;
		String sql = "delete from Student  where username = ?";
		pst.setString(1, t.getTeachername());
		int n = pst.executeUpdate();
		if(n>0) {
			b = true;
		}
		pst.close();
		return b;
	}
	
	/**
	 * 查询管理员个人信息
	 */
	@Override
	public Manager select(Manager m, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		Manager info=new Manager();
		PreparedStatement pst=null;
		ResultSet rs = null;
		String sql = "select * from Manager where username = ?";
		pst = con.prepareStatement(sql);
		pst.setString(1, m.getName());
		rs = pst.executeQuery();
		if(rs.next()) {
			info.setName(rs.getString(2));
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
	
}
