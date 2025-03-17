/* 1. Write a Menu Driven program in Java for the following: Assume Employee table with   
attributes (ENo, EName, Salary) is already created. 1. Insert 2. Update 3. Display 4. 
Exit. */
package advjavaslips;

import java.sql.*;
import java.util.*;

public class slip22q1 {

	public static void main(String[] args)  
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","1234");
		
		Scanner sc=new Scanner(System.in);
		 int n;
		do {
		    System.out.println("1-insert\n2-update\n3-display\n4-exit");
		    System.out.println("Enter choice");
		     n=sc.nextInt();
		
	       switch (n)
	       {
		     case 1: PreparedStatement pmt=con.prepareStatement("insert into emp values(?,?,?)");
		            System.out.println("Enter emp no");
		            int eno=sc.nextInt();
		            System.out.println("Enter emp name");
		            String name=sc.next();
		            System.out.println("Enter emp salary");
		            int salary=sc.nextInt();
		        
		            pmt.setInt(1, eno);
		            pmt.setString(2, name);
		            pmt.setInt(3, salary);
		            pmt.executeUpdate();
		            System.out.println("data insert succ");
		            break;
		     case 2: System.out.println("Enter emp no to update");
		     		eno=sc.nextInt();
		     		System.out.println("Enter emp name");
		     		name=sc.next();
		     		System.out.println("Enter emp salary");
		     		salary=sc.nextInt();
		     		String q="update emp set ename=?,salary=? where eno=?";
		     		pmt=con.prepareStatement(q);
		     		pmt.setString(1, name);
		     		pmt.setInt(2, salary);
		     		pmt.setInt(3, eno);
		     		int check=pmt.executeUpdate();
		     		if(check>0)
		     		{
		     			System.out.println("updated succ");
		     		}
		     		else
		     		{
		     			System.out.println("update failed");
		     		}
		     		break;
		     case 3:
		    	 	Statement smt=con.createStatement();
		    	 	String q1="select * from emp";
		    	 	ResultSet rs=smt.executeQuery(q1);
		    	 	System.out.println("eno\tename\tsalary");
		    	 	while(rs.next())
		    	 	{
		    	 		eno=rs.getInt(1);
		    	 		name=rs.getString(2);
		    	 		salary=rs.getInt(3);
		    	 		System.out.println(eno+"\t"+name+"\t"+salary);
		    	 	}
		    	 	break;
		     case 4:
		    	 	System.out.println("Existing....");
		    	 	System.exit(0);
		    	 	break;
	       }
		} while (n<5);
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}
