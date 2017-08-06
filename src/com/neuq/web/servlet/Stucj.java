package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.neuq.bean.StudentGrade;
import com.neuq.db.DBUtil;

/**
 * Servlet implementation class cjservlet
 */



public class Stucj extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Stucj() {
        super();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	String username=(String)request.getAttribute("username");
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		con = DBUtil.getConnection();
		//声明一个ArrayList.用来存放Book类中的数据
		ArrayList<StudentGrade> list = new ArrayList<StudentGrade>();
		try {
			// where username = ?
			String sql="select * from studentgrade where username='"+username+"'";
			pst = con.prepareStatement(sql);
		//	pst.setNString(1, (String)request.getParameter("mary"));
			rs = pst.executeQuery();
			while (rs.next()) {
				//建立了一个实体类,用来存放从数据库中拿到的数据
				StudentGrade sg=new StudentGrade();
				sg.setId(rs.getInt(1));
				sg.setUsername(rs.getString(2));
				sg.setScore(rs.getInt(3));
				sg.setPapername(rs.getString(4));
				list.add(sg);
			}
			//将list数据打包
			request.setAttribute("list", list);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//将list数据发送到.jsp文件中
		request.getRequestDispatcher("cj.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

