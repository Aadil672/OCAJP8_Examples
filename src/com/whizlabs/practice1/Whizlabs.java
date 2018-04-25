package com.whizlabs.practice1;

import java.util.Arrays;

/*public class Whizlabs {
	static int i=2;
	public static void main(String args[]) {
		int[] array=new int[i];
array[0]=65;
		array[1]=66;
		//array[2]=67;   //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
		System.out.println(array[1]+" "+array[0]);
		
	}

}
*/


/*public class Whizlabs {
	//static int i=2;
	public static void main(String args[]) {
		
		int[][] array=new int[10][];
		int array1[][]=new int[10][];
		//int array2[][10]=new int[][10];
		int[] array3[]=new int[][10];  //can not define an array dimension after an empty array dimension.
		
		System.out.println("");
		
	}

}*/


/*public class Whizlabs {
	
	public static void main(String args[]) {
		//String[] strings={"N","L","n","O","S"}; //NLOSn
		String[] strings={"10","2","N","L","n","6","O","S"};  //1026NLOSn...(not 2610NLOSn)
		Arrays.sort(strings);  //it sorts number before letter and Upper case before lower case.
		for(String s:strings)
		{
		System.out.print(s);
		}
		
	}

}*/




/*class Whizlabs
{   
	
    // Driver method
    public static void main(String args[]) 
    {
        //int[] array = new int[2];
        int array1[]={2,-1,4,5,3};
        int array2[]={2,-1,4,5,3};
        System.out.println(array1==array2);    //false
      System.out.println(Arrays.equals(array1, array2));  //true
      //System.out.println(Arrays.deepEquals(array1, array2));  //not applicable for int array
    }
}*/


/*class Whizlabs
{   
	
    // Driver method
    public static void main(int[] i)
    		{
      System.out.println("m1");
    }
    public static void main(String... s)
	{
System.out.println("m2");
}
    public static void main(String c)
	{
System.out.println("m3");
}
}         */



/*class Whizlabs
{   
	
    // Driver method
    public static void main(int[] i)
    {
    	int x=10;
    	if(x>10)
    	{
    		int y=20;
    	}
    	else {
    		int y=30;
    	}
   System.out.println(y);
}
}*/



/*class Whizlabs
{   
	static int x=50;
    // Driver method
    public static void main(String[] args)
    {
    	Integer[] a= new Integer[2];
    	//a[0]=5;
    	a[1]=10;
    	for(Integer I:a)
    	{
    		System.out.print(I); //null10
    		System.out.println(x);
    	}
    	System.out.println(x);
}
}*/




/*class Whizlabs
{   
	
    // Driver method
    public static void main(String[] args)
    {
    	int []a= {3,2,1,0};
    	int y=a.length;
    	int x=y-1;
    	while(y>=0)
    	{
    		System.out.print(a[--y]);   //0123Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1
    	}
    	
}
}
*/


/*class Whizlabs
{   
	
    // Driver method
    public static void main(String[] args)
    {
    	String s="A";
    	String c1="A";
    	String c2="A";
    	String c3="A";
    	
    	switch(s)
    	{
    	case c1: {System.out.println("A");};
    	default: {System.out.println("default");};
    	case c2: {System.out.println("B");}break;
    	case c3: {System.out.println("A");};
    	}
    	
}
}*/

/*class 
Whizlabs
{   
	static String out="";
    // Driver method
    public static void main(String[] args)
    {
    	int x=5; int y=8;
    	if(x++==5)
    	{
    		out+="1";
    		//out=out+1;    //out+=1;
    		System.out.println(out);
    	}
    	if(x!=6){}
    	else if(x>9){out+="2";}
    	else if(y<9){out+="3";}
    	else if(x==6){out+="2";}
    	else{out+="2";}
    	System.out.println(out);  //13
    	
    	
}
}
*/



/*class Whizlabs
{   
	static String out="";
    // Driver method
    public static void main(String[] args)
    {
    	int value1=1;
    	int value2=2;
    	 if(value1==value2){System.out.println("1");}
    	 if(value1!=value2){System.out.println("2");}
    	 if(value1>value2){System.out.println("3");}
    	 if(value1<value2){System.out.println("4");}
    	 if(value1>=value2){System.out.println("5");}
    	System.out.println(out);  // 2 4
    	
    	
}
}*/


