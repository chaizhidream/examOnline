/**
 * 
 */
package com.neuq.util;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


import com.neuq.bean.Xzt;
import com.neuq.dao.BacthExcel;

public class SaveData{
	public void save(String path) throws IOException, SQLException {
		ReadExcel xlsMain = new ReadExcel();
		Xzt xzt = null;
		List<Xzt> list = xlsMain.readExcel(path);

		for (int i = 0; i < list.size(); i++) {
			xzt = list.get(i);
		
			BacthExcel.insert(xzt);
			
		}
	}
}
