package com.whizlabs.practice2;

import java.util.Arrays;

/*public class Whiz {

	public static void main(String[] args) {

		 int[] ints = new int[3];

		int len = ints.length;
		System.out.println(len);   //3
		ints[1]++;
		for (int i : ints) {
			System.out.print(i);    //010
		}

	}

}
*/

/*public class Whiz 
{
   public static void main(String[] args) {
	
	//final int[][] ints=new int[3][2];
	//ints[0]=new int[3];
	//ints[2]={1,2,3};
    int[] ints=new int[-1];
    System.out.println(ints[0]);  //Exception in thread "main" java.lang.NegativeArraySizeException
		
	}

}*/



/*public class Whiz {
	public static void main(String[] args) {

		int[][] ints = new int[2][];

		//Arrays.sort(ints[1]);                         ////Exception in thread "main" java.lang.NullPointerException
		System.out.println(Arrays.toString(ints[1]));    

	}

}
*/


/*public class Whiz {
	public static void main(String[] args) {

		int[] ints = { 2, -1, 4, 5, 3 };

		Arrays.sort(ints);
		System.out.println(Arrays.binarySearch(ints, -1)); // 0

	}

}
*/


/*public class Whiz {
	public static void main(String[] args) {

		new Whiz().meth();
	}

	public void meth() throws Exception {
		for (int x = 0; x > 5; x++)
			System.out.println(x);

	}

}*/



/*public class Whiz {
public static void main(String[] args) {
	int x=5, y=10;
	try
	{
		y/=x;
	}
	catch(Exception e)
	{
		System.out.println("error");
	}
		finally{
			System.out.println("finally");
		}
	}

}*/

/*public class Whiz {
public static void main(String[] args) {
	try
	{
		new Whiz().meth();
		
	}catch(ArithmeticException e)
	{
		
	}
}

public void meth() throws Exception
{
	for(int x=0;x>5;x++)	
System.out.println(x);

		
	}*/


/*public class Whiz 
{
   public static void main(String[] args) {
	
	//final int[][] ints=new int[3][2];
	//ints[0]=new int[3];
	//ints[2]={1,2,3};
    int[] ints=new int[-1];
    System.out.println(ints[0]);  //Exception in thread "main" java.lang.NegativeArraySizeException
		
	}

}*/


/*public class Whiz {
	public static void main(String[] args) {
		int x = 10, y = 12;
		System.out.println("Answer is:" + x + y);

		 //final // int array[]={1,2,3};       //not allowed
		// final /int array1[]={1,2,3};        //not allowed compile error
		final *//** *//* int array[] = { 1, 2, 3 };

	}

}*/


/*public class Whiz 
{
	static int x=2;
	public static void main(String[] args) {
		if(x>0)
			{
			x++;
		int x=4;
		System.out.println(x);   //4
	}
	System.out.println(x);   //3
	final int x=10;
	System.out.println(x);    //10
	}
	
}
*/


/*public class Whiz 
{
	static int x=2;
	public static void main(String[] args) {
		{int x=4;
		System.out.println(x);  //4 
	}
	System.out.println(x);   //2
	}
}*/

	

/*public class Whiz {
  
	static int x=2;
	static int z;
	public static void main(String[] args)
	{ 
		System.out.println(x);  //2
		System.out.println(z);   //3
		System.out.println(x+z);  //5
		
	}
	static{int x=3; z=x;}

}
*/


/*public class Whiz {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int i = a.length - 1;
		 System.out.println(i);   //5
		while (i >= 0) {
			if (i == 2)
				continue;
			System.out.print(a[i]);    //654 will continue
			i--;
		}

	}
}*/


/*public class Whiz {

	public static void main(String[] args) {

    int[] a={1,2,3};
    
    
    for(int j:a)
    	if(j==2)continue;
    for(int x=0;x<3;System.out.println(x);)
    	x++;
    
	}
}
*/


/*public class Whiz {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int i = a.length - 1;

		System.out.println(i); // 3
		while (true) {
			while (i >= 0) {
				System.out.print(a[i]); // 4321
				i--;
			}

		}
	}
}*/


/*public class Whiz 
{
	
	public static void main(String[] args) {
		
	int x=1; 
			int y=10;
    
    if((x*=3)==y)
    {
    	System.out.println(y);
    } else
    {
    	System.out.println(x);
    }
	}
}*/


