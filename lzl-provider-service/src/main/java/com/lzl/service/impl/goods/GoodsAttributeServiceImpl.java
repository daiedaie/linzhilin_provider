package com.lzl.service.impl.goods;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.lzl.bean.javashop.goods.GoodsAttribute;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.write.goods.GoodsAttributeWriteDao;
import com.lzl.dao.javashop.read.goods.GoodsAttributeReadDao;
import com.lzl.service.goods.IGoodsAttributeService;

/**
 * 描述：GoodsAttribute 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-03-14 14:31:18
 */
@Service(value = "goodsAttributeService")
public class GoodsAttributeServiceImpl implements IGoodsAttributeService{
	
	@Resource
    private GoodsAttributeWriteDao goodsAttributeWriteDao;

	@Resource
    private GoodsAttributeReadDao goodsAttributeReadDao;
	
	/**列表查询*/
    public List<GoodsAttribute> get(Map<String, Object> queryMap, Pager pager)throws Exception {
		if (pager != null) {
			if(pager.isGetCount()){
				pager.setRowsCount(goodsAttributeReadDao.getCount(queryMap));
			}
            queryMap.put("start", pager.getStart());
            queryMap.put("size", pager.getPageSize());
        }
        List<GoodsAttribute> goodsAttributeList = goodsAttributeReadDao.get(queryMap);
        return goodsAttributeList;
    }

	/**新增*/
    public Boolean post(GoodsAttribute goodsAttribute) throws Exception {
        int result = goodsAttributeWriteDao.post(goodsAttribute);
        return result > 0 ;
    }

	/**更新*/
    public Boolean put(GoodsAttribute goodsAttribute) throws Exception {
        int result = goodsAttributeWriteDao.put(goodsAttribute);
        return result > 0 ;
    }
	
	/**************************************************上面是公共方法，下面是私有方法***************************************************************/

}
