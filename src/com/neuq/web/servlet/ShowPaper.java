package com.neuq.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.Student;
import com.neuq.dao.I.PaperInterfaceDao;
import com.neuq.dao.Impl.PaperInterfaceImplDao;




public class ShowPaper extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ShowPaper() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PaperInterfaceDao pif=new PaperInterfaceImplDao();
		System.out.println(">>>>>><<<<<>>>>>>>");
		
		Student s =(Student)request.getSession().getAttribute("Student");
		System.out.println(s.getUsername());
		request.getSession().setAttribute("PaperBefore",pif.showbeforePaper(s.getUsername()));
		request.getSession().setAttribute("PaperAfter",pif.showafterPaper(s.getUsername()));
		request.getSession().setAttribute("PaperNow",pif.shownowPaper(s.getUsername()));
		//Ìø×ªµ½ÊÔ¾íÒ³
		response.sendRedirect("student/showExam.jsp");
		//request.getRequestDispatcher("student/showExam.jsp").forward(request, response);
		
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
