package com.able.tx.service;

import com.able.tx.dao.AccountDao;
import com.able.tx.dao.ProductDao;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @param
 * @author jipeng
 * @date 2020-11-11 15:53
 */
@Service
public class PayService {
	@Resource
	AccountDao accountDao;
	@Resource
	ProductDao productDao;


	@Transactional(rollbackFor = Exception.class)
	public void pay(Integer accountId, int money) {

		int retVal = accountDao.updateAccountBlance(accountId, money);
		((PayService) AopContext.currentProxy()).updateProductStore(1);
//		System.out.println(1/0);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateProductStore(int productId) {
		try {
			productDao.updateProductStore(productId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

