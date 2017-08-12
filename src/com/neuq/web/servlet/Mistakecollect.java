package com.neuq.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.Student;
import com.neuq.service.I.MistakesInterfaceBiz;
import com.neuq.service.Impl.MistakesInterfaceImplBiz;
public class MistakeCollect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MistakeCollect() {
        super();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	MistakesInterfaceBiz mif=new MistakesInterfaceImplBiz();		
			//将list数据打包
    	Student s=(Student)request.getSession().getAttribute("Student");
		String uname=s.getUsername();
		System.out.println(uname);
		request.getSession().setAttribute("xztlist", mif.selectxzt(uname));

			//request.setAttribute("xztlist", mif.selectxzt(request.getParameter("username")));
			request.getSession().setAttribute("tktlist", mif.selecttkt(uname));
			request.getSession().setAttribute("bctlist", mif.selectbct(uname));
		//将list数据发送到.jsp文件中
		request.getRequestDispatcher("student/seeFaults.jsp").forward(request, response);
			//response.sendRedirect("");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

