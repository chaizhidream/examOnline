package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuq.bean.Tkt;
import com.neuq.dao.I.TktInterfaceDao;
import com.neuq.db.DBUtil;

public class TktInterfaceImplDao implements TktInterfaceDao {
	private static Connection con = null;
	private static PreparedStatement pr = null;
	private static ResultSet rs = null;

	@Override
	public boolean insert(Tkt tkt) {
		int row = 0;
		con = DBUtil.getConnection();
		String sql = "insert into tkt values (null,?,?,?,?)";
		try {
			pr = con.prepareStatement(sql);
			pr.setString(1, tkt.getQuestion());
			pr.setString(2, tkt.getAnswer());
			pr.setInt(7, 2);
			pr.setString(8, tkt.getQuestionpoint());
			row = pr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.CloseConnection(rs, pr, con);
		}

		return row > 0;
	}

	@Override
	public boolean delete(Tkt tkt) {
		int row=0;
        con=DBUtil.getConnection();
        String sql="delete from Tkt where question=?";
        try {
			pr=con.prepareStatement(sql);
			pr.setString(1, tkt.getQuestion());
			row=pr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
		return row>0;
	}

	@Override
	public boolean update(Tkt tkt) {
		int row=0;
        con=DBUtil.getConnection();
        //题目种类不会变
        String sql="update tkt set question=?,answer=?,questionpoint=? where id=?";
        try {
			pr=con.prepareStatement(sql);	
			pr.setString(1, tkt.getQuestion());
			pr.setString(2, tkt.getAnswer());
			pr.setString(3, tkt.getQuestionpoint());
			pr.setInt(4, tkt.getId());			
			row=pr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
		return row>0;
	}

	@Override
	public List<Tkt> select() {
		List<Tkt> list=new ArrayList<Tkt>();
		String sql="select * from tkt";
		  con=DBUtil.getConnection();
		  try {
			pr=con.prepareStatement(sql);
			rs=pr.executeQuery();
			while (rs.next()) {
				Tkt t=new Tkt();
				t.setId(rs.getInt("id"));
				t.setQuestion(rs.getString("question"));
				t.setAnswer(rs.getString("answer"));
				t.setQuestiontype(2);
				t.setQuestionpoint(rs.getString("questionpoint"));
				list.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}	
		return list;
	}

	@Override
	public List<Tkt> select(String questionpoint) {
		List<Tkt> list=new ArrayList<Tkt>();
		String sql="select * from tkt where questionpoint = ?";
		  con=DBUtil.getConnection();
		  try {
			pr=con.prepareStatement(sql);
			pr.setString(1, questionpoint);
			rs=pr.executeQuery();
			while (rs.next()) {
				Tkt t=new Tkt();
				t.setId(rs.getInt("id"));
				t.setQuestion(rs.getString("question"));
				t.setAnswer(rs.getString("answer"));
				t.setQuestiontype(2);
				t.setQuestionpoint(rs.getString("questionpoint"));
				list.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}	
		return list;
	}

}
