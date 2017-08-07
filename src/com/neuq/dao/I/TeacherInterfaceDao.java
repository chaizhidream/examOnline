package com.neuq.dao.I;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.Student;
import com.neuq.bean.StudentGrade;
import com.neuq.bean.Teacher;

public interface TeacherInterfaceDao   {
	public Teacher select(Teacher t,Connection con)throws SQLException;
	public List<Student> select(String sc,Connection con)throws SQLException;//sc--studentclass
	public boolean insert(Student s,Connection con)throws SQLException;
	public boolean updata(Teacher t,Connection con)throws SQLException;
	public boolean delete(Student s,Connection con)throws SQLException;
	public List<StudentGrade> stucj(String studentclass,String Papername)throws SQLException;
	public Teacher showTeacherInfo(String parameter) throws SQLException; 
	
}
