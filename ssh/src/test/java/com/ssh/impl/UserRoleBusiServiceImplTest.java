/**
 * 
 */
package com.ssh.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssh.entity.UserRole;
import com.ssh.inter.UserRoleBusiService;

/**
 * @author yl
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-core.xml")
public class UserRoleBusiServiceImplTest {
	@Autowired
	private UserRoleBusiService userRoleBusiService;

	/**
	 * Test method for {@link com.ssh.impl.UserRoleBusiServiceImpl#queryUserRole()}.
	 */
	@Test
	public void testQueryUserRole() {
		List<UserRole> list = userRoleBusiService.queryUserRole();
		for(UserRole userRole:list){
			System.out.println(userRole.getId());
		}
	}

}
