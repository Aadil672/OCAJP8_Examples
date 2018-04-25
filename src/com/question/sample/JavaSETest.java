package com.question.sample;

import java.util.ArrayList;
import java.util.List;

/*import java.util.ArrayList;
	import java.util.List;
	
	public class JavaSETest {
	public static void main(String[] args)
	{
	List<Integer> elements = new ArrayList<>();
	elements.add(10);
	//System.out.println(elements);     //[10]
	int firstElmnt = elements.get(0);   //10
	//int firstElmnt = elements.get(1);  //Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 1, Size: 1  at com.question.samle.JavaSETest.main(JavaSETest.java:12)
	System.out.println(firstElmnt);
	}
	}*/

/*public class JavaSETest {
	public static void main(String[] args)
	{ 
		//int cardVal=14;
		int cardVal=18;
	
		switch (cardVal) {
		case 4: case 5: case 6:
		case 7: case 8:
		System.out.println("Hit");
		break;
		case 9: case 10: case 11:
		System.out.println("Double");
		break;
		case 15: case 16:
		System.out.println("Surrender");
		break;
		default:
		System.out.println("Stand");
		}
	}
}*/

/*abstract class Writer {
	public static void write() {
		System.out.println("Writing...");
	}
}

class Author extends Writer {
	public static void write() {
		System.out.println("Writing book");
	}
}

public class Programmer extends Writer {
	public static void write() {
		System.out.println("Writing code");
	}

	public static void main(String[] args) {
		Writer w = new Programmer();
		w.write();
	}
}
*/
/*
 * public class JavaSETest { public static void main(String[] args) {
 * List<String> items = new ArrayList<>(); items.add("Pen");
 * items.add("Pencil"); items.add("Box"); for (String i : items) { //if
 * (i.indexOf("P") != 0) { //continue; //} else { System.out.print(i+" "); } } }
 * //}
 */
class SomeException extends Exception{}
class SomeException1 extends Exception{}


public class JavaSETest {
	
	
	
	 static void doSomething() throws SomeException1 {
		System.out.println("Doing something");
		
		try {
			throw new SomeException();
		} catch (SomeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			throw new SomeException1();
		}
		
	}

	public static void main(String[] args)  {
		int x = 10;
		
		int y = 2;
		try {
			for (int z = 2; z >= 0; z--) {
				int ans = x / z;
				System.out.print(ans + " ");
			}
		} catch (Exception e1) {
			System.out.println("E1");

		} // catch (ArithmeticException e1) {
		System.out.println("E2");
		
		try {
			doSomething();
		} catch (SomeException1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}

/*
 * public class JavaSETest{
 * 
 * public static void main(String[] argd) {
 * 
 * 
 * 
 * StringBuilder s1 = new StringBuilder("Java"); String s2 = "Love";
 * s1.append(s2); s1.substring(4); int foundAt = s1.indexOf(s2);
 * System.out.println(foundAt);
 * 
 * } }
 */
