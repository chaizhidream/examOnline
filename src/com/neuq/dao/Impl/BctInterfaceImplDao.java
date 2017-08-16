package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuq.bean.Bct;
import com.neuq.dao.I.BctInterfaceDao;
import com.neuq.db.DBUtil;

public class BctInterfaceImplDao implements BctInterfaceDao {
	private static Connection con = null;
	private static PreparedStatement pr = null;
	private static ResultSet rs = null;

	@Override
	public boolean insert(Bct bct) {
		int row=0;
         con=DBUtil.getConnection();
         String sql="insert into bct values (null,?,?,?)";
         try {
			pr=con.prepareStatement(sql);
			pr.setString(1, bct.getQuestion());
			pr.setInt(2, bct.getQuestiontype());
			pr.setString(3, bct.getQuestionpoint());
			row=pr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
	
		
		return row>0;
	}

	@Override
	public boolean delete(Bct bct) {
		int row=0;
        con=DBUtil.getConnection();
        String sql="delete from bct where question=?";
        try {
			pr=con.prepareStatement(sql);
			pr.setString(1, bct.getQuestion());
			row=pr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
		return row>0;
	}
/**
 * 只能修改已有的对象，不能传入新建的对象，因为没有ID值。
 */
	@Override
	public boolean update(Bct bct) {
		int row=0;
        con=DBUtil.getConnection();
        //题目种类不会变
        String sql="update bct set question=?,questionpoint=? where id=?";
        try {
			pr=con.prepareStatement(sql);
			
			pr.setString(1, bct.getQuestion());
			pr.setString(2, bct.getQuestionpoint());
			pr.setInt(3, bct.getId());
			
			row=pr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
		return row>0;
	}

	@Override
	public List<Bct> select() {
		List<Bct> list=new ArrayList<Bct>();
		String sql="select * from bct";
		  con=DBUtil.getConnection();
		  try {
			pr=con.prepareStatement(sql);
			rs=pr.executeQuery();
			while (rs.next()) {
				Bct bct=new Bct();
				bct.setId(rs.getInt("id"));
				bct.setQuestion(rs.getString("question"));
				bct.setQuestiontype(3);
				bct.setQuestionpoint(rs.getString("questionpoint"));
				list.add(bct);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}	
		return list;
	}

	@Override
	public List<Bct> select(String questionpoint) {
		List<Bct> list=new ArrayList<Bct>();
		String sql="select * from bct where questionpoint=?";
		  con=DBUtil.getConnection();
		  try {
			pr=con.prepareStatement(sql);
			pr.setString(1, questionpoint);
			rs=pr.executeQuery();
			while (rs.next()) {
				Bct bct=new Bct();
				bct.setId(rs.getInt("id"));
				bct.setQuestion(rs.getString("question"));
				bct.setQuestiontype(3);
				bct.setQuestionpoint(rs.getString("questionpoint"));
				list.add(bct);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.CloseConnection(rs, pr, con);
		}	
		return list;
	}

}
