/*
 * while loop: A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition. 
 * The while loop can be thought of as a repeating if statement.
Syntax :

while (boolean condition)
{
   loop statements...
}

    While loop starts with the checking of condition. If it evaluated to true, then the loop body statements are executed otherwise first statement following the loop is executed. For this reason it is also called Entry control loop
    Once the condition is evaluated to true, the statements in the loop body are executed. Normally the statements contain an update value for the variable being processed for the next iteration.
    When the condition becomes false, the loop terminates which marks the end of its life cycle.

 */
package com.java.loops;

	// Java program to illustrate while loop
	class WhileLoopDemo
	{
	    public static void main(String args[])
	    {
	        int x = 1;
	 
	        // Exit when x becomes greater than 4
	        while (x <= 4)
	        {
	            System.out.println("Value of x:" + x);
	 
	            //increment the value of x for next iteration
	            x++;
	        }
	    }
	}

