package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.neuq.dao.I.ManagerInterfaceDao;
import com.neuq.dao.Impl.ManagerInterfaceImplDao;


/**
 * Servlet implementation class cjservlet
 */



public class ShowManagerInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ShowManagerInfo() {
        super();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
		ManagerInterfaceDao tid=new ManagerInterfaceImplDao();
		//传入Manager类
		request.setAttribute("Manager", tid.showManagerInfo(request.getParameter("username")));			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		//将list数据发送到.jsp文件中
		request.getRequestDispatcher("ManagerSelf.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

