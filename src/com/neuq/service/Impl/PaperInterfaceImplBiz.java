package com.neuq.service.Impl;

import java.util.List;

import com.neuq.bean.Paper;
import com.neuq.dao.I.PaperInterfaceDao;
import com.neuq.dao.Impl.PaperInterfaceImplDao;
import com.neuq.service.I.PaperInterfaceBiz;

public class PaperInterfaceImplBiz implements PaperInterfaceBiz {
PaperInterfaceDao pif=new PaperInterfaceImplDao();
	@Override
	public boolean insert(Paper paper) {
		return pif.insert(paper);
	}

	@Override
	public boolean delete(Paper paper) {
		return pif.delete(paper);
	}

	@Override
	public List<Paper> select() {
		return pif.select();
	}

	@Override
	public List<Paper> select(String questionpoint) {
		return pif.select(questionpoint);
	}

}
