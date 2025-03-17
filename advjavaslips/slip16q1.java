/* 1. Write a java program to create a TreeSet, add some colors (String) and print out the 
content of TreeSet in ascending order.  */
package advjavaslips;

import java.util.Collection;
import java.util.TreeSet;

public class slip16q1 
{
     public static void main(String[] args) 
     {
	    TreeSet<String> t=new TreeSet<String>();
	    t.add("pink");
	    t.add("green");
	    t.add("black");
	    t.add("white");
	    
	    System.out.println(t);
	 }
}
