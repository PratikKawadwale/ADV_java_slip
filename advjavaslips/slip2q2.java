/*2. Design a servlet that provides information about a HTTP request from a client, such as 
IP-Address and browser type. The servlet also provides information about the server on     
which the servlet is running, such as the operating system type, and the names of        
currently loaded servlets. */
package servlet_slips;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.util.Enumeration;
import java.util.Set;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/slip2q2")
public class slip2q2 extends HttpServlet 
{
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
   {
	  PrintWriter out=resp.getWriter();
	  out.println("IPAddress="+req.getRemoteAddr());
	  out.println("Browser type="+req.getHeader("User-Agent"));
	  
	  out.println("Request Method:"+req.getMethod()); 
	  out.println("Request URI:"+req.getRequestURI());
	 
	  out.println("Operating System="+System.getProperty("os.name"));
	  out.println("Operating System version="+System.getProperty("os.version"));
	  
	  out.println("server name="+req.getServerName());
	  out.println("server port="+req.getServerPort());
	   
	  ServletContext context=getServletContext(); 
	  Set<String> names=context.getServletRegistrations().keySet(); 
	  for(String servletname:names) 
	  { 
	   out.println(servletname); 
	  }
   }
}
