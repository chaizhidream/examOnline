package com.neuq.dao.I;

import java.util.List;

import com.neuq.bean.BctAnswer;

public interface BctAnswerInterfaceDao {
	
public List<BctAnswer> select(String studentclass,String papername);
public List<BctAnswer> selectwp(String studentclass,String papername);
public boolean insert(BctAnswer bctanswer);



}
