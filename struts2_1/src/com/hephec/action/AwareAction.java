package com.hephec.action;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.StrutsStatics;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AwareAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{

	private String username;
	private HttpServletResponse response;
	private HttpServletRequest request;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	private static final long serialVersionUID = 1L;
	@Override
	public void setApplication(Map<String, Object> application) {
//		Set<?> entrySet=application.entrySet();
//		Iterator<?> it=entrySet.iterator();
//		for(;it.hasNext();){
//			//System.out.println(it.next().getClass());
//		}
	}

	@Override
	public void setSession(Map<String, Object> session) {
		Set<String> set=session.keySet();
		Iterator<String> it=set.iterator();
		while(it.hasNext()){
			String key=it.next();
			System.out.println("key «£∫"+key);
			System.out.println("value «:"+session.get(key));
			
		}
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request=(HttpServletRequest) request.get(StrutsStatics.HTTP_REQUEST);
		
		
	}
	@Override
	public String execute() throws Exception {
		System.out.println(username);
		System.out.println(request.getClass().getCanonicalName());
		return SUCCESS;
		
	}
	
	

}
