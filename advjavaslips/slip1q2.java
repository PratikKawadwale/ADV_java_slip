/* 2. Write a Java program to accept the details of Employee (Eno, EName, Designation, 
Salary) from a user and store it into the database. (Use Swing) */
package advjavaslips;
import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class slip1q2 extends JFrame implements ActionListener
{
	JButton b;JTextField text,text1,text2,text3;
     slip1q2()
     {
	    setSize(500,400);
	    setVisible(true);
	    setLayout(new GridLayout(5,2,10,50));
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
	    JLabel label=new JLabel("Enter eno");
	     text=new JTextField();
	    JLabel label1=new JLabel("Enter ename");
	     text1=new JTextField();
	    JLabel label2=new JLabel("Enter designation");
	    text2=new JTextField();
	    JLabel label3=new JLabel("Enter salary");
	     text3=new JTextField();
	     b=new JButton("submit");
        
	    add(label);add(text);
        add(label1);
        add(text1);
        add(label2);
        add(text2);
        add(label3);
        add(text3);
        add(b);
        b.addActionListener(this);
     }
     @Override
 	public void actionPerformed(ActionEvent e)
     {
 		if(e.getSource()==b)
 		{
 			int eno=Integer.parseInt(text.getText().trim());
 			String ename=text1.getText().trim();
 			String designation=text2.getText().trim();
 			int salary=Integer.parseInt(text3.getText().trim());
 			try {
				db(eno,ename,designation,salary);
			} catch (Exception e1)
 			{
				e1.printStackTrace();
			}
 		}
 	}
     public void db(int eno,String ename,String designation,int salary) throws Exception 
     {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","1234");
           PreparedStatement pmt= con.prepareStatement("insert into emp values(?,?,?,?)");
           pmt.setInt(1,eno);
           pmt.setString(2,ename);
           pmt.setString(3, designation);
           pmt.setInt(4, salary);
           int rows= pmt.executeUpdate();
           if (rows > 0) {
               JOptionPane.showMessageDialog(this, "Employee saved successfully!");
           } else {
               JOptionPane.showMessageDialog(this, "Failed to save employee!");
           }
     }
     public static void main(String[] args) 
     {
		new slip1q2();
	}
	
}
