package com.neuq.web.servlet;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.Paper;

import com.neuq.service.I.PaperInterfaceBiz;
import com.neuq.service.Impl.PaperInterfaceImplBiz;


/**
 * Servlet implementation class ShowAllPaper
 */
public class ShowAllPaper extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ShowAllPaper() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 全部或按知识点显示试卷，返回paperlist
		 */
		List<Paper> lista   = new ArrayList<Paper>();
		List<Paper> listb   = new ArrayList<Paper>();
		lista = null;
		listb = null;
		PaperInterfaceBiz pif= new PaperInterfaceImplBiz();
		String selectpoint = request.getParameter("selectpoint");
		if(Integer.parseInt(selectpoint) == 1) {
			lista = pif.select();
			request.setAttribute("list",lista);
			request.getRequestDispatcher("/teacher/getAllPaper.jsp").forward(request, response);
		}
		else {
			lista = pif.select("java");
			listb = pif.select("c++");
			request.setAttribute("java",lista);
			request.setAttribute("c++",listb);
			//按知识点显示试卷名称等信息
			response.sendRedirect("/teacher/showpaper.jsp");
			request.getRequestDispatcher("/teacher/seepaper.jsp").forward(request, response);
		}
		
		
		doGet(request, response);
	}

}