/*public class Whiz 
{
	
	public static void main(String[] args) {
		
	  final int x=-1; 
		final int y=2;
    
    switch(x+y)
    {
    case x+1: {System.out.println();}
    case1: {System.out.println();}
    default:{System.out.println();}
    case y:{System.out.println();}
	}
	}
}*/


/*public class Whiz 
{
	
	public static void main(String[] args) {
		
	  final int[] array={1,2,3}; 
		
    
    switch(2)
    {
    case array[0]: {System.out.println();}
    case array[1]: {System.out.println();}
    default:{System.out.println();break;}
    case array[2]:{System.out.println();}
	}
	}
}

*/


/*public class Whiz 
{
	
	public static void main(String[] args) {
		
	 int whiz=0; 
		
    
    if(whiz>0)
    {
    	System.out.println("A");
	}
    System.out.println();
    else                         //compilation error
   System.out.println("B");
	}
}

*/


/*public class Whiz 
{
	
	public static void main(String[] args) {
		
	  int marks=60;
	  
	  if(marks>=40)System.out.println("C");
	  else if(marks>=60)System.out.println("B");
	  else if(marks>=75){System.out.println("A");
	  else {System.out.println("D"); }  //compilation error
	}
	}
}*/


/*public class Whiz 
{
	
	public static void main(String[] args) {
		
	  int x=1;
	  int y=2;
	  int z=3;
	  System.out.println((z/y)+z*2);   //7
	  System.out.println((z/y+z)*2);   //8
	  
	}
	
}*/



/*public class Whiz 
{
	
	public static void main(String[] args) {
		
	  Integer i=10;
	  Double d=10.0;
	
		int ii=10;
	  double dd=10.0;
	  
	  System.out.println(i.equals(d) + " "); // false
	  System.out.println(ii==dd);    //true
	  
	}
	
}
*/


/*public class Whiz 
{
	
	public static void main(String[] args) {
		
		new Whiz().iteratot(new int[]{10,12,13});
	}
		void iteratot(int[] i)
		{
	 for(int x=0;x<i.length;System.out.println(i[x]+" "))x++;
	  
	}
	
}*/

//12 
//13 
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3


/*public class Whiz 
{
	
	public static void main(String[] args) {
		
		int[] a={1,2,3,4,5,6};
		for(int i=0,j=0;i<a.length;j++)
		{i=a[j];
		//for(int i:a)
		
			System.out.print(i);
		}
	}
	
}
*/


/*public class Whiz 
{
	
	public static void main(String[] args) {
		
		String s1="Rekha";
		//String s2="Rekha";
		String s2=new String("Rekha");
		
		System.out.println(s1.equals(s2));   //true
		System.out.println(s1==s2);          //false
			  
	}
	
}
*/


/*class Animal
{
	public void eat()throws Exception{System.out.println("Animal Eat");}
}

class Dog extends Animal
{
	public void eat() {System.out.println("Dog Eat");}
}

public class Whiz
{
	public static void main(String[] args) {
		Animal a=new Dog();
		Dog d=new Dog();
		a.eat();
		d.eat();
		
		
	}
}*/


/*public class Whiz
{
	public static void main(String[] args) {
		char a='C';
		a++;
		System.out.println(a);   //D
		
	}
}*/


/*public class Whiz
{
	public static void main(String[] args) {
		Double d=0.0;
		System.out.println(d.BYTES);
		System.out.println(d.SIZE); 
		
	}
}*/


/*public class Whiz
{
	public static void main(String[] args) {
		A ab=new B();
		ab.print();  //A
		ab.print();  //A
		//ab.print("C");  //not applicable
		B ac=new B();
		ac.print("C");	  //C
	}
}
class A
{
 public void print()
 {
	 System.out.println("A");
 }
}
class B extends A
{
	public void print(String s)
	{
		System.out.println(s);
	}
}*/

/*public class Whiz
{
	//static int x=10;
	int x=10;
	public static void main(String[] args) {
		int y=12;
		//System.out.println(x+y);  //error can not access non-static variable from static reference
		//System.out.println(new Whiz().x+y);  
		int x=11;
		
	}
}*/




/*public class Whiz
{
	public static void main(String[] args) {
		char chars[]={'1','Z','0','-','8','1'};
		StringBuilder sb=new StringBuilder();
		//String sb=new String();
		sb.append(chars,0,chars.length-1);
		sb.append('0');
		sb.append("8");
		System.out.println(sb);
		
	}
}
*/





/*public class Whiz
{
	public static void main(String[] args) {
	
		StringBuilder sb=new StringBuilder("Whiz");
		sb.append("Labs");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
	}
}
*/
