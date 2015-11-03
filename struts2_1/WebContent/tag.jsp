<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<s:form method="post" action="loginAction">
	<s:textfield name="us.username" label="用户名"></s:textfield>
	<s:password name="password" label="密码"></s:password>
	<s:checkboxlist list="{'打篮球','下棋','唱歌'}" label="爱好" name="hobby"/>
	<s:checkboxlist list="#{'1':'打篮球','2':'下棋','3':'唱歌'}" label="爱好" name="hobby"/>
	<s:radio list="{'打篮球','下棋','唱歌'}" name="rad"></s:radio>
	<s:radio list="#{'1':'打篮球','2':'下棋','3':'唱歌'}" name="hobby2"></s:radio>
	<s:select list="#{'1':'打篮球','2':'下棋','3':'唱歌'}" name="test"></s:select>
	<!-- 级联菜单 -->
	<s:doubleselect doubleList="top=='西红柿'?{'xx','yy'}:{'zz'},'yy'" 
	list="{'西红柿','番茄'}" doubleName="author" name=""></s:doubleselect>
	<s:submit value="提交"></s:submit>
</s:form>

</body>
</html>