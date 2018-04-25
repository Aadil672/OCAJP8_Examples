package com.exception.java;

/*public class JavaException {
		   public static void main(String args[]){
		      int d = 0;
		      int n = 20;
		      int fraction = n/d;              //
		      System.out.println(fraction);      // code at line 8 and 9 will never execute due to exception at line 7
		     System.out.println("End Of Main");
		   }
		}*/
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at com.exception.java.JavaException.main(JavaException.java:7)


/*public class JavaException {
	   public static void main(String args[]){
		   try{
			   int d = 0;
			      int n = 20;
			      int fraction = n/d;
			      System.out.println(fraction);
			   }
		   catch (ArithmeticException ae){
			   System.out.println("In the catch block due to Exception:"+ae);
		   }
	     System.out.println("End Of Main");
	   }
	}*/

//In the catch block due to Exception:java.lang.ArithmeticException: / by zero
//End Of Main


/*class JavaException {
	 public static void main(String args[]) {
	  int d = 0;
	  int n = 20;
	  try {
	   int fraction = n / d;
	   System.out.println("This line will not be Executed");
	  } catch (ArithmeticException e) {
	   System.out.println("In the catch Block due to Exception = " + e);
	  }
	  System.out.println("End Of Main");
	 }
	}*/


/*class JavaException {
	 public static void main(String args[]) {
	  try {
	   int d = 1;
		 //int d=0;
	   int n = 20;
	   int fraction = n / d;
	   System.out.println("Value of fraction:"+fraction);
	   int g[] = {1};
	   g[20] = 100;
	   	  }
	  catch(Exception e){
	  	System.out.println("In the catch clock due to Exception AND This is because Exception is the base class of ArithmeticException Exception."
	  			+"Any Exception that is raised by ArithmeticException and other like ArrayIndexOutOfBoundsException can be handled by Exception class as well."+e);
	  }
	  //catch (ArithmeticException ae) {
	   //System.out.println("In the catch clock due to Exception = " + ae);
	  //} catch (ArrayIndexOutOfBoundsException aie) {
	   //System.out.println("In the catch clock due to Exception = " + aie);
	  //}
	  System.out.println("End Of Main");
	 }
	}*/





/*class JavaException {
	public static void main(String args[]) {
		try {
			int d = 0;
			// int d=1;
			int n = 20;
			int fraction = n / d;
			System.out.println("Value of fraction:" + fraction);
		} catch (ArithmeticException e) {
			System.out.println("In the catch clock due to Exception = " + e);
		} finally {
			System.out.println(
					"Inside the finally block,The finally block is executed irrespective of an exception being raised in the try block. It is optional to use with a try block. "
							+ "In case, an exception is raised in the try block, finally block is executed after the catch block is executed.");
		}
		System.out.println("End of main method");
	}
}*/

//output:
/*
 * In the catch clock due to Exception = java.lang.ArithmeticException: / by zero
Inside the finally block,The finally block is executed irrespective of an exception being raised in the try block. It is optional to use with a try block. In case, an exception is raised in the try block, finally block is executed after the catch block is executed.
End of main method

 */

/*class JavaException{
	public static void main(String[] args) {
		try{
			throw new MyException();  // throw keyword is used to create a new exception and throw it.
		}
		catch(MyException me)
		{
			System.out.println(me);
			System.out.println("Exception Handled");
		}
	}
}
class MyException extends Exception
{
	MyException()
	{
		System.out.println("Custom Exception created");
	  }
	}


//output:

//Custom Exception created
//com.exception.java.MyException
//Exception Handled
*/

 


/*class JavaException{
	   public static void main(String args[]){
	  try{
	       throw new MyException(2);
	      // The keyword “throw” is used to create a new Exception and throw it to the catch block.
	  }
	 catch(MyException e){
	    System.out.println(e) ;
	 }
	}
	}
	class MyException extends Exception{
	   int a;
	   MyException(int b) {
	     a=b;
	   }
	   public String toString(){
	     return ("Exception Number =  "+a) ;
	  }
	}*/
	

//output:  Exception Number=2
	
	
	
//Java throws demo...
//throws keyword is used to declare that a method may throw one or some exceptions. The caller must catch the exceptions. 
	/*import java.io.*;
	class JavaException{
	  public static void main(String[] args) {
	     try{
	           FileWriter file = new FileWriter("C://Java IO file/IO File.txt");
	           file.write("Java throws keyword demo");
	           file.close();
	    }
	    catch(IOException io){
	    	System.out.println(io);
	    }
	  }
	}	*/



//So java provides an option, wherein whenever you are using a risky piece of code in the method definition you declare it throws an exception without implementing try catch.
//java throw Exception Syntax

//method (Arguments) throws Exception1,Exception2,Exception,… {}


import java.io.*;

class JavaException {
	public static void main(String[] args) throws IOException{
      FileWriter file = new FileWriter("c://Java IO file/IO file using throws keyword at method.txt");
      file.write("So java provides an option, wherein whenever you are using a risky piece of code in the method definition you declare it throws an exception without implementing try catch.");
      //file.read("c://Java IO file/IO file using throws keyword at method.txt"");
      file.close();
    }
}


	
	
	


