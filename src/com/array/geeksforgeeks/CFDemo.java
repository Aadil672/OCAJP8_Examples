package com.array.geeksforgeeks;

import java.util.ArrayList;

/*public class CFDemo {
public static void main(String[] args) {
	ArrayList<String> list= new ArrayList<>();
	
	list.add("SE");
	list.add("EE");
	list.add("ME");
	list.add("SE");
	list.add("EE");
	
	list.remove("SE");
	//list.removeIf(filter)
	System.out.println(list);
	
}
}*/


//Java program to demonstrate Iterator
/*import java.util.ArrayList;
import java.util.Iterator;

public class CFDemo
{
 public static void main(String[] args)
 {
     ArrayList al = new ArrayList();

     for (int i = 0; i < 10; i++)
         al.add(i);

     System.out.println(al);                   //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

     // at beginning itr(cursor) will point to
     // index just before the first element in al
     Iterator itr = al.iterator();

     // checking the next element availabilty
     while (itr.hasNext())
     {
         //  moving cursor to next element
         int i = (Integer)itr.next();

         // getting even elements one by one
         System.out.print(i + " ");              //0 1 2 3 4 5 6 7 8 9

         // Removing odd elements
         if (i % 2 != 0)
            itr.remove(); 
     }
     System.out.println(); 
     System.out.println(al);                //[0, 2, 4, 6, 8]

 }
}
*/