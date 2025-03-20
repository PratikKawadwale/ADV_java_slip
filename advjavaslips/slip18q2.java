/* 2. Write a SERVLET program in java to accept details of student (SeatNo,   Stud_Name, 
Class, Total_Marks). Calculate percentage and grade obtained and     
display details on 
page.  */
package servlet_slips;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/student")
public class slip18q2 extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     try {
    	PrintWriter out=resp.getWriter();
      resp.setContentType("text/html");
      String sno=req.getParameter("sno");
      String sname=req.getParameter("sname");
      String class1=req.getParameter("class");
      String tmarks=req.getParameter("tmarks");
      
      int tmarks1 =Integer.parseInt(tmarks);
      int per=tmarks1/5;
      String grade="";
      if(per>=70 && per<100)
    	  grade="O";
      else if(per>=60 && per<70)
    	  grade="A";
      else if(per>=50 && per<60)
    	  grade="B";
      else if(per>=40 && per<50)
    	  grade="c";
      else
    	  grade="fail";
    
     out.println("<br>Student no="+sno);
     out.println("<br>Student name="+sname);
     out.println("<br>Student Class="+class1);
     out.println("<br>Student per"+per);
     out.println("<br>Student grade="+grade);
    
    }catch(Exception e)
    {
       	System.out.println(e);
    }
   }
}