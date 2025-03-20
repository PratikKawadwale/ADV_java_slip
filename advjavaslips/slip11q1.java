/* 1. Design an HTML page which passes customer number to a search servlet. The servlet            
searches for the customer number in a database (customer table) and returns customer 
details if found the number otherwise display error message. */
package servlet_slips;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/abc")
public class slip11q1 extends HttpServlet
{
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
   {
	PrintWriter out=resp.getWriter();
	
	String cno=req.getParameter("cno");	

	resp.setContentType("text/html");
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","1234");
    out.println("Connection  suucc");
	PreparedStatement pmt=con.prepareStatement("select * from customer where cno=?");
	pmt.setString(1,cno);
	ResultSet rs=pmt.executeQuery();
	
	out.println("<html><body>");
	if(rs.next())
	{
		out.println("<p>cno="+rs.getInt(1)+"</p>");
		out.println("<p>cname="+rs.getString(2)+"</p>");
	}
	else
	{
		out.println(cno+"not found");
	}
	 out.println("</body></html>");
	} catch (Exception e) 
	{
		e.printStackTrace();
	}
   }
}
