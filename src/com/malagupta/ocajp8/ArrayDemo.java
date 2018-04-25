package com.malagupta.ocajp8;

public class ArrayDemo {
	public static void main(String[] args) 
	{
		int i;
		int intArray[];      //array declaration
	intArray=new int[2];     //array allocation
	System.out.println(intArray.length);
	for(i=0;i<intArray.length;i++)
	{
		intArray[i]=i+5;
		System.out.print(intArray[i]+ " ");  //array initialization
	}
	

}
}
