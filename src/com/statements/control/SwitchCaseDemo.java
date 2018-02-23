/*
 * switch-case The switch statement is a multiway branch statement. 
It provides an easy way to dispatch execution to different parts of code based on the value of the expression.
Syntax:

switch (expression)
{
  case value1:
    statement1;
    break;
  case value2:
    statement2;
    break;
  .
  .
  case valueN:
    statementN;
    break;
  default:
    statementDefault;
}

    Expression can be of type byte, short, int char or an enumeration. Beginning with JDK7, expression can also be of type String.
    Dulplicate case values are not allowed.
    The default statement is optional.
    The break statement is used inside the switch to terminate a statement sequence.
    The break statement is optional. If omitted, execution will continue on into the next case.

 */

// Java program to illustrate switch-case

package com.statements.control;

/*public class SwitchCaseDemo 
	{
	    public static void main(String args[])
	    {
	        int i = 9;
	        switch (i)
	        {
	        case 0:
	            System.out.println("i is zero.");
	            break;
	        case 1:
	            System.out.println("i is one.");
	            break;
	        case 2:
	            System.out.println("i is two.");
	            break;
	        default:
	            System.out.println("i is greater than 2.");
	        }
	    }
	}*/

//output: i is greater than 2.

/*public class SwitchCaseDemo 
{
    public static void main(String args[])
    {
        int i = 9;
        switch (i)
        {
        case 0:
            System.out.println("i is zero.");
            break;
        case 1:
            System.out.println("i is one.");
            break;
        case 2:
            System.out.println("i is two.");
            break;
        case 9:
        	System.out.println("Switch-case block executed");
        	                                                       // without break statement, print default also.
        default:
            System.out.println("i is greater than 2.");
        }
    }
}*/

//output:
/*
* Switch-case block executed
* i is greater than 2
*/

public class SwitchCaseDemo 
{
    public static void main(String args[])
    {
        int i = 9;
        switch (i)
        {
        case 0:
            System.out.println("i is zero.");
            break;
        case 1:
            System.out.println("i is one.");
            break;
        case 2:
            System.out.println("i is two.");
            break;
        
        default:
            System.out.println("i is greater than 2.");
        case 9:
        	System.out.println("Switch-case block executed");
        	                                                       // without break statement, print default also.
        }
    }
}
//output:
/*
* Switch-case block executed

*/

/*public class SwitchCaseDemo 
	{
	    public static void main(String args[])
	    {
	        int i = 9;
	        switch (i)
	        {
	        case 0:
	            System.out.println("i is zero.");
	            break;
	        case 1:
	            System.out.println("i is one.");
	            break;
	        case 2:
	            System.out.println("i is two.");
	            break;
	        case 9:
	        	System.out.println("Switch-case block executed because of break statement, default will be skipped if case matched with expression");
	        	break;
	        default:
	            System.out.println("i is greater than 2.");
	        }
	    }
	}*/

//output: Switch-case block executed because of break statement, default will be skipped if case matched with expression

/*public class SwitchCaseDemo 
{
    public static void main(String args[])
    {
        final int x;
        x= 0;
        final int y=2;
        switch (x)
        {
        case x:   // case expressions must be constant type.
        { System.out.println("A");}
           
        case 1:
            System.out.println("B");
        default:
            System.out.println("default");
            break;
        case y:
            System.out.println("C");
           
        
        }
    }
    */
    /*
     * public class SwitchCaseDemo 
{
    public static void main(String args[])
    {
        final int x= 0;
        final int y=2;
        switch (x)
        {
        case x:   // case expression must be constant type.
        { System.out.print("A");}
           
        case 1:
            System.out.print("B");
        default:
            System.out.println("default");
            break;
        case y:
            System.out.println("C");
           
        
        }
    }
}
     */
    //output: ABdefault