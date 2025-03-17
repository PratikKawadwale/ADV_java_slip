//1. Write a Java program using Runnable interface to blink Text on the frame. 
package advjavaslips;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class slip4q1 extends JFrame implements Runnable
{
	JLabel l1;
	@Override
    public void run() 
    {
        setSize(500,300);
		setLayout(new GridLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		l1=new JLabel("Blink text");
		 add(l1);
		setVisible(true);
		while (true) {
			try {
				Thread.sleep(1000);
				 l1.setVisible(!l1.isVisible());//imp
	         
				Thread.sleep(1000);
			} catch (Exception e) 
			{
				System.out.println(e);
			}
			
		}
    }	
	public static void main(String[] args) 
	{
	  slip4q1 s=new slip4q1();
	   Thread t1=new Thread(s);
	  t1.start();
	  
	}
}
