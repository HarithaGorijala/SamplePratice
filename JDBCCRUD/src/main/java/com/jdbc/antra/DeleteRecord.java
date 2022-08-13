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
 * Servlet implementation class DeleteRecord
 */
@WebServlet("/delete")
public class DeleteRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteRecord() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid=request.getParameter("sid");
		PrintWriter out=response.getWriter();
		try {
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Gharitha123");
			PreparedStatement stm = con.prepareStatement("delete from student12 where sid=?");
			stm.setString(1,sid);
			int d=stm.executeUpdate();
			out.println(d +"rows deleted");
			 response.setContentType("text/html");
            out.println("<html><body><a href ='index.html'/></body></html>");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
