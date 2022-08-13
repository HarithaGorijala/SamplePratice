package com.jdbc.antra;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewRecord
 */
@WebServlet("/view")
public class ViewRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewRecord() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Gharitha123");
			Statement stm=con.createStatement();
			 ResultSet rs=stm.executeQuery("select * from student12");
			  while(rs.next()) {
				  System.out.println(rs.getString(1) +"\t" + rs.getString(2) +"\t" + rs.getString(3) +"\t" + rs.getString(4));
				  
			  }
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}

}
