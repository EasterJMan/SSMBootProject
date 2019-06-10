package com.itheima.domain;

import java.io.Serializable;


public class User implements Serializable {
	private static final long serialVersionUID= 1L;
	
	
	/**
	 * user_id 用户ID
	 * user_code 用户账号
	 * user_name 用户名称
	 * user_password 用户密码
	 * user_state 用户状态
	 */
	private Integer user_id;
	private String user_code;
	private String  user_name;
	private String user_password; 
	private Integer user_state;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_code() {
		return user_code;
	}
	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public Integer getUser_state() {
		return user_state;
	}
	public void setUser_state(Integer user_state) {
		this.user_state = user_state;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_code=" + user_code + ", user_name=" + user_name + ", user_password="
				+ user_password + ", user_state=" + user_state + "]";
	} 
	
}
