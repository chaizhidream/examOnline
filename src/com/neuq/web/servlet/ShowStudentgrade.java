package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.StudentGrade;
import com.neuq.dao.I.TeacherInterfaceDao;
import com.neuq.dao.Impl.TeacherInterfaceImplDao;
import com.neuq.service.I.TeacherInterfaceBiz;
import com.neuq.service.Impl.TeacherInterfaceImplBiz;


public class ShowStudentgrade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowStudentgrade() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentclass =(String) request.getAttribute("studentclass");
		String papername=(String) request.getAttribute("papername");
		
		//这里要用service层封装
		TeacherInterfaceDao t=new TeacherInterfaceImplDao();
		List<StudentGrade> sg=null;
		try {
			sg=t.studentgrade(studentclass, papername);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("StudentGrade", sg);
		
		response.sendRedirect("teacher/studentgrade.jsp");
		
	}

}