/*class Whizlabs
{   
	static String out="";
    // Driver method
    public static void main(String[] args)
    {
    	int y=5;
    	
    	 if(false && y++==11)
    	 System.out.println("y");
    	 else if(true || --y==4)
        	 System.out.println("y");
    	 else (y==5){}                     //compilation error
    	    	
}
}*/


/*class Whizlabs
{   
	static String out="";
    // Driver method
    public static void main(String[] args)
    {
    	int x=20;
    	int y=13;
    	
    	System.out.println(""+x+y+""); //2013
    	System.out.println(x+y+"");  //33
    	System.out.println(x+""+y);  //  2013
    	
    	//for(System.out.println(a);)
    		
    	
    	    	
}
}*/



/*class Whizlabs
{   
	//static String out="";
    // Driver method
    public static void main(String[] args)
    {
    	int x=20;
    	int y=20;
    	
    	String x="20";
    	String y="20";
    	
    	System.out.println(x==y);      //true
    	System.out.println(x.equals(y));  //we can not use equals() for primitive like int
    	
    	
    	//for(System.out.println(a);)
    		
    	
    	    	
}
}

*/


/*class Whizlabs
{   
	
    // Driver method
    public static void main(String[] args)
    {

    	
    	//for(;;System.out.println("a");)
    		//for(int j;int k j<k; k--)
    	//for(int k; k--)
    		//for(int k=1;k--;k>0)
    		//{}
    	
    	int arr[][]={{1,3,5},{7,8}};
    	for(int[] a:arr)
    	{
    		for(int i:a)
    		{System.out.print(i+" "); // 1 3 5 7 8
    	}
    	}
    	
    }	    	
}*/


/*class Whizlabs
{   
	
    // Driver method
    public static void main(String[] args)
    {

    	
    	//for(;;System.out.println("a"))
    		//for(int j;int k j<k; k--)
    	//for(int k; k--)
    		//for(int k=1;k--;k>0)
    		//{}
    	
    	//for(int k=0,j=5;j<k;k--);
    	//for(int j=0;j++<3;);
    	for(int i=0;i<5;i++,System.out.print(i+".Hi"));
    		
    }	
    
}*/
    


/*class Whizlabs
{   
	
    // Driver method
    public static void main(String[] args)
    {

    	
    	//for(;;System.out.println("a"))
    		//for(int j;int k j<k; k--)
    	//for(int k; k--)
    		//for(int k=1;k--;k>0)
    		//{}
    	
    	//for(int k=0,j=5;j<k;k--);
    	//for(int j=0;j++<3;);
    	for(int i=0;i<5;i++,System.out.print(i+".Hi"));
    		
    }	
    
}*/


/*class Whizlabs
{   
	
    // Driver method
    public static void main(String[] args)
    {

    	L1:for(int i=5,j=0;i>0;i--);
    	{
    		L2:for(int j=0;j<5;j++)
    		
    			System.out.println(i+""+j+"");
    			if(j==0)
    			continue L1;
    			
    		
    	}
    		
    }	
    
}*/


/*class Whizlabs
{   
	
    // Driver method
    public static void main(String[] args)
    {

    	int[][] arr={{1,3,5},{7,8}};
    out:for(int[]a:arr);
    	{
    		for(int i:a)
    		{ if(i==7)
    			System.out.println(i+"");
    		}
    			
    		
    	}
    		
    }	
}*/


/*class Animal{
	void eat()
	{System.out.println("Animal Eats");}
}
class Bird extends Animal{
	void eat()
	{System.out.println("Bird eats");}
	void print()
	{
	eat();
	super.eat();
		}
}
class Whizlabs
{   
    // Driver method
    public static void main(String[] args)
    { 
    	
    	Animal an=new Animal();
    	an.eat();
    	Bird ab=new Bird();
    	ab.print();
    		
    }
}

*/


/*interface Walk{
	public default int getSpeed()
	
	{return 5;}
}


interface Run{
public default int getSpeed()
	
	{return 10;}
}
//public class Whizlabs implements Walk,Run    //duplicate getSpeed () inherited
{   
    // Driver method
    public static void main(String[] args)
    { 
    	
    	Whizlabs an=new Whizlabs();
    	System.out.println(an.getSpeed());
    		
    }
}*/



