package com.neuq.service.Impl;

import java.util.List;

import com.neuq.bean.StudentGrade;
import com.neuq.dao.I.StudentGradeInterfaceDao;
import com.neuq.dao.Impl.StudentGradeInterfaceImplDao;
import com.neuq.service.I.StudentGradeInterfaceBiz;

public class StudentGradeInterfaceImplBiz implements StudentGradeInterfaceBiz {
StudentGradeInterfaceDao sgi=new StudentGradeInterfaceImplDao();
	@Override
	public boolean insert(StudentGrade studentGrade) {
		return sgi.insert(studentGrade);
	}

	@Override
	public boolean delete(StudentGrade studentGrade) {
		return sgi.delete(studentGrade);
	}

	@Override
	public boolean update(int bctscore,String username,String papername) {
		return sgi.update(bctscore,username,papername);
	}

	@Override
	public List<StudentGrade> select(String username) {
		return sgi.select(username);
	}

	@Override
	public List<StudentGrade> select(String studentclass, String papername) {
		return sgi.select(studentclass, papername);
	}

}
