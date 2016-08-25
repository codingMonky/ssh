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
public class UserAction extends ActionSupport {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 907537131086537862L;

	/*private User user;//用户对象
	
	private String password;//用户密码

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
	*/
	private String  hello;
	  public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	public String execute() throws Exception {
	        System.out.println("欢迎使用struts2!");
	        hello = "kdjfoid";
	        return "SUCCESS";
	    }
	
}
