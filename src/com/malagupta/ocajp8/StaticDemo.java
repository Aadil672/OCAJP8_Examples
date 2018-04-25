package com.malagupta.ocajp8;

/*class Test {
	
	String name;
	static int bankVault;
}
	
	class StaticDemo{
		public static void main(String[] args) {
			
			Test obj1=new Test();
			Test obj2=new Test();
			
			obj1.bankVault=10;
			obj2.bankVault=20;
			
			System.out.println(obj1.bankVault); // 20
			System.out.println(obj2.bankVault); //20
			System.out.println(Test.bankVault);  //20
			
			System.out.println("-------------------------------------");  
			obj1.bankVault=100;
			//obj2.bankVault=20;
			
			System.out.println(obj1.bankVault); // 100
			obj2.bankVault=200;
			System.out.println(obj2.bankVault); //200
			System.out.println(Test.bankVault);  //200
		}
	}*/
	
	/*Even though you can use an object reference variable to access static members,it’s not advisable to do so. 
	Because static members belong to a class and not to individual objects, using object reference variables to access static members may make them appear to belong to an object. The preferred way to access them is by using the class name. 
	The static and final nonaccess modifiers can be used together to define constants (variables whose value can’t change). 
*/

	
	
	
/*class StaticDemo{
	static int x=result();
	int y=10;

	static int result()
	{
		return 20;
		//System.out.println("Static Method");
		
	}
	int nonStatic()
	{
		//System.out.println(y);  //10
		return result();
		//System.out.println(y);  //unreachable code
	}
	
	public static void main(String[] args) {
		System.out.println("non-static variables and methods can access static variables and methods because the static members of a class exist even if no instances of the class exist. ");
		//System.out.println(x);
		//System.out.println(y);  //can not static reference to non-static fields y.
		//StaticDemo obj=new StaticDemo();
		//obj.nonStatic();
		new StaticDemo().nonStatic();
	}
}
	*/



/*class StaticDemo{
	static int x=result();
	static int y=10;
	static int z;

	static int result()
	{
		return 200;
		
	}
	int nonStatic()
	{
		//System.out.println(y);  //10
		return result();
		//System.out.println(y);  //unreachable code
	}
	
	public static void main(String[] args) {
		System.out.println("non-static variables and methods can access static variables and methods because the static members of a class exist even if no instances of the class exist. ");
		System.out.println(x);  //200
		//System.out.println(y); // can not static reference to non-static fields y.
		//StaticDemo obj=new StaticDemo();
		//obj.nonStatic();
		//obj.result();
		
		StaticDemo obj=null;
		int res=obj.result();
		
		System.out.println(res);   //200
		System.out.println(obj.result());  //200
		System.out.println(obj.y);    //10
		System.out.println(obj.z);    //0
	}
}
	*/


/*class StaticDemo{
	static int x=result();
	static int y=10;
	static int z;

	static int result()
	{
		return 200;
		
	}
	int nonStatic()
	{
		//System.out.println(y);  //10
		return result();
		//System.out.println(y);  //unreachable code
	}
	
	public static void main(String[] args) {
		
		StaticDemo var=new StaticDemo();
		var.nonStatic();
		var.result();
		//nonStatic();
		result();
		
		try{
			int x=Integer.parseInt("one");
			}
		finally{}
		
	}
}
*/

/*
import java.lang.Math.*;
import static java.lang.Math.*;
import java.lang.*;

class StaticDemo
{
	public static void main(int[] i) {
		System.out.println(PI);
		
	}
}*/



	
	