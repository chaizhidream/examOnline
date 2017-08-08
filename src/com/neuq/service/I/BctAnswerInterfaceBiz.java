package com.neuq.service.I;

import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.BctAnswer;



public interface BctAnswerInterfaceBiz {

	public List<BctAnswer> select(String studentclass,String papername)throws SQLException;

}
