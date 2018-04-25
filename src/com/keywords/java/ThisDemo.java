
/*‘this’ reference in Java

‘this’ is a reference variable that refers to the current object.

Following are the ways to use ‘this’ keyword in java :

 
1. Using ‘this’ keyword to refer current class instance variables
//Java code for using 'this' keyword to
//refer current class instance variables
*/
package com.keywords.java;

/*public class ThisDemo 
{
    int a;
    int b;
     
    // Parameterized constructor
    ThisDemo(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
 
    void display()
    {
        //Displaying value of variables a and b
        //System.out.println("a="+a + "b="+b);                 //output:a=10b=20

    	System.out.println("a="+a 
		+ " "+ "b="+b);                                     //output:a=10 b=20
    }
    
 //Driver method
    public static void main(String[] args)
    {
        ThisDemo object = new ThisDemo(10, 20);
        object.display();
    }
}*/



//2. Using this() to invoke current class constructor
//Java code for using this() to 
//invoke current class constructor
/*class ThisDemo
{
 int a;
 int b;

 //Default constructor
 ThisDemo()
 {  
     this(10, 20);
     System.out.println("Inside  default constructor \n");
 }
  
 //Parameterized constructor
 ThisDemo(int a, int b)
 {
     this.a = a;
     this.b = b;
     System.out.println("a="+a + " " + "b="+b);
     System.out.println("Inside parameterized constructor");
     //System.out.println("a="+a + " " + "b="+b);
 }

 public static void main(String[] args)
 {
     ThisDemo object = new ThisDemo();
 }
}*/

//output:
//a=10 b=20
//Inside parameterized constructor
//Inside  default constructor


//3. Using ‘this’ keyword to return the current class instance
		//Java code for using 'this' keyword 
		//to return the current class instance
		class ThisDemo
		{
		    int a;
		    int b;
		 
		    //Default constructor
		    ThisDemo()
		    {
		        a = 10;
		        b = 20;
		    }
		     
		    //Method that returns current class instance
		    ThisDemo get()
		    {
		        return this;
		    }
		     
		    //Displaying value of variables a and b
		    void display()
		    {
		        System.out.println("a = " + a + "  b = " + b);
		    }
		 
		    public static void main(String[] args)
		    {
		        ThisDemo object = new ThisDemo();
		        object.get().display();
		        //object.get();
		        //object.display();
		        
		    }
		}







