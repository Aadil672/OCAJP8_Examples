package com.general.examples;

class Test1
{

 public static void main(String[] args)
 {
	 try{
	 int []a = {1,2,3,4,5,6};
		int i = a.length;
		while(i>=1)
		{	
		System.out.println(a[i]);
		i--;
		}
	 }
catch(ArrayIndexOutOfBoundsException e)
	 {	 
	System.out.println("Exception handled");
		 }
	 }
 }

	 



/*class Exer{
	public static void main(String [] args){
 String s = "Java";
 s.concat(" SE 7");
 s.replaceAll(“7”,””);
 System.out.print(s);
 }
	}*/

