package com.neuq.dao.Impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.neuq.bean.Bct;
import com.neuq.bean.Paper;
import com.neuq.bean.PaperString;
import com.neuq.bean.Student;
import com.neuq.bean.StudentGrade;
import com.neuq.bean.Teacher;
import com.neuq.bean.Tkt;
import com.neuq.bean.Xzt;
import com.neuq.dao.I.TeacherInterfaceDao;
import com.neuq.db.DBUtil;
import com.neuq.util.QuestionInstance;
import com.neuq.util.SaveData;

public class TeacherInterfaceImplDao implements TeacherInterfaceDao{
	@SuppressWarnings("unused")
	private static Connection con = DBUtil.getConnection();
	private static PreparedStatement pst = null;
	private static ResultSet rs = null;
	boolean b=false;
	@Override
	/**
	 * 教师查询个人信息
	 */
	public Teacher select(Teacher t, Connection con) throws SQLException {
		Teacher info=new Teacher();
		String sql = "select * from Teacher where username = ?";
		pst = con.prepareStatement(sql);
		pst.setString(1, t.getTeachername());
		rs = pst.executeQuery();
		while(rs.next()) {
			info.setTeachername(rs.getString(2));
			info.setPwd(rs.getString(3));
			info.setName(rs.getString(4));
			info.setSex(rs.getString(5));
			info.setTelephone(rs.getString(7));
			info.setEmail(rs.getString(8));
		}
		DBUtil.CloseConnection(rs, pst, con);
		return info;
	}

	@Override
	/**
	 * 增加学生
	 */
	public boolean insert(Student s, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pst=null;
		boolean b = false;
		String sql = "insert into Student values (null,?,?,?,?,?,?,?,3)";
		pst = con.prepareStatement(sql);
		pst.setString(1, s.getUsername());
		pst.setString(2, s.getPwd());
		pst.setString(3, s.getName());
		pst.setString(4, s.getSex());
		pst.setString(5, s.getStudentclass());
		pst.setString(6, s.getTelephone());
		pst.setString(7, s.getEmail());
		int n = pst.executeUpdate();
		if(n>0) {
			b = true;
		}
		DBUtil.CloseConnection(rs, pst, con);
		return b;
	}

	@Override
	/**
	 * 修改教师个人信息仅密码
	 */
	public boolean updata(Teacher t, Connection con) throws SQLException {
		PreparedStatement pst=null;
		boolean b = false;
		String sql = "updata Teacher set pwd = ? where username = ?";
		pst = con.prepareStatement(sql);
		pst.setString(1, t.getPwd());
		pst.setString(2, t.getTeachername());
		int n = pst.executeUpdate();
		if(n>0) {
			b = true;
		}
		DBUtil.CloseConnection(rs, pst, con);
		return b;
	}

	@Override
	/**
	 * 删除学生
	 */
	public boolean delete(Student s,String studentclass, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pst=null;
		boolean b = false;
		String sql = "delete from Student  where username = ?";
		pst = con.prepareStatement(sql);
		pst.setString(1, s.getUsername());
		int n = pst.executeUpdate();
		if(n>0) {
			b = true;
		}
		DBUtil.CloseConnection(rs, pst, con);
		return b;
	}

	@Override
	/**
	 * 教师查询学生列表
	 */
	public List<Student> select(String sc, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		Student info = new Student();
		PreparedStatement pst=null;
		List<Student> list  = new ArrayList<Student>();	
		ResultSet rs = null;
		String sql = "select * from Student where studentclass= ? ";
		pst = con.prepareStatement(sql);
		pst.setString(1, sc);
		rs = pst.executeQuery();
		while(rs.next()) {
			info.setId(rs.getInt(1));
			info.setUsername(rs.getString(2));
			info.setName(rs.getString(4));
			info.setSex(rs.getString(5));
			info.setStudentclass(rs.getString(6));
			info.setTelephone(rs.getString(7));
			info.setEmail(rs.getString(8));
			list.add(info);
		}
		DBUtil.CloseConnection(rs, pst, con);
		return list;
	}

