/**
 * 
 */
package com.ssh.inter;

import java.util.List;

import com.ssh.entity.UserRole;

/**用户角色表业务层接口
 * @author yl
 *
 */
public interface UserRoleBusiService {
	/**
	 * 查询用户角色表信息
	 * @return
	 */
	public List<UserRole> queryUserRole();

}
