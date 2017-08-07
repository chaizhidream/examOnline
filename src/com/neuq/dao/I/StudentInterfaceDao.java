package com.neuq.dao.I;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.Student;
import com.neuq.bean.StudentGrade;

public interface StudentInterfaceDao {
	public Student select(Student s,Connection con)throws SQLException;
	public boolean insert(Student s, Connection con)throws SQLException;
	public boolean updata(Student s,Connection con)throws SQLException;
	public boolean delete(Student s,Connection con)throws SQLException;//不可使用
	public Student login(String username, String pwd) throws SQLException;
	public Student showuserinfo(String username)throws SQLException;
	public List<StudentGrade> stucj(String username)throws SQLException; 
}
