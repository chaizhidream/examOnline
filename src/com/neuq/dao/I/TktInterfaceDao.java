package com.neuq.dao.I;

import java.util.List;

import com.neuq.bean.Tkt;



/**
 * 填空题数据库接口类
 *
 */
public interface TktInterfaceDao {


	/**
	 * 增加一道填空题
	 * @param tkt
	 * @return
	 */
	public boolean insert(Tkt tkt);
	
	/**
	 * 删除一道填空题
	 * @param tkt
	 * @return
	 */
	public boolean delete(Tkt tkt);
	
	/**
	 * 更新修改一道填空题
	 * @param tkt
	 * @return
	 */
	public boolean update(Tkt tkt);
	
	/**
	 * 查询全部填空题
	 * @param tkt
	 * @return 填空题集合
	 */
	public List<Tkt> select();
	
	/**
	 * 按知识点查询填空题
	 * @param questionpoint 知识点
	 * @return 填空题集合
	 */
	public List<Tkt> select(String questionpoint);
}