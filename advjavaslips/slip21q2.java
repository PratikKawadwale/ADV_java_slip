/*2. Write a java program to solve producer consumer problem in which a producer 
produces a value and consumer consume the value before producer generate the next 
value. (Hint: use thread synchronization)*/
package advjavasliprahilele;
class company extends Thread
{
	boolean chance=true;
	public synchronized void produce(int i)throws Exception
	{
		if(!chance)
		{
			wait();
		}
		System.out.println("producer produce"+i+"items");
		chance=false;
		notify();
	}
	public synchronized void consumer(int i)throws Exception
	{
		if(chance)
		{
			wait();
		}
		System.out.println("consumer consumes"+i+"items");
		chance=true;
		notify();
	}
}
class producer extends Thread
{
	company c;
	producer(company c)
	{
		this.c=c;
	}
	@Override
	public void run() {
	for(int i=1;i<6;i++)
	{
		try {
			c.produce(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	}
}
class consumer extends Thread
{
	company c;
	consumer(company c)
	{
		this.c=c;
	}
	@Override
	public void run() 
	{
		for(int i=1;i<6;i++)
		{
          try 
          {
			 c.consumer(i); 
		  } catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
}
public class slip21q2 {
 public static void main(String[] args)
 {
	company c=new company();
	Thread t1=new producer(c);
	Thread t2=new consumer(c);
	t1.start();
	t2.start();
  }
}
