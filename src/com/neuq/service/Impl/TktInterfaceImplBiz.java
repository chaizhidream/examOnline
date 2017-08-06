package com.neuq.service.Impl;

import java.util.List;

import com.neuq.bean.Tkt;
import com.neuq.dao.I.TktInterfaceDao;
import com.neuq.dao.Impl.TktInterfaceImplDao;
import com.neuq.service.I.TktInterfaceBiz;

public class TktInterfaceImplBiz implements TktInterfaceBiz {
TktInterfaceDao tif= new TktInterfaceImplDao();
	@Override
	public boolean insert(Tkt tkt) {
		return tif.insert(tkt);
	}

	@Override
	public boolean delete(Tkt tkt) {
		return tif.delete(tkt);
	}

	@Override
	public boolean update(Tkt tkt) {
		return tif.update(tkt);
	}

	@Override
	public List<Tkt> select() {
		return tif.select();
	}

	@Override
	public List<Tkt> select(String questionpoint) {
		return tif.select(questionpoint);
	}

}
