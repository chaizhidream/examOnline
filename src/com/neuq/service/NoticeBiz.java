package com.neuq.service;

import java.sql.SQLException;
import com.neuq.dao.NoticeDao;


public class NoticeBiz {
	
	public String select() throws SQLException {
		NoticeDao bfc=new NoticeDao();
		return bfc.select();
	}
	
	
	public boolean update(String information) throws SQLException {
		NoticeDao bfc=new NoticeDao();
		return bfc.update(information);
	}
	
}
