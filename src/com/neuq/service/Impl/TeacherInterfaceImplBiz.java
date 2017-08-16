package com.neuq.service.Impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.Student;
import com.neuq.bean.Teacher;
import com.neuq.dao.I.TeacherInterfaceDao;
import com.neuq.dao.Impl.TeacherInterfaceImplDao;
import com.neuq.db.DBUtil;
import com.neuq.service.I.TeacherInterfaceBiz;

public class TeacherInterfaceImplBiz implements TeacherInterfaceBiz {
	TeacherInterfaceDao ti=new TeacherInterfaceImplDao();
	Connection con=DBUtil.getConnection();
	@Override
	public Teacher select(Teacher t) throws SQLException {
		return ti.select(t, con);
	}

	@Override
	public List<Student> select(String sc) throws SQLException {
		return ti.select(sc, con);
	}

	@Override
	public boolean insert(Student s) throws SQLException {
		return ti.insert(s, con);
	}

	@Override
	public boolean updata(Teacher t) throws SQLException {
		return ti.updata(t, con);
	}

	@Override
	public boolean delete(String studentname,String studentclass) throws SQLException {
		return ti.delete(studentname,studentclass, con);
	}

	@Override
	public Teacher login(String username, String password) throws SQLException {
		return ti.login(username, password);
	}

}
