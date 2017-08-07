/**
 * 
 */
package com.neuq.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.neuq.bean.Xzt;


public class ReadExcel {

	public List<Xzt> readExcel(String path) throws IOException {
		InputStream is = new FileInputStream(path);
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		Xzt xzt = null;
		List<Xzt> list = new ArrayList<Xzt>();
		// 循环工作表Sheet
		for (int numSheet = 0; numSheet < hssfWorkbook.getNumberOfSheets(); numSheet++) {
			HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
			if (hssfSheet == null) {
				continue;
			}
			// 循环行Row
			for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
				HSSFRow hssfRow = hssfSheet.getRow(rowNum);
				if (hssfRow != null) {
					xzt = new Xzt();
					HSSFCell question = hssfRow.getCell(0);
					HSSFCell answer = hssfRow.getCell(1);
					HSSFCell opA = hssfRow.getCell(2);
					HSSFCell opB = hssfRow.getCell(3);
					HSSFCell opC = hssfRow.getCell(4);
					HSSFCell opD = hssfRow.getCell(5);
				//	HSSFCell questiontype = hssfRow.getCell(6);
					HSSFCell questionpoint = hssfRow.getCell(7);
					xzt.setQuestion(getValue(question));
					xzt.setAnswer(getValue(answer));
					xzt.setOptionA(getValue(opA));
					xzt.setOptionB(getValue(opB));
					xzt.setOptionC(getValue(opC));
					xzt.setOptionD(getValue(opD));
					//选择题种类为1
					xzt.setQuestiontype(1);
					xzt.setQuestionpoint(getValue(questionpoint));
					list.add(xzt);
				}
			}
		}
		return list;
	}
	
	 @SuppressWarnings("static-access")
	private String getValue(HSSFCell hssfCell) {
	        if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
	            // 返回布尔类型的值
	            return String.valueOf(hssfCell.getBooleanCellValue());
	        } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
	            // 返回数值类型的值
	            return String.valueOf(hssfCell.getNumericCellValue());
	        } else {
	            // 返回字符串类型的值
	            return String.valueOf(hssfCell.getStringCellValue());
	        }
	    }
}
