//2. Write a java program to simulate traffic signal using threads.
package advjavasliprahilele;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class slip6q2 extends JFrame implements ActionListener
{
	JRadioButton r,y,g;
	ButtonGroup group;
	JLabel l;
	JPanel p;
	slip6q2()
	{
	    setSize(500,400);
	    setLayout(new FlowLayout());
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    l=new JLabel();
	    l.setFont(new Font("Arial",Font.BOLD,18));
	    r=new JRadioButton("Red");
	    y=new JRadioButton("Yellow");
	    g=new JRadioButton("Green");
	    group=new ButtonGroup();
	    group.add(r);
	    group.add(y);
	    group.add(g);
	    
	    p=new JPanel();
	    p.add(r);
	    p.add(g);
	    p.add(y);
	    add(p);
	    add(l);
	    r.addActionListener(this);
	    y.addActionListener(this);
	    g.addActionListener(this);
	    setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	 if(e.getSource()==r )
	 {
		 l.setText("Stop");
		 l.setForeground(Color.red);
	 }
	 if(e.getSource()==y )
	 {
		 l.setText("Ready");
		 l.setForeground(Color.yellow);
	 }
	 if(e.getSource()==g )
	 {
		 l.setText("Go");
		 l.setForeground(Color.green);
	 }
	}
	public static void main(String[] args) {
	   new slip6q2();	
	}

}
