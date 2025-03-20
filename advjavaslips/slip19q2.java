package servlet_slips;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class slip19q2 extends HttpServlet
{
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
  {
     try {
			
     resp.setContentType("text/html");
     PrintWriter out=resp.getWriter();
     String user=req.getParameter("usr");
     String pass=req.getParameter("pass");
     
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","1234");
      Statement smt=con.createStatement();
      ResultSet rs=smt.executeQuery("select * from login");
      if(rs.next())
      {
    	  if(rs.getString(1).equals(user) && rs.getString(2).equals(pass))
    	  {
    		  out.println("Login Successful");
    	  }
    	  else
    	  {
    		  out.println("Invalid username and password");
    	  }
      }
	} catch (Exception e) {
		System.out.println(e);
	}
  }
}
