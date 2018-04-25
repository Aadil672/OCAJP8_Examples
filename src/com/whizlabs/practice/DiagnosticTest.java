package com.whizlabs.practice;

import java.util.Arrays;

/*public class DiagnosticTest {
	public static void main(String[] args) {
		char[] chars= {'A','B','1','2','@'};
		
		System.out.println();
		System.out.println(chars.length-1);
		System.out.println(chars[4]);
		System.out.println(chars[chars.length-1]);
		System.out.println("Element at index 4:"+chars[4]);
		
	}

}
*/
/*output = 4
@
//Element at index 0:@
//@
*/


/*public class Array1 {
	public static void main(String[] args) {
		int[] a={1,2,053,4};
		int b[][]= {{1,2,4},{2,2,1},{0,43,2}};
		System.out.print(a[3]==b[0][2]);
		System.out.print(" "+(a[2]==b[2][1]));
		System.out.println(" "+b[2][1]);
	}
}
*/
// output= true true

/*public class DiagnosticTest {
	public static void main(String[] args) 
	{
		//char[] chars= {'A','B','1','2','@'};
		
		String[] str= {"A","B","C","D","S"};
		//Arrays.sort(strings);
		System.out.println(str);   // [Ljava.lang.String;@15db9742
		//System.out.println(chars);
		
		//for(String[] str: strings)
		{
			for(String s:str){
				System.out.print(s+" ");   //A B C D S 
			}
		}
	}
}
*/


/*public class DiagnosticTest {
	public static void main(String[] args) 
	{
		int[] ints=new int[0b101];
		int len=ints.length;
		System.out.println(len);   //5
		for(int i:ints)
			System.out.print(i);  //00000
				
	}
}*/




/*public class DiagnosticTest {
	public static void main(String[] args) {
		String[][] strings = { { "A", "Z" }, { "C", "D", "S" }, { "L" } };
		// Array.sort(strings); //can not sort 2 dimentional array.
		for (String[] str : strings) {
			for (String s : str) {
				System.out.print(s); // AZCDSL

			}
		}
	}
}
*/


/*public class DiagnosticTest {
	public static void main(String[] args) {
		Object obj=new Float(3);
		Number num=(Number)obj;
		System.out.println(num);
	}
}*/



/*public class DiagnosticTest {
	public static void main(String[] args) {
		
		System.out.println("Main");  //main
	}
	{System.out.println("Extra");};
	static {System.out.println("static");};   //static
}		*/
		

/*public class DiagnosticTest {
	public static void main(String[] args) {
		int x=2;
		for(x=0;x<3;x++)
		{
			System.out.print(x);
		}
	}
}*/
	



/*public class DiagnosticTest {

	static int x = 10;

	public static void main(String[] args) {

		for (x = 1; x < 3; x++) {
			System.out.println(x);
		}
		System.out.print(x);
	}
}*/
	



/*import static java.lang.System.*;

public class DiagnosticTest {

	static int x = 10;

	public static void main(String[] args) {
		out.print(x);
	}

}*/
		


/*public class DiagnosticTest {
	
	static int x=10;
	public static void main(String[] args) {
		//for(;;);
		//for(int x=10,y=6;x-->y;);
		//for(int x=10,y=6;x>y;x--);
		for(int x=10,y=6;x>y;System.out.println(x--));   // all for loop is valid
	}
}

*/


/*public class DiagnosticTest {

	static int x = 1;

	public static void main(String[] args) {
		int[] num = { 0, 1, 2, 3, 4 };

		for (int x : num) {
			System.out.print(x);
			continue;

			// System.out.println(x+Whiz.x);
		}
	}

}*/
		



/*public class DiagnosticTest {

	public static void main(String[] args) {
		int x = 20;
		while (x > 0) {
			do {
				x -= 2;
			} while (x > 5);
			x--;
			System.out.println(x);
		}
	}

}*/



/*public class DiagnosticTest {

	public static void main(String[] args) {
		
			do {
				int i=1;
				System.out.println(i++ +"");
			} while (i<=5);
		}
	}
*/



/*public class DiagnosticTest {

	public static void main(String[] args) {
		int x = 20;
		if (x > 20)
			;
		{
			System.out.println(">");
		}
		// else if(x<20);
		{
			System.out.println("<");
		}

	}
}*/



/*public class DiagnosticTest {

	public static void main(String[] args) {
		final int x = 0;
		final int y = 2;

		switch (x + y) {
		case x:
			System.out.println("A");
		case 1:
			System.out.println("B");
		default:
			System.out.println(">");
			break;
		case y:
			System.out.println("C");     //C
		}
	}
}*/


