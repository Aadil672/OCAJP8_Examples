package com.malagupta.questions.sample;

/*public class Q4 {
	    public static void main(String args[]) {
	        int[] arr = new int[5];
	        byte b = 4; char c = 'c'; long longVar = 10;
	        arr[0] = b;
	        arr[1] = c;
	        //arr[3] = longVar;  //compilation error
	        System.out.println(arr[0] + arr[1] + arr[2] + arr[3]);
		System.out.println(arr[0]);  //4
		System.out.println(arr[1]);  //99 
		System.out.println(arr[2]);
		System.out.println(arr[3]);
	System.out.println(arr[0] + arr[1] + arr[2] + arr[3]);
    
}
}
*/


/*public class Q4 {
    public static void main(String args[]) {
        int[] arr1;
        int[] arr2 = new int[3];
        char[] arr3 = {'a', 'b'};
        arr1 = arr2;
        //arr1 = arr3;    //can not convert from char[] to int[]
        System.out.println(arr1[0] + ":" + arr1[1]);
    }
}*/


/*import java.util.*;                                             // line 1
class Q4                 {                                      // line 2
    public static void main(String args[]) {                    // line 3
        ArrayList<String> ejg = new ArrayList<>();              // line 4
        ejg.add("One");                                         // line 5
        ejg.add("Two");                                         // line 6
        System.out.println(ejg.contains(new String("One")));    // line 7
        System.out.println(ejg.contains("One"));
        System.out.println(ejg.indexOf("Two"));                 // line 8
        ejg.clear();                                            // line 9
        System.out.println(ejg);                                // line 10

        System.out.println(ejg.get(1));                         // line 11
    }                                                           // line 12
}                              */                                 // line 13



/*class Q4 {
    public static void main(String args[]) {
        String ejg1 = new String("E Java");
        String ejg2 = new String("E Java");
        String ejg3 = "E Java";
        String ejg4 = "E Java";
        do
            System.out.println(ejg1.equals(ejg2));
        while (ejg3 == ejg4);
    }
}
*/


/*class Q4 {
    public static void main(String args[]) {
        String ejg = "game".replace('a', 'Z').trim().concat("Aa");
        ejg.substring(0, 2);   //gZmeAa
         //ejg=ejg.substring(0, 2);  //gZ
        System.out.println(ejg);
    }
}
*/


/*class Q4 {
    public static void main(String args[]) {
        String ejg = "game";
        ejg.replace('a', 'Z').trim().concat("Aa");
        ejg.substring(0, 2);
        System.out.println(ejg);   //game , because after operation we did not assign value.
    }
}*/


/*class Q4{
    public static void main(String args[]) {
        StringBuilder ejg = new StringBuilder(10 + 2 + "SUN" + 4 + 5);
        ejg.append(ejg.delete(3, 6));
        System.out.println(ejg);   12S512S5
    }
}*/



/*class Q4 {
	public static void main(String args[]) {
		StringBuilder sb1 = new StringBuilder("123456");
		sb1.subSequence(2, 4);
		sb1.deleteCharAt(3);
		sb1.reverse();
		System.out.println(sb1);   //65321
	}
}*/

class Q4
{
	public static void main(String[] args) {
		String printDate = LocalDate.parse("2057-08-11")
                .format(DateTimeFormatter.ISO_DATE_TIME);
System.out.println(printDate);
		
	}
}





