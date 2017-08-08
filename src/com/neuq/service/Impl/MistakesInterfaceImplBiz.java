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
	public List<Mistakes> selectxzt(String username) {
		return mif.selectxzt(username);
	}
	public List<Mistakes> selecttkt(String username) {
		return mif.selecttkt(username);
	}
	public List<Mistakes> selectbct(String username) {
		return mif.selectbct(username);
	}

	@Override
	public List<Mistakes> select(String username, String questionpoint) {
		return mif.select(username,questionpoint);
	}

	@Override
	public List<Mistakes> select(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
