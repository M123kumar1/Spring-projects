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

public class StateHelper{
	
	public List stateList() {
		String getStateQuery="select * from state";
	    String state=null;
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		List stateList=null;
		RequestDispatcher rd=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			stmt=con.createStatement();
			rs=stmt.executeQuery(getStateQuery);
			stateList=new ArrayList();
			while(rs.next()){
				state=rs.getString("state_name");
				stateList.add(state);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stateList;
	}
}
