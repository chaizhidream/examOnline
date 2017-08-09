package com.neuq.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;

import com.jspsmart.upload.SmartFile;
import com.jspsmart.upload.SmartFiles;
import com.jspsmart.upload.SmartRequest;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
import com.neuq.dao.I.TeacherInterfaceDao;
import com.neuq.dao.Impl.TeacherInterfaceImplDao;

public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Upload() {
		super();

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SmartUpload su = new SmartUpload();
		//smartupload 
		PageContext pageContext=JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8192, true);
		// 初始化
		su.initialize(pageContext);
		// 设置文件上传可以的类型
		su.setAllowedFilesList("xls,xlsx,txt");
		// 设置上传单个文件的大小
		su.setMaxFileSize(1024 * 1024 * 10);// 10mb
		// 设置总上传文件的大小
		su.setTotalMaxFileSize(1024 * 1024 * 10 * 5);
		// 50mb
		try {
			su.upload();
		} catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// 开始处理上传

		// 获取文件上传类型的请求对象
		SmartRequest srequest = su.getRequest();

		String msg = srequest.getParameter("msg");
		// 获取被上传的文件
		SmartFiles sfs = su.getFiles();
		// 获取一个
		SmartFile sf = sfs.getFile(0);
		try {
			sf.saveAs("/upload//34.xls" ,1);
		} catch (SmartUploadException e) {
			e.printStackTrace();
		}
	System.out.println(msg );
//		System.out.println(sf.getFilePathName());
//		System.out.println(sf.getFileName());
		String path = request.getServletContext().getRealPath("/");
		System.out.println("文件上传成功！");
		TeacherInterfaceDao teacherInterfaceDao = new TeacherInterfaceImplDao();
		try {
			System.out.println(msg+"  1111" + sf.getFileName()+"1111"+path);

			teacherInterfaceDao.batchquestion(Integer.parseInt(msg),sf.getFileName(),path);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}}