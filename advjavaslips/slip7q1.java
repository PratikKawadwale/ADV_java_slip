/* 1. Write a java program that implements a multi-thread application that has three threads. 
First thread generates random integer number after every one second, if the number is 
even; second thread computes the square of that number and print it. If the number is 
odd, the third thread computes the of cube of that number and print it. 
[15 M] */
package advjavaslips;

import java.util.*;

class thread1 extends Thread
{
	int no;
	@Override
	public void run() 
	{
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hou many number are gernrated=");
	    int n =sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        try {
	          no=r.nextInt(100);
	          
				Thread.sleep(1000);
	         if(no%2==0)
	         {
	        	 thread2 t2=new thread2(no);
	        	 t2.start();
	         }
	         else
	         {
	        	 thread3 t3=new thread3(no);
	        	 t3.start();
	         }
	        } catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
	}
}
class thread2 extends Thread
{
	int no;
	thread2(int no)
	{
		this.no=no;
	}
	@Override
	public void run() 
	{
	  System.out.println("genrated number="+no+"square="+(no*no));	
	}
}
class thread3 extends Thread
{
	int no;
	thread3(int no)
	{
		this.no=no;
	}
	@Override
	public void run() 
	{
		System.out.println("genrated number="+no+"cube="+(no*no*no));
	}
}

public class slip7q1 
{
  public static void main(String[] args)
  {
	  thread1 t=new thread1();
	  t.start();
  }
}
