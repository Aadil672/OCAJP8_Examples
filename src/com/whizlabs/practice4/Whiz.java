package com.whizlabs.practice4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*public class Whiz {
	public static void main(String[] args) {
		// int[] array;
		// args=new String[]{"1","2","3"};
		// args={"1","2","3"}; //compilation error

		args = new String[4];
		System.out.println(args[0]);

	}

}*/


/*public class Whiz {
	
	static long index=2;
	public static void main(String[] args) {
		int[][] array={{},{1,2,3},{4,5}};
		System.out.println(array[index][1]);     //can not convert long to int in size
		
	}

}
*/


/*public class Whiz {
	
	public static void main(String[] args) {
		new Whiz().meth();                     //compilation error
		
	}

	public void meth() throws Exception{
		for(int x=0;x>5;x++)
		{
			System.out.println(x);
		}
	}
}
*/



/*public class Whiz {
	
	
	public static void main(String[] args) {
		System.out.println(args[0]);
		
	}

}*/


/*public class Whiz {

	public static void main(String[] args) {
		try {
			Whiz.test();
		} catch (IOException x) {       //compilation

		}
	}

	public static void test() {
		System.out.println("I am running");
	}

}*/


/*public class Whiz {

	public static void main(String[] args) {
		// System.out.println(args[0]);
		try
		{
			
		args=new String[]{"0","4"};
		int x = args.length; 
		int v=10/x;
		System.out.println(x);   //0
		try
		{
			if(x==1)
				x=x/x-x;
			if(x==2)
			{
				int[] c={2};
				c[3]=3;
			}
		}
			catch(ArrayOutOfBoundsException a)
			{
				System.out.println("out of bound");
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Arithmetic");
			}
		}

	}
}
*/


/*public class Whiz {

	public static void run() {
		throw new RuntimeException();

	}

	public static void main(String[] args) {
		try {
			run();
			System.out.println("OK");
		} catch (RuntimeException runtime) {
			System.out.println("Runtime");     //Runtime

		} catch (Exception ex1) {
			System.out.println("Exception here");   
		} finally {
			System.out.println("Finally here");
		} 
		System.out.println("Terminated");
	}

}*/


/*public class Whiz {

	public static void main(String i[]) {
		try {
			int[] a = new int[4];
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			a[3] = (a[0] + a[1]) / a[2];

			System.out.println(a[3]);
		} catch (ArithmeticException ae) {
			System.out.println("A");         //A
		} catch (Exception e) {
			System.out.println("E");
		}

	}

}*/




/*public class Whiz {

	public static void main(String i[]) {
		StringBuilder sb = new StringBuilder("Whiz");

		sb = sb.append("lab");
		sb.append("s");

		//sb.setLength(7);
		System.out.println(sb);  //Whizlab

	}

}*/



/*public class Whiz {

	public static void main(String i[]) {
		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb);
		sb.insert(0,"The Latest").append("version is").append("1.7").delete(27,28).append("8").substring(4);
		System.out.println(sb);  //The Latestjavaversion is1.8

	}

}*/


/*public class Whiz {
	public static void main(String[] args) {
		
		int[] a={1,2,3,4,5,6};
		int i=a.length-1;
		System.out.println(i);  //5
		while(i>=0)
		{
			if(i%2!=0)
			{
			System.out.print(a[i]);   //642
			i--;
			}
		}
		
		
	}

}*/


/*public class Whiz {
	
	
	public static void main(String[] args) {
		int[][] ints={{1,2},{3,5},{6,7}};
		System.out.println(ints.length);    //3
		if(y==0)
	}

}*/




/*public class Whiz {

	public static void main(String[] args) {
		int x = 0;
		while ((x = 0) <= 1) {
			System.out.println(x);
			x++;
		}
	}

}*/



/*public class Whiz {

	public static void main(String[] args) {
		int x = 0;
		for (; x < 5; x += 3)
			System.out.println(x);

	}
}*/



/*public class Whiz {

	public static void main(String[] args) {
		short x = 9;
		double y = 10;
		String str = x == y ? "x = y" : x == y ? "x = y" : "nothing";
		System.out.println(str);//nothing

	}
}*/

/*public class Whiz {

	public static void main(String[] args) {
		short x = 10;
		double y = 10;
		String str = x == y ? "x = y" : x == y ? "x = y" : "nothing";
		System.out.println(str);  //x=y

	}
}*/


/*public class Whiz {
 static Integer y;
	public static void main(String[] args) {
		int x = 10;
		if(x++>10 & y++==1)
			y+=10;
			System.out.println(y);   //Exception in thread "main" java.lang.NullPointerException

	}
}*/


/*public class Whiz {

	public static void main(String[] args) {
		int x = -10;
		int y=-3;
			System.out.println(x%y);   //-1

	}
}*/



/*public class Whiz {

	public static void main(String[] args) {
		int x =-10;
		int y=3;
			System.out.println(x%y);   //-1   in %, Numerator sign will always be printed in result

	}
}*/

/*public class Whiz {

	public static void main(String[] args) {
		int x =10;
		int y=-3; //int y=3 wil; give equivalent result
			System.out.println(x%y);   //1

	}
}*/



/*public class Whiz {

	public static void main(String[] args) {
		int x =-10;
		int y=3;
			System.out.println(x/y);   //-3, in / -ve sign effect result.

	}
}*/


/*public class Whiz {

	public static void main(String[] args) {
		int x=-3;
		Float F=1.03f;
			System.out.println(x%F);

	}
}
*/



/*public class Whiz {
	int i;

	public static void main(String[] args) {
		Float F=1.03f;
		new Whiz().divide(F);    //compilation
	}
	void divide(Double D)
	{
		System.out.println(D/i);
	}
}
*/


/*public class Whiz {
	
	int x=8;
	static int y=x;    // can not make static reference to non-static field x.
	public static void main(String[] args) {
		int x=2;
		System.out.println(x+y);
	}
}*/


/*public class Whiz {
	
	int _=$;
	static int $=2;    
	public static void main(String[] args) {
		
		System.out.println($+new Whiz()._);   //4
	} 
}*/





/*public class Whiz {

	public static void main(String[] args) {
		Integer x=8;
		
			System.out.println("x.SIZE"+x.BYTES);  //32+4=36

	}
}*/


public class Whiz {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");

		System.out.println(list.set(3, "3"));  //set will return the removed element.
		
		System.out.println(list);  //[1,2,3,3]

	}
}


