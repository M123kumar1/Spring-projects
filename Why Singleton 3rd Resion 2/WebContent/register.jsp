<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.gmail.servlet.CityHelper"%>
<%@page import="com.gmail.servlet.StateHelper"%>
<%@page import="com.gmail.servlet.CountryHelper"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>resister user</title>
</head>
<body>
	<h1 align="center">Register User</h1>
	<hr/>
	<form>
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
				<td>city:</td>
			<td>
			<select name="city">
				<%
					CityHelper cList = new CityHelper();
												  List cityList=cList.cityList();
												  for(Object value:cityList){
													  String city=(String)value;
													  out.print("<option value="+"'"+city+"'"+">"+city+"</option>");
												  }
				%>
		</select>
				</td>
		</tr>
		<tr>
				<td>state:</td>
			<td>
			<select name="state">
			<%
				StateHelper sList = new StateHelper();
					  List stateList=sList.stateList();
					  for(Object value:stateList){
						  String state=(String)value;
						  out.print("<option value="+"'"+state+"'"+">"+state+"</option>");
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
				CountryHelper ctrList = new CountryHelper();
				  List countryList=ctrList.countryList();
				  for(Object value:countryList){
					  String country=(String)value;
					  out.print("<option value="+"'"+country+"'"+">"+country+"</option>");
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