package com.neuq.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.SmartFile;
import com.jspsmart.upload.SmartFiles;
import com.jspsmart.upload.SmartRequest;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Upload() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
SmartUpload su=new SmartUpload();

		//初始化
		 su.initialize(null);
		 //设置文件上传可以的类型
		 su.setAllowedFilesList("xls,xlsx");
		 //设置上传单个文件的大小
		 su.setMaxFileSize(1024*1024*10);//10mb
		 //设置总上传文件的大小
		 su.setTotalMaxFileSize(1024*1024*10*5);
		 //50mb
		 try {
			su.upload();
		} catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//开始处理上传
		 
		 //获取文件上传类型的请求对象
		 SmartRequest srequest=su.getRequest();
		 
		 String msg=srequest.getParameter("msg");
		 //获取被上传的文件
		 SmartFiles sfs=su.getFiles();
		 //获取一个
		 SmartFile sf=sfs.getFile(0);
		 
		 //out.println(sf.getSize()+"<br/>");
		 
		 //String path=request.getContextPath()+"/pic";
		 try {
			sf.saveAs("upload/"+sf.getFileName());
		} catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("文件上传成功！");
	}

}
