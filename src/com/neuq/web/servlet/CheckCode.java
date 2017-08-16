package com.neuq.web.servlet;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckCode
 */

public class CheckCode extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckCode() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doPost(request, response);	
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String vercode=request.getParameter("vcode");  
        HttpSession session=request.getSession(true);  
        if(session.getAttribute("code")!=null){  
              
            String rand=(String) session.getAttribute("code");  
              
            OutputStream os=response.getOutputStream();  
            if(rand.equalsIgnoreCase(vercode)){  
                os.write("1".getBytes());  
            }  
            os.flush();
            os.close();
        }  
	
	
	
	}

}
