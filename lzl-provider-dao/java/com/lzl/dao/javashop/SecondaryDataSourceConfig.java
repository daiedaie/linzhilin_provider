package com.lzl.dao.javashop;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author:cx
 * @version:1.0
 * @since:1.0
 * @createTime:2018-01-18 15:12:16
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "com.lzl.dao.javashop.read", sqlSessionTemplateRef = "secondarySqlSessionTemplate")
public class SecondaryDataSourceConfig {

	@Bean(name = "SecondaryDataSource")
	@ConfigurationProperties(prefix = "server.jdbc.secondary")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "sqlSessionFactory2")
	public SqlSessionFactory sqlSessionFactory(
			@Qualifier("SecondaryDataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver()
				.getResources("classpath:sql-mapper/javashop/read/*.xml"));
		SqlSessionFactory sqlSessionFactory = bean.getObject();
		sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);// 开启驼峰映射
		sqlSessionFactory.getConfiguration().setCacheEnabled(true);
		return sqlSessionFactory;
	}

	@Bean(name = "secondaryTransactionManager")
	public DataSourceTransactionManager testTransactionManager(
			@Qualifier("SecondaryDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "secondarySqlSessionTemplate")
	public SqlSessionTemplate testSqlSessionTemplate(
			@Qualifier("sqlSessionFactory2") SqlSessionFactory sqlSessionFactory)
			throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
