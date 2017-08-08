package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.Student;
import com.neuq.service.I.StudentInterfaceBiz;
import com.neuq.service.Impl.StudentInterfaceImplBiz;


/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
    }

	public void destroy() {
		super.destroy();

	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//复用doPost方法
	this.doPost(request, response);
		
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获得ServletContext对象

		String uname=request.getParameter("username");
		String upsw=request.getParameter("password");
		String message1 =null;
		String message2 =null;
	StudentInterfaceBiz service=new StudentInterfaceImplBiz();
	
		//用户登录
		Student stu=null;
		try {
			stu = service.login(uname, upsw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(stu==null){
			 message1 = String.format(
						"对不起，用户名或密码有误！！请重新登录！2秒后为您自动跳到登录页面！");
			 
			 message2 = String.format(
					"<meta http-equiv='refresh' content='2;url=%s'", 
					request.getContextPath()+"/login.jsp");
			 request.setAttribute("message1",message1);
			request.setAttribute("message2",message2);
			request.getRequestDispatcher("/message.jsp").forward(request, response);
			return;
		}
		
		//登录成功后，就将用户存储到session中
		request.getSession().setAttribute("user", stu);
		int r=stu.getRu();
        System.out.print(r);


		if (r==1) {
			//跳到管理员界面
			 message1 = String.format(
						"管理员登陆成功！");
	 message2 = String.format(
				"<meta http-equiv='refresh' content='3;url=%s'", 
				request.getContextPath()+"/teacher/index.jsp");

		} else if(r==2){
			//跳到普通用户界面
			 message1 = String.format(
						"教师登陆成功！");
			 message2 = String.format(
						"<meta http-equiv='refresh' content='3;url=%s'", 
						request.getContextPath()+"/teacher/index.jsp");
			 
	}else {
		//跳转到学生页面
		 message1 = String.format(
					"学生登陆成功！");
		 message2 = String.format(
					"<meta http-equiv='refresh' content='3;url=%s'", 
					request.getContextPath()+"/user/index.jsp");
		 
	}
		
		
		
		request.setAttribute("message2",message2);
		request.setAttribute("message1",message1);
		request.getRequestDispatcher("/message.jsp").forward(request, response);
	}

	}


