/* 1. Write a java program to accept ‘N’ Integers from a user store them into LinkedList 
Collection and display only negative integers. */
package advjavaslips;

import java.util.Collection;
import java.util.LinkedList;

public class slip19q1
{
   public static void main(String[] args) 
   {
	   LinkedList<Integer> ll=new LinkedList<Integer>();
	   ll.add(11);
	   ll.add(-12);
	   ll.add(-13);
	   ll.add(15);
	   ll.add(16);
	   ll.add(-17);
	   for(int i:ll)
	   {
		   if(i<0)
		   {
			   System.out.println(i);
		   }
	   }
   }
}
