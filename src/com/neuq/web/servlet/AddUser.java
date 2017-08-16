package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.neuq.bean.Teacher;
import com.neuq.service.I.ManagerInterfaceBiz;
import com.neuq.service.Impl.ManagerInterfaceImplBiz;


public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public AddUser() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String teachername = request.getParameter("teachername");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String sex =request.getParameter("sex");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		Teacher t = new Teacher(teachername, pwd, name, sex, telephone, email);
			ManagerInterfaceBiz mInterfaceBiz=new ManagerInterfaceImplBiz();
			try {
				mInterfaceBiz.insert(t);
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
