package grapple.learn.springboot.druid.mybatis.ip.domain;

import java.time.Instant;

/**
 * @author grapple
 * @date 2019/3/20
 * @description
 */
public class Ip {

	private Long id;

	private Instant createTime;

	private Instant updateTime;

	private String requestIp;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Instant createTime) {
		this.createTime = createTime;
	}

	public Instant getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Instant updateTime) {
		this.updateTime = updateTime;
	}

	public String getRequestIp() {
		return requestIp;
	}

	public void setRequestIp(String requestIp) {
		this.requestIp = requestIp;
	}

	@Override
	public String toString() {
		return "IP:[id:"+id+",createTime:"+createTime+",updateTime:"+updateTime+",requestIp:"+requestIp+"]";
	}
}
