package com.statements.control;

/*if-else-if ladder: 
 Here, a user can decide among multiple options.The if statements are executed from the top down. 
 As soon as one of the conditions controlling the if is true, the statement associated with that if is executed ONLY,and the rest of the ladder is bypassed. 
   If none of the conditions is true, then the final else statement will be executed.*/


	// Java program to illustrate if-else-if ladder
/*public class IfElseIfDemo {
	    public static void main(String args[])
	    {
	        int i = 20;
	 
	        if (i == 10)
	            System.out.println("i is 10");
	        else if (i == 15)
	            System.out.println("i is 15");
	        else if (i == 20)
	            System.out.println("i is 20");
	        else
	            System.out.println("i is not present");
	    }
	}
*/
//output:
//i is 20


/*public class IfElseIfDemo {
    public static void main(String args[])
    {
        int i = 10;
 
        if (i>10);
            System.out.println("i is 10");
        else if (i<10)
            System.out.println("i is 15");
      
    }
}
*/

public class IfElseIfDemo {
    public static void main(String args[])
    {
        int i = 10;
 
        if (i>10);  // if statement is end here.
            System.out.println("i is 10");
       // else if (i<10)
            System.out.println("i is 15");
      
    }
}
//output: 
//i is 10
//i is 15

