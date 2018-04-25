package com.whizlabs.test.section;




/*public class SectionTest4 {
	public static void main(String[] args) {
		int i=2;
		char array[]=new char[i];
		
		array[0]=65;
		array[1]=66;
		array[2]=67;    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
		
		System.out.println(array[0]);  //A
		System.out.println(array[1]);   //B
		System.out.println(array[2]);   //java.lang.ArrayIndexOutOfBoundsException: 2
		
	}

}*/



/*public class SectionTest4 {
	public static void main(String[] args) {
		
		int array[][]=new int[2][];
		
		array[0]=new int[3];
		array[1]=new int[2];
		array[2]=new int[1];
		
		System.out.println(array.length);  //2
		System.out.println(array[0].length);  //3
		System.out.println(array[1].length);  //2
		//System.out.println(array[2].length);     //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2  
		
		System.out.println(array.length+array[1].length);   //4
		
	}

}*/


/*public class SectionTest4 {
	public static void main(String[] args) {
		
		int array[]={1,2,3};
		array=new int[6];         //new array initialization
	
		System.out.println(array[0]);   //0  because of new array initialization , its taking default value of integer array
		System.out.println(array[1]);   //0
		System.out.println(array[2]);    //0
		System.out.println(array[3]);   //0
		System.out.println(array[4]);   //0
		System.out.println(array[5]);    //0
		System.out.println(array[6]);     //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
		
	}

}*/