/**
 * 
 */
package com.ssh.inter;

import com.ssh.entity.User;

/**用于用户查询的业务层接口
 * @author yl
 *
 */
public interface UserQueryBusiService {
	public User QueryUser(String id);
}
