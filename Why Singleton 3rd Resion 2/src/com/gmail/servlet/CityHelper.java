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

public class CityHelper{
	
	public List cityList() {
		String getCityQuery="select * from city";
	    String city=null;
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		List cityList=null;
		RequestDispatcher rd=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			stmt=con.createStatement();
			rs=stmt.executeQuery(getCityQuery);
			cityList=new ArrayList();
			while(rs.next()){
				city=rs.getString("city_name");
				cityList.add(city);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cityList;
	}
}
