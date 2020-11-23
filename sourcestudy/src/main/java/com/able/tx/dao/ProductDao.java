package com.able.tx.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @param
 * @author jipeng
 * @date 2020-11-11 15:52
 */
@Component
public class ProductDao {
	@Resource
	JdbcTemplate jdbcTemplate;

	public void updateProductStore(int productId) {
		String sql="update product set stock=stock-1 where id=?";
		final int update = jdbcTemplate.update(sql, productId);
		System.err.println("更新的行数为:"+update);
	}
}

