/*1. Write a Java program to display information about all columns in the DONAR table 
using ResultSetMetaData. */
package advjavaslips;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;

public class slip29q1 
{
   public static void main(String[] args) throws Exception 
   {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","1234");
        Statement smt=con.createStatement();
          ResultSet rs=smt.executeQuery("select * from donar");
          ResultSetMetaData md=rs.getMetaData();
          int n=md.getColumnCount();
          System.out.println("total table column"+n);
          System.out.println("no \t name \t Label \t type \t Display size \t ReadOnly \t writable\t NULL");
          for(int i=1;i<=n;i++)
          {
        	  System.out.println(i+"\t"+md.getColumnName(i)+"\t"+md.getColumnLabel(i)+"\t"+md.getColumnType(i)+"\t"+md.getColumnDisplaySize(i)+"\t"+md.isReadOnly(i)+"\t"+md.isWritable(i)+md.isNullable(i));
          }
   }
}
