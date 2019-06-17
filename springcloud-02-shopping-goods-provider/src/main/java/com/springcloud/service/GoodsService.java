package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Goods;

/**
 * 商品模型层：用于定义对商品模块进行操作的方法
 * 
 * @author wanyan
 *
 */
public interface GoodsService {

	/**
	 * 添加新的商品信息
	 * 
	 * @param goods 商品信息
	 * @return 成功返回大于0的整数，否则返回0
	 */
	public abstract Integer insert(Goods goods);

	/**
	 * 查询满足条件的商品信息（分页功能）
	 * 
	 * @param goods      查询条件
	 * @param pageNumber 页数
	 * @return 返回com.github.pagehelper.PageInfo<Goods>类型的实例，否则返回null
	 */
	public abstract PageInfo<Goods> selsct(Goods goods, Integer pageNumber);

	/**
	 * 根据条件修改商品信息
	 * 
	 * @param goods修改商品信息
	 * @return 成功返回大于0的整数，否则返回小于等于0的整数
	 */
	public abstract Integer updateGoodsById(Goods goods);

	/**
	 * 修改指定编号的商品信息
	 * 
	 * @param goods修改商品信息
	 * @return 成功返回大于0的整数，否则返回小于等于0的整数
	 */
	public abstract Integer update(Goods goods);

	/**
	 * 查询销量前十的商品信息
	 * 
	 * @return 成功返回java.util.List类型的实例，否则返回null
	 */
	public abstract List<Goods> selectGroup();
}
