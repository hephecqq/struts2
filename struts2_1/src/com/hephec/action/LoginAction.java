package com.hephec.action;

import com.hephec.model.UserBean;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	UserBean us;
	public UserBean getUs() {
		return us;
	}
	public void setUs(UserBean us) {
		this.us = us;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(us.getUsername());
		return super.execute();
	}
}
