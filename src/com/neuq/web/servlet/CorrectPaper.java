package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.BctAnswer;
import com.neuq.service.I.BctAnswerInterfaceBiz;
import com.neuq.service.Impl.BctAnswerInterfaceImplBiz;

public class CorrectPaper extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CorrectPaper() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String studentclass=request.getParameter("studentclass");
		String papername=request.getParameter("papername");
		BctAnswerInterfaceBiz bf=new BctAnswerInterfaceImplBiz();
		List<BctAnswer> bca=new ArrayList<BctAnswer>();
		
		try {
			bca=bf.select(studentclass, papername);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.getSession().setAttribute("Bctanwser", bca);
		//重定向
		response.sendRedirect("/student/paper.jsp");
		
//向前端传递数据
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
