package com.malagupta.ocajp8;

/*public class DataType {
		public static void main(String args[]) {
			int baseDecimal = 267;
			int octVal = 0413;
			int hexVal = 0x10B;
			int binVal = 0b100001011;
			System.out.println(baseDecimal + octVal);    //534 (267+267)
			System.out.println(hexVal + binVal);         //534 (267+267)
			
			System.out.println("==========================================");
			
			//char c='Aa';  //invalid character constant. Char should of one letter.
			char c1='A';
			char c2=122;
			char c3=123;
			System.out.println(c1);   //A
			System.out.println(c2);   //z
			System.out.println(c3);   //{
			
			System.out.println("==========================================");
			
		char c4 = '\u0122';
		System.out.println("c1 = " + c1);
		System.out.println("c4 = " + c4);
		System.out.println(c4);
		
		System.out.println("==========================================");
		//As mentioned earlier, char values are unsigned integer values, so if you try to assign a negative number to one, the code won’t compile. 
		//char c5=-122;  //can not convert from int to char, -ve value not allowed in char as it is unsigned integer or positive integer.
		
		//But you can forcefully assign a negative number to a char type by casting it to char, as follows:
		
		char c5=(char)-122;
		System.out.println("c5="+c5);
		//In the previous code, note how the literal value –122 is prefixed by (char). This practice is called casting. Casting is the forceful conversion of one data type to another data type. 
		
		
		
		}
	}
*/
/*class DataType {
	public static void main(String[] args) {
		int myInt = 7;
		boolean result=true;
		//bool result = true;  //compilation error
		if (result == true)
			do
				System.out.println(myInt);
			while (myInt > 10);
	}
}*/


/*class DataType {
	public static void main(String[] args) {
		int a = 10;
		int b=20;
		
				System.out.println(a==b);    //false    == its an equality operator
				System.out.println(a!=b);    //true
				
				System.out.println(a=b);     //20, = its an assignment operator
				
				boolean c=false;
				
				System.out.println(c);      //false
				System.out.println(c=true);  //true
				System.out.println(c=false);  //false
	}
}*/


/*class DataType {
    public static void main (String args[]) {
        int a = 10;
        int b = 20;
        int c = 40;
        System.out.println(a++ > 10 || ++b < 30);     // line1   //true
        System.out.println(a > 90 && ++b < 30);                  //false
        System.out.println(!(c>20) && a==10 );                   //false
        System.out.println(a >= 99 || a <= 33 && b == 10);       //false
        System.out.println(a >= 99 && a <= 33 || b == 10);       //false
        
        System.out.println("=======================================");
        String name = "hello";
        System.out.println(name!=null);    //true
        System.out.println(name.length());     //5
        if (name != null && name.length() > 0)       //true
        	System.out.println(name.toUpperCase());   //HELLO
    }
}*/



/*class DataType{
	
		public static void main (String[] args)
		{
			int myChar = 97;
			int yourChar = 98;
			System.out.print((char)myChar + (char)yourChar);

			int age = 20;
			System.out.print(" ");
			System.out.print((float)age);
		System.out.println("without array args");
	}
}*/


/*public class DataType {                                // line 1    
	public static void main(String[] args) {       // line 2        
		char a = 'a';                              // line 3        
		char b = -10;                              // line 4        
		char c = '1';                              // line 5        
		integer d = 1000;                          // line 6        
	}
	System.out.println(++a + b++ * c - d);     // line 7    
	}                                             
	// line 8}                   

Ans - line 4 6 and 7 will give compile error

/*
 * Note:
 * Explanation: The prefix increment operator (++) used with the variable a will increment its value before it’s used in the expression ++a + b++ * c. The postfix increment operator (++) used with the variable b will increment its value after its initial value is used in the expression ++a + b++ * c.

Therefore, the expression ++a + b++ * c evaluates with the following values: 
 */


/*public class DataType {
    public static void main(String[] args) {
        int a = 10;
        long b = 20;
        short c = 30;
        System.out.println(++a + b++ * c);
    }
}
Ans - 611
*/

/*public class DataType {
    public static void main(String[] args) {
Boolean buy = new Boolean(true);
Boolean sell = new Boolean(true);

System.out.print(buy == sell);        //both has different reference variable thats why it is false, if use valueOf() method then it is true
boolean buyPrim = buy.booleanValue();
//System.out.println(buyPrim);
System.out.print(!buyPrim);

System.out.print(buy && sell);
    }
}
Ans - false false true
*
*/

public class DataType{
	public static void main(String[] args) {

	   // bit a = 0;         //bit can not be resolved to a type
	   // integer a2 = 7;    //integer can not be resolved to a type
	    long a3 = 0x10C;
	    short a4 = 0512;
	    double a5 = 10;
	    byte a7 = -0;
	    long a8 = 123456789;
	    
	    System.out.println(a3);
	    System.out.println(a4);
	    System.out.println(a5);
	    System.out.println(a7);
	    System.out.println(a8);

		
	}
}
/*Ans=
268
330
10.0
0
123456789


*/

/*public class DataType {
	public static void main(String[] args)
	{       
		int ctr = 50;       
		  //++ctr;  ctr+=1;       //print 11
		// ctr=+1;  ctr=1;               // print 1.        
		System.out.println(ctr % 20);    }
}*/


/*public class DataType{
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int c = (a * (b + 2)) - 10-4 * ((2*2) - 6);
		System.out.println(c);
		
		
	}
}

Ans=218

*/

/*public class DataType{
	public static void main(String args[]) {
boolean b = false;

//int i = 90;
System.out.println(i >= b);    //operator >= is undefined , compile time error
	}
}*/

/*public class DataType {
	// line 1
	public static void main(String[] args) {
		// line 2
		int num1 = 12; // line 3
		float num2 = 17.8f; // line 4
		boolean eJavaResult = true; // line 5
		//boolean returnVal = num1 >= 12 && num2 < 4.567 || eJavaResult == true;           // line 6  print true
		//boolean returnVal = (num1 >= 12 && num2 < 4.567) || eJavaResult == true;         //print true
		boolean returnVal = num1 >= 12 && (num2 < 4.567 || eJavaResult == false);		   //print false
		System.out.println(returnVal); // line 7  
	} // line 8}

} // line9

*/

/*public class DataType {
	
	public static void main(String[] args) {
boolean myBool = false;                               // line 1
int yourInt = 10;                                     // line 2
float hisFloat = 19.54f;                             // line 3

System.out.println(hisFloat = yourInt);               // line 4
System.out.println(yourInt > 10);                     // line 5
System.out.println(myBool = false);                   // line 6

	}
	
	}

//Ans-
10.0
false
false
*/






