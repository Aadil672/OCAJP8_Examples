/* 
 Enhanced For loop:
Java also includes another version of for loop introduced in Java 5. 
Enhanced for loop provides a simpler way to iterate through the elements of a collection or array. It is inflexible and should be used only when there is a need to iterate through the elements in sequential manner without knowing the index of currently processed element.
Syntax:

for (T element:Collection obj/array)
{
    statement(s)
}

Lets take an example to demonstrate how enhanced for loop can be used to simpify the work. Suppose there is an array of names and we want to print all the names in that array. Let’s see the difference with these two examples
Enhanced for loop simplifies the work as follows-
 */

package com.java.loops;

public class EnhancedForLoop {
	// Java program to illustrate enhanced for loop
	
	    public static void main(String args[])
	    {
	        String array[] = {"Arshad", "Asad", "Ajmal","Aadil", "Tahir", "Afzal"};
	        //String[] array = {"Arshad", "Asad", "Ajmal","Aadil", "Tahir", "Afzal"};
	        
	        //enhanced for loop
	        for (String x:array)
	        {
	            System.out.println(x);
	        }
	 
	        //for loop for same function
	        /*for (int i = 0; i < array.length; i++)
	        {
	            System.out.println(array[i]);
	        }*/
	        
	    }
	}

