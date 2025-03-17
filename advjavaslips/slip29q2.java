/*2. Write a Java program to create LinkedList of integer objects and perform the following:  
i. Add element at first position  
ii. Delete last element  
iii. Display the size of link list   */
package advjavaslips;

import java.util.LinkedList;

public class slip29q2 
{
    public static void main(String[] args) 
    {
	   LinkedList<Integer> ll= new LinkedList<Integer>();
	   ll.addFirst(1);
	   ll.add(23);
	   System.out.println(ll);
	   ll.removeLast();
	   System.out.println(ll);
	   int n=ll.size();
	   System.out.println(n);
	}
}
