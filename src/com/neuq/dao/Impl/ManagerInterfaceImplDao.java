package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuq.bean.Manager;
import com.neuq.bean.Teacher;
import com.neuq.dao.I.ManagerInterfaceDao;
import com.neuq.db.DBUtil;

public class ManagerInterfaceImplDao implements ManagerInterfaceDao {
	@SuppressWarnings("unused")
	private static Connection con = DBUtil.getConnection();
	private static PreparedStatement pst = null;
	private static ResultSet rs = null;
	boolean b=false;
	/**
	 * 查询所有教师，此处可做分页
	 */
	@Override
	public List<Teacher> select(Connection con) throws SQLException {
		Teacher info = null;
		List<Teacher> list  = new ArrayList<Teacher>();	
		String sql = "select * from Teacher ";
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		while(rs.next()) {
			 info = new Teacher();
			info.setId(rs.getInt(1));
			info.setUsername(rs.getString(2));
			info.setName(rs.getString(4));
			info.setSex(rs.getString(5));
			info.setTelephone(rs.getString(6));
			info.setEmail(rs.getString(7));
			list.add(info);
		}
		DBUtil.CloseConnection(rs, pst, con);
		return list;
	}

	/**
	 * 添加教师
	 */
	@Override
	public boolean insert(Teacher t, Connection con) throws SQLException {
		String sql = "insert into Teacher values (null,?,?,?,?,?,?,2)";
		pst=con.prepareStatement(sql);
		pst.setString(1, t.getUsername());
		pst.setString(2, t.getPwd());
		pst.setString(3, t.getName());
		pst.setString(4, t.getSex());
		pst.setString(5, t.getTelephone());
		pst.setString(6, t.getEmail());
		int n = pst.executeUpdate();
		if(n>0) {
			b = true;
		}
		DBUtil.CloseConnection(rs, pst, con);
		return b;
	}


	
	/**
	 * 查询管理员个人信息
	 */
	@Override
	public Manager select(Manager m, Connection con) throws SQLException {
		Manager info=null;
		String sql = "select * from Manager where username = ?";
		pst = con.prepareStatement(sql);
		pst.setString(1, m.getName());
		rs = pst.executeQuery();
		if(rs.next()) {
		    info = new Manager();
			info.setName(rs.getString(2));
			info.setPwd(rs.getString(3));
			info.setName(rs.getString(4));
			info.setSex(rs.getString(5));
			info.setTelephone(rs.getString(7));
			info.setEmail(rs.getString(8));
		}
		DBUtil.CloseConnection(rs, pst, con);
		return info;
	}

	@Override
	public Manager showManagerInfo(String username) throws SQLException {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		con = DBUtil.getConnection();
		
		Manager u=null;
		String sql="select * from Manager where username = ?";
		pst = con.prepareStatement(sql);
		pst.setString(1, username);
		rs = pst.executeQuery(sql);
		while (rs.next()) {
			 u=new Manager();
			u.setId(rs.getInt("id"));
			u.setUsername(rs.getString("username"));
			u.setName(rs.getString("name"));
			u.setSex(rs.getString("sex"));
			u.setEmail(rs.getString("email"));
            u.setTelephone(rs.getString("telephone"));
			System.out.println(u.toString());

		}
		return u;
	}

	@Override
	public Manager login(String username, String pwd) throws SQLException {
		Connection con = DBUtil.getConnection();
		Manager info=null;
		String sql = "select * from Manager where username = ? and pwd=?";
		pst = con.prepareStatement(sql);
		pst.setString(1, username);
		pst.setString(2,pwd);
		rs = pst.executeQuery();
		if(rs.next()) {
			info=new Manager();
			info.setUsername(rs.getString(2));
			info.setPwd(rs.getString(3));
			info.setName(rs.getString(4));
			info.setSex(rs.getString(5));
			info.setTelephone(rs.getString(6));
			info.setEmail(rs.getString(7));
		}
		DBUtil.CloseConnection(rs, pst, con);
		return info;
	}
	/**
	 * 删除教师
	 */
	@Override
	public boolean delete(String teachername, Connection con) throws SQLException {
		// TODO Auto-generated method stub
				PreparedStatement pst=null;
				boolean b = false;
				String sql = "delete from Teacher  where username = ?";
				pst = con.prepareStatement(sql);
				pst.setString(1, teachername);
				int n = pst.executeUpdate();
				if(n>0) {
					b = true;
				}
				DBUtil.CloseConnection(rs, pst, con);
				return b;
	}
	
}
