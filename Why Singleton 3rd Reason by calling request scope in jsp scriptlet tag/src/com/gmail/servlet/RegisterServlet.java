package com.gmail.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		List<String> cities=null;
		List<String> states=null;
		List<String> countries=null;
		
		ResultSet stateRs=null;
		ResultSet cityRs=null;
		ResultSet countryRs=null;
		
		RequestDispatcher rd = null;
		
		stateRs=getStates();
		cityRs=getCities();
		countryRs=getCountries();
		
		states = new ArrayList<>();
		cities = new ArrayList<>();
		countries=new ArrayList<>();
		try {
			while (stateRs.next()) {
				String state = stateRs.getString("state_name");
				states.add(state);
			}
			while (cityRs.next()) {
				String city = cityRs.getString("city_name");
				cities.add(city);
			}
			while (countryRs.next()) {
				String country = countryRs.getString("country_name");
				countries.add(country);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServletException(e);
		}	
		req.setAttribute("cities", cities);
		req.setAttribute("states", states);
		req.setAttribute("countries", countries);
		
		rd=req.getRequestDispatcher("/register.jsp");
		rd.forward(req, res);
	}
	private ResultSet getCities() {
		String getCityQuery = "select city_name from city";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
			stmt = con.createStatement();
			rs = stmt.executeQuery(getCityQuery);			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	private ResultSet getStates() {
		String getStateQuery = "select state_name from state";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
			stmt = con.createStatement();
			rs = stmt.executeQuery(getStateQuery);			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	private ResultSet getCountries() {
		String getContryQuery = "select country_name from country";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
			stmt = con.createStatement();
			rs = stmt.executeQuery(getContryQuery);			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}
