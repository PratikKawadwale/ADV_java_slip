/*2. Write a SERVLET program which counts how many times a user has visited a web 
page. If user is visiting the page for the first time, display a welcome message. If the 
user is revisiting the page, display the number of times visited. (Use Cookie)
[15 ]*/
package servlet_slips;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
@WebServlet("/cook")
public class slip15q2 extends HttpServlet
{
	static int i=1;
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
   {
	   resp.setContentType("text/html");
	   PrintWriter out=resp.getWriter();
	   String s=String.valueOf(i);
	   Cookie c=new Cookie("Visit", s);
	   resp.addCookie(c);
	   int visit=Integer.parseInt(c.getValue());
	   if(visit==1)
	   {
		   out.println("welcome to the page");
	   }
	   else
	   {
		   out.println("You are visite of"+i+"times");
		  
	   }
	   i++;
   }
}
