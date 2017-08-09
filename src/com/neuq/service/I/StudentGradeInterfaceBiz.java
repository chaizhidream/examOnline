package com.neuq.service.I;

import java.util.List;

import com.neuq.bean.StudentGrade;

public interface StudentGradeInterfaceBiz {
public boolean insert(StudentGrade studentGrade);
	
	/**
	 * 删除一条学生成绩记录
	 * @param studentGrade
	 * @return
	 */
	public boolean delete(StudentGrade studentGrade);
	
	/**
	 * 修改一条学生成绩记录
	 * @param studentGrade
	 * @return
	 */
	public boolean update(int bctscore,String username,String papername);
	
	/**
	 * 查询某个学生的全部成绩记录
	 * @param username 学生姓名
	 * @return 某个学生的全部成绩记录StudentGrade
	 */
	public List<StudentGrade> select(String username);
	
	/**
	 * 查询某张试卷在某个班级的全部成绩记录
	 * @param studentclass 学生所在班级
	 * @param  papername 试卷名
	 * @return 某张试卷的全部成绩记录
	 */
	public List<StudentGrade> select(String studentclass,String papername);
}
