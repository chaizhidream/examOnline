package com.neuq.dao.I;

import java.util.List;

import com.neuq.bean.Paper;



/**
 * 试卷数据库接口类
 *
 */
public interface PaperInterfaceDao {


	/**
	 * 增加一张试卷
	 * @param paper
	 * @return
	 */
	public boolean insert(Paper paper);
	
	/**
	 * 删除一张试卷
	 * @param paper
	 * @return
	 */
	public boolean delete(Paper paper);
	
	/**
	 * 更新修改一张试卷
	 * @param paper
	 * @return
	 */
//	public boolean update(Paper paper);
	
	/**
	 * 查询全部试卷
	 * @param 无
	 * @return  Paper 试卷集合
	 */
	public List<Paper> select();
	
	/**
	 * 按知识点查询试卷
	 * @param questionpoint
	 * @return  Paper 试卷集合
	 */
	public List<Paper> select(String questionpoint);
	/**
	 * 之前已经结束的考试
	 * @param username 
	 * @return
	 */
	public List<Paper> showbeforePaper(String username);
	/**
	 * 将要进行的考试
	 * @return
	 */
	public List<Paper> showafterPaper(String username);
	

	
	/**
	 * 根据试卷名查找当前对应的试卷对象
	 * @param papername
	 * @return  Paper 对象
	 */
	public Paper selectInstance(String papername);
     
	 /**
	 * 正在进行的考试
	 * @return
	 */
	public List<Paper> shownowPaper(String username);

	
	/**
	 * 防止提前交卷时的bug，查询可以考试的试卷前判断是否存在记录
	 * 为真，存在记录；为假，不存在记录
	 * @param username
	 * @param papername
	 * @return
	 */
	public boolean IsDone(String username, String papername);
}