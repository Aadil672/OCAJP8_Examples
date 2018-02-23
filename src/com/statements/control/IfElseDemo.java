package com.statements.control;

//Java program to illustrate if-else statement
/*class IfElseDemo
{
 public static void main(String args[])
 {
     int i = 10;

     if (i < 15)
         System.out.println("i is smaller than 15");
     
     else
         System.out.println("i is greater than 15");
 }
}
*/

class IfElseDemo
{
 public static void main(String args[])
 {
     int i = 10;

     if (i < 15)
         System.out.println("i is smaller than 15");
         System.out.println("can not put multiple block before else if there is no braces to enclose body of true condition");
     else                 //can not put multiple block before else if without braces , delete else token
         System.out.println("i is greater than 15");
 }
}

/*class IfElseDemo
{
 public static void main(String args[])
 {
     int i = 10;

     if (i < 15)
     {
         System.out.println("i is smaller than 15");
         System.out.println("True condition will execute here");
     }
     else
         System.out.println("i is greater than 15");
         System.out.println("This is out of else body as there is no enclosed braces");
 }
}*/

//output:
/*i is smaller than 15
True condition will execute here
This is out of else body as there is no enclosed braces*/


/*class IfElseDemo
{
 public static void main(String args[])
 {
     int i = 10;

     if (i < 15)
     {
         System.out.println("i is smaller than 15");
         System.out.println("True condition will execute here");
     }
     else
     {
         System.out.println("i is greater than 15");
         System.out.println("False condition will execute here");
     }
 }
}*/

//output:
/*i is smaller than 15
True condition will execute here*/
