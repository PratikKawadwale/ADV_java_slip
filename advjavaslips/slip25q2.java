//2. Write a Java Program for the following: Assume database is already created.
package advjavaslips;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;

public class slip25q2 extends JFrame implements ActionListener
{
    JLabel l1;
    JTextField t1;
    JButton create,alter,drop;
	slip25q2()
	{
	  setSize(500,300);
	  setLayout(new FlowLayout());
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	 
	  l1=new JLabel("Type your DDL Query");
	  add(l1);
	  t1= new JTextField(30);
	  add(t1);
	  create = new JButton("create table");
	  alter = new JButton("alter table");
	  drop = new JButton("drop table");
	  add(create);add(alter);add(drop);
	  setVisible(true);
	  create.addActionListener(this);
	  alter.addActionListener(this);
	  drop.addActionListener(this);
	 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==create||e.getSource()==alter||e.getSource()==drop)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pratik","root","1234");
			    String q =t1.getText();
			    PreparedStatement pmt =con.prepareStatement(q);
			    pmt.execute();
			   JOptionPane.showMessageDialog(this,"Query run succ");
			
			} catch (ClassNotFoundException | SQLException e1) 
			{
				e1.printStackTrace();
			}
			
		}
		
	}
    public static void main(String[] args)
      {
		new slip25q2();
    	}
}
//create table t1(tid int,tname varchar(33))
// alter table t1 to t2