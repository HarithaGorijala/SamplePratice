package com.jdbc.antra;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateRecord
 */
@WebServlet("/create")
public class CreateRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CreateRecord() {
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sname = request.getParameter("sname");
		String sbranch = request.getParameter("sbranch");
		String sid = request.getParameter("sid");
		String sadd=   request.getParameter("sadd");
        PrintWriter out=response.getWriter();   

        Connection con=null;
		PreparedStatement psmt=null;
	
	   try {
	     Class.forName("oracle.jdbc.driver.OracleDriver");
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Gharitha123");
		 psmt=con.prepareStatement("insert into student12 values(?,?,?,?)");
	  
		 psmt.setString(1,sname);
		 psmt.setString(2,sbranch);
		 psmt.setString(3,sid);
		 psmt.setString(4,sadd);	
		       
	       
       	int i=psmt.executeUpdate();
	
	     out.println(i + "inserted successfully");
	     response.setContentType("text/html");
	     out.println("<html><body><a href='index.html'/></body></html>");
		
	} catch (SQLException e) {
	   System.out.println("invalid type");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    finally {
	    	try {
	    	if(con!=null) {
	    		con.close();
	    	}
	    	if(psmt!=null) {
	    		psmt.close();
	    	}
	    }catch(Exception e) {
	    	
	    }
	   }
     
	}
}
