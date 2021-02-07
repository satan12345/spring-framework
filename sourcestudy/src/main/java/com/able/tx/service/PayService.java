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
public class PayService implements IPayService {
	@Resource
	AccountDao accountDao;
	@Resource
	ProductDao productDao;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void pay(Integer accountId, int money) {

		int retVal = accountDao.updateAccountBlance(accountId, money);
		//((IPayService) AopContext.currentProxy()).updateProductStore(1);
		int a=0;
		System.out.println(1/a);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
	public void updateProductStore(int productId) {
		try {
			productDao.updateProductStore(productId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

