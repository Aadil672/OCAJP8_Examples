package com.gocertify.www;

/*public class Ex1 {
		    static int x = 10;  
		   public static void main(String[] args) {
		     for(int x=0;x<5;x++){
	        }
		     System.out.print(x);
		   }
		  }
*/



/*class Ex1 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		Ex1 e=new Ex1();
		System.out.println(e instanceof Object);
		System.out.print(a instanceof Object);
	}
}*/

//output:
//true
//true


/*class Ex1 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 053, 4 };
		int b[][] = { { 1, 2, 4 }, { 2, 2, 1 }, { 0, 43, 2 } };
		System.out.print(a[3] == b[0][2]);
		System.out.print(" " + (a[2] == b[2][1]));
	}
}*/

// true true



/*class Ex1{
    public static void main(String[] args) {
      int a[][] = new int[3][];
       a[1] = new int[]{1,2,3};
      a[2] = new int[]{4,5};
      System.out.println(a[0]);  //null
    // System.out.println(a[0][0]);    //nullException in thread "main" java.lang.NullPointerException
    System.out.println(a[1][1]); //2
    System.out.println(a[2][0]); //4
    System.out.println(a[2][1]); //5
    System.out.println(a[2][2]);   //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
    }
  }*/

//output: 2




/*class Ex1 {
	int a = 10;

	public static void main(String[] args) {
		new Ex1().print();
		Ex1 obj=new Ex1();
		obj.print();
	}

	public void print() {
		int a = 8;
		System.out.print(a + " ");
	}
}*/





/*class Ex1{
      public static void main(String[] args) {
     new Ex1().pass();
    }
    
  public void pass(){
   int a =10 , b=20;
   print(a) ;
   }
    
public void print(int a){
    int c = b/a;            // b is a local variable and can not be used here.
    System.out.print(c);
    }
  public void print(int a){
	  int b=10;  
	  int c = b/a;            
	    System.out.print(c);   //output:1
	    }
  }*/



/*class Ex1{
     static int x = 10;  
    public static void main(String[] args) {
    for(int x=0;x<5;x++){         //scope of x here is limited to for loop ONLY.
       }
      System.out.print(x);
    }
  }*/
//output:10

/*class Ex1{
   static int x = 10;  
   public static void main(String[] args) {
     System.out.print(x);    //10
   }
 }*/





class Ex1 {
	public static void main(String args[]) {
		int x = 10;
		int y = new Ex1().change(x);
				System.out.print(x + y);
	}

	int change(int x) {
		//x = 12;
		return x;
	}
}


/*
 Correct! When you are passing a primitive variable, you are passing a copy of the bits representing the variable. For example,  
 if you pass an int variable with the value 3, you are passing a copy of bits representing 3.
In this case you pass the value of x in the main method to the change method and it'll return the value 12 and assign it to y.
 But the value of x is still the same as explained above. So the summation of x and y will print 22.
 */



