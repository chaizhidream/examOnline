package com.neuq.util;

import java.io.IOException;
import java.util.List;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.neuq.bean.StudentGrade;

public class WriteExcel {
       public HSSFWorkbook writeExcel(List<StudentGrade> list) throws IOException {
    	   
    	   // 1.创建一个workbook，对应一个Excel文件
    	   HSSFWorkbook wb = new HSSFWorkbook();     
    	   // 2.在workbook中添加一个sheet，对应Excel中的一个sheet   
    	   HSSFSheet sheet = wb.createSheet("学生成绩表");   
    	   // 3.在sheet中添加表头第0行，老版本poi对excel行数列数有限制short     
    	   HSSFRow row = sheet.createRow((int) 0);     
    	   // 4.创建单元格，设置值表头，设置表头居中
    	   HSSFCellStyle style = wb.createCellStyle();  
    	   // 居中格式   
    	   style.setAlignment(HSSFCellStyle.ALIGN_CENTER);     
    	   // 设置表头     
    	   HSSFCell cell = row.createCell(0);  
    	   cell.setCellValue("用户名");     
    	   cell.setCellStyle(style);     
    	   cell = row.createCell(1);   
    	   cell.setCellValue("选择题得分");   
    	   cell.setCellStyle(style);     
    	   cell = row.createCell(2);     
    	   cell.setCellValue("填空题得分");   
    	   cell.setCellStyle(style);      
    	   cell = row.createCell(3);    
    	   cell.setCellValue("编程题得分");   
    	   cell.setCellStyle(style);    
    	   cell = row.createCell(4);      
    	   cell.setCellValue("总分");    
    	   cell.setCellStyle(style); 
    	   cell = row.createCell(5);      
    	   cell.setCellValue("试卷名称");    
    	   cell.setCellStyle(style); 
    	   
    	// 循环将数据写入Excel   
    	   for (int i = 0; i < list.size(); i++) {    
    		   row = sheet.createRow((int) i + 1);  
    		   StudentGrade sg= list.get(i);  
    		   // 创建单元格，设置值         
    		   row.createCell(0).setCellValue(sg.getUsername());   
    		   row.createCell(1).setCellValue(sg.getXztscore()); 
    		   row.createCell(2).setCellValue(sg.getTktscore());   
    		   row.createCell(3).setCellValue(sg.getBctscore()); 
    		   row.createCell(4).setCellValue(sg.getXztscore()+sg.getTktscore()+sg.getBctscore());  
    		   row.createCell(5).setCellValue(sg.getPapername());
    		   } 
    	   
    	     	  
		return wb; 
	
}
}
