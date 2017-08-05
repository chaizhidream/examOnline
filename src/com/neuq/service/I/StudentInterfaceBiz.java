package com.neuq.service.I;

import java.sql.SQLException;

import com.neuq.bean.Student;

public interface StudentInterfaceBiz {
	public Student select(Student s)throws SQLException;
	public boolean insert(Student s)throws SQLException;
	public boolean updata(Student s)throws SQLException;
	public boolean delete(Student s)throws SQLException;
}
