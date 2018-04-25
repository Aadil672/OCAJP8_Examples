/*
 * 
For-each loop in Java
1.6

Prerequisite: Decision making in Java

For-each is another array traversing technique like for loop, while loop, do-while loop introduced in Java5.

    It starts with the keyword for like a normal for-loop.
    Instead of declaring and initializing a loop counter variable, you declare a variable that is the same type as the base type of the array, 
    followed by a colon, which is then followed by the array name.
    In the loop body, you can use the loop variable you created rather than using an indexed array element.
    It’s commonly used to iterate over an array or a Collections class (eg, ArrayList)

Syntax:

for (type var : array) 
{ 
    statements using var;
}

is equivalent to:

for (int i=0; i<arr.length; i++) 
{ 
    type var = arr[i];
    statements using var;
}

 */

package com.java.loops;


public class ForEachLoopDemo {
	
    public static void main(String[] arg)
    {
        {
            int[] marks = { 125, 132, 95, 116, 140, 110 };
         
        // for each loop
           for (int elements : marks) 
           // for(int i=0;i<marks.length;i++)
        
             System.out.println("Array Elements are:" +elements);
            	//int list=marks[i];
            	//System.out.println("Array Elements are:" +marks);
        
        }
    }
}


/*public class ForEachLoopDemo {
	
	    public static void main(String[] arg)
	    {
	        {
	            int[] marks = { 125, 132, 95, 116, 140, 110 };
	             
	            int highest_marks = maximum(marks);
	            System.out.println("The highest score is " + highest_marks);
	        }
	    }
	    public static int maximum(int[] numbers)
	    { 
	        int maxSoFar = numbers[3];
	         
	        // for each loop
	        for (int num : numbers) 
	        {
	            if (num > maxSoFar)
	            {
	                maxSoFar = num;
	            }
	        }
	    return maxSoFar;
	    }
	}
*/