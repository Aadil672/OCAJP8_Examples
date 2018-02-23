package com.statements.control;

	// Java program to illustrate If statement
	/*class IfDemo
	{
	    public static void main(String args[])
	    {
	        int i = 10;
	 
	        //if (i > 15)
	        if (i<15)
	            System.out.println("10 is less than 15");
	 
	        // This statement will be executed
	        // as if considers one statement by default
	        System.out.println("I am Not in if 1st statement");
	        System.out.println("I am Not in if 2nd statement");
	    }
	}*/
	
	//output: if(i>15)- False
	/*I am Not in if 1st statement
	I am Not in if 2nd statement
	*/
	
	//output: if(i<15)- True
	/*10 is less than 15
	I am Not in if 1st statement
	I am Not in if 2nd statement
*/
	
	
	
class IfDemo{
	
	public static void main(String[] args) {
		int a=10,b=1,c=0;      //Type mismatch: can not convert int to boolean.
		
		//if(a==0) //always must be boolean expression
		if(a>10)
			System.out.println("true statement will print");
		    System.out.println("a will not print if condition is false");
		
	}
}

//output:
/*true statement will print
a will not print if condition is false*/

	/*class IfDemo{
		
		public static void main(String[] args) {
			boolean b=true;     
			
			//if(a==0) //always must be boolean expression
			if(b)
				System.out.println("true statement will print");
			    System.out.println("b will not print if condition is false");
			    System.out.println("b will not print if condition is false");
		}
	}*/
	
	//output:
	/*true statement will print
	b will not print if condition is false
	b will not print if condition is false*/

	
	