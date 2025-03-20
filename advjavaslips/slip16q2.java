/*2. Write a Java program to accept the details of Teacher (TNo, TName, Subject). Insert at
least 5 Records into Teacher Table and display the details of Teacher who is teaching 
“JAVA” Subject. (Use PreparedStatement Interface)*/
package advjavasliprahilele;

import java.sql.*;

public class slip16q2 
{
    public static void main(String[] args) throws Exception 
    {
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","1234");
	   PreparedStatement pmt=con.prepareStatement("insert into teacher values(?,?,?)");
	   pmt.setInt(1, 101);
	   pmt.setString(2,"shravan");
	   pmt.setString(3,"java");
	   pmt.executeUpdate();
	   pmt.setInt(1, 102);
	   pmt.setString(2,"komal");
	   pmt.setString(3,"c");
	   pmt.executeUpdate();
	   pmt.setInt(1, 103);
	   pmt.setString(2,"nandkumar");
	   pmt.setString(3,"python");
	   pmt.executeUpdate();
	   pmt.setInt(1, 104);
	   pmt.setString(2,"shreeman");
	   pmt.setString(3,"dbms");
	   pmt.executeUpdate();
	   pmt.setInt(1, 105);
	   pmt.setString(2,"payal");
	   pmt.setString(3,"dsa");
	   pmt.executeUpdate(); 
	   pmt=con.prepareStatement("select tno, tname from teacher where sub=?");
	   pmt.setString(1, "java");
	   ResultSet rs=pmt.executeQuery();
	   while(rs.next())
	   {
		   System.out.println("tno="+rs.getInt(1));
		   System.out.println("tname="+rs.getString(2));
	       
	   }
	}
}
