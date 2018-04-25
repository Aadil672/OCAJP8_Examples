package com.dumps.ocajp7;

/*public class Test {
	public static void main(String[] args) {
		

	//String valid="true";
		boolean valid=true;
	if(valid)
	
		System.out.println("Valid");
		else
			System.out.println("Not Valid");
}
}
*/


/*public class Test{
	public static void main(String[] args) {
		for(int ii=0; ii<2;)
		{
			ii++;
			System.out.print(ii +" ");   //1 2
		}
		//while(int ii=0; ii<2;)
		{
			//ii++;
			//System.out.print(ii +" ");   //1 2
		}
	}
}
*/




/*class Test {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };
		int i = a.length;
System.out.println("length of array:"+i);               //6
		while (i >= 1) {                    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
			System.out.print(a[i]);
			i--;
		}
	}
}*/




/*class Test {
	public static void main(String[] args) {
		int a[] = {};
		System.out.println(a instanceof Object);     //true because Array is of object type.
		System.out.print(a[0]);    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
}
}
*/

class Test {
	int value = 10;
	
	public void print() {
		int value = 8;
		System.out.println(value);}

	public static void main(String[] args) {
		Test t1=new Test();
		t1.print();
		new Test().print();
	}

	
	}


