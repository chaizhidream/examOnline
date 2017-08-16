package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import org.apache.naming.java.javaURLContextFactory;

import com.neuq.bean.Paper;
import com.neuq.bean.Student;
import com.neuq.bean.StudentGrade;
import com.neuq.bean.Teacher;
import com.neuq.bean.Xzt;
import com.neuq.dao.I.ManagerInterfaceDao;
import com.neuq.dao.I.PaperInterfaceDao;
import com.neuq.dao.I.StudentGradeInterfaceDao;
import com.neuq.dao.I.StudentInterfaceDao;
import com.neuq.dao.I.TeacherInterfaceDao;
import com.neuq.dao.Impl.ManagerInterfaceImplDao;
import com.neuq.dao.Impl.PaperInterfaceImplDao;
import com.neuq.dao.Impl.StudentGradeInterfaceImplDao;
import com.neuq.dao.Impl.StudentInterfaceImplDao;
import com.neuq.dao.Impl.TeacherInterfaceImplDao;
import com.neuq.db.DBUtil;
import com.neuq.util.ReadExcel;
import com.neuq.util.SaveData;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.neuq.util.SaveData;

public class testdao {

	public static void main(String[] args) throws SQLException, IOException {
//		// TODO Auto-generated method stub
//		Connection con = DBUtil.getConnection();
//	Student s=new Student();
//	String b = s.aaa();
//		StudentInterfaceDao studentInterfaceDao=new StudentInterfaceImplDao();
//		try {
//			studentInterfaceDao.insert(s, con);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		ManagerInterfaceDao managerInterfaceDao=new ManagerInterfaceImplDao();
////		managerInterfaceDao.insert(t, con);
//		try {
//		System.out.println(studentInterfaceDao.select(s,DBUtil.getConnection()));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		StudentGradeInterfaceDao aGrade  = new StudentGradeInterfaceImplDao();
//		System.out.println(aGrade.select("mary"));
	//	@SuppressWarnings("deprecation")
//		Date date=new Date(1996-1900,07-1,9);
//		System.out.println(date);
//		DateFormat df=new SimpleDateFormat("YY-MM-DD-HH:mm:ss");
//		System.out.println(df.format(date));
//		PreparedStatement pst = null;
//		ResultSet rs = null;
//		String sql="select * from studentgrade where username=?";
//		pst = con.prepareStatement(sql);
//		pst.setString(1, "aa");
//		rs = pst.executeQuery();
//		if (rs.next()) {
//			StudentGrade sg=new StudentGrade();
//			sg.setId(rs.getInt(1));
//			sg.setUsername(rs.getString(2));
//			sg.setScore(rs.getInt(3));
//			sg.setPapername(rs.getString(4));
//			//list.add(sg);
//			System.out.println(sg.getUsername());
//}
//		SaveData sd=new SaveData();
//		sd.save(null);
//		String a = "xzt";
//		if(a == b){
//			System.out.println("afsaf");
//		}
//		TeacherInterfaceDao teacherInterfaceDao= new teacherInterfaceImplDao();
		
		
//		Teacher t = new Teacher("chai","aaa","chaizhi","ÄÐ","18833501280","464@ab.com");
//		teacherInterfaceDao.insert(t, DBUtil.getConnection());
//		java.util.List<Teacher> tea= teacherInterfaceDao.select(DBUtil.getConnection());
//		System.out.println(tea.get(0).getTeachername());
//		System.out.println(tea.get(1).getTeachername());
//		System.out.println(tea.get(2).getTeachername());
//		System.out.println(tea.get(4).getTeachername());
//		System.out.println(tea.get(5).getTeachername());
//        Connection con = null;
//		PreparedStatement pst = null;
//		con = DBUtil.getConnection();
//		System.out.println("adsfd>>>>>>>>>>>>>s");
//		Date date=new Date(2017-1900,7,11);
//		Date date1=new Date(2017-1900,7,12);
//		Paper p = new Paper(date,date1,"test1",1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,3,5);
//		//teacherInterfaceDao.setPaper(questionxztid, questiontktid, questionbctid)
//		//java.util.Date date = new java.util.Date();
//		java.sql.Date utilDate0 = new java.sql.Date (date.getTime());
//		java.sql.Date utilDate1 = new java.sql.Date (date1.getTime());
//		String sql = "insert into  Paper (id,starttime,endtime,papername,xzt1, xzt2, xzt3,xzt4,xzt5, xzt6,xzt7,xzt8, xzt9,xzt10,tkt1,tkt2,tkt3,tkt4,tkt5,bct1,bct2) values (null,?,?,? ,?,?,? ,?,?,? ,?,?,? ,?,?,? ,?,?,?, ?,?)";
//		pst = con.prepareStatement(sql);
//		pst.setDate(1, utilDate0);
//		pst.setDate(2, utilDate1);
//		pst.setString(3, p.getPapername());
//		pst.setInt(4, p.getXzt1());
//		pst.setInt(5, p.getXzt2());
//		pst.setInt(6, p.getXzt3());
//	pst.setInt(7, p.getXzt4());
//		pst.setInt(8, p.getXzt5());
//		pst.setInt(9, p.getXzt6());
//		pst.setInt(10, p.getXzt7());
//		pst.setInt(11, p.getXzt8());
//		pst.setInt(12, p.getXzt9());
//		pst.setInt(13, p.getXzt10());
//		
//		System.out.println("ads<<<<<<<<<<<<<<<<<<<<<fds");
//		pst.setInt(14, p.getTkt1());
//		pst.setInt(15, p.getTkt2());
//		pst.setInt(16, p.getTkt3());
//		pst.setInt(17, p.getTkt4());
//		pst.setInt(18, p.getTkt5());
//		
//		pst.setInt(19, p.getBct1());
//		pst.setInt(20, p.getBct2());	
//			int n = pst.executeUpdate();	
//
//		if(n>0) {
//			System.out.println("ad<<<<<<<<<<<<<<<<<<<sfds");
//		}
//		PaperInterfaceDao  paperInterfaceDao = new PaperInterfaceImplDao();
//		System.out.println(paperInterfaceDao.select().get(0).getPapername());
//		
//		
//	}
	PaperInterfaceImplDao a=new PaperInterfaceImplDao();
	ArrayList<Paper> list =(ArrayList<Paper>) a.select();
	for(int i = 0;i< list.size();i++)
	System.out.println(list.get(i).getPapername());
	
	}}
