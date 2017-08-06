package com.neuq.service.Impl;

import java.util.List;

import com.neuq.bean.Mistakes;
import com.neuq.dao.I.MistakesInterfaceDao;
import com.neuq.dao.Impl.MistakeInterfaceImplDao;
import com.neuq.service.I.MistakesInterfaceBiz;

public class MistakesInterfaceImplBiz implements MistakesInterfaceBiz {
	MistakesInterfaceDao mif= new MistakeInterfaceImplDao();
	@Override
	public boolean insert(Mistakes mistakes) {
		return mif.insert(mistakes);
	}

	@Override
	public boolean delete(Mistakes mistakes) {
		return mif.delete(mistakes);
	}

	@Override
	public List<Mistakes> select(String username) {
		return mif.select(username);
	}

	@Override
	public List<Mistakes> select(String username, String questionpoint) {
		return mif.select(username,questionpoint);
	}

}
