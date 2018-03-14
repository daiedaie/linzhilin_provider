package com.lzl.service.impl.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lzl.bean.javashop.goods.Goods;
import com.lzl.bean.javashop.order.OrdersGoods;
import com.lzl.bean.javashop.order.ProviderOrders;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.read.goods.GoodsReadDao;
import com.lzl.dao.javashop.read.order.OrdersGoodsReadDao;
import com.lzl.dao.javashop.read.order.ProviderOrdersReadDao;
import com.lzl.dao.javashop.write.order.OrdersGoodsWriteDao;
import com.lzl.service.order.IOrdersGoodsService;

/**
 * 描述：OrdersGoods 服务实现层
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-28 22:27:55
 */
@Service(value = "ordersGoodsService")
public class OrdersGoodsServiceImpl implements IOrdersGoodsService{
	
	@Resource
    private OrdersGoodsWriteDao ordersGoodsWriteDao;

	@Resource
    private OrdersGoodsReadDao ordersGoodsReadDao;
	
	@Resource
	private ProviderOrdersReadDao providerOrdersReadDao;
	
	@Resource
	private GoodsReadDao goodsReadDao;
	
	/**列表查询*/
    public List<OrdersGoods> get(Map<String, Object> queryMap, Pager pager)throws Exception {
		if (pager != null) {
			if(pager.isGetCount()){
				pager.setRowsCount(ordersGoodsReadDao.getCount(queryMap));
			}
            queryMap.put("start", pager.getStart());
            queryMap.put("size", pager.getPageSize());
        }

        List<OrdersGoods> ordersGoodsList = ordersGoodsReadDao.get(queryMap);
    
        String idsStr = (String)queryMap.get("idsStrAll");
        String flag = (String)queryMap.get("flag");
        
        List<Integer> ids = new ArrayList<>();
        if(idsStr != null && !"".equals(idsStr)){
        	System.out.println("进入set_checked处理》》》》》》》》》》》》》》");
        	String[] idsArray = idsStr.split(",");
        	for(String idStr : idsArray){
        		ids.add(Integer.parseInt(idStr));
        	}
        	List<OrdersGoods> selectedOrdersGoodsList = this.getSelectedOrdersGoodsList(ids, queryMap);
        	
        	if(flag != null && flag.equals("modalSelectedShow")){
        		Iterator<OrdersGoods> iterator = selectedOrdersGoodsList.iterator();
        		if(iterator.hasNext()){
        			OrdersGoods ordersGoods = iterator.next();
        			
        			Map<String, Object> query1 = new HashMap<>();
        			query1.put("ordersSn", ordersGoods.getOrdersSn());
        			ProviderOrders providerOrders = providerOrdersReadDao.get(query1).get(0);
        			
        			Map<String, Object> query2 = new HashMap<>();
        			query2.put("goodsId", ordersGoods.getGoodsId());
        			Goods goods = goodsReadDao.get(query2).get(0);
        			
        			ordersGoods.setBarCode(goods.getBarCode());
        			ordersGoods.setTaxMoney(providerOrders.getTaxMoney());
        			ordersGoods.setExpressMoney(providerOrders.getExpressMoney());
        			System.out.println("处理完毕：" + ordersGoods.getId());
        		}
        		
        		return selectedOrdersGoodsList;
            }else{
            	for(OrdersGoods ordersGood : ordersGoodsList){
            		if(selectedOrdersGoodsList.contains(ordersGood)){
            			ordersGood.set_checked(true);
            			System.out.println("选中的商品，set_checked(true)：：：：" + ordersGood);
            		}
            	}
            	return ordersGoodsList;
            }
        }
        
        return ordersGoodsList;
    }

	/**新增*/
    public Boolean post(OrdersGoods ordersGoods) throws Exception {
        int result = ordersGoodsWriteDao.post(ordersGoods);
        return result > 0 ;
    }

	/**更新*/
    public Boolean put(OrdersGoods ordersGoods) throws Exception {
        int result = ordersGoodsWriteDao.put(ordersGoods);
        return result > 0 ;
    }
	
	/**************************************************上面是公共方法，下面是私有方法***************************************************************/

    private List<OrdersGoods> getSelectedOrdersGoodsList(List<Integer> ids, Map<String, Object> queryMap) {
    	System.out.println("处理后的ids：" + ids);
    	Map<String, Object> query = new HashMap<>();
    	query.put("ids", ids);
    	query.putAll(queryMap);
    	return ordersGoodsReadDao.getSelectedOrdersGoodsList(query);
	}
}
