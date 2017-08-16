package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.dao.I.TeacherInterfaceDao;
import com.neuq.dao.Impl.TeacherInterfaceImplDao;


/**
 * Servlet implementation class cjservlet
 */



public class ShowTeacherInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ShowTeacherInfo() {
        super();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
		TeacherInterfaceDao tid=new TeacherInterfaceImplDao();
		//传入student类
		request.setAttribute("Teacher", tid.showTeacherInfo(request.getParameter("username")));			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		//将list数据发送到.jsp文件中++
		request.getRequestDispatcher("TeacherSelf.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

