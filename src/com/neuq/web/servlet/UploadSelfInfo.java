package com.neuq.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.Manager;
import com.neuq.bean.Student;
import com.neuq.bean.Teacher;

/**
 * 更新个人信息，看参数
 * 
 * @author Administrator
 *
 */
public class UploadSelfInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UploadSelfInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		
		String type = request.getParameter("usertype");

		String username = (String) request.getParameter("username");
		String pwd = (String) request.getParameter("pwd");
		String name = (String) request.getParameter("name");
		String sex = (String) request.getParameter("usex");
		String telephone = (String) request.getParameter("telephone");
		String email = (String) request.getParameter("email");
		if (type.equals("3")) {
			String studentclass = (String) request.getParameter("sclass");
			Student s = new Student(username, pwd, name, sex, studentclass, telephone, email);
			
			request.getSession().setAttribute("Student", s);
		//	System.out.println(request.getSession().getAttribute("Student")+">>>>>>>>>>");
			//request.getRequestDispatcher("/student/index.jsp").forward(request, response);
			// 更新后重定向到学生首页。
			PrintWriter out = response.getWriter();
			out.println("<html><head></head><body>");
			out.print("<script type=\"text/javascript\" language=\"javascript\">");
			out.print("alert('successful!!!');");
			out.print("window.location='student/index.jsp';");
			out.print("</script>");
			out.print("</body></html>");
			
			return;
		}
		if (type.equals("2")) {

			Teacher t = new Teacher(username, pwd, name, sex, telephone, email);
System.out.println(telephone.toString());
			request.getSession().setAttribute("Teacher", t);
			PrintWriter out = response.getWriter();
			out.println("<html><head></head><body>");
			out.print("<script type=\"text/javascript\" language=\"javascript\">");
			out.print("alert('successful!!!');");
			out.print("window.location='teacher/index.jsp';");
			out.print("</script>");
			out.print("</body></html>");
			// 更新后重定向至教师首页。
			//response.sendRedirect("teacher/index.jsp");
			return;
		}
		if (type.equals("1")) {

			Manager m = new Manager(username, pwd, name, sex, telephone, email);

			request.getSession().setAttribute("Manager", m);
			PrintWriter out = response.getWriter();
			out.println("<html><head></head><body>");
			out.print("<script type=\"text/javascript\" language=\"javascript\">");
			out.print("alert('successful!!!');");
			out.print("window.location='manager/index.jsp';");
			out.print("</script>");
			out.print("</body></html>");
			// 更新后重定向至管理员首页。
			//response.sendRedirect("manager/index.jsp");
			return;
		}

	}

}
