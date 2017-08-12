package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuq.bean.Xzt;
import com.neuq.dao.I.XztInterfaceDao;
import com.neuq.db.DBUtil;

public class XztInterfaceImplDao implements XztInterfaceDao {
	private static Connection con = null;
	private static PreparedStatement pr = null;
	private static ResultSet rs = null;
	@Override
	public boolean insert(Xzt xzt) {
		int row=0;
        con=DBUtil.getConnection();
        String sql="insert into xzt values (null,?,?,?,?,?,?,?,?)";
        try {
			pr=con.prepareStatement(sql);
			pr.setString(1, xzt.getQuestion());
			pr.setString(2, xzt.getAnswer());
			pr.setString(3, xzt.getOptionA());
			pr.setString(4, xzt.getOptionB());
			pr.setString(5, xzt.getOptionC());
			pr.setString(6, xzt.getOptionD());
			pr.setInt(7, xzt.getQuestiontype());
			pr.setString(8, xzt.getQuestionpoint());
			row=pr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
	
		
		return row>0;
	}

	@Override
	public boolean delete(Xzt xzt) {
		int row=0;
        con=DBUtil.getConnection();
        String sql="delete from xzt where question=?";
        try {
			pr=con.prepareStatement(sql);
			pr.setString(1, xzt.getQuestion());
			row=pr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
		return row>0;
	}

	@Override
	public boolean update(Xzt xzt) {
		int row=0;
        con=DBUtil.getConnection();
        //题目种类不会变
        String sql="update xzt set question=?,answer=?,optionA=?,optoinB=?,optionC=?,optoinD=?,questionpoint=? where id=?";
        try {
			pr=con.prepareStatement(sql);	
			pr.setString(1, xzt.getQuestion());
			pr.setString(2, xzt.getAnswer());
			pr.setString(3, xzt.getOptionA());
			pr.setString(4, xzt.getOptionB());
			pr.setString(5, xzt.getOptionC());
			pr.setString(6, xzt.getOptionD());
			pr.setString(7, xzt.getQuestionpoint());
			pr.setInt(8, xzt.getId());
			
			row=pr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
		return row>0;
	}

	@Override
	public List<Xzt> select() {
		List<Xzt> list=new ArrayList<Xzt>();
		String sql="select * from xzt";
		  con=DBUtil.getConnection();
		  try {
			pr=con.prepareStatement(sql);
			rs=pr.executeQuery();
			while (rs.next()) {
				Xzt xzt=new Xzt();
				xzt.setId(rs.getInt("id"));
				xzt.setQuestion(rs.getString("question"));
				xzt.setAnswer(rs.getString("answer"));
				xzt.setOptionA(rs.getString("optionA"));
				xzt.setOptionB(rs.getString("optionB"));
				xzt.setOptionC(rs.getString("optionC"));
				xzt.setOptionD(rs.getString("optionD"));
				xzt.setQuestiontype(1);
				xzt.setQuestionpoint(rs.getString("questionpoint"));
				list.add(xzt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}	
		return list;
	}

	@Override
	public List<Xzt> select(String questionpoint) {
		List<Xzt> list=new ArrayList<Xzt>();
		String sql="select * from xzt where questionpoint=?";
		  con=DBUtil.getConnection();
		  try {
			pr=con.prepareStatement(sql);
			pr.setString(1, questionpoint);
			rs=pr.executeQuery();
			while (rs.next()) {
				Xzt xzt=new Xzt();
				xzt.setId(rs.getInt("id"));
				xzt.setQuestion(rs.getString("question"));
				xzt.setAnswer(rs.getString("answer"));
				xzt.setOptionA(rs.getString("optionA"));
				xzt.setOptionB(rs.getString("optionB"));
				xzt.setOptionC(rs.getString("optionC"));
				xzt.setOptionD(rs.getString("optionD"));
				xzt.setQuestiontype(1);
				xzt.setQuestionpoint(rs.getString("questionpoint"));
				list.add(xzt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}	
		return list;
	}

}
