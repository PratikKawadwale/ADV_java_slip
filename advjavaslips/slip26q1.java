/* 1. Write a Java program to delete the details of given employee (ENo EName Salary). 
Accept employee ID through command line. (Use PreparedStatement Interface) 
[15 M] */
package advjavaslips;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class slip26q1 
{
   public static void main(String[] args)throws Exception 
   {
	  if(args.length==1)
	  {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","1234");
		  PreparedStatement pmt=con.prepareStatement(null);
	  }
   }
}
