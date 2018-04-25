package com.whizlabs.practice5;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/*public class Whiz {

	public static void main(String[] args) {

		final int[] ints = new int[3];
		int len = ints.length;
		System.out.println(len);
		ints[1]++;
		for (int i : ints) {
			System.out.print(i);
		}
	}
}
*/


/*public class Whiz {
	static Integer i;

	public static void main(String[] args) {

		print();
	}

	public static void print() {
		try {
			System.out.println(i++);
		} catch (IOException ie) {
			System.out.println("Error");
		}
	}
}*/


/*public class Whiz {
	int x = 5;
	int y = 5;

	public static void main(String[] args) {

		new Whiz().print(2);
	}

	public void print(int x) {

		System.out.println(x + y); // 2+5=7
		int y = 4;
	}
}*/

/*import static java.lang.Integer.*;
public class Whiz {
		public static void main(String[] args) {
		
		System.out.println(MIN_VALUE);
	}
}*/


/*public class Whiz {

	public static void main(String[] args) {
          int y=10;
          System.out.println("\nHello,\nWorld");
		try {
			int x=0;
			int z=y/x;
			System.out.println(z);
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic");
		}
		catch (NumberFormatException nfe) {
			System.out.println("Hello,\nWorld");
		}
	}
}*/


/*public class Whiz {

	public static void main(String[] args) {
		int y = 0;
		while (y-- < 10) {
			System.out.println("infinity");
			continue;
		}

		System.out.println("Error");
	}
}
*/



/*public class Whiz {

	public static void main(String[] args) {
		int a=0;
for(;;System.out.println(a))
{
	
}
		for(int j=0;int k=5;j<k;k--)
		{
			
		}
	}
}*/


/*public class Whiz {

	public static void main(String[] args) {
		int a = 1;

		while (a <= 3) {
			if (a++ == 2)
				continue;
			System.out.println(a + " ");
		}
	}
}*/


/*public class Whiz {

	public static void main(String[] args) {
		String[] str={"A","B","C"};

		for(String i:str)
		{
			continue;
			System.out.println(i);    //unreachable code
		}
	}
}*/


/*public class Whiz {

	public static void main(String[] args) {
		for(int i=0;i<3;i++)

		switch(i)
		{
		case 0: break;
		case 1: System.out.print("1");
		case 2: System.out.print("2");
		case 3: System.out.print("3");
		}
	}
}
*/


/*public class Whiz {

	public static void main(String[] args) {
		float f=12.0f;
		long l=12;
		System.out.println(f==l); //true
	}
}

*/


/*public class Whiz {

	public static void main(String[] args) {
		int i = 8;
		int x = new Whiz().change(i);
		System.out.println(x + i);
	}

	int change(int i) {
		i = 2;
		return i;
	}
}*/


/*public class Whiz {

	public static void main(String[] args) {
		String s="Whizlab";
	String s1=s.substring(1,4);
	System.out.println(s1.charAt(3));
	}
}
*/



/*public class Whiz {
	
	public void test(int i)
	{
		System.out.println(i);
	}
	
	public void test(float f)
	{
		System.out.println(f);
	}
	
	public static void main(String[] args) {

	Whiz obj=new Whiz();
	obj.test(1.0);
	}
}*/



/*public class Whiz {

	public static void main(String[] args) {
		
	StringBuilder sb=new StringBuilder("Whiz");
	sb.append(new char[]{'l','a','b'},0,2);
	System.out.println(sb);
	}
}*/


/*public class Whiz {

	public static void main(String[] args) {
		
	StringBuilder sb=new StringBuilder("Whiz");
	sb.delete(2,5);
	System.out.println(sb);
	}
}*/


/*public class Whiz {

	public static void main(String[] args) {
		
	LocalTime lt=LocalTime.of(22,10);
	lt=lt.truncatedTo(ChronoUnit.HALF_DAYS);
	System.out.println(lt);
	}
}
*/



public class Whiz {

	public static void main(String[] args) {
		
	LocalDate date=LocalDate.ofYearDay(2016,22);
	
	System.out.println(date.getMonthValue());
	}
}



