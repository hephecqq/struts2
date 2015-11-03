<%@page import="java.util.*,com.hephec.model.City"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<City> cities=new ArrayList<City>();
	cities.add(new City("1","张三1"));
	cities.add(new City("2","张三2"));
	cities.add(new City("3","张三3"));
	request.setAttribute("cities", cities);
%>
<s:form action="save">
	<s:textfield name="username" label="username"></s:textfield>
	<s:password name="password" label="password"></s:password>
	<s:textarea name="desc" label="desc"></s:textarea>
	<s:hidden name="userID"></s:hidden>
	<s:checkbox label="married" name="married"></s:checkbox>
	<s:checkboxlist list="#request.cities" listKey="cityId" listValue="cityName" name="cities"></s:checkboxlist>
	
	<s:submit></s:submit>
	<s:subset></s:subset>
</s:form>
<s:debug></s:debug>
</body>
</html>