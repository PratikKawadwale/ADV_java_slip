/*2. Write a Java program to display information about all columns in the DONAR table 
using ResultSetMetaData. */
package advjavasliprahilele;

import java.sql.*;

public class slip11q2 
{
    public static void main(String[] args) throws Exception 
    {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","1234");
	    Statement smt=con.createStatement();
	    ResultSet rs=smt.executeQuery("select * from product");
	    ResultSetMetaData rmd=rs.getMetaData();
	    System.out.println("column count="+rmd.getColumnCount());
	    for(int i=1;i<=rmd.getColumnCount();i++)
	    {
	    	System.out.println("column name="+rmd.getColumnName(i));
	    	System.out.println("column type="+rmd.getColumnType(i));
	    	System.out.println("column label="+rmd.getColumnLabel(i));
	    	System.out.println("isautoincrement="+rmd.isAutoIncrement(i));
	    	System.out.println("column table name="+rmd.getTableName(i));
	    }
    }
}
