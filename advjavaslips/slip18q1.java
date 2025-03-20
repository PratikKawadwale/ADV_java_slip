//1. Write a java program to display name and priority of a Thread. 
package advjavasliprahilele;
class eg extends Thread
{
	@Override
	public void run() {
	System.out.println("thread name"+currentThread().getName());
	System.out.println("thread priority"+currentThread().getPriority());
	}
}
public class slip18q1
{
   public static void main(String[] args) 
   {
	 eg t=new eg();
	 t.start();
}
}