/*public class DiagnosticTest {

	public static void main(String[] args) {
		final int x;
		x=0;
		final int y = 2;

		switch (x) {
		case x:                        //case expressions must be constant expressions
			System.out.println("A");
		case 1:
			System.out.println("B");
		default:
			System.out.println(">");
			break;
		case y:
			System.out.println("C");
		}
	}
}*/


/*public class DiagnosticTest {

	public static void main(String[] args) {
		int _6=6;
		if(_6>6)  //always false
		
			System.out.println(">6");
			System.out.println("or");   //compilation error because of extra print() between if and else
		
			else
			{
			System.out.println("<6");
		}
	}
}*/

/*class AB
{
	static void method()
	{
		System.out.println("AB");   //AB because static method
	}
}

class CD extends AB
{
	protected static void method()
	{
		System.out.println("CD");
	}
}

public class DiagnosticTest {

	public static void main(String[] args) {
		
		
		AB a=new CD();
		a.method();
	}
}
*/




/*class AB
{
	 void method()
	{
		System.out.println("AB");
	}
}

class CD extends AB
{
	protected  void method()
	{
		System.out.println("CD");    //CD
	}
}

public class DiagnosticTest {

	public static void main(String[] args) {
		
		
		AB a=new CD();
		a.method();
	}
}
*/




/*class Animal
{
	 void run()
	{
		System.out.println("Animal run");
	}
}

class Dog extends Animal
{
	
	void sound()
	{
		System.out.println("Barks");
	}
	 void run()
	{
		System.out.println("Dog run");
	}
	 
	 
}

public class DiagnosticTest {

	public static void main(String[] args) {
		
		
		Animal a=new Dog();
		//a.sound();    //compile error
		a.run();    //dog run
	}
}*/




/*public class DiagnosticTest {

	public static void main(String[] args) {

		Double d1 = 0.0 / 0.0;

		System.out.println(Double.isNaN(d1));
		System.out.println(d1.isInfinite());
	}
}
*/



/*public class DiagnosticTest {

	public static void main(String[] args) {

		Character ch=new Character('a');  //it should not take String, otherwise classCastException
		System.out.println(Character.isLetterOrDigit(ch));  //true
	}
}
*/

/*public class DiagnosticTest {

	public static void main(String[] args) {

		String[] x = { "A", "B", "C", "D", "E" };

		nxt(x);

		for (String s : x) {
			System.out.print(s + " ");
		}
	}

	static void nxt(Object o) {
		String[] y = (String[]) o;
		for (int i = 5, j = 0; i > 0; --i, j++)
			y[j] = Integer.toString(i);
	}

}*/


/*public class DiagnosticTest {

	public static void main(String[] args) {

		char[] chars = {'1','Z','0', '-', '8','1' };

		StringBuilder sb=new StringBuilder();
		System.out.println(chars[chars.length-1]);   //1
		sb.append(chars,0,chars.length-1);
		System.out.println(sb);    //1Z0-8
		
		sb.append('0');
		sb.append("8");
		
		System.out.println(sb);    //1Z0-808
	}

}*/


/*public class DiagnosticTest {

	public static void main(String[] args) {

		char[] chars = {'1','Z','0', '-', '8','1' };

		StringBuilder sb=new StringBuilder();
		System.out.println(chars[chars.length-1]);   //1
		sb.append(chars,1,chars.length-1);
		System.out.println(sb);    //1Z0-81
		
		sb.append('0');
		sb.append("8");
		
		System.out.println(sb);   //1Z0-8108
	}

}*/


/*public class DiagnosticTest {

	public static void main(String[] args) {

		char[] chars = {'1','Z','0', '-', '8','1' };

		StringBuilder sb=new StringBuilder();
		sb.append(chars,0,chars.length-1);
		System.out.println(sb);    //1Z0-8
		
		sb.append("08");
		System.out.println(sb);
		
		sb.setLength(4);  //we have set the length of 4 till -(1Z0-) and we are trying to put at position 5 so StringOutOfBoundsException.
		sb.insert(5,"10"); //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 5
		
		System.out.println(sb);
	}

}*/




/*public class DiagnosticTest {

	public static void main(String[] args) {
		Comparable s1 = "Abc";
		Comparable s2 = new String("Abc");
		System.out.println(s1.equals(s2));    //true

	}
}
*/

