/* 2. Write a java program for the following: 
i. To create a Product(Pid, Pname, Price) table. 
ii. Insert at least five records into the table. 
iii. Display all the records from a table.  */
package advjavaslips;

import java.sql.*;
public class slip7q2 
{
   public static void main(String[] args) throws Exception 
   {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","1234");
 /*    Statement smt=con.createStatement();
     String q="create table product(pid int,pname varchar(30),price int)";
     smt.execute(q); */
     PreparedStatement pmt=con.prepareStatement("insert into product values(?,?,?)");
    /* pmt.setInt(1, 101);
     pmt.setString(2, "abc");
     pmt.setInt(3, 500);
     pmt.executeUpdate();
     
     pmt.setInt(1, 102);
     pmt.setString(2, "pqr");
     pmt.setInt(3, 600);
     pmt.executeUpdate();
     
     pmt.setInt(1, 103);
     pmt.setString(2, "xyz");
     pmt.setInt(3, 700);
     pmt.executeUpdate();
     
     pmt.setInt(1, 104);
     pmt.setString(2, "www");
     pmt.setInt(3, 800);
     pmt.executeUpdate();
     
     pmt.setInt(1, 105);
     pmt.setString(2, "uyt");
     pmt.setInt(3, 900);
     pmt.executeUpdate();
   */
     ResultSet rs=pmt.executeQuery("select * from product");
     System.out.println("pid\tpname\tsalary\t");
     while(rs.next())
     {
    	 int pid=rs.getInt(1);
    	 String pname=rs.getString(2);
    	 int salary=rs.getInt(3);
    	 System.out.println(pid+"\t"+pname+"\t"+salary);
     }
   }
}
