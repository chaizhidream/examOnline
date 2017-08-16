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

import com.neuq.bean.Bct;
import com.neuq.bean.Tkt;
import com.neuq.bean.Xzt;


public class ReadExcel {

	public List<Xzt> readExcelxzt(String path) throws IOException {
		System.out.println(path);
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

	public List<Bct> readExcelbct(String path) throws IOException {
		InputStream is = new FileInputStream(path);
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		Bct bct = null;
		List<Bct> list = new ArrayList<Bct>();
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
					bct = new Bct();
					HSSFCell question = hssfRow.getCell(0);
					HSSFCell questionpoint = hssfRow.getCell(2);
					bct.setQuestion(getValue(question));
					//编程题种类为3
					bct.setQuestiontype(1);
					bct.setQuestionpoint(getValue(questionpoint));
					list.add(bct);
				}
			}
		}
		return list;
	}

	public List<Tkt> readExceltkt(String path) throws IOException {
		InputStream is = new FileInputStream(path);
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
		Tkt tkt = null;
		List<Tkt> list = new ArrayList<Tkt>();
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
					tkt = new Tkt();
					System.out.println("444   "+rowNum);
					HSSFCell question = hssfRow.getCell(0);
					HSSFCell answer = hssfRow.getCell(1);
					HSSFCell questionpoint = hssfRow.getCell(3);
					tkt.setQuestion(getValue(question));
					System.out.println("555   "+getValue(question));
					tkt.setAnswer(getValue(answer));
					System.out.println("666   "+getValue(answer));
					//填空题种类为2
					tkt.setQuestiontype(2);
					tkt.setQuestionpoint(getValue(questionpoint));
					list.add(tkt);
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
