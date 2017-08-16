package com.neuq.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neuq.bean.BctAnswer;
import com.neuq.dao.I.BctAnswerInterfaceDao;
import com.neuq.db.DBUtil;

public class BctAnswerInterfaceImplDao implements BctAnswerInterfaceDao {

	@Override
	public List<BctAnswer> select(String username, String papername) {
		//String sql = "select * from bctanswer where username=? and papername=? and (select bctscore from studentgrade where username = ? and papername = ?) =-1";
		Connection con = DBUtil.getConnection();
		PreparedStatement pr = null;
		ResultSet rs = null;
		List<BctAnswer> list = new ArrayList<BctAnswer>();
		try {
			pr = con.prepareStatement("select * from bctanswer ");
			//pr.setString(1, username);
			//pr.setString(2, papername);
			//pr.setString(3, username);
			//pr.setString(4, papername);
			rs = pr.executeQuery();
			while (rs.next()) {
				BctAnswer bcta = new BctAnswer();
				bcta.setId(rs.getInt("id"));
				bcta.setUsername(rs.getString("username"));
				bcta.setPapername(rs.getString("papername"));
				bcta.setAnswerpath1(rs.getString("answerpath1"));
				bcta.setAnswerpath2(rs.getString("answerpath2"));
				list.add(bcta);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.CloseConnection(rs, pr, con);

		}

		return list;
	}
	@Override
	public List<BctAnswer> selectwp(String username, String papername) {
		//String sql = "select * from bctanswer where username=? and papername=? and (select bctscore from studentgrade where username = ? and papername =? ) >= 0 ";
		Connection con = DBUtil.getConnection();
		PreparedStatement pr = null;
		ResultSet rs = null;
		List<BctAnswer> list = new ArrayList<BctAnswer>();
		try {
			pr = con.prepareStatement("select * from bctanswer ");
		//	pr.setString(1, username);
			//pr.setString(2, papername);
			//pr.setString(3, username);
			//pr.setString(4, papername);
			rs = pr.executeQuery();
			while (rs.next()) {
				BctAnswer bcta = new BctAnswer();
				bcta.setId(rs.getInt("id"));
				bcta.setUsername(rs.getString("username"));
				bcta.setPapername(rs.getString("papername"));
				bcta.setAnswerpath1(rs.getString("answerpath1"));
				bcta.setAnswerpath2(rs.getString("answerpath2"));
				list.add(bcta);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.CloseConnection(rs, pr, con);

		}

		return list;
	}
	@Override
	public boolean insert(BctAnswer bctanswer) {
		String sql="insert into bctanswer (username,papername,answerpath1,answerpath2) values(?,?,?,?)";
		Connection con = DBUtil.getConnection();
		PreparedStatement pr = null;
		int row=0;
		try {
			pr=con.prepareStatement(sql);
			pr.setString(1, bctanswer.getUsername());
			pr.setString(2, bctanswer.getPapername());
			pr.setString(3, bctanswer.getAnswerpath1());
			pr.setString(4, bctanswer.getAnswerpath2());
               row=pr.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.CloseConnection(null, pr, con);
		}

		return row>0;
	}

}
