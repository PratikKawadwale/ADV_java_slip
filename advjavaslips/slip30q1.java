//1. Write a java program for the implementation of synchronization. 
package advjavaslips;

import java.util.*;
class thread21
{ 
	int n=0;
    public synchronized void inc()
    {
    	n++;
    	System.out.println(Thread.currentThread().getName()+"count="+n);
    }
}
class MyThread extends Thread 
{
	thread21 increment;
   MyThread(thread21 increment)
   {
	   this.increment=increment;
   }
   @Override
   public void run() 
   {
	  for(int i=0;i<3;i++)
	  {
		  increment.inc();
		  try {
			sleep(1000);
		} catch (InterruptedException e) 
		  {
			e.printStackTrace();
		}
	  }
   }
}
public class slip30q1 extends Thread
{
      public static void main(String[] args) 
      {
    	  thread21 increment=new thread21();
		   MyThread t1=new MyThread(increment);
		   MyThread t2=new MyThread(increment);
		   
		   t1.start();
		   t2.start();
	  }
}
