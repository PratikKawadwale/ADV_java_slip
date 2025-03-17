/* 2. Write a Java program to store city names and their STD codes using an appropriate 
collection and perform following operations: 
i. Add a new city and its code (No duplicates)  
ii.Remove a city from the collection 
iii. Search for a city name and display the code */
package advjavaslips;

import java.util.*;

public class slip4q2 
{
    public static void main(String[] args)
    {
	   TreeMap t=new TreeMap();	
	   
	   t.put("shrirampur",101);
	   t.put("shirdi",111);
	   t.put("rahata",112);
	   System.out.println(t);
	   t.remove("rahata");
	   System.out.println(t);
	   Scanner sc=new Scanner(System.in);
	    System.out.println("Enter city name to search");
	    String name=sc.next();
	   if(t.containsKey(name))
	   {
		   System.out.println("city found\t"+name+"\t"+t.get(name));
	   }
	   else
	   {
		   System.out.println("not found");
	   }
	    
    }
}
