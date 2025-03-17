/*2. Write a java program to display name of currently executing Thread in multithreading.*/
package advjavaslips;
public class slip28q2 extends Thread
{
	@Override
		public void run() {
		try {
			System.out.println(currentThread());
			sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		}
   public static void main(String[] args) 
   {
	   slip28q2 t1=new slip28q2();
	   slip28q2 t2=new slip28q2();
	   slip28q2 t3=new slip28q2();
      
	   t1.setName("thread1");
	   t2.setName("thread2");
	   t3.setName("thread3");
	   
	   t1.start();
	   t2.start();
	   t3.start();
   }
}
