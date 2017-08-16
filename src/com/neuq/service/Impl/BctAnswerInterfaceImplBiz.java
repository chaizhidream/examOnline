package com.neuq.service.Impl;

import java.sql.SQLException;
import java.util.List;

import com.neuq.bean.BctAnswer;
import com.neuq.dao.I.BctAnswerInterfaceDao;
import com.neuq.dao.Impl.BctAnswerInterfaceImplDao;
import com.neuq.service.I.BctAnswerInterfaceBiz;

public class BctAnswerInterfaceImplBiz implements BctAnswerInterfaceBiz {
              BctAnswerInterfaceDao bfc=new BctAnswerInterfaceImplDao();
	@Override
	public List<BctAnswer> select(String studentclass, String papername) throws SQLException {
		return bfc.select(studentclass, papername);
	}

}
