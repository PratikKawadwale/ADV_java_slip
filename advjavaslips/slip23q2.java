/* 2. Write a java program to accept ‘N’ student names through command line, store them 
into the appropriate Collection and display them by using Iterator and ListIterator 
interface. */
package advjavaslips;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.print.DocFlavor.STRING;

public class slip23q2 
{
     public static void main(String[] args) 
     {
    	 ArrayList<String> al=new ArrayList<String>();
	     for(int i=0;i<args.length;i++)
	     {
	    	 al.add(args[i]);
	     }
	     Iterator<String> itr=al.iterator();
	     while(itr.hasNext())
	     {
	    	 System.out.println("iterator="+itr.next());
	     }
	     
	     ListIterator<String> litr=al.listIterator();
	     while(litr.hasNext())
	     {
	    	 System.out.println("List iterator="+litr.next());
	     }
	 }
}
