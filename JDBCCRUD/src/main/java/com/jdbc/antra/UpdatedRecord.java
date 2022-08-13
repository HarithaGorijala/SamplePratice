package com.jdbc.antra;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdatedRecord
 */
@WebServlet("/update")
public class UpdatedRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatedRecord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement smt=null;
		String sname = request.getParameter("sname");
		String sid = request.getParameter("sid");
		PrintWriter out=response.getWriter();
	   try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Gharitha123");
		 smt= con.prepareStatement("update student12 set sname=? where sid=?");
		 smt.setString(1,sname);
		 smt.setString(2, sid);
		 int h=smt.executeUpdate();
		 
		  System.out.println(h + "row updated");
	
			
		}catch(Exception e){
			System.out.println("no records found");
			e.printStackTrace();
		
		}   
         finally {
        	 try
        	 {
        		 if(con!=null) {
        			 con.close();
        		 }
        		 if(smt!=null) {
        			 smt.close();
        		 }
        	 } catch(Exception e) {
        		 
        	 }
         }
         out.close();

}
}