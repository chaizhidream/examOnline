package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.bean.PaperString;
import com.neuq.dao.I.TeacherInterfaceDao;
import com.neuq.dao.Impl.TeacherInterfaceImplDao;
public class ShowNeedPaper extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ShowNeedPaper() {
        super();
    }
    /**
     * 查看老师选中的那张试卷，根据试卷名来查
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String papername = request.getParameter("papername");
		TeacherInterfaceDao teacherInterfaceDao = new TeacherInterfaceImplDao();
		try {
			PaperString pString =teacherInterfaceDao.showPaper(papername);
			request.setAttribute("paper",pString);
			//显示所选的试卷内容，调用pSting.xzt1qu等即可，jsp待定
			request.getRequestDispatcher("/teacher/XXXX.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
