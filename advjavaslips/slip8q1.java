/* 1. Write a java program to define a thread for printing text on output screen for ‘n’ 
number of times. Create 3 threads and run them. Pass the text ‘n’ parameters to the 
thread constructor.  
Example:   
i.First thread prints “COVID19” 10 times. 
ii.Second thread prints “LOCKDOWN2020” 20 times 
iii.Third thread prints “VACCINATED2021” 30 times 
[15 M]*/
package advjavaslips;
class thread11 extends Thread
{
	String s1;
	int n;
	 thread11(String s1,int n)
	{
       this.s1=s1;
       this.n=n;
	}
	@Override
	public void run() 
	{
	    for(int i=1;i<=n;i++)
	    {
	    	System.out.println(s1);
	    }
	}
}
/* class thread12 extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<=20;i++)
	    {
	    	System.out.println("LOCKDOWN2020");
	    }
	}
}
class thread13 extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<=30;i++)
	    {
	    	System.out.println("VACCINATED2021");
	    }
	}
} */
public class slip8q1 
{
   public static void main(String[] args)
   {
	   thread11 t1=new thread11("COVID19",10);
	   thread11 t2=new thread11("LOCKDOWN2020",20);
	   thread11 t3=new thread11("VACCINATED2021",30);
	   t1.start();
	   t2.start();
	   t3.start();
  }
}
