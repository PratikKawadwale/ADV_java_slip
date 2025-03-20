//1. Write a java program to display name and priority of a Thread. [15 M]
package advjavasliprahilele;
class q1 extends Thread
{
	@Override
	public void run() {
	 System.out.println("current thread name="+currentThread().getName());
	 System.out.println("current thread priority="+currentThread().getPriority());
	}
}
public class slip15q1
{
	
   public static void main(String[] args) 
   {
	   q1 t=new q1();
	   t.start();
  }
}
