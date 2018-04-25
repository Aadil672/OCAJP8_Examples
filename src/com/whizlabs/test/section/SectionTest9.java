package com.whizlabs.test.section;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/*public class SectionTest9 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(10);
		StringBuilder sb1 = new StringBuilder("ABCD");
		System.out.println(sb.capacity());   //10
		System.out.println(sb1.capacity());  //20
	}

}*/


/*public class SectionTest9 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(3);
		list.add(4);
		list.add(2, 3);
		list.removeIf(e -> e < 3);
		System.out.println(list);
	}

}*/


/*public class SectionTest9 {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();

		strings.add("A");
		strings.add("B");
		strings.add("C");

		String[] arr = new String[2];
		arr = strings.toArray(arr);
		System.out.println(arr);//[Ljava.lang.String;@15db9742
		System.out.println(strings);  //[A, B, C]
		

		for (String s : arr)
			System.out.print(s);
	}

}*/



/*public class SectionTest9 {
	public static void main(String[] args) {
		List list = new ArrayList<>();

		list.add(5);
		list.add(5);
		System.out.println(list.get(0));
		System.out.println(list);
		System.out.println(Integer.max(5,1));
		//System.out.println(Integer.max(list.get(0),1));   //compilation error beacuse no generic
	}
}*/


/*public class SectionTest9 {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();

		list.add(5);
		list.add(5);
		System.out.println(list.get(0));   //5
		System.out.println(Integer.max(5,1));     //5
		System.out.println(Integer.max(list.get(0),1));   //5
	}
}*/


/*public class SectionTest9 {
	public static void main(String[] args) {
		
		Period p=Period.ofMonths(13);
				System.out.println(p.normalized());
	}
}*/


/*public class SectionTest9 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Whizlab");

		// String s=new String(new StringBuilder("Whizlab"));

		char[] ch = new char[4];
		sb.getChars(1, 4, ch, 1);

		for (char c : ch) {
			System.out.print(c);
		}
	}
}*/


/*public class SectionTest9 {
	public static void main(String[] args) {
		String s = String.join("-", "1", "1");
		System.out.println(s);
	}
}*/


public class SectionTest9 {
	public static void main(String[] args) {
		LocalDate date=LocalDate.of(2015,12,12);
		LocalDateTime time=date.atTime(10,22);
	}
}



		
		
		
		
		