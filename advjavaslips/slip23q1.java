/* 1. Write a java program to accept a String from a user and display each vowel from a    
String after every 3 seconds. */
package advjavaslips;

import java.util.Scanner;

public class slip23q1 extends Thread
{
    @Override
    public void run() 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter string");
       String v=sc.next();
       for(int i=0;i<v.length();i++)
       {
    	   char ch=v.charAt(i);
    	   if(ch == 'a' ||ch == 'i' ||ch == 'e' ||ch =='o' ||ch=='u'||ch=='A'||ch == 'E' ||ch == 'I' ||ch =='O' ||ch=='U' )
    	   {
    		   System.out.println(ch);
    		   try {
				sleep(3000);
			} catch (InterruptedException e) 
    		   {
				e.printStackTrace();
			}
    	   }
       }
    }
	public static void main(String[] args) 
    {
	   slip23q1 t=new slip23q1();
	   t.start();
  }
}
