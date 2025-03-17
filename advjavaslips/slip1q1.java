/* 1. Write a Java program to display all the alphabets between ‘A’ to ‘Z’
 *  after every 2 seconds. */
package advjavaslips;

public class slip1q1 extends Thread
{
	public void run() 
	{
	   	 for(char l='A';l<='Z';l++)
	   	 {
	   		 System.out.println("Alphabet="+l);
	   		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	   	 }
	}
   public static void main(String[] args) 
   {
	  slip1q1 t1 = new slip1q1();
	  t1.start();
   }
}
