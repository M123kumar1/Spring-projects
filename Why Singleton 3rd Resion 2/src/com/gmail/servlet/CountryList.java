package com.gmail.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryList{
	
	public List countryList() {
		String getCountryQuery="select * from country";
	    String country=null;
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		List countryList=null;
		RequestDispatcher rd=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			stmt=con.createStatement();
			rs=stmt.executeQuery(getCountryQuery);
			countryList=new ArrayList();
			while(rs.next()){
				country=rs.getString("country_name");
				countryList.add(country);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return countryList;
	}
}
