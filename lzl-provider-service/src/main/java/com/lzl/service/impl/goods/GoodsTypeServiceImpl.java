package com.lzl.service.impl.goods;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.goods.GoodsType;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.read.goods.GoodsTypeReadDao;
import com.lzl.dao.javashop.write.goods.GoodsTypeWriteDao;
import com.lzl.service.goods.IGoodsTypeService;

@Service(value="goodsTypeService")
public class GoodsTypeServiceImpl implements IGoodsTypeService {

	@Resource
	private GoodsTypeWriteDao goodsTypeWriteDao;
	@Resource
	private GoodsTypeReadDao goodsTypeReadDao;
	
	@Override
	public List<GoodsType> get(Map<String, Object> queryMap, Pager pager) throws Exception {
		if(pager != null){
			if(pager.isGetCount()){
				pager.setRowsCount(goodsTypeReadDao.getCount(queryMap));
			}
		}
		
		queryMap.put("startIndex", pager.getStart());
		queryMap.put("endIndex", pager.getStart() + pager.getPageSize() - 1);
		
		return goodsTypeReadDao.get(queryMap);
	}

	@Override
	public Integer getCount(Map<String, Object> queryMap) throws Exception {
		return goodsTypeReadDao.getCount(queryMap);
	}

	@Override
	public Boolean post(GoodsType goodsType) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean put(GoodsType goodsType) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteGoodsTypeById(Integer goodsTypeId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
