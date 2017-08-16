package com.neuq.dao.I;

import java.util.List;

import com.neuq.bean.Mistakes;

/**
 * 错题集数据库接口类
 *
 */
public interface MistakesInterfaceDao {

	/**
	 * 增加一道错题
	 * @param mistakes
	 * @return
	 */
	public boolean insert(Mistakes mistakes);
	
	/**
	 * 删除一道错题
	 * @param mistakes
	 * @return
	 */
	public boolean delete(Mistakes mistakes);
	
	
	
	/**
	 * 查询某个学生的全部错题  
	 * @param username 学生姓名
	 * @return 错题集合
	 */
	public List<Mistakes> selectxzt(String username);
	public List<Mistakes> selecttkt(String username);
	public List<Mistakes> selectbct(String username);
	
	/**
	 * 按知识点查询某个学生的全部错题
	 * @param username 学生姓名
	 * @param  questionpoint 知识点
	 * @return 错题集合
	 */
	public List<Mistakes> select(String username,String questionpoint);
}
