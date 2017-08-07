package com.neuq.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.neuq.dao.I.MistakesInterfaceDao;
import com.neuq.dao.Impl.MistakeInterfaceImplDao;
public class Mistakecollect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Mistakecollect() {
        super();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	MistakesInterfaceDao mif=new MistakeInterfaceImplDao();		
			//将list数据打包
			request.setAttribute("xztlist", mif.selectxzt(request.getParameter("username")));
			request.setAttribute("tktlist", mif.selecttkt(request.getParameter("username")));
			request.setAttribute("bctlist", mif.selectbct(request.getParameter("username")));
		//将list数据发送到.jsp文件中
		request.getRequestDispatcher("mistakecollect.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

