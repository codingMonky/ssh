/**
 * 
 */
package com.ssh.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.ssh.Util.HibernateUtil;
import com.ssh.entity.UserRole;
import com.ssh.inter.UserRoleBusiService;

/**用户角色表业务层实现代码
 * @author yl
 *
 */
@Service
public class UserRoleBusiServiceImpl implements UserRoleBusiService {

	@Override
	public List<UserRole> queryUserRole() {
		Session session = HibernateUtil.getSessionfactory().getCurrentSession();
		return session.createQuery("from UserRole").list();
	}
	
public static void main(String[] args) {
	UserRoleBusiService userRoleBusiService = new UserRoleBusiServiceImpl();
	List<UserRole> list = userRoleBusiService.queryUserRole();
	for(UserRole userRole:list){
		System.out.println(userRole.getId());
	}
}

}
