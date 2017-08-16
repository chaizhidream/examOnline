package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.dao.I.StudentInterfaceDao;
import com.neuq.dao.Impl.StudentInterfaceImplDao;


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
		try {
		StudentInterfaceDao sid=new StudentInterfaceImplDao();
		//传入student类
		request.setAttribute("Student", sid.showuserinfo(request.getParameter("username")));			
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

