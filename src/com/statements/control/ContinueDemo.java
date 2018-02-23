/*
 * Continue: Sometimes it is useful to force an early iteration of a loop. That is, 
 * you might want to continue running the loop but stop processing the remainder of the code in its body for this particular iteration.
 * This is, in effect, a goto just past the body of the loop, to the loop’s end. The continue statement performs such an action.

 */

package com.statements.control;

	// Java program to illustrate using
	// continue in an if statement
	public class ContinueDemo
	{
	    public static void main(String args[])
	    {
	        for (int i = 0; i < 10; i++)
	        {
	            // If the number is even
	            // skip and continue
	            if (i%2 == 0)
	            	//System.out.println(i);
	            	continue;
	            	
	 
	            // If number is odd, print it
	            System.out.print(i + " ");
	        }
	    }
	}
	
