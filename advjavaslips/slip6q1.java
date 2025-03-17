/* 1. Write a Java program to accept ‘n’ integers from the user and store them in a collection. 
Display them in the sorted order. The collection should not accept duplicate elements. 
(Use a suitable collection). Search for a particular element using predefined search 
method in the Collection framework. */ 
package advjavaslips;

import java.util.*;

public class slip6q1 
{
    public static void main(String[] args) 
    {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter limit");
	   int n=sc.nextInt();
	   System.out.println("Enter no");
	   TreeSet t=new TreeSet();
	   for(int i=0;i<n;i++)
	   {
		   int no=sc.nextInt();
		   t.add(no);
	   }
	   for(int i=0;i<n;i++)
	   {
		   System.out.println(t);
	   }
	}
}
