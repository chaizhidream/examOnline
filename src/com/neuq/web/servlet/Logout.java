package com.neuq.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//移除存储在session中的user对象，实现注销功能
	
		
		request.getSession().getAttribute("Student");
		request.getSession().getAttribute("Teacher");
		request.getSession().getAttribute("Manager");
		
		
		 String message1 = String.format(
					"注销成功！");
		String  message2 = String.format(
					"<meta http-equiv='refresh' content='0;url=%s'", 
					request.getContextPath()+"/index.jsp");
		
	 
		

		request.setAttribute("message2",message2);
		request.setAttribute("message1",message1);
		request.getRequestDispatcher("/message.jsp").forward(request, response);
	}

}
