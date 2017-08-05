package com.neuq.dao.I;

import java.util.List;

import com.neuq.bean.Bct;

/**
 * 编程题数据库接口类
 *
 */
public interface BctInterfaceDao {

	/**
	 * 增加一道编程题
	 * @param bct
	 * @return
	 */
	public boolean insert(Bct bct);
	
	/**
	 * 删除一道编程题
	 * @param bct
	 * @return
	 */
	public boolean delete(Bct bct);
	
	/**
	 * 更新修改一道编程题
	 * @param bct
	 * @return
	 */
	public boolean update(Bct bct);
	
	/**
	 * 查询全部编程题
	 * @param 无
	 * @return 编程题集合
	 */
	public List<Bct> select();
	
	/**
	 * 按知识点查询编程题
	 * @param questionpoint 知识点
	 * @return 编程题集合
	 */
	public List<Bct> select(String questionpoint);
}
