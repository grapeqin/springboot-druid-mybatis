package grapple.learn.springboot.druid.mybatis.ip.dao;

import java.util.List;

import grapple.learn.springboot.druid.mybatis.ip.domain.Ip;

/**
 * @author grapple
 * @date 2019/3/20
 * @description
 */
public interface IpDao {

	/**
	 * 根据指定Id获取IP信息
	 * @param id
	 * @return
	 */
	Ip findById(Long id);

	/**
	 * 获取所有IP列表
	 * @return
	 */
	List<Ip> findAllIps();
}
