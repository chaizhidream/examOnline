package com.neuq.web.servlet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.neuq.bean.StudentGrade;
import com.neuq.dao.Impl.StudentGradeInterfaceImplDao;
import com.neuq.util.WriteExcel;



public class ExportExcel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ExportExcel() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		WriteExcel wl=new WriteExcel();
		//List<StudentGrade> list=(List<StudentGrade>)request.getAttribute("listStudentGrade");
		List<StudentGrade> list=new StudentGradeInterfaceImplDao().select("fang");
		System.out.println(list);
		HSSFWorkbook wb =wl.writeExcel(list);
		String fileName = "学生成绩表";    
		ByteArrayOutputStream os = new ByteArrayOutputStream();  
		
		wb.write(os);    
		byte[] content = os.toByteArray();      
		InputStream is = new ByteArrayInputStream(content);    
		// 设置response参数，可以打开下载页面     
		response.reset();    
		response.setContentType("application/vnd.ms-excel;charset=utf-8");   
		response.setHeader("Content-Disposition", "attachment;filename="  + new String((fileName + ".xls").getBytes(), "iso-8859-1"));       
		ServletOutputStream out = response.getOutputStream();  
		BufferedInputStream bis = null;     
		BufferedOutputStream bos = null;   
		try {         
			bis = new BufferedInputStream(is);   
			bos = new BufferedOutputStream(out);     
			byte[] buff = new byte[2048];         
			int bytesRead;       
			// Simple read/write loop.   
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {  
				bos.write(buff, 0, bytesRead);    
				}      
			} catch (Exception e) {    
				// TODO: handle exception  
				e.printStackTrace();   
				} finally {       
					if (bis != null)   
						bis.close(); 
					if (bos != null)       
						bos.close();
					} 
		}

	}


