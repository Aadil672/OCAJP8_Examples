package com.whizlabs.practice;

import java.time.LocalDate;

/*import java.io.*;
public class WhizFreeTest 
{
public static void main(String[] args) {
	
	try{	
	//int[] array=new int[-2];
		int whizData[]=new int[10];
	//System.out.println(array);
	System.out.println("Acc:"+whizData[11]);
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Oops.. Identified Exception::"+e);
		
	}
}
}*/


/*import java.io.*;
public class WhizFreeTest 
{
public static void main(String[] args) {
	
	try{	
	int[] array=new int[-2];
		//int whizData[]=new int[10];
	System.out.println(array);
	//System.out.println("Acc:"+whizData[11]);
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Oops.. Identified Exception::"+e);
		
	}
}
}*/


/*public class WhizFreeTest 
{
public static void main(String[] args) {
	
	int sum=0;
	for(int x=0;x<10;x++)
		sum+=x;
	System.out.print("sum for 0 to"+x);
	System.out.println("="+sum);
	
	}
}*/

/*public class WhizFreeTest {
	public static void main(String[] args) {

		try {
			Double number = Double.valueOf("120D");

		} catch (NumberFormatException ex) {
			System.out.println(ex);

		}
		System.out.println(number);
	}
}*/



/*public class WhizFreeTest 
{
public static void main(String[] args) {
	
	int[] testData={1,2,3};
	for(int i:testData)
		i++;
	
	}
}*/


/*public class WhizFreeTest {
	public static void main(String[] args) {

		String s = "A";

		switch (s) {
		case "a":
			System.out.println("simple A");
		default:
			System.out.println("default");
		case "A":
			System.out.println("Capital A");
		}
	}
}*/



/*public class WhizFreeTest {
	public static void main(String[] args) {
		Integer number = Integer.valueOf("808.1");
		System.out.println(number);     //NumberFormatException
	}
}*/



/*public class WhizFreeTest 
{
public static void main(String[] args) {
	
	StringBuilder sb=new StringBuilder("1Z0");
	//sb.concat("-808");  //the method concat(String) is undefined for the type of StringBuilder
	sb.append("-808");  //1Z0-808
	System.out.println(sb);
	}
}*/



/*import java.time.LocalDate;
import java.time.Period;
public class WhizFreeTest 
{
public static void main(String[] args) {
	
	LocalDate date=LocalDate.of(2018,2,22);
	Period p=Period.ofDays(2);
	System.out.println(date.plus(p));
	}
}
//output: 2018-02-24
 */




import java.util.ArrayList;
import java.util.List;

public class WhizFreeTest 
{
public static void main(String[] args) {
	
	List<Integer> list= new ArrayList<>();
	list.add(21);list.add(11);list.add(30);list.add(2);list.add(13);list.add(17);
	System.out.println("List created:"+list);
	
	//list.removeIf(e->e%2==0);
	//System.out.println("Odd List created:"+list);
	list.removeIf(e->e%2!=0);
	System.out.println("Even List created:"+list);
	}
}
