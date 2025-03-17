/* 1. Write a java program to read ‘N’ names of your friends, store it into HashSet and 
display them in ascending order.  */
package advjavaslips;
import java.util.*;

public class slip2q1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
    	HashSet hs=new HashSet();
    	System.out.println("Enter limit");
    	int n=sc.nextInt();	
    	System.out.println("Enter n name of frends");
    	for(int i=0;i<n;i++)
    	{
    		String name=sc.next();
    		hs.add(name);
    	}
    TreeSet ts=new TreeSet(hs);    

    System.out.println(ts);
	}
}