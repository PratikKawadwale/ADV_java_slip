/* 2. Write a Java Program to create a PROJECT table with field’s project_id, Project_name, 
Project_description, Project_Status. Insert values in the table. Display all the details of 
the PROJECT table in a tabular format on the screen.(using swing). */
package advjavaslips;

import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class slip12q2 extends JFrame
{
   slip12q2()
   {
	   setSize(1000,500);
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	   
	   setLayout(new FlowLayout());
	   try 
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","1234");
		 Statement smt=con.createStatement();
		 ResultSet rs=smt.executeQuery("select * from project");
		 String col[]= {"pid","pname","disc","status"};
		 DefaultTableModel dt=new DefaultTableModel(col,0);
		 while (rs.next())
		 {
		   dt.addRow(new Object[] {rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)});	
		}
		 JTable jt=new JTable();
		 JScrollPane jp=new JScrollPane(jt);
		 add(jp);
		 jt.setModel(dt);
		 setVisible(true); 
	    } catch (Exception e) {
		JOptionPane.showMessageDialog(this,"Error"+e);
	}
   }
   public static void main(String[] args) 
   {
	 new slip12q2();
   }
}
