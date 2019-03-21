package grapple.learn.springboot.druid.mybatis;

import grapple.learn.springboot.druid.mybatis.ip.dao.IpDao;
import grapple.learn.springboot.druid.mybatis.user.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class SpringbootDruidMybatisApplicationTests {

	@Autowired
	private UserDao userDao;

	@Autowired
	private IpDao ipDao;

	@Test
	public void contextLoads() {
		Assert.assertEquals(userDao.findbyId(1L).getName(),"老黄");
		Assert.assertEquals(userDao.findAllUsers().size(),3);

		Assert.assertEquals(ipDao.findAllIps().size(),3);
		Assert.assertEquals(ipDao.findById(1L).getRequestIp(),"192.168.9.66");
	}
}
