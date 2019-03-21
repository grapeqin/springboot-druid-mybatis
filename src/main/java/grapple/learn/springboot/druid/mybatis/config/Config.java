package grapple.learn.springboot.druid.mybatis.config;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * @author grapple
 * @date 2019/3/20
 * @description
 */
public abstract class Config {

	/**
	 * 连接url
	 * @return
	 */
	protected abstract String getUrl();

	/**
	 * 用户名
	 * @return
	 */
	protected abstract String getUserName();

	/**
	 * 密码
	 * @return
	 */
	protected abstract String getPassword();

	/**
	 * 驱动名
	 * @return
	 */
	protected abstract String getDriver();

	/**
	 * typealiaspackage
	 * @return
	 */
	protected abstract String getTypeAliasesPackage();

	/**
	 * mapperlocations
	 * @return
	 */
	protected abstract String getMapperLocations();

	/**
	 * 获取数据源
	 * @return
	 */
	public DataSource getDataSource(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(getUrl());
		dataSource.setUsername(getUserName());
		dataSource.setPassword(getPassword());
		dataSource.setDriverClassName(getDriver());
		return dataSource;
	}

	/**
	 * 获取SqlSessionFactory
	 * @return
	 * @throws Exception
	 */
	public SqlSessionFactory getSqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(getDataSource());
		sqlSessionFactory.setTypeAliasesPackage(getTypeAliasesPackage());
		sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(getMapperLocations()));
		return sqlSessionFactory.getObject();
	}

	/**
	 * 获取事务管理器
	 * @return
	 */
	public DataSourceTransactionManager getDatasourceTransactionManager(){
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(getDataSource());
		return transactionManager;
	}
}
