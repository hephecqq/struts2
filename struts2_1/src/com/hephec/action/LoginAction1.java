package com.hephec.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction1 extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	//�û���
	 private String userName;
	 //����
	 private String password;
	 //��֤��
	 private String code;
	 private InputStream inputStream;
	 
	 public InputStream getResult(){
	  return inputStream;
	 }
 //�ɹ�
 public String success() throws Exception{
  return SUCCESS;
 }
 //���Ե�¼
 public String testLogin() throws Exception{
  //��ȡͼƬ����֤��
  String randomStr=(String) ActionContext.getContext().getSession().get("randomStr");
  if(code.trim().equalsIgnoreCase(randomStr)){
   if("admin".equals(userName.trim())&&"admin".equals(password.trim())){
    //�ɹ�
    inputStream=new ByteArrayInputStream("1".getBytes("UTF-8"));
   }else{
    //�û������������
    inputStream=new ByteArrayInputStream("2".getBytes("UTF-8"));
   }
  }else{
   //��֤�����
   inputStream=new ByteArrayInputStream("0".getBytes("UTF-8"));
  }
  return "result";
 }
 public String getUserName() {
  return userName;
 }
 public void setUserName(String userName) {
  this.userName = userName;
 }
 public String getPassword() {
  return password;
 }
 public void setPassword(String password) {
  this.password = password;
 }
 public String getCode() {
  return code;
 }
 public void setCode(String code) {
  this.code = code;
 }
}
