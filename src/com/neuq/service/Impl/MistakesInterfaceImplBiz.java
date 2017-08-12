package com.neuq.service.Impl;

import java.util.ArrayList;
import java.util.List;

import com.neuq.bean.Bct;
import com.neuq.bean.Mistakes;
import com.neuq.bean.Tkt;
import com.neuq.bean.Xzt;
import com.neuq.dao.I.MistakesInterfaceDao;
import com.neuq.dao.Impl.MistakeInterfaceImplDao;
import com.neuq.service.I.MistakesInterfaceBiz;
import com.neuq.util.QuestionInstance;

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
	public List<Xzt> selectxzt(String username) {
		List<Mistakes> mi= mif.selectxzt(username);
		List<Xzt> xzt=new ArrayList<Xzt>();
		for (int i = 0; i <mi.size(); i++) {
			System.out.println(QuestionInstance.getXzt(mi.get(i).getQuestionid()).toString());
			xzt.add(QuestionInstance.getXzt(mi.get(i).getQuestionid()));
		}
		return xzt;
	}
	public List<Tkt> selecttkt(String username) {
		List<Mistakes> mi= mif.selecttkt(username);
		List<Tkt> tkt=new ArrayList<Tkt>();
		for (int i = 0; i <mi.size(); i++) {
			System.out.println(QuestionInstance.getTkt(mi.get(i).getQuestionid()).toString());
			tkt.add(QuestionInstance.getTkt(mi.get(i).getQuestionid()));
		}
		return tkt;
	}
	public List<Bct> selectbct(String username) {
		List<Mistakes> mi= mif.selectbct(username);
		List<Bct> bct=new ArrayList<Bct>();
		for (int i = 0; i <mi.size(); i++) {
			System.out.println(QuestionInstance.getBct(mi.get(i).getQuestionid()).toString());
			bct.add(QuestionInstance.getBct(mi.get(i).getQuestionid()));
		}
		return bct;
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
