/*2. Write a Java Program for the implementation of scrollable ResultSet. Assume Teacher 
table with attributes (TID, TName, Salary) is already created.  */
package advjavaslips;

import java.sql.*;
import java.sql.DriverManager;

public class slip30q2 
{
     public static void main(String[] args) throws Exception
     {
    	 
	    Class.forName("com.mysql.cj.jdbc.Driver");	
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","1234");
	    Statement smt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE , ResultSet.CONCUR_READ_ONLY);
	   ResultSet rs=smt.executeQuery("select * from teacher");
	    System.out.println("Tid \t Tname \t Salary");
	    while(rs.next())
	    {
	    	int tid=rs.getInt(1);
	    	String tname=rs.getString(2);
	    	Float salary=rs.getFloat(3);
	    	System.out.println(tid+"\t"+tname+"\t"+salary);
	    }
	    System.out.println("\n\nTid \t Tname \t Salary");
	    while(rs.previous())
	    {
	    	int tid=rs.getInt(1);
	    	String tname=rs.getString(2);
	    	Float salary=rs.getFloat(3);
	    	System.out.println(tid+"\t"+tname+"\t"+salary);
	    }
	    System.out.println("\n\nTid \t Tname \t Salary");
	    if(rs.first())
	    {
	    	int tid=rs.getInt(1);
	    	String tname=rs.getString(2);
	    	Float salary=rs.getFloat(3);
	    	System.out.println(tid+"\t"+tname+"\t"+salary);
	    }
	    System.out.println("\n\nTid \t Tname \t Salary");
	    if(rs.last())
	    {
	    	int tid=rs.getInt(1);
	    	String tname=rs.getString(2);
	    	Float salary=rs.getFloat(3);
	    	System.out.println(tid+"\t"+tname+"\t"+salary);
	    }
	    System.out.println("\n\nTid \t Tname \t Salary");
	    if(rs.absolute(2))
	    {
	    	int tid=rs.getInt(1);
	    	String tname=rs.getString(2);
	    	Float salary=rs.getFloat(3);
	    	System.out.println(tid+"\t"+tname+"\t"+salary);
	    }
     }
}
