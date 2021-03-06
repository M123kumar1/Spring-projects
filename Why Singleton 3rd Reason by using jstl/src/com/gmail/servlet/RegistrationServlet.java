package com.gmail.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/user_registration"})
public class RegistrationServlet extends HttpServlet{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String reTypepassword=req.getParameter("re_type_password");
		String mobile=req.getParameter("mobile");
		String gender=req.getParameter("gender");
		String dob=req.getParameter("dob");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String country=req.getParameter("country");
		
		String registerQuery = "insert into registration(email,password,mobile,gender,dob,city,state,country) values(?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		RequestDispatcher rd=null;
		int count=0;
		try {
			if(password.equals(reTypepassword) && password!=null && password!="") {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
				pstmt = con.prepareStatement(registerQuery);
				pstmt.setString(1, email);
				pstmt.setString(2, password);
				pstmt.setString(3, mobile);
				pstmt.setString(4, gender);
				pstmt.setString(5, dob);
				pstmt.setString(6, city);
				pstmt.setString(7, state);
				pstmt.setString(8, country);
				count = pstmt.executeUpdate();	
			}
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(count>0) {
			rd=req.getRequestDispatcher("/success.jsp");
			rd.forward(req, res);
		}else {
			rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req, res);
		}
	}

}
