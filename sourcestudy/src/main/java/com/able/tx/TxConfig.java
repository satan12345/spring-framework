package com.able.tx;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @param
 * @author jipeng
 * @date 2020-11-11 15:38
 */
@EnableTransactionManagement
@EnableAspectJAutoProxy(exposeProxy = true)
@Configuration
@ComponentScan(basePackages = {"com.able.tx"})
public class TxConfig {

	@Bean
	public DataSource dataSource(){
		DruidDataSource dataSource=new DruidDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("ablejava");
		dataSource.setUrl("jdbc:mysql://192.168.9.223:3306/txsource");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return dataSource;
	}
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource){

		return new DataSourceTransactionManager(dataSource);
	}

}

