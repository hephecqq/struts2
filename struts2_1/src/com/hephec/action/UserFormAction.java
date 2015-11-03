package com.hephec.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserFormAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String desc;
	private String userID;
	private String married;
	public String getMarried() {
		return married;
	}
	public void setMarried(String married) {
		this.married = married;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	@Override
	public String toString() {
		return "UserFormAction [username=" + username + ", password="
				+ password + ", desc=" + desc + ", userID=" + userID
				+ ", married=" + married + "]";
	}
	@Override
	public String execute() throws Exception {
		UserFormAction ufa=new UserFormAction();
		ufa.setDesc("哈哈");
		ufa.setPassword("123");
		ufa.setUsername("张三");
		//调用值栈
		//回显的原理？
		ActionContext.getContext().getValueStack().push(ufa);
		System.out.println(this);
		return INPUT;
	}
}
