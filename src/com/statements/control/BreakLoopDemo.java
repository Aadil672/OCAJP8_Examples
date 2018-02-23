/*
 * jump: Java supports three jump statement: break, continue and return. These three statements transfer control to other part of the program.

    Break: In Java, break is majorly used for:
        Terminate a sequence in a switch statement (discussed above).
        To exit a loop.
        Used as a “civilized” form of goto.

    Using break to exit a Loop

    Using break, we can force immediate termination of a loop, bypassing the conditional expression and any remaining code in the body of the loop.
    Note: Break, when used inside a set of nested loops, will only break out of the innermost loop.

 */
package com.statements.control;

	// Java program to illustrate using
	// break to exit a loop

public class BreakLoopDemo {

		    public static void main(String args[])
	    {
	        // Initially loop is set to run from 0-9
	        for (int i = 0; i < 10; i++)
	        {
	            // terminate loop when i is 5.
	            //if (i == 5)
	                break;
	 
	            //System.out.println("i: " + i);
	        }
	        System.out.println("Loop complete.");
	    }
	}
