/**
 * 
 */
package com.ssh.entity;

import java.io.Serializable;

/**用户角色表映射实体类
 * @author yl
 *
 */
public class UserRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2759243370709105168L;
	
	private String id;//主键
	
	private String userId;//用户ID
	
	private String roleId;//角色ID

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	
	

}
