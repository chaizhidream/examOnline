package com.neuq.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.Paper;
import com.neuq.bean.Student;
import com.neuq.service.I.StudentGradeInterfaceBiz;
import com.neuq.service.Impl.StudentGradeInterfaceImplBiz;


public class CalculationBctScore extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CalculationBctScore() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int score = Integer.parseInt(request.getParameter("score"));
		Student stu = (Student) request.getSession().getAttribute("student");
		Paper paper = (Paper) request.getSession().getAttribute("paper");
	    StudentGradeInterfaceBiz studentGradeInterfaceBiz= new StudentGradeInterfaceImplBiz();
	    studentGradeInterfaceBiz.update(score,stu.getUsername(),paper.getPapername());
	   /**
	    * ²»ÌøÒ³Ãæ
	    */
	    request.getRequestDispatcher("/.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
