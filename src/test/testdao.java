package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.naming.java.javaURLContextFactory;

import com.neuq.bean.Student;
import com.neuq.bean.StudentGrade;
import com.neuq.dao.I.ManagerInterfaceDao;
import com.neuq.dao.I.StudentGradeInterfaceDao;
import com.neuq.dao.I.StudentInterfaceDao;
import com.neuq.dao.Impl.ManagerInterfaceImplDao;
import com.neuq.dao.Impl.StudentGradeInterfaceImplDao;
import com.neuq.dao.Impl.StudentInterfaceImplDao;
import com.neuq.db.DBUtil;

public class testdao {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Connection con = DBUtil.getConnection();
//		Student s=new Student("mary", "aaa", "ÕÅÈý", "21424");
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
		@SuppressWarnings("deprecation")
		Date date=new Date(1996-1900,07-1,9);
		System.out.println(date);
		DateFormat df=new SimpleDateFormat("YY-MM-DD-HH:mm:ss");
		System.out.println(df.format(date));
	}

}
