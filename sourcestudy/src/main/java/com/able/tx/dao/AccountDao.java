package com.able.tx.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @param
 * @author jipeng
 * @date 2020-11-11 15:50
 */
@Component
public class AccountDao {
	@Resource
	JdbcTemplate jdbcTemplate;

	public int updateAccountBlance(Integer accountId, int money) {
		String sql="update account set money=money-? where id=?";
		final int update = jdbcTemplate.update(sql, money, accountId);
		System.err.println("更新的行数为:"+update);
		return 0;
	}
}

