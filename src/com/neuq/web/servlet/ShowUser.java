package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.Student;
import com.neuq.bean.Teacher;
import com.neuq.service.I.ManagerInterfaceBiz;
import com.neuq.service.I.TeacherInterfaceBiz;
import com.neuq.service.Impl.ManagerInterfaceImplBiz;
import com.neuq.service.Impl.TeacherInterfaceImplBiz;



public class ShowUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ShowUser() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usertype = request.getParameter("usertype");
		String studentclass = request.getParameter("studentclass");
		if(Integer.parseInt(usertype) == 2){
			ManagerInterfaceBiz mInterfaceBiz=new ManagerInterfaceImplBiz();
			ArrayList<Teacher> list = null;
			try {
				list = (ArrayList<Teacher>) mInterfaceBiz.select();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			request.setAttribute("teacherlist",list);
			request.getRequestDispatcher("managerTeacher.jsp").forward(request,response);
		}
		else {
			TeacherInterfaceBiz mInterfaceBiz=new TeacherInterfaceImplBiz();
			ArrayList<Student> list = null;
			try {
				list = (ArrayList<Student>) mInterfaceBiz.select(studentclass);
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			request.setAttribute("studentlist",list);
			request.getRequestDispatcher("teacherStudent.jsp").forward(request,response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
