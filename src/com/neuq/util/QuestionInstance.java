package com.neuq.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.neuq.bean.Bct;
import com.neuq.bean.Tkt;
import com.neuq.bean.Xzt;
import com.neuq.db.DBUtil;

public class QuestionInstance {
	private static Connection con = null;
	private static PreparedStatement pr = null;
	private static ResultSet rs = null;

	public static Xzt getXzt(int id) {
		Xzt xzt = new Xzt();
		String sql = "select * from xzt where id='" + id + "'";
		con = DBUtil.getConnection();
		try {
			pr = con.prepareStatement(sql);
			rs = pr.executeQuery();
			while (rs.next()) {
				xzt.setId(rs.getInt("id"));
				xzt.setQuestion(rs.getString("question"));
				xzt.setAnswer(rs.getString("answer"));
				xzt.setOptionA(rs.getString("optionA"));
				xzt.setOptionB(rs.getString("optionB"));
				xzt.setOptionC(rs.getString("optionC"));
				xzt.setOptionD(rs.getString("optionD"));
				xzt.setQuestiontype(1);
				xzt.setQuestionpoint(rs.getString("questionpoint"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
		return xzt;

	}

	public static Tkt getTkt(int id) {
		Tkt tkt = new Tkt();
		String sql = "select * from tkt where id='" + id + "'";
		con = DBUtil.getConnection();
		try {
			pr = con.prepareStatement(sql);
			rs = pr.executeQuery();
			while (rs.next()) {
				tkt.setId(rs.getInt("id"));
				tkt.setQuestion(rs.getString("question"));
				tkt.setAnswer(rs.getString("answer"));
				tkt.setQuestiontype(2);
				tkt.setQuestionpoint(rs.getString("questionpoint"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
		return tkt;

	}

	public static Bct getBct(int id) {
		Bct bct = new Bct();
		String sql = "select * from bct where id='" + id + "'";
		con = DBUtil.getConnection();
		try {
			pr = con.prepareStatement(sql);
			rs = pr.executeQuery();
			while (rs.next()) {
				bct.setId(rs.getInt("id"));
				bct.setQuestion(rs.getString("question"));
				bct.setQuestiontype(3);
				bct.setQuestionpoint(rs.getString("questionpoint"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.CloseConnection(rs, pr, con);
		}
		return bct;


	}

}
