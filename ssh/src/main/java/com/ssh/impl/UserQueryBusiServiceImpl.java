/**
 * 
 */
package com.ssh.impl;

import org.springframework.stereotype.Service;

import com.ssh.entity.User;
import com.ssh.inter.UserQueryBusiService;

/**
 * @author yl
 *
 */
@Service
public class UserQueryBusiServiceImpl implements UserQueryBusiService {

	/* 查询User用户信息
	 * @see com.ssh.inter.UserQueryBusiService#QueryUser(java.lang.String)
	 */
	@Override
	public User QueryUser(String id) {
		System.out.println("spring-context initialization success");
		return null;
	}

}
