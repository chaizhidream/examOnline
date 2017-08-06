package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.Student;

import com.neuq.db.DBUtil;


/**
 * Servlet implementation class cjservlet
 */



public class ShowUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ShowUserInfo() {
        super();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	@SuppressWarnings("unused")
		String username="mary";
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		con = DBUtil.getConnection();
		
		Student u=new Student();
		try {
			String sql="select * from student";
			pst = con.prepareStatement(sql);
			//pst.setString(1, username);
			rs = pst.executeQuery(sql);
			while (rs.next()) {

				u.setId(rs.getInt("id"));
				u.setUsername(rs.getString("username"));
				u.setName(rs.getString("name"));
				u.setSex(rs.getString("sex"));
				u.setEmail(rs.getString("email"));
                u.setTelephone(rs.getString("telephone"));
                u.setStudentclass(rs.getString("studentclass"));
				System.out.println(u.toString());

			}
			//将list数据打包
			request.setAttribute("Student", u);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//将list数据发送到.jsp文件中
		request.getRequestDispatcher("StudentSelf.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

