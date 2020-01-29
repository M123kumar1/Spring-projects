<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register user</title>
</head>
<body>
	<h1 align="center">Register User</h1>
	<hr/>
	
	<form action="${pageContext.request.contextPath}/user_registration" method="POST">
		<table align="center">
			<tr>
				<td>email:</td>
				<td><input type="text" name="email"/></td>
			</tr>
			<tr>
				<td>password:</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td>re-type password:</td>
				<td><input type="password" name="re_type_password"/></td>
			</tr>
			<tr>
				<td>mobile:</td>
				<td><input type="text" name="mobile"/></td>
			</tr>
			<tr>
				<td>gender:</td>
				<td><input type="text" name="gender"/></td>
			</tr>
			<tr>
				<td>DOB:</td>
				<td><input type="text" name="dob"/></td>
			</tr>
			<tr>
				<td>City:</td>
			<td>
			<select name="city">
				<c:forEach var="city" items="${cities}">
					<option value="${city}">${city}</option>
				</c:forEach>
		</select>
				</td>
		</tr>
		<tr>
				<td>State:</td>
			<td>
			<select name="state">
			<c:forEach var="state" items="${states}">
					<option value="${state}">${state}</option>
				</c:forEach>
		</select>
			</td>
		</tr>
		<tr>
				<td>Country:</td>
			<td>
			<select name="country">
			<c:forEach var="country" items="${countries}">
					<option value="${country}">${country}</option>
				</c:forEach>
		</select>
			</td>
		</tr>
		<tr>				
				<td><input type="submit" value="register"/></td>
		</tr>		
		</table>
	</form>
</body>
</html>