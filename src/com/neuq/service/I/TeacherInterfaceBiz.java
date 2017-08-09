package com.neuq.service.I;

import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.Student;
import com.neuq.bean.Teacher;

public interface TeacherInterfaceBiz {
	public Teacher select(Teacher t)throws SQLException;
	public List<Student> select(String sc)throws SQLException;//sc--studentclass
	public boolean insert(Student s)throws SQLException;
	public boolean updata(Teacher t)throws SQLException;
	public boolean delete(String studentname,String studentclass)throws SQLException;
	public Teacher login(String username,String password)throws SQLException;
}
