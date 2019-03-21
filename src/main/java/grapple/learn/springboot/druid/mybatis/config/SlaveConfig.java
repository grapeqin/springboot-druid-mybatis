package grapple.learn.springboot.druid.mybatis.config;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * @author grapple
 * @date 2019/3/20
 * @description
 */
@Configuration
@MapperScan(value = "grapple.learn.springboot.druid.mybatis.ip.dao",sqlSessionFactoryRef = "slaveSqlSessionFactory")
public class SlaveConfig extends Config{

	@Value("${spring.slave.datasource.url}")
	private String url;

	@Value("${spring.slave.datasource.username}")
	private String username;

	@Value("${spring.slave.datasource.password}")
	private String password;

	@Value("${spring.slave.datasource.driver-class-name}")
	private String driver;

	@Value("${spring.slave.mybatis.type-alias-package}")
	private String typeAliasesPackage;

	@Value("${spring.slave.mybatis.mapping-location}")
	private String mapperLocations;

	@Override
	protected String getUrl() {
		return this.url;
	}

	@Override
	protected String getUserName() {
		return this.username;
	}

	@Override
	protected String getPassword() {
		return this.password;
	}

	@Override
	protected String getDriver() {
		return this.driver;
	}

	@Override
	protected String getTypeAliasesPackage() {
		return this.typeAliasesPackage;
	}

	@Override
	protected String getMapperLocations() {
		return this.mapperLocations;
	}

	@Bean("slaveDataSource")
	@Override
	public DataSource getDataSource(){
		return super.getDataSource();
	}

	@Bean("slaveSqlSessionFactory")
	@Override
	public SqlSessionFactory getSqlSessionFactory() throws Exception {
		return super.getSqlSessionFactory();
	}

	@Bean("slaveTransactionManager")
	@Override
	public DataSourceTransactionManager getDatasourceTransactionManager(){
		return super.getDatasourceTransactionManager();
	}

}
