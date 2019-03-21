package grapple.learn.springboot.druid.mybatis.user.dao;

import java.util.List;

import grapple.learn.springboot.druid.mybatis.user.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author grapple
 * @date 2019/3/19
 * @description
 */
public interface UserDao {

	/**
	 * 根据用户Id来获取用户
	 * @param id
	 * @return
	 */
	User findbyId(@Param("id") Long id);

	/**
	 * 获取所有用户列表
	 * @return
	 */
	List<User> findAllUsers();
}
