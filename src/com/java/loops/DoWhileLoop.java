
/*
 * do while: do while loop is similar to while loop with only difference that it checks for condition after executing the statements, 
 * and therefore is an example of Exit Control Loop.
Syntax:

do
{
    statements..
}
while (condition);

Note:
    do while loop starts with the execution of the statement(s). There is no checking of any condition for the first time.
    After the execution of the statements, and update of the variable value, the condition is checked for true or false value. If it is evaluated to true, next iteration of loop starts.
    When the condition becomes false, the loop terminates which marks the end of its life cycle.
    It is important to note that the do-while loop will execute its statements atleast once before any condition is checked, and therefore is an example of exit control loop.

 */
package com.java.loops;
//Java program to illustrate do-while loop
/*public class DoWhileLoop
	{
	    public static void main(String args[])
	    {
	        int x = 21;
	        do
	        {
	            //The line while be printer even
	            //if the condition is false
	            System.out.println("Value of x:" + x);
	            x++;
	        }
	        while (x <= 22);
	    }
	}*/
//output: Value of x:21
//Value of x:22



/*public class DoWhileLoop
{
    public static void main(String args[])
    {
        int x = 21;
        do
        {
            //The line while be printer even
            //if the condition is false
            System.out.println("Value of x:" + x);
            x++;
        }
        while (x < 23);
    }
}*/

//output:
/*
Value of x:21
Value of x:22

 */
public class DoWhileLoop
{
    public static void main(String args[])
    {
    	int x=1;
         do
        {
            //The line while be printer even
            //if the condition is false
        	 //int x=1;
        	 System.out.println(x++ +"");
            //System.out.println(x +"");  //(x++ means first print x and increment one.)
            //x++;
        }
        while (x<=5);   //x is declared as local variable under do. 
    }
}

