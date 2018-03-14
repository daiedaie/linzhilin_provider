package com.lzl.service.impl.goods;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.goods.Goods;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.read.goods.GoodsReadDao;
import com.lzl.dao.javashop.write.goods.GoodsWriteDao;
import com.lzl.service.goods.IGoodsService;

@Service(value="goodsService")
public class GoodsServiceImpl implements IGoodsService {

	@Resource
	private GoodsReadDao goodsReadDao;
	
	@Resource
	private GoodsWriteDao goodsWriteDao;
	
	@Override
	public List<Goods> get(Map<String, Object> queryMap, Pager pager) throws Exception {
		if(pager != null){
			if(pager.isGetCount()){
				pager.setRowsCount(goodsReadDao.getCount(queryMap));
			}
			queryMap.put("startIndex", pager.getStart());
			queryMap.put("endIndex", pager.getStart() + pager.getPageSize() - 1);
		}
		
		List<Goods> goodsList = goodsReadDao.get(queryMap);
		return goodsList;
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) throws Exception {
		return goodsReadDao.getCount(queryMap);
	}

	@Override
	public Boolean post(Goods goods) throws Exception {
		int result = goodsWriteDao.post(goods);
		return result > 0;
	}

	@Override
	public Boolean put(Goods goods) throws Exception {
		int result = goodsWriteDao.put(goods);
		return result > 0;
	}

	@Override
	public Boolean deleteGoodsById(Integer goodsId) throws Exception {
		int result = goodsWriteDao.deleteGoodsById(goodsId);
		return result > 0;
	}

	
}
