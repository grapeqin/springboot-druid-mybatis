package grapple.learn.springboot.druid.mybatis.user.domain;

import java.time.Instant;

/**
 * @author grapple
 * @date 2019/3/18
 * @description
 */
public class User {
	
	private Long id;

	private String name;

	private Integer age;

	private Instant createTime;

	private Instant updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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

	@Override
	public String toString() {
		return "UserDto:[id:"+id+",name:"+name+",age:"+age+",createTime:"+createTime+",updateTime:"+updateTime+"]";
	}
}
