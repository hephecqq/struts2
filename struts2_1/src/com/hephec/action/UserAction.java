package com.hephec.action;

import com.hephec.model.UserBean;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<UserBean>{
	
	public UserBean userBean=new UserBean();
	
	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		System.out.println(userBean.getUsername());
		if(userBean.getUsername()!=null){
			return SUCCESS;
		}
		else{
			return "fail";
		}
	}

	@Override
	public UserBean getModel() {
		return userBean;
	}
}
