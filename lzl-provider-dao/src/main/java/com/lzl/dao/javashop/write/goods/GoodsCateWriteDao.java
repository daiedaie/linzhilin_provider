package com.lzl.dao.javashop.write.goods;

import java.util.List;

import com.lzl.bean.javashop.goods.GoodsCate;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-13 13:34:06
 */
public interface GoodsCateWriteDao {
	/**新增*/
    Integer post(GoodsCate goodsCate);
	/**更新*/
    Integer put(GoodsCate goodsCate);
	Integer deleteById(Integer id);
	Integer batchDelete(List<GoodsCate> list);

}