<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Locale"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>News</title>

</head>
<body>
	<form >
		नाम:<input type="text" name="name">
		<input type="submit" value="भेजें">
		<br/>
		<%
		
		String name=request.getParameter("name");
		Connection con1=null;
		PreparedStatement pstmt1=null;
		ResultSet rs1=null;
		if(name!=null){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con1=DriverManager.getConnection("jdbc:mysql:///unicodedb","root","root");
			pstmt1=con1.prepareStatement("select * from employee");
			//pstmt1.setString(1, name);
			rs1=pstmt1.executeQuery();
			while(rs1.next()) {
				out.println(rs1.getInt(1)+"\t"+rs1.getString(2)+"\t"+rs1.getDouble(3));
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		%>
	
	<%
		response.setContentType("text/html;charset=UTF-8");
		String name1=request.getParameter("name");
		Connection con=null;
		PreparedStatement pstmt=null;
		if(name1!=null){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql:///unicodedb?useUnicode=yes&characterEncoding=UTF-8","root","root");
			pstmt=con.prepareStatement("insert into employee values(?,?,?)");
			
			pstmt.setInt(1, 1001);
			pstmt.setString(2, name1);
			pstmt.setDouble(3, 45000.00);
			
			pstmt.executeUpdate();
			System.out.println("Record inserted");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	%>
	</form>
</body>
</html>