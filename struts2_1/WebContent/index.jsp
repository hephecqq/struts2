<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="userAction" method="post">
		username:<input type="text" name="username">
		<input type="submit" value="提交"/>
	</form>
	
	<s:form action="resAction" method="post">
		username:<s:textfield name="username"></s:textfield>
		<s:submit value="提交"></s:submit>
	</s:form>
	
	<s:form action="awareAction" method="post">
		username:<s:textfield name="username"></s:textfield>
		<s:submit value="提交"></s:submit>
	</s:form>
</body>
</html>