package com.neuq.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuq.bean.Student;

public class StudentFilter implements Filter {


    public StudentFilter() {
        // TODO Auto-generated constructor stub
    }


	public void destroy() {
		System.out.println("学生过滤器停止工作");
	}

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		HttpSession session = request.getSession();
		Student s = (Student) session.getAttribute("Student");
		if(s == null){			
			response.sendRedirect("../index.jsp");
			return;
		}
		String username=s.getUsername();
		int rule=s.getRu();
		if (rule != 3 || "".equals(username)) {				
				response.sendRedirect("../index.jsp");
				return;		
		}
		else
		  {
			chain.doFilter(request, response);		    
		  }
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("学生过滤器开始工作");
	}

}
