<%@page import="com.ust.retailermaintenancesystem.dto.RetailerBean"%>
<%@page import="com.ust.retailermaintenancesystem.dto.Product"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<%
RetailerBean bean =(RetailerBean)session.getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${msg} </h3>
	<a href="./changepassword">Change Password</a>
	<a href="./buy">Logout</a>
	<a href="./order">ordered item</a>
	<a href="./search">Search Product</a>
	<a href="./logout">Logout</a>
	
	<%-- <h2>Welcome <%=bean.getName()%></h2> --%>

<h3 style="color: red;">${msg}</h3>
</body>
</html>