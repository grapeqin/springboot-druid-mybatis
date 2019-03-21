package grapple.learn.springboot.druid.mybatis;

import grapple.learn.springboot.druid.mybatis.ip.dao.IpDao;
import grapple.learn.springboot.druid.mybatis.user.dao.UserDao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * main function
 */
@SpringBootApplication
public class SpringbootDruidMybatisApplication {

	public static void main(String[] args){
		ApplicationContext context = SpringApplication.run(SpringbootDruidMybatisApplication.class,args);
		UserDao userDao = context.getBean(UserDao.class);
		System.out.println(userDao.findAllUsers());
		IpDao ipDao = context.getBean(IpDao.class);
		System.out.println(ipDao.findAllIps());
	}
}
