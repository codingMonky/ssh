/**
 * 
 */
package com.ssh.entity;

/**
 * 用户表的关系映射对象
 * 
 * @author yl
 * 
 */
public class User {
	private String id;
	private String userName;
	private int age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
