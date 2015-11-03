package com.hephec.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class ResAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,ServletContextAware{

	
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;
	private HttpServletResponse response;
	private ServletContext context;
	
	@Override
	public String execute() throws Exception {
		String username=request.getParameter("username");
		System.out.println(username);
		return SUCCESS;
	}

	@Override
	public void setServletContext(ServletContext context) {
		this.context=context;
		
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response=response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}
}
