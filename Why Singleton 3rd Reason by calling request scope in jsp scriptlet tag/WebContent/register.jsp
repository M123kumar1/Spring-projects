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
	${pageContext.request.contextPath}
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
				<%
				List<String> cities=(List<String>)request.getAttribute("cities");
				for(String city:cities){
					out.println("<option value='"+city+"'>"+city+"</option>");
				}
			%>
		</select>
				</td>
		</tr>
		<tr>
				<td>State:</td>
			<td>
			<select name="state">
			<%
				List<String> states=(List<String>)request.getAttribute("states");
				for(String state:states){
					out.println("<option value='"+state+"'>"+state+"</option>");
				}
			%>
		</select>
			</td>
		</tr>
		<tr>
				<td>Country:</td>
			<td>
			<select name="country">
			<%
				List<String> countries=(List<String>)request.getAttribute("countries");
				for(String country:countries){
					out.println("<option value='"+country+"'>"+country+"</option>");
				}
			%>
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