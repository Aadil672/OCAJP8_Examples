package com.whizlabs.practice3;

import java.util.Arrays;

/*public class Whiz {
	public static void main(String[] args) {
		// int[] one[]=new int[][];
		// int[] one=new int[6];

		int a[][] = { { 1, 2, 3 }, { 5, 2, 1 }, { 0, 43, 2 } };
		int b[] = a[2];
		System.out.println(b[1]);   //43

	}
}*/


/*public class Whiz {
	public static void main(String[] args) {
		// int[] one[]=new int[][];
		// int[] one=new int[6];

		int a[] = { 1,2,053,4 };
		int b[][] = {{1,2,4},{2,2,1},{0,43,2}};
		System.out.println(a[3]==b[0][2]);   //true
		  
      System.out.println(a[2]==b[2][1]);   //true
	}
}
*/


/*public class Whiz {
	public static void main(String[] args) {
		// int[] one[]=new int[][];
		// int[] one=new int[6];

		int a[][] = new int[3][];
		 a[1] = new int[]{1,2,3};
		 a[2]= new int[]{4,5};
		System.out.println(a[1][2]);    //3

	}
}*/


import java.util.Arrays;
/*public class Whiz {
	public static void main(String[] args){

		int ints[][] = new int[2][];
		 Arrays.sort(ints[1]);
		System.out.println(Arrays.toString(ints));   //NullPointerException

	}
}*/



/*public class Whiz {
	public static void main(String[] args){
         int size=0xB;
		long ints[]= new long[size];
		int size=0xB;
		long ints[]= new long[size];     //array size shuld always be integer
		
		ints[5]=10;
		
		 
		System.out.println(ints[5]+10);

	}
}*/



/*public class Whiz {
	public static void main(String[] args){

		int ints[] = {3,6,1,4,0};
		 Arrays.sort(ints,0,4);
		 for(int i:ints)
		System.out.print(i);   //13460

	}
}*/



/*public class Whiz {
	int a=10;    //instance variable
	public static void main(String[] args){

		new Whiz().print();    //instance way of calling instance method
		
	}
	public void print()
	{
		int a=8;    //local variable
		System.out.println(a);     //8

	}
}*/




/*public class Whiz {
	int a=10;
	public static void main(String[] args){

		print();   //static way of calling static method
		
	}
	public static void print()
	{
		int a=8;    
		System.out.println(a);  //8

	}
}

*/


/*abstract interface Movable
{
	int x =10;
	//private int x=10;   //only public static and final is allowed in interface
	final short s=10;
	//final static float c=6.0;
	//final static float c=6.0f;
	//abstract int i=5;
	void run();
}*/



/*import java.util.*;
public class Whiz
{
	public static void main(String[] args) {
		System.out.println(new Date());   //Sat Mar 24 18:03:01 IST 2018
		
	}
}
*/


/*import static java.lang.Math.pow;
public class Whiz
{
	public static void main(String[] args) {
		System.out.println(pow(5,5));
		
	}
}*/



/*public class Whiz
{
	public static void main(String[] args) {
		int n=808;
		System.out.format("%d",n);  //808
		System.out.println("");
		System.out.format("%03d",n);  //808
		System.out.println("");
		System.out.format("%04d",n);   //0808
		System.out.println("");
		System.out.format("%06d",n);   //000808
		
	}
	
}*/




/*public class Whiz
{
	static int i;
	int j;
	Whiz()
	{
	 j=i++;
	}
	public static void main(String[] args) {
		Whiz s=new Whiz();
		Whiz s1=new Whiz();
		Whiz s2=new Whiz();
		System.out.println("i="+s.i);
		System.out.println("j="+s.j);
	}
	
}*/



/*public class Whiz
{
	final int i;
	//Whiz(){i=10;}
	public static void main(String[] args) {
		Whiz s=new Whiz();
		System.out.println("i="+s.i);
	}
	
}
*/



/*public class Whiz
{
	
	public static void main(String[] args) {
		new Whiz().iterator(new int[]{10,12,13});
	}

	 void iterator(int[] i) {
		// TODO Auto-generated method stub
		for(int x=0;x<i.length;System.out.println(i[x]+ " "))   //12 13 followed by ArrayIndexOutOfBoundsException:3
				x++;
	}
	
}*/


/*public class Whiz
{
	
	public static void main(String[] args) {
		int[] a={1,2,3,4};
		
		for(int j:a)
		{
			System.out.print(j);
			if(j==2)continue;
		for(int x=0;x<3;System.out.print(x))   //123123123
				{x++;}
	}
	}
	
}*/


/*public class Whiz {

	public static void main(String[] args) {
		//int i=3;
		do
		{
			int i=3;
			System.out.print(i++);
		}
		while(i<=6);   //compilation error
		
	}
}
*/


/*public class Whiz {
	final int i;

	public static void main(String[] args) {
		for (int x = 0; args.length; x++) {
			System.out.println(args[1]);  //

		}

	}
}*/




/*public class Whiz {

	public static void main(String[] args) {
		for (int x = 10; x > 6; x++) {
			if (x == 16)
				x -= 11;
			System.out.println(x);
		}

	}
}
*/



/*public class Whiz
{

	public static void main(String[] args) {
		final int i=0;
		final int j;
		j=2;
		int x=(int)(Math.random()*3);
		
		switch(x)
		{
		case i:{System.out.println("A");}
		case 1:System.out.println("B"); break;
		case j:System.out.println("C");  //case expressions j must be constant
		}
	
}
}*/



