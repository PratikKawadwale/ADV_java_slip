/* 2. Write a Java program to create LinkedList of String objects 
 * and perform the following: 
i. Add element at the end of the list 
ii. Delete first element of the list 
iii. Display the contents of list in reverse order  */
package advjavaslips;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class slip3q2 
{
  public static void main(String[] args) {
	LinkedList ll=new LinkedList();
    ll.add(11);
    ll.add(12);
    ll.add(13);
    ll.add(14);
    ll.removeFirst();
    Collections.sort(ll);
    Collections.reverse(ll);
    System.out.println(ll);
  }
}
