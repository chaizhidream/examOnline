package com.neuq.dao.I;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.Manager;
import com.neuq.bean.Teacher;

public interface ManagerInterfaceDao {
	public Manager select(Manager m,Connection con)throws SQLException;
	public List<Teacher> select(Connection con)throws SQLException;
	public boolean insert(Teacher t,Connection con)throws SQLException;
	public boolean delete(String teachername,Connection con)throws SQLException;
	public Manager showManagerInfo(String parameter) throws SQLException; 
	public Manager login(String username, String pwd) throws SQLException;
}
