package com.lzl.dao.javashop.write.order;

import com.lzl.bean.javashop.order.ProviderOrders;
/**
 * @author:Lgq
 * @version:1.0
 * @since:1.0
 * @createTime:2018-02-05 13:05:46
 */
public interface ProviderOrdersWriteDao {
	
    Integer post(ProviderOrders providerOrders);

	Integer put(ProviderOrders providerOrders);
	
}