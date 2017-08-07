package com.neuq.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.neuq.dao.I.PaperInterfaceDao;
import com.neuq.dao.Impl.PaperInterfaceImplDao;


/**
 * Servlet implementation class ShowPaper
 */

public class ShowPaper extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowPaper() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                 doPost(request, response);
                 
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PaperInterfaceDao pif=new PaperInterfaceImplDao();
		request.setAttribute("PaperBefore",pif.showbeforePaper());
		request.setAttribute("PaperAfter",pif.showafterPaper());
		request.setAttribute("PaperNow",pif.shownowPaper());
		//Ìø×ªµ½ÊÔ¾íÒ³
		request.getRequestDispatcher("/paper.jsp").forward(request, response);
	}
}
