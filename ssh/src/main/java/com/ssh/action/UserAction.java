/**
 * 
 */
package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.entity.User;

/**
 * @author yl
 * 
 */
public class UserAction  {


	private User user;// 用户对象

	private String password;// 用户密码

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String hello;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public String hello() {
		System.out.println("execute action");
		hello = "kdjfoid";
		return "SUCCESS";
	}

}
