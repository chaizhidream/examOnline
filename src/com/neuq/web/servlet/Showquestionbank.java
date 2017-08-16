package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.neuq.dao.I.TeacherInterfaceDao;
import com.neuq.dao.Impl.TeacherInterfaceImplDao;


public class ShowQuestionBank extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ShowQuestionBank() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession();
		TeacherInterfaceDao tid=new TeacherInterfaceImplDao();
		try {
			session.setAttribute("xzt",tid.showPaperbankxzt());		
			session.setAttribute("tkt",tid.showPaperbanktkt());		
			session.setAttribute("bct",tid.showPaperbankbct());
			
//			//json
//			JSONObject jsonObject = new JSONObject();
//			jsonObject.put("xzt", tid.showPaperbankxzt());
//			JSONArray jsonArray = new JSONArray();
//			jsonArray.add(jsonObject); 
//			System.out.println(jsonArray.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
