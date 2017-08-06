package com.neuq.service.Impl;

import java.util.List;

import com.neuq.bean.Xzt;
import com.neuq.dao.I.XztInterfaceDao;
import com.neuq.dao.Impl.XztInterfaceImplDao;
import com.neuq.service.I.XztInterfaceBiz;

public class XztInterfaceImplBiz implements XztInterfaceBiz {
XztInterfaceDao xif=new XztInterfaceImplDao();
	@Override
	public boolean insert(Xzt xzt) {
		return xif.insert(xzt);
	}

	@Override
	public boolean delete(Xzt xzt) {
		return xif.delete(xzt);
	}

	@Override
	public boolean update(Xzt xzt) {
		return xif.update(xzt);
	}

	@Override
	public List<Xzt> select() {
		return xif.select();
	}

	@Override
	public List<Xzt> select(String questionpoint) {
		return xif.select(questionpoint);
	}

}
