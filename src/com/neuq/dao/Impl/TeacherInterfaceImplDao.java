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
	private static Connection con = DBUtil.getConnection();
	private static PreparedStatement pst = null;
	private static ResultSet rs = null;
	boolean b=false;
	@Override
	/**
	 * 教师查询个人信息
	 */
	public Teacher select(Teacher t, Connection con) throws SQLException {
		Teacher info=null;
		String sql = "select * from Teacher where username = ?";
		pst = con.prepareStatement(sql);
		pst.setString(1, t.getUsername());
		rs = pst.executeQuery();
		while(rs.next()) {
			 info=new Teacher();
			info.setUsername(rs.getString(2));
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
		pst.setString(2, t.getUsername());
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
	public boolean delete(String studentname,String studentclass, Connection con) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement pst=null;
		boolean b = false;
		String sql = "delete from Student  where username = ? and studentclass = ?";
		pst = con.prepareStatement(sql);
		pst.setString(1, studentname);
		pst.setString(2, studentclass);
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
		Student info =null;
		PreparedStatement pst=null;
		List<Student> list  = new ArrayList<Student>();	
		ResultSet rs = null;
		String sql = "select * from Student where studentclass= ? ";
		pst = con.prepareStatement(sql);
		pst.setString(1, sc);
		rs = pst.executeQuery();
		while(rs.next()) {
			info = new Student();
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
		
		Teacher u=null;
		String sql="select * from teacher where username = ?";
		pst = con.prepareStatement(sql);
		pst.setString(1, username);
		rs = pst.executeQuery(sql);
		while (rs.next()) {
		 u=new Teacher();

			u.setId(rs.getInt("id"));
			u.setUsername(rs.getString("username"));
			u.setName(rs.getString("name"));
			u.setSex(rs.getString("sex"));
			u.setEmail(rs.getString("email"));
            u.setTelephone(rs.getString("telephone"));
			System.out.println(u.toString());

		}
		return u;
	}



@Override
public boolean batchquestion(int questiontype,String filename,String path) {
	SaveData sd=new SaveData();
	boolean b = false;
	if(questiontype == 1) {
		try {
			try {
				sd.savexcel(path+"\\upload\\"+filename, 1);
				b = true;
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
				sd.savexcel(path+"\\upload\\"+filename, 2);
				b = true;
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
				sd.savexcel(path+"\\upload\\"+filename, 3);
				b = true;
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
public PaperString showPaper(String papername) throws SQLException {
	String sql = " select * from paper where papername = ?";
	pst=con.prepareStatement(sql);
	pst.setString(1, papername);
	rs = pst.executeQuery();
	Paper paper  = null;
	while(rs.next()) {
	    paper  = new Paper();
		pst.setDate(1, (java.sql.Date)paper.getStarttime());
		pst.setDate(2, (java.sql.Date)paper.getEndtime());
		pst.setString(3, paper.getPapername());
		pst.setInt(4, paper.getXzt1());
		pst.setInt(5, paper.getXzt2());
		pst.setInt(6, paper.getXzt3());
		pst.setInt(7, paper.getXzt3());
		pst.setInt(8, paper.getXzt4());
		pst.setInt(9, paper.getXzt5());
		pst.setInt(10, paper.getXzt6());
		pst.setInt(11, paper.getXzt7());
		pst.setInt(12, paper.getXzt8());
		pst.setInt(13, paper.getXzt9());
		pst.setInt(14, paper.getXzt10());
		
		
		pst.setInt(15, paper.getTkt1());
		pst.setInt(16, paper.getTkt2());
		pst.setInt(17, paper.getTkt3());
		pst.setInt(18, paper.getTkt4());
		pst.setInt(19, paper.getTkt5());
		
		pst.setInt(20, paper.getBct1());
		pst.setInt(21, paper.getBct2());	
	}
	PaperString ps=QuestionInstance.changeToPaperString(paper);
	return ps;
	
}

@Override
public List<Xzt> showPaperbankxzt() throws SQLException {
	List<Xzt> list = new ArrayList<Xzt>();
	Xzt xzt= null;
	String sql = " select * from xzt";
	pst=con.prepareStatement(sql);
	rs = pst.executeQuery();
	while(rs.next()) {
		xzt= new Xzt();
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
	Tkt tkt= null;
	String sql = " select * from tkt";
	pst=con.prepareStatement(sql);
	rs = pst.executeQuery();
	while(rs.next()) {
		 tkt= new Tkt();
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

@Override
public Teacher login(String username, String pwd) throws SQLException {
	Connection con = DBUtil.getConnection();
	Teacher info=null;
	String sql = "select * from Teacher where username = ? and pwd=?";
	pst = con.prepareStatement(sql);
	pst.setString(1, username);
	pst.setString(2,pwd);
	rs = pst.executeQuery();
	if(rs.next()) {
		info=new Teacher();
		info.setUsername(rs.getString(2));
		info.setPwd(rs.getString(3));
		info.setName(rs.getString(4));
		info.setSex(rs.getString(5));
		info.setTelephone(rs.getString(6));
		info.setEmail(rs.getString(7));
	}
	DBUtil.CloseConnection(rs, pst, con);
	return info;
}

@Override
public String[] selectclass() throws SQLException {
	Connection con = DBUtil.getConnection();
	String sql = "select distinct studentclass from student";
	String[] studentclass = null;
	int i =0;
	pst = con.prepareStatement(sql);
	rs = pst.executeQuery();
	studentclass=new String[5];
while(rs.next()){
	
		studentclass[i]= rs.getString(1);
		System.out.println(studentclass[i]);
		i++;
}
	DBUtil.CloseConnection(rs, pst, con);
	return studentclass;
}
public static void main(String[] args) {
	TeacherInterfaceDao a=new TeacherInterfaceImplDao();
	try {
		a.selectclass();
		a.selectpaper();
	} catch (SQLException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
}
@Override
public String[] selectpaper() throws SQLException {
		Connection con = DBUtil.getConnection();
		String sql = "select  papername from Paper";
		String[] papername=null;
		int i =0;
		pst = con.prepareStatement(sql);
		rs = pst.executeQuery();
		papername = new String[10];
		while(rs.next()) {	
			papername[i]= rs.getString(1);
		
			System.out.println(papername[i]);
			i++;
		}
		DBUtil.CloseConnection(rs, pst, con);
		return papername;
}

	
}




