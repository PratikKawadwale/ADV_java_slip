/* 1. Write a java program to accept ‘N’ Subject Names from a user store them into 
LinkedList Collection and Display them by using Iterator interface.  */
package advjavaslips;

import java.util.*;

public class slip21q1 
{
   public static void main(String[] args) 
   {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter limit");
	  int n=sc.nextInt();
	  LinkedList<String> ll=new LinkedList<String>();
	  System.out.println("Enter n sub name");
	  for(int i=0;i<n;i++)
	  {
		  String name=sc.next();
		  ll.add(name);
	  }
	  Iterator<String> t=(Iterator<String>) ll.iterator();
	  while(t.hasNext())
	  {
		  System.out.println(t.next());
	  }
   }
}
