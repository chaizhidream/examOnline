package com.neuq.web.servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuq.service.NoticeBiz;

public class GetNotice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetNotice() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String information = "暂无新公告";
		NoticeBiz nb = new NoticeBiz();
		try {
			information = nb.select();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		OutputStream os = response.getOutputStream();
		os.write(information.getBytes());
		os.flush();
		os.close();
	}

}
