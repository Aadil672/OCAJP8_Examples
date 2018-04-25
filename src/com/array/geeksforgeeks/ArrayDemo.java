package com.array.geeksforgeeks;




/*Default array values in Java
1.8

If we don’t assign values to array elements, and try to access them, compiler does not produce error as in case of simple variables. Instead it assigns values which aren’t garbage.

Below are the default assigned values.

    boolean : false
    int : 0
    double : 0.0
    String : null
    User Defined Type : null

// Java program to demonstrate default values of array
// elements
*/
/*class ArrayDemo
{
    public static void main(String[] args)
    {
        System.out.println("String array default values:");
        String str[] = new String[5];
        for (String s : str)
            System.out.print(s + " ");
 
        System.out.println("\n\nInteger array default values:");
        int num[] = new int[5];
        for (int val : num)
             System.out.print(val + " ");
 
        System.out.println("\n\nDouble array default values:");
        double dnum[] = new double[5];
        for (double val : dnum)
            System.out.print(val + " ");
 
        System.out.println("\n\nBoolean array default values:");
        boolean bnum[] = new boolean[5];
        for (boolean val : bnum)
            System.out.print(val + " ");
 
        System.out.println("\n\nReference Array default values:");
        ArrayDemo ademo[] = new ArrayDemo[5];
        for (ArrayDemo val : ademo)
            System.out.print(val + " ");
    }
}*/

/*Output:

String array default values:
null null null null null 

Integer array default values:
0 0 0 0 0 

Double array default values:
0.0 0.0 0.0 0.0 0.0 

Boolean array default values:
false false false false false 

Reference Array default values:
null null null null null 
*/

/*public class ArrayDemo {
	public static void main(String[] args) {
		
	
	int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
	 // Declaring array literal
	System.out.println("Total Array length:"+intArray.length);
	
	// accessing the elements of the specified array
	for (int i = 0; i < intArray.length; i++)
	  //System.out.println("Element at index " + i + " : "+ intArray[i]);
      System.out.print(intArray[i]+ " ");
}
}*/





//Java program to illustrate creating an array
//of integers,  puts some values in the array,
//and prints each value to standard output.

/*class ArrayDemo 
{
 public static void main (String[] args) 
 {         
   // declares an Array of integers.
   int[] arr;
      
   // allocating memory for 5 integers.
   arr = new int[5];
      
   // initialize the first elements of the array
   arr[0] = 10;
      
   // initialize the second elements of the array
   arr[1] = 20;
      
   //so on...
   arr[2] = 30;
   arr[3] = 40;
   arr[4] = 50;
      
   // accessing the elements of the specified array
   for (int i = 0; i < arr.length; i++)
      System.out.println("Element at index " + i + 
                                   " : "+ arr[i]);          
 }
}*/



/*
Arrays of Objects

An array of objects is created just like an array of primitive type data items in the following way.

 Student[] arr = new Student[7]; //student is a user-defined class

The studentArray contains seven memory spaces each of size of student class in which the address of seven Student objects can be stored.The Student objects have to be instantiated using the constructor of the Student class and their references should be assigned to the array elements in the following way.

Student arr = new Student[5];
*/

// Java program to illustrate creating an array of
// objects
 
/*class Student
{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}
 
// Elements of array are objects of a class Student.
public class ArrayDemo
{
    public static void main (String[] args)
    {
        // declares an Array of integers.
        Student[] arr;
 
        // allocating memory for 5 objects of type Student.
        arr = new Student[5];
 
        // initialize the first elements of the array
        arr[0] = new Student(1,"aman");
 
        // initialize the second elements of the array
        arr[1] = new Student(2,"vaibhav");
 
        // so on...
        arr[2] = new Student(3,"shikar");
        arr[3] = new Student(4,"dharmesh");
        arr[4] = new Student(5,"mohit");
 
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i + " : " +
                        arr[i].roll_no +" "+ arr[i].name);
    }
}*/



/*What happens if we try to access element outside the array size?

Compiler throws ArrayIndexOutOfBoundsException to indicate that array has been accessed with an illegal index. The index is either negative or greater than or equal to size of array.
*/
/*class ArrayDemo
{
    public static void main (String[] args)
    {
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
 
        for (int i = 0; i <= arr.length; i++)
            System.out.println(arr[i]);
    }
}*/

/*Runtime error

10
20
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
	at com.array.geeksforgeeks.ArrayDemo.main(ArrayDemo.java:126)
*/


/*Multidimensional Arrays

Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other array. These are also known as Jagged Arrays. A multidimensional array is created by appending one set of square brackets ([]) per dimension. Examples:

int[][] intArray = new int[10][20]; //a 2D array or matrix
int[][][] intArray = new int[10][20][10]; //a 3D array
*/
/*class ArrayDemo
{
    public static void main(String args[])
    {
        // declaring and initializing 2D array
       // int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };
        // printing 2D array
        //for (int i=0; i< 3 ; i++)
        //{
           // for (int j=0; j < 3 ; j++)
             //System.out.print(arr[i][j] + " ");
 
           // System.out.println();
    	
    	String[] arr= {{"A","B","C"},{"D","E"}};
    	for (int i=0; i<arr.length ; i++)
        {
            for (int j=0; j <arr.length ; j++)
             System.out.print(arr[i][j] + " ");
            if(arr[i][j].equals("B"))
            	break;
        }
    	continue;
    }
}
*/


/*Passing Arrays to Methods

Like variables, we can also pass arrays to methods.For example, below program pass array to method sum for calculating sum of array's values.
// Java program to demonstrate 
// passing of array to method
 */
/*class ArrayDemo
{   
    // Driver method
    public static void main(String args[]) 
    {
        int arr[] = {3, 1, 2, 5, 4};
         
        // passing array to method 
        sum(arr);
     
    }
 
    public static void sum(int[] arr) 
    {
        // getting sum of array values
        int sum = 0;
         
        for (int i = 0; i < arr.length; i++)
            sum+=arr[i];
         
        System.out.println("sum of array values : " + sum);
    }
}
*/



/*Returning Arrays from Methods

As usual, a method can also return an array. For example, below program returns an array from method m1.
// Java program to demonstrate 
// return of array from method
 */
/*class ArrayDemo
{   
    // Driver method
    public static void main(String args[]) 
    {
        int arr[] = m1();
         
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
     
    }
 
    public static int[] m1() 
    {
        // returning  array
        return new int[]{1,2,3};
    }
}*/





/*class ArrayDemo
{   
	
    // Driver method
    public static void main(String args[]) 
    {
        int[] array = new int[2];
        int array1[]={2,-1,4,5,3};
        //int[] array;
        //array=int[2];
         
        array[0]=10;
        array[1]=20;
        System.out.println(array[1]);
      System.out.println(array[0] +":"+ array[1]);
    }
}
*/
/*class ArrayDemo
{   
    // Driver method
    public static void main(String args[]) 
    {
        String[] array = {"A","B","C","D"};
        System.out.println(array.length);
        
        for(int i=0;i<array.length;i++)
        {
        	System.out.print(array[i]+ " ");
         
        
         if(array[i].equals("c")){
    	 continue;}
        }
        System.out.println("WD");
       //break;
    }
    }
   */






    
    
    
    