/*public class Whiz
{

	public static void main(String[] args) {
		int x=0,y=10;
		if(x>0)
			System.out.println("");
		if(y>=10)
		System.out.println("Aadil");
	
}
}
*/

/*public class Whiz
{

	public static void main(String[] args) {
		int x=3,y=2;
				System.out.println(x-- + --y + ++x);  //7
	
}
}*/



/*class Animal
{
	public void eat() throws NullPointerException
	{
		System.out.println("Animals eat");
	}
}

class Dog extends Animal
{
	 void eat(String s) throws Exception
	{
		System.out.println("Dog eat"+s);
	}
}
public class Whiz
{
	public static void main(String[] args) throws Exception {
		Animal a=new Dog();
		//Dog d=(Dog)a;
		Dog d=new Dog();
		a.eat();
		d.eat("Meat");
		
	}
}*/

//Animal eat
//Dog eat meat



/*class Animal
{
	public void eat() throws NullPointerException
	{
		System.out.println("Animals eat");
	}
}

class Dog extends Animal
{
	 public void eat(String s) throws Exception
	{
		System.out.println("Dog eat"+s);
	}
	 public void eat() throws NullPointerException
		{
			System.out.println("checking");
		}
}
public class Whiz
{
	public static void main(String[] args) throws Exception {
		Animal a=new Dog();
		//Dog d=(Dog)a;
		Dog d=new Dog();
		a.eat();
		d.eat("Meat");
		
	}
}*/

//checking
//Dog eat meat

/*public class Whiz
{
	native int AccessCode;  //native can be used in method only not in variable.
	public static void main(String[] args) {
		
		if(x>0)
			System.out.println("");
		if(y>=10)
		System.out.println();
	
}
}
*/


/*public class Whiz {
	int i = 10;

	public static void main(String[] args) {
		//int i=2;
		int i;
		if (new Whiz().go(10))
	
		i = 5;
		System.out.println(i);   //local variable may not have been initialized 
	}

	boolean go(int y) {
		if (y > 5)
			return true;
		else
			return false;
	}

}*/


/*public class Whiz {
	int i = 10;

	public static void main(String[] args) {
		int i=2;
		if (new Whiz().go(10))
		{
		i = 5;
		System.out.println(i);}   //5
	}

	boolean go(int y) {
		if (y > 5)
			return true;
		else
			return false;
	}

}
*/

/*class Person
{
	String name;
	int age;
	public void read() 
	{
		System.out.println("Person is reading");
	}
	private void other(){}
}

class Livera extends Person
{
	Livera(String s, int i)
	{
		i=age;
		s=name;
	}
	public void read() 
	{
		System.out.println("Livera is reading");
	}
	private void other()throws Exception{}
}
public class Whiz
{
	public static void main(String[] args) throws Exception {
		Livera l=new Livera("Livera",22);
		Person p=l;
		l.read();
		p.read();
		
	}
}
*/
//Livera is reading
//Livera is reading



/*class Person
{
	String name;
	int age;
	public void read() 
	{
		System.out.println("Person is reading");
	}
	private void other(){}
}

class Livera extends Person
{
	Livera(String s, int i)
	{
		i=age;
		s=name;
	}
	public void read() 
	{
		System.out.println("Livera is reading");
	}
	private void other()throws Exception{}
}
public class Whiz
{
	public static void main(String[] args) throws Exception {
		Livera l=new Livera("Livera",22);
		//Person p=l;
		Person p=new Livera("Aadil",26);
		l.read();
		p.read();
		
		
	}
}
*/
//Person is reading
//Person is reading


/*class SuperClass
{
	
	public void method() 
	{
		System.out.println("SuperClass");
	}
}
class SubClass extends SuperClass
{
	
	public void method() 
	{
		System.out.println("SubClass");
	}
	
}
public class Whiz extends SubClass
{
	public static void main(String[] args)

	{
		((SuperClass)new Whiz()).method();
	}
	public void method() 
	{
		System.out.println("Whizlabs");    //Whizlabs
	}
}

*/


/*public class Whiz
{
	static int x=10;
	 static int y=x;
	
	Whiz()
	{
		y++;
	}
	public static void main(String[] args) {
		System.out.println(new Whiz().y+new Whiz().x);
		
	}
}*/


/*public class Whiz
{
	public static void main(String[] args) {
		String s=new String("Aadil");
		s=s.concat("H");
		System.out.println(s);    //AadilH
		
	}
}
*/


/*public class Whiz
{
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Aadil");
		sb.append("H");
		System.out.println(sb);     //AadilH
		
	}
}*/


/*public class Whiz
{
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("OCAJP");
		//String sb=new String("OCAJP");
		String s=new String(sb.toCharArray());   //compilation error
		s=s.concat("8");
		System.out.println(s);    //AadilH
		
	}
}*/



/*public class Whiz
{
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("aAaA");
		sb.insert(sb.lastIndexOf("A"),true);
		System.out.println(sb);     //aAatrueA
		
	}
}*/



/*public class Whiz
{
	public static void main(String[] args) {
		String str=new String("1z0-808");
		str=str.replace("80","81");
		System.out.println(str);     //1z0-818
		str=str.substring(str.indexOf("81"),str.lastIndexOf("8"));
		System.out.println(str);  //81
		
	}
}
*/




