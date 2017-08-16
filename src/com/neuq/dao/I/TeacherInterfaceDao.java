package com.neuq.dao.I;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.Bct;
import com.neuq.bean.PaperString;
import com.neuq.bean.Student;
import com.neuq.bean.StudentGrade;
import com.neuq.bean.Teacher;
import com.neuq.bean.Tkt;
import com.neuq.bean.Xzt;

public interface TeacherInterfaceDao   {
	/**
	 * 查询老师个人信息
	 * @param t
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public Teacher select(Teacher t,Connection con)throws SQLException;
	/**
	 *按班级查询学生
	 * @param sc
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public List<Student> select(String sc,Connection con)throws SQLException;//sc--studentclass
	/**
	 * 插入学生
	 * @param s
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public boolean insert(Student s,Connection con)throws SQLException;
	/**
	 * 修改教师个人信息
	 * @param t
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public boolean updata(Teacher t,Connection con)throws SQLException;
	/**
	 * 删除学生
	 * @param s
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public boolean delete(String studentname,String studentclass,Connection con)throws SQLException;
	/**
	 * 更据试卷名字和班级查学生成绩
	 * @param studentclass
	 * @param Papername
	 * @return
	 * @throws SQLException
	 */
	public List<StudentGrade> studentgrade(String studentclass,String Papername)throws SQLException;
	/**
	 * 查看教师个人信息
	 * @param parameter
	 * @return
	 * @throws SQLException
	 */
	public Teacher showTeacherInfo(String parameter) throws SQLException; 
	/**
	 * 批量导题
	 */
	public boolean batchquestion(int questiontype,String filename,String path) throws SQLException;
	/**
	 * 出卷
	 */
	public boolean setPaper(int[] questionxztid,int[] questiontktid, int[] questionbctid )throws SQLException;
	/**
	 * 查看题库
	 */
	public List<Xzt> showPaperbankxzt()throws SQLException;
	public List<Tkt> showPaperbanktkt()throws SQLException;
	public List<Bct> showPaperbankbct()throws SQLException;
	/**
	 * 改卷
	 */
	public boolean correctPaper(int score)throws SQLException;
	/**
	 * 根据前台返回的试卷名称查看试卷
	 */
	public PaperString showPaper(String papername)throws SQLException; 
	/**
	 * login
	 */
	public Teacher login(String username, String pwd) throws SQLException;
	public String[] selectclass()throws SQLException;
	public String[] selectpaper()throws SQLException;
}
