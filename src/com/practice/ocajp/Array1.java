package com.practice.ocajp;

import java.util.Arrays;

/*public class Array1 {
	public static void main(String[] args) {
		char[] chars= {'A','B','1','2','@'};
		
		System.out.println();
		System.out.println(chars.length-1);
		System.out.println(chars[4]);
		System.out.println(chars[chars.length-1]);
		System.out.println("Element at index 4:"+chars[4]);
		
	}

}*/

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

/*public class Array1 {
	public static void main(String[] args) 
	{
		//char[] chars= {'A','B','1','2','@'};
		
		String[] strings= {"A","B","C","D","S"};
		Arrays.sort(strings);
		for(String[] str: strings)
		{
			for(String s:str){
				System.out.println(s);
			}
		}
	}
}*/


/*public class Array1 {
	public static void main(String[] args) 
	{
		int[] ints=new int[0b101];
		int len=ints.length;
		System.out.println(len);   //5
		for(int i:ints)
			System.out.print(i);  //00000
				
	}
}*/




public class Array1 {
	public static void main(String[] args) 
	{
		int[] ints=new int[0b101];
		int len=ints.length;
		System.out.println(len);   //5
		for(int i:ints)
			System.out.print(i);  //00000
				
	}
}