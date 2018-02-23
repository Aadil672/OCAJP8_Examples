package com.whizlabs.practice;

/*public class Whiz {
	public static void main (String[] args) {
		System.out.print("Main");
		
	}
	{System.out.println("Whiz");};
	static{System.out.print("Static");};
}
*/
//output: StaticMain


/*public class Whiz {
	public static void main (String[] args) {
		int x=2;
		//for(int x=0;x<3;x++) // compile error : duplicate local variable
	for(x=0;x<3;x++)	
		{
		System.out.print(x);
		}
}
}*/
//output:012


/*public class Whiz {
	
	static int x=10;
	public static void main (String[] args) {
		int x=2;
		//for(int x=0;x<3;x++) // compile error : duplicate local variable
	for(x=1;x<3;x++)	
		{
		System.out.print(x);
		}
	System.out.println(x);
}
}*/
//output:123


/*import static java.lang.System.*;
public class Whiz {
	
	static int x=10;
	public static void main (String[] args) {
		out.print(x);
}
}
*/
//output:10



/*public class Whiz 
{
	public static void main(String[] args) 
	{
		int x,y;
		for(x=9; x>0; x--)
		{
		   for(y=8; x>=y; y++)
		   {
		    System.out.print(x+y);
		   }
        }
	}
}*/


public class Whiz 
{
	public static void main(String[] args) 
	{
		A ab=new B();
		System.out.println(ab.x);  //10
		System.out.println(ab.j);  //21
		System.out.println(B.j);  //21
		//System.out.println(A.x);  // can not make a static reference to non-static fields A.x
		System.out.println(A.j);  //10
	}
}
	class A{
		protected int x=10;
		static int j=21;
	}
	class B extends A{}


