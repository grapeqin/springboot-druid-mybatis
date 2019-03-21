package grapple.learn.springboot.druid.mybatis.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * @author grapple
 * @date 2019/3/20
 * @description
 */
@Configuration
@MapperScan(value = "grapple.learn.springboot.druid.mybatis.user.dao",sqlSessionFactoryRef = "masterSqlSessionFactory")
public class MasterConfig extends Config{

	@Value("${spring.master.datasource.url}")
	private String url;

	@Value("${spring.master.datasource.username}")
	private String username;

	@Value("${spring.master.datasource.password}")
	private String password;

	@Value("${spring.master.datasource.driver-class-name}")
	private String driver;

	@Value("${spring.master.mybatis.type-alias-package}")
	private String typeAliasesPackage;

	@Value("${spring.master.mybatis.mapping-location}")
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

	@Bean("masterDataSource")
	@Override
	public DataSource getDataSource(){
		return super.getDataSource();
	}

	@Bean("masterSqlSessionFactory")
	@Override
	public SqlSessionFactory getSqlSessionFactory() throws Exception {
		return super.getSqlSessionFactory();
	}

	@Bean("masterTransactionManager")
	@Override
	public DataSourceTransactionManager getDatasourceTransactionManager(){
		return super.getDatasourceTransactionManager();
	}

}