	@Override
	public List<StudentGrade> studentgrade(String studentclass,String Papername) throws SQLException {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		con = DBUtil.getConnection();
		ArrayList<StudentGrade> list = new ArrayList<StudentGrade>();
		try {
			String sql="select score,username form studentgrade  where papername=? and username = (select username from student where studentclass = ?) ";
			pst = con.prepareStatement(sql);
			pst.setString(1, Papername);
			pst.setString(2, studentclass);
			rs = pst.executeQuery();
			while (rs.next()) {
				StudentGrade sg=new StudentGrade();
				sg.setId(rs.getInt(1));
				sg.setUsername(rs.getString(2));
				sg.setXztscore(rs.getInt(3));
				sg.setTktscore(rs.getInt(4));
				sg.setBctscore(rs.getInt(5));
				sg.setPapername(rs.getString(6));
				list.add(sg);
	}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return list;


}
/**
 * 查看教师个人信息
 */
	@Override
	public Teacher showTeacherInfo(String username) throws SQLException {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		con = DBUtil.getConnection();
		
		Teacher u=new Teacher();
		String sql="select * from teacher where username = ?";
		pst = con.prepareStatement(sql);
		pst.setString(1, username);
		rs = pst.executeQuery(sql);
		while (rs.next()) {

			u.setId(rs.getInt("id"));
			u.setTeachername(rs.getString("username"));
			u.setName(rs.getString("name"));
			u.setSex(rs.getString("sex"));
			u.setEmail(rs.getString("email"));
            u.setTelephone(rs.getString("telephone"));
			System.out.println(u.toString());

		}
		return u;
	}



@Override
public boolean batchquestion(int questiontype) {
	SaveData sd=new SaveData();
	boolean b = false;
	if(questiontype == 1) {
		try {
			try {
				sd.savexcel("upload/", 1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	if(questiontype == 2) {
		try {
			try {
				sd.savexcel("upload/", 2);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		}
	if(questiontype == 3) {
		try {
			try {
				sd.savexcel("upload/", 3);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	return b;
}

@Override
public boolean  setPaper(int[] questionxztid,int[] questiontktid, int[] questionbctid ) throws SQLException {
	boolean  b = false;
	List<Xzt> xzts=new ArrayList<Xzt>();
	List<Tkt> tkts=new ArrayList<Tkt>();
	List<Bct> bcts=new ArrayList<Bct>();
	for(int i  = 0; i<questionxztid.length;i++){
		xzts.add(QuestionInstance.getXzt(questionxztid[i]));
	}
	for(int j  = 0; j<questionxztid.length;j++){
		tkts.add(QuestionInstance.getTkt(questiontktid[j]));	
	}
	for(int k  = 0; k<questionxztid.length;k++){
		bcts.add(QuestionInstance.getBct(questionbctid[k]));	
	}
	if(xzts != null && tkts != null && bcts != null) {
		b = true;
	}
	return b;
}	


@Override
public boolean correctPaper(int score) throws SQLException {
	// TODO Auto-generated method stub
	return false;
}

@Override
public PaperString showPaper(Paper paper) throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Xzt> showPaperbankxzt() throws SQLException {
	List<Xzt> list = new ArrayList<Xzt>();
	Xzt xzt= new Xzt();
	String sql = " select * from xzt";
	pst=con.prepareStatement(sql);
	rs = pst.executeQuery();
	while(rs.next()) {
		xzt.setId(rs.getInt(1));
		xzt.setQuestion(rs.getString(2));
		xzt.setAnswer(rs.getString(3));
		xzt.setOptionA(rs.getString(4));
		xzt.setOptionB(rs.getString(5));
		xzt.setOptionC(rs.getString(6));
		xzt.setOptionD(rs.getString(7));
		xzt.setQuestiontype(rs.getInt(8));
		xzt.setQuestionpoint(rs.getString(9));
	}
	list.add(xzt);
	return list;
}

@Override
public List<Tkt> showPaperbanktkt() throws SQLException {
	List<Tkt> list = new ArrayList<Tkt>();
	Tkt tkt= new Tkt();
	String sql = " select * from tkt";
	pst=con.prepareStatement(sql);
	rs = pst.executeQuery();
	while(rs.next()) {
		tkt.setId(rs.getInt(1));
		tkt.setQuestion(rs.getString(2));
		tkt.setAnswer(rs.getString(3));
		tkt.setQuestiontype(rs.getInt(4));
		tkt.setQuestionpoint(rs.getString(5));
	}
	list.add(tkt);
	return list;
}

@Override
public List<Bct> showPaperbankbct() throws SQLException {
	List<Bct> list = new ArrayList<Bct>();
	Bct bct= new Bct();
	String sql = " select * from bct";
	pst=con.prepareStatement(sql);
	rs = pst.executeQuery();
	while(rs.next()) {
		bct.setId(rs.getInt(1));
		bct.setQuestion(rs.getString(2));
		bct.setQuestiontype(rs.getInt(4));
		bct.setQuestionpoint(rs.getString(5));
	}
	list.add(bct);
	return list;
}
	
}




