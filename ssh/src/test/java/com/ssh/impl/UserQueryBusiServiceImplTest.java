/**
 * 
 */
package com.ssh.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssh.inter.UserQueryBusiService;





/**测试用户查询业务层接口
 * @author yl
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-core.xml")
public class UserQueryBusiServiceImplTest{
	
	@Autowired
	private UserQueryBusiService userQueryBusiService;
	
	@Test
	public void testQueryUser(){
		userQueryBusiService.QueryUser("111");
		
	}

}
