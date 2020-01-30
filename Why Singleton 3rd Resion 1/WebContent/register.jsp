<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
				String getCityQuery="select * from city";
			    String city=null;
				Connection con=null;
				Statement stmt=null;
				ResultSet rs=null;
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
				stmt=con.createStatement();
				rs=stmt.executeQuery(getCityQuery);
				while(rs.next()){
					city=rs.getString("city_name");
					out.print("<option value='"+city+"'>"+city+"</option>");
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
				String getStateQuery="select * from state";
			    String state=null;
				Connection stateCon=null;
				Statement stateStmt=null;
				ResultSet stateRs=null;
				Class.forName("oracle.jdbc.driver.OracleDriver");
				stateCon=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
				stateStmt=stateCon.createStatement();
				stateRs=stateStmt.executeQuery(getStateQuery);
				while(stateRs.next()){
					state=stateRs.getString("state_name");
					out.print("<option value='"+state+"'>"+state+"</option>");
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
				String getCountyQuery="select * from country";
			    String country=null;
				Connection countryCon=null;
				Statement countryStmt=null;
				ResultSet countryRs=null;
				Class.forName("oracle.jdbc.driver.OracleDriver");
				countryCon=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
				countryStmt=countryCon.createStatement();
				countryRs=countryStmt.executeQuery(getCountyQuery);
				while(countryRs.next()){
					country=countryRs.getString("country_name");
					out.print("<option value='"+country+"'>"+country+"</option>");
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