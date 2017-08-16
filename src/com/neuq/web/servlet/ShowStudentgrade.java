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



public class ShowStudentGrade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowStudentGrade() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TeacherInterfaceDao teacherInterfaceDao = new TeacherInterfaceImplDao();
		String[] studentclass = null;
		try {
			studentclass = teacherInterfaceDao.selectclass();
		} catch (SQLException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		String[] papername = null;
		try {
			papername = teacherInterfaceDao.selectpaper();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
			
			request.getSession().setAttribute("studentclass", studentclass);
			request.getSession().setAttribute("papername", papername);
		//这里要用service层封装
		
	
		response.sendRedirect("teacher/checkExamResult.jsp");
		
	}

}
