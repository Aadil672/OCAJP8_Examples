package com.whizlabs.practice;

import java.util.Arrays;

/*public class Final {
	public static void main(String[] args) {

		int ins0[], ins1;

		ins0 = new int[2];
		ins1 = new int[2];

	}

}
*/
/*public class Final {
	public static void main(String[] args) {

		String[][] strs = new String[5][];

		strs[1] = new String[2];

		System.out.println(strs.length + strs[1].length);

	}

}*/




/*public class Final {
	public static void main(String[] args) {

		int[] ints = new int[4];

		ints[0] = 1;
		ints[1] = 2;
		ints[2] = 3;
		ints[3] = 4;

		int ins[] = Arrays.copyOf(ints, 5);

		for (int x : ins)
			System.out.println(x);   //12340

	}

}*/



/*public class Final {
	public static void main(String[] args) {

		int[] ints = { 2, -1, 4, 5, 3 };
		Arrays.sort(ints);

		System.out.println(Arrays.binarySearch(ints, -1)); // 0

	}

}*/


/*public class Final {
	static Integer i;

	public static void main(String[] args) {

		try {
			System.out.println(i.toString());
		} catch (RuntimeException ex) {
			throw ex;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Fin");  //Fin followed by Exception in thread "main" java.lang.NullPointerException

		}

	}
}
*/


/*public class Final {
	public static void main(String[] args) {

		int[] ints = get(-1);

		System.out.println(ints.length);

	}

	public static int[] get(int i) {
		return new int[i];
	}

}*/


/*public class Final {
	public static void main(String[] args) {
		int x = 10, y = 12;
		System.out.println("Answer =" + x - y);
	}

}*/



/*public class Final {
	
	static int x=10;
	static int y=20;
	public static void main(String[] args) {
		System.out.print(x+y);
		System.out.print(x+get(30));
	}
	public static int get(int x)
	{
		return x+y;
	}

}*/


/*public class Final {
	public static void main(String[] args) {
		for (int x = 0; x < 10; System.out.print(x++));

	}

}*/

/*public class Final {
	public static void main(String[] args) {
		String[] sts = { "A", "B", "C" };

		for (String var : sts) {
			continue;
			System.out.println(var);   //unreachable
		}

	}
}*/


/*public class Final {
	public static void main(String[] args) {
		int x = 0;
		do {
			System.out.println(x);
			System.out.println();
		} while (x++ > 0);
	}

}*/


/*public class Final {
	public static void main(String[] args) {
		int x=1;
		int y=2;
		int res =x/y;
		
			System.out.println(res);
	}

}
*/





/*public class Final {
	public static void main(String[] args) {
		int x=1;
		int y=2;
		int z=3;
		int res=x++*y++*--z;
		
			System.out.println(res);
	}

}*/

/*public class Final {
	public static void main(String[] args) {
		int x=0;
		while(x<10)
		{
			
		}
		String out=x++>10?">":"<";
		System.out.println(out);
			//System.out.println(+out+x);
	}

}*/


/*public class Final {
	public static void main(String[] args) {
		String s="abc";
		
		
		switch(s)
		{
		case "ABC":System.out.println(1);
		case "BBB": System.out.println(3);break;
		}
			
	}

}
*/


/*public class Final {
	public static void main(String[] args) {
		String s="abc";
		int x_y;
		//double null;
		//int stu count;
		
	//char c='12';
	String s2="A";
	
	//String s1=null;
	
			
	}

}*/



/*public class Final {
	public static void main(String[] args) {
		String s = "abc";
		int[] array = { 1, 2, 3 };
		double[] d = array; // can not convert int array to double
		double sum = 0;

		for (int i = 0; i < array.length; ++i)
			sum += d[i];
		System.out.println(sum);

	}

}*/

/*public class Final {
	public static void main(String[] args) {
		
		Double d = 10.0;
		Integer i = 10;
		System.out.println(d+i);   //20.0
		//System.out.println((d+i).intValue());

	}

}*/




/*public class Final {
	public static void main(String[] args) {
		
		long l1 = 10l;
		long l2 = 9l;
		System.out.println(Long.remainderUnsigned(l1,l2)+Long.divideUnsigned(l1,l2));  //2
		
	}

}*/


/*public class Final {
	public static void main(String[] args) {
		
	Double d = 10.7;
		Integer i = Integer.decode("12");
				Integer ii=Integer.parseInt("011");
		
		System.out.println(d+i+ii);
		
	}

}*/


/*public class Final {
	//int i1; int i2;
	static int x,y=10,z=x*y;
	public static void main(String[] args) {
		
		System.out.println(z);  //0
		
	}

}*/


/*public class Final {
	static double d = 10.9;
	static int i= 100;
	public static void main(String[] args) {
		
		
		int i1=(int)d+i;
		System.out.println(i1);  //110
	}

}
*/



/*public class Final {

	public static void main(String[] args) {
		int i1 = 10;
		int i2;
		if (i1 > 2) {
			i1 = 1;
			i2 = 1;
		} else {
			i2 = 2;
		}
		System.out.println(i1 + i2);   //2

	}

}*/


/*public class Final {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder("A");
		
		sb.append(new char[]{'B','C'});
		System.out.println(sb);    //ABC
		
		sb.append(3);
		sb.append(true);
		
		System.out.println(sb);   //ABC3true
	}
}
*/



/*public class Final {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder("ABCDEF");
		sb.delete(4,6);
		System.out.println(sb);  //ABCD
		
		sb.ensureCapacity(22);
		System.out.println(sb.capacity());    //22
		
          sb.ensureCapacity(23);
		System.out.println(sb.capacity());  //46
	}
}*/





/*public class Final {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder("ABCDEF");
		sb.reverse().reverse().append(12);
		System.out.println(sb);  //ABCDEF12
		
		sb.setLength(4);
		System.out.println(sb);  //ABCD
		
	}
}*/


/*public class Final {

	public static void main(String[] args) {
		char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F' };

		String out = String.copyValueOf(chars, 1, 4); // BCDE
		System.out.println(out);
	}
}
*/



/*public class Final {

	public static void main(String[] args) {
		char[] chars = new char[4];
		chars[0]=0;
		chars[1]=2;

		String out = "12345789";
		//out.getChars(srcBegin, srcEnd, dst, dstBegin);
		out.getChars(0, 3,chars,0);
		for(char c:chars)
		System.out.print(c); //123
	}
}*/




public class Final {

	public static void main(String[] args) {
		

		String out = "Oracle Certified Professional Java Programmer";
		int x=out.indexOf("O",0);
		int y=out.lastIndexOf("Cer");
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
	}
}


