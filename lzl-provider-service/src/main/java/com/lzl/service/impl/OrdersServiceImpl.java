package com.lzl.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.lzl.bean.javashop.Orders;
import com.lzl.bean.javashop.Seller;
import com.lzl.bean.javashop.SellerApply;
import com.lzl.common.Pager;
import com.lzl.dao.javashop.read.OrdersReadDao;
import com.lzl.dao.javashop.read.SellerApplyReadDao;
import com.lzl.dao.javashop.read.SellerReadDao;
import com.lzl.dao.javashop.write.OrdersWriteDao;
import com.lzl.service.IOrdersService;

/**
 * 订单
 * 描述：Orders 服务实现层
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:19
 */
@Service(value = "ordersService")
public class OrdersServiceImpl implements IOrdersService {

    @Resource
    private OrdersWriteDao     ordersWriteDao;

    @Resource
    private OrdersReadDao      ordersReadDao;

    @Resource
    private SellerReadDao      sellerReadDao;

    @Resource
    private SellerApplyReadDao sellerApplyReadDao;

    public Orders getById(Integer id) throws Exception {
        Orders orders = ordersReadDao.getById(id);
        return orders;
    }

    /**查询订单列表*/
    public List<Orders> get(Map<String, Object> queryMap, Pager pager) throws Exception {
        if (pager != null) {
            if (pager.isGetCount()) {
                pager.setRowsCount(ordersReadDao.getCount(queryMap));
            }
            queryMap.put("start", pager.getStart());
            queryMap.put("size", pager.getPageSize());
        }

        setQuerySellerId(queryMap);

        List<Orders> ordersList = ordersReadDao.get(queryMap);

        setSellerInfo(ordersList);

        return ordersList;
    }

    public Boolean post(Orders orders) throws Exception {
        int result = ordersWriteDao.post(orders);
        return result > 0;
    }

    public Boolean put(Orders orders) throws Exception {
        int result = ordersWriteDao.put(orders);
        return result > 0;
    }
    
    /**************************************************上面是公共方法，下面是私有方法***************************************************************/
    
    /**设置查询条件：根据商家电话号码查询订单*/
    private void setQuerySellerId(Map<String, Object> queryMap){
        if (!StringUtils.isEmpty(queryMap.get("sellerMobile"))) {
            Map<String, Object> sellerQueryMap = new HashMap<>();
            sellerQueryMap.put("name", queryMap.get("sellerMobile"));
            Seller seller = sellerReadDao.getSingle(sellerQueryMap);
            if (seller != null) {
                queryMap.put("sellerId", seller.getId());
            }
        }
    }
    
    /*** 设置订单中商家信息*/
    private void setSellerInfo(List<Orders> ordersList){
        if (ordersList.size() > 0) {
            for (Orders orders : ordersList) {
                Map<String, Object> saQueryMap = new HashMap<>();
                saQueryMap.put("sellerId", orders.getSellerId());
                SellerApply seller = sellerApplyReadDao.get(saQueryMap).get(0);
                orders.setSellerMobile(StringUtils.isEmpty(seller.getTelephone()) ? seller.getName()
                    : seller.getTelephone());
                orders.setSellerName(seller.getCompany());
                orders.setSellerAddress(seller.getCompanyAdd());
            }
        }
    }

}
