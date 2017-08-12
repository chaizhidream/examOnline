package com.neuq.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.BctAnswer;
import com.neuq.dao.I.BctAnswerInterfaceDao;
import com.neuq.dao.Impl.BctAnswerInterfaceImplDao;


public class CorrectPaper extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CorrectPaper() {
        super();
        // TODO Auto-generated constructor stub
    }

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+"123");
		//String studentname=request.getParameter("username");
		//String papername=request.getParameter("papername");
		String studentname=request.getParameter("fang");
		String papername=request.getParameter("测试试卷二");
		studentname="fang";
		papername="测试试卷二";
		BctAnswerInterfaceDao bf=new BctAnswerInterfaceImplDao();
		List<BctAnswer> bca=new ArrayList<BctAnswer>();
		List<BctAnswer> bcw=new ArrayList<BctAnswer>();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+"456");
		bca=bf.select(studentname, papername);//wp
		bcw=bf.selectwp(studentname, papername);//yp
		System.out.println(bca.toString());
		System.out.println(bcw.toString());
		bca.forEach(i->System.out.println(i.toString()+"123"));
		bcw.forEach(i->System.out.println(i.toString()+"456"));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+"789");
		request.getSession().setAttribute("Bctanwseryp", bcw);
		request.getSession().setAttribute("Bctanwserwp", bca);
		//重定向
		response.sendRedirect("teacher/uncompletePaper2.jsp");
		
//向前端传递数据
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
