package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.Student;
import com.neuq.service.I.ManagerInterfaceBiz;
import com.neuq.service.I.TeacherInterfaceBiz;
import com.neuq.service.Impl.ManagerInterfaceImplBiz;
import com.neuq.service.Impl.TeacherInterfaceImplBiz;

public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteUser() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String username = request.getParameter("username");
			String usertype = request.getParameter("usertype");
			Student stu = (Student) request.getSession().getAttribute("student");
			if(Integer.parseInt(usertype) == 2){
				ManagerInterfaceBiz mInterfaceBiz=new ManagerInterfaceImplBiz();
				try {
					mInterfaceBiz.delete(username);
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			else{
				TeacherInterfaceBiz mInterfaceBiz=new TeacherInterfaceImplBiz();
				try {
					mInterfaceBiz.delete(username,stu.getStudentclass());
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
