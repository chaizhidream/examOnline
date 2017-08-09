package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.Manager;
import com.neuq.bean.Student;
import com.neuq.bean.Teacher;
import com.neuq.dao.I.ManagerInterfaceDao;
import com.neuq.dao.I.TeacherInterfaceDao;
import com.neuq.dao.Impl.ManagerInterfaceImplDao;
import com.neuq.dao.Impl.TeacherInterfaceImplDao;
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
	TeacherInterfaceDao tea=new TeacherInterfaceImplDao();
	ManagerInterfaceDao man=new ManagerInterfaceImplDao();
		//用户登录
		Student stu=null;
		Teacher te=null;
		Manager ma=null;
		int r  = 0;
		try {
			System.out.println("即将进行登录检测");
			stu = service.login(uname, upsw);
			te = tea.login(uname, upsw);
			ma = man.login(uname, upsw);
			System.out.println("登录检测完成,即将跳转");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(stu != null) {
			 r=stu.getRu();
	        System.out.print(r);
		}
		else if(te != null) {
			 r=te.getRu();
		    System.out.print(r);
		}
		else if(ma != null) {
			 r=ma.getRu();
		    System.out.print(r);
		}
		else{
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
	//	request.getSession().setAttribute("Student", stu);
		
System.out.println("aaaaaaaaaaaaa");

		if (r==1) {
			//跳到管理员界面
			 message1 = String.format(
						"管理员登陆成功！");
			 message2 = String.format(
						"<meta http-equiv='refresh' content='3;url=%s'", 
						request.getContextPath()+"/manager/managerIndex.jsp");
			 			request.getSession().setAttribute("Manager",ma);

		}
		else if(r==2){
			//跳到教师界面
			 message1 = String.format(
						"教师登陆成功！");
			 message2 = String.format(
						"<meta http-equiv='refresh' content='3;url=%s'", 
						request.getContextPath()+"/teacher/index.jsp");
			
			  request.getSession().setAttribute("Teacher",te);
	}
		else if(r == 3) {
			System.out.println(stu.toString());
			System.out.println("跳到学生登录成功页面");
			//跳转到学生页面
			 message1 = String.format(
						"学生登陆成功！");
			 message2 = String.format(
						"<meta http-equiv='refresh' content='3;url=%s'", 
						request.getContextPath()+"/student/studentIndex.jsp");
			
		  request.getSession().setAttribute("Student",stu);
	}

		
		
		
		
		request.setAttribute("message2",message2);
		request.setAttribute("message1",message1);
		request.getRequestDispatcher("/message.jsp").forward(request, response);
	}

	}


