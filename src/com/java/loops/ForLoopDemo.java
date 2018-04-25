/*
 * for loop: for loop provides a concise way of writing the loop structure. Unlike a while loop, 
 * a for statement consumes the initialization, condition and increment/decrement in one line thereby providing a shorter, 
 * easy to debug structure of looping.
Syntax:

for (initialization condition; testing condition; 
                              increment/decrement)
{
    statement(s)
}

    Initialization condition: Here, we initialize the variable in use. It marks the start of a for loop. An already declared variable can be used or a variable can be declared, local to loop only.
    Testing Condition: It is used for testing the exit condition for a loop. It must return a boolean value. It is also an Entry Control Loop as the condition is checked prior to the execution of the loop statements.
    Statement execution: Once the condition is evaluated to true, the statements in the loop body are executed.
    Increment/ Decrement: It is used for updating the variable for next iteration.
    Loop termination:When the condition becomes false, the loop terminates marking the end of its life cycle.

 */
// Java program to illustrate for loop.
package com.java.loops;

/*public class ForLoopDemo {
	
	    public static void main(String args[])
	    {
	        // for loop begins when x=2
	        // and runs till x <=4
	        for (int x = 2; x <= 4; x++)
	            System.out.println("Value of x:" + x);
	    }
	}
*/

/*public class ForLoopDemo {
	
    public static void main(String args[])
    {
    	String s="I Love you!!!";
        // for loop begins when x=2
        // and runs till x <=4
        for (;;)   //will create infinite loop
        	
            System.out.println(s);
    }
}*/

public class ForLoopDemo {
	
    public static void main(String args[])
    {
    	int i=0;
        // for loop begins when x=2
        // and runs till x <=4
        for (;;)   //will create infinite loop
        	
            System.out.println(i++ +" ");
    }
    
    
    
    
    
}