/*public class Whizlabs   
{   
    // Driver method
    public static void main(String[] args)
    { 
    	
    	Move.print();
    		
    }
interface Move{
public static void main(String[] args) {
	System.out.println("Move");
	
}
	
public static void print(){System.out.println("Hi");}
}

}*/



/*class Whizlabs
{   
	
    // Driver method
    public static void main(String[] args)
    {

    	StringBuilder sb=new StringBuilder("Java");
    	StringBuilder sb1=new StringBuilder("Java");
    	
    	String s=new String("Java");
    	
    	//System.out.println(s==sb1);   //incompatible typr String and StringBuilder
    	System.out.println(sb==sb1);     //false 
    	System.out.println(sb.equals(sb1));  //false
    	System.out.println(s.equals(sb));    //false
    	System.out.println(sb.toString().equals(sb1.toString()));  //true
    	
    	}
    		
    }	
*/


/*class Whizlabs
{   
	
    // Driver method
    public static void main(String[] args)
    {

    	StringBuilder sb=new StringBuilder("Java");
    	StringBuilder sb1=new StringBuilder("Lava");
    	//String s=new String("Lava");
    	String s=new String("Java");
    	
    	//System.out.println(s==sb1);   //incompatible typr String and StringBuilder
    	System.out.println(sb==sb1);     //false 
    	System.out.println(sb.equals(sb1));  //false
    	System.out.println(s.equals(sb));    //false
    	System.out.println(sb.toString().equals(sb1.toString()));  //false
    	
    	}
    		
    }	*/



/*class Whizlabs
{   
	static int x=10;
    // Driver method
    public static void main(String[] args)
    {
         Whizlabs wh=new Whizlabs();
        //Whizlabs.x=5;
         wh.x=5;
         System.out.println(x);
         int y=x/wh.x;
         System.out.println(wh.x);
         System.out.print("y=");
        // System.out.print();  //method print() is not applicable
         System.out.print(y);
         
    	
    	}
    		
    }	*/


/*class Whizlabs implements A
{   
	
    // Driver method
    public static void main(String[] args)
    {
        System.out.print(A.s);
        System.out.print(A.value);
    
         
    		}
    		
    }	
interface A
{
	static int value=15;
	String s="Value is:";
}*/



/*class Whizlabs
{   
	static int x=50;
    // Driver method
    public static void main(String[] args)
    {
        int x,y=100;
        System.out.println(new Whizlabs().x);      //local variable should be initialized
        //System.out.println(x);
        
    	
    	}
    		
    }	
*/

/*class Whizlabs
{   
	int x=y;
    static int y=10;
    // Driver method
    public static void main(String[] args)
    {
        System.out.print(new Whizlabs().x);
        System.out.print(" "+y);
        
    	
    	}
    static{y=15;}
    		
    }	
*/

/*class Whizlabs
{   
	
    // Driver method
    public static void main(String[] args)
    {
         Double d1=10.0/0.0;
         System.out.println(d1.isInfinite());
    	
    	}
    		
    }	*/



/*class Whiz
{
	private String code="1Z0-808";
	{System.out.print(code+ " ");}
	
	private static int QUESTIONS=90;
	static{System.out.print(QUESTIONS+ " ");}
	static{QUESTIONS-=13;System.out.print(QUESTIONS+ " ");}
	public Whiz()
	{
		System.out.print("Constructor");
	}
}
*/

/*class Whizlabs
{   
	
	
	
    // Driver method
    public static void main(String[] args)
    {
        String s="abc";
    	s.concat("def");
    	
    	System.out.println(s);
    	
    	String res=s.concat("def");
    	System.out.println(res);
    	}
    		
    }	*/



/*class Alpha{
	int ns;
	int s;
	Alpha(int ns)
	{
		//System.out.println(s);
		if(s<ns)
		{
		s=ns;
		this.ns=ns;}
	}
		void doPrint()
		{
			System.out.println("ns="+ns+" "+"s="+s);
		}
}
public class Whizlabs
{
	public static void main(String[] args) {
		Alpha a1=new Alpha(50);
		Alpha a2=new Alpha(125);
	Alpha a3=new Alpha(100);
		a1.doPrint();
		a2.doPrint();
		a3.doPrint();
		
		
	}
}
*/
//ns=50 s=125
//ns=125 s=125
//ns=0 s=125

