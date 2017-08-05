package com.neuq.service.Impl;

import java.sql.Connection;
import java.sql.SQLException;

import com.neuq.bean.Student;
import com.neuq.dao.I.StudentInterfaceDao;
import com.neuq.dao.Impl.StudentInterfaceImplDao;
import com.neuq.db.DBUtil;
import com.neuq.service.I.StudentInterfaceBiz;


public class StudentInterfaceImplBiz implements StudentInterfaceBiz{
	Connection con=DBUtil.getConnection();
	StudentInterfaceDao stu=new StudentInterfaceImplDao();
	@Override
	public Student select(Student s) throws SQLException {
		return stu.select(s, con);
	}

	@Override
	public boolean insert(Student s) throws SQLException {
		return stu.insert(s, con);
	}

	@Override
	public boolean updata(Student s) throws SQLException {
		return stu.updata(s, con);
	}

	@Override
	public boolean delete(Student s) throws SQLException {
		return stu.delete(s, con);
	}

}
