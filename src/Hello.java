
/*public class Hello {
	public static void main(String args[])
	{
		System.out.println("Hello Java");
	}

}
*/

public class Hello {
	int a=10; // it should be static, otherwise it will not print this a value, that is we can not static reference to non static field a which is inside class of value 10.
	public static void main(String args[])
	{int a=20;
		System.out.print("Hello Java");
		System.out.println(a);
	}
	
}
//output: Hello Java 20
