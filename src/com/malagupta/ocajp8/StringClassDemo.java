package com.malagupta.ocajp8;

/*public class StringClassDemo {
	public static void main(String[] args) {
		
		String str1=new String("Aadil");
		String str2=new String("Aadil");
		System.out.println(str1==str2);   //false
		System.out.println(str1.equals(str2));  //true
		
		//In the previous code, a comparison of the String reference variables str1 and str2 prints false. 
		//The operator == compares the addresses of the objects referred to by the variables str1 and str2. 
		//Even though these String objects store the same sequence of characters, they refer to separate objects stored at separate locations. 
		
	}

}*/


//String objects created using the assignment operator (=) may refer to the same object if they store the same sequence of characters.


/*public class StringClassDemo {
	public static void main(String[] args) {
		
		String str3="Aadil";
		String str4="Aadil";
		System.out.println(str3==str4);   //true
		System.out.println(str3.equals(str4));  //true
		
		//In the preceding example, the variables str1 and str2 referred to different String objects, 
		 * even if they were created using the same sequence of characters. In the case of variables str3 and str4, 
		 * the objects are created and stored in a pool of String objects. Before creating a new object in the pool, 
		 * Java searches for an object with similar contents. When the following line of code executes, 
		 * no String object with the value "Harry" is found in the pool of String objects:
		 * 
         //String str3 = "Harry";
	}

}*/




/*public class StringClassDemo {
	public static void main(String[] args) {
		
		System.out.println("Morning");               //Morning
		String morning1 = "Morning";
		System.out.println("Morning" == morning1);   // true
	}

}*/



/*public class StringClassDemo {
	public static void main(String[] args) {
		
		System.out.println("Morning");                //Morning
		String morning2 = new String("Morning");
		System.out.println("Morning" == morning2);   // false
		
		
		//The preceding code shows that object references of String objects that exist in the String constant pool and 
		//object references of String objects that don’t exist in the String constant pool don’t refer to the same String object, even if they define the same String value. 
	}

}*/



//You can also invoke other overloaded constructors of the class String to create its objects by using the operator new:

/*public class StringClassDemo {
	public static void main(String[] args) {
		
		
		String girl = new String("Sania");       //String constructor that accept String 
		
		char[] name=new char[]{'A','a','d','i','l'};
		String boy=new String(name);              //String constructor that accept char array
		
		System.out.println(girl);
		System.out.println(name);   // 
		System.out.println(boy);
	}

}
*/


//You can also create objects of String using the classes StringBuilder and StringBuffer:      

/*public class StringClassDemo {
	public static void main(String[] args) {
		
		
		StringBuilder sbuilder = new StringBuilder("String Builder object");       
		String str5=new String(sbuilder);                        //String constructor that accept objects of StringBuilder 
		
		
		StringBuffer sbuffer = new StringBuffer("String Buffer object");       
		String str6=new String(sbuffer);                        //String constructor that accept objects of StringBuffer.
		
		
		System.out.println(sbuilder);
		System.out.println(str5);   // 
		System.out.println(sbuffer);
		System.out.println(str6);
	}

}*/


//Because String is a class, you can assign null to it, as shown in the next example: 


/*public class StringClassDemo {
	public static void main(String[] args) {
		
		
		String defaultValue=null;
		System.out.println(defaultValue);      //null
	}

}
*/



/*public class StringClassDemo {
	public static void main(String[] args) {
		
		
		String str1=new String("Aadil");
		String str5=new String("Aadil");
		System.out.println(str1==str5);     //false
		
		String str2="Aadil";
		String str4="Aadil";
		System.out.println(str2==str4);   //true
		
		System.out.println("Aadil");
		System.out.println("Aadil");
		System.out.println("Aadil"=="Aadil");   //false
		
		String str3=new String("Aadil");
	}

}*/


/*The code at  creates a new String object with the value "Summer". 
This object is not placed in the String constant pool.                                       
The code at  creates a new String object with the value "Summer" and places it in the String constant pool.                                       
The code at  doesn’t need to create any new String object. 
It reuses the String object with the value "Summer" that already existed in the String constant pool.                                       
The code at  creates a new String object with the value "autumn" and places it in the String constant pool.                                       
The code at  reuses the String value "autumn" from the String constant pool. 
It creates a String object with the value "summer" in the String constant pool (note the difference in the case of letters—Java is case-sensitive and "Summer" is not the same as "summer").                                       The code at  creates a new String object with the value "Summer".                     

*/


/*public class StringClassDemo {
public static void main(String[] args) 
{
	
	
	String name=new String("Aadil");
	
	System.out.println(name.charAt(1));  //a
	System.out.println(name.charAt(3));  //i
	//System.out.println(name.charAt(5));  //error Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 5
	
	System.out.println("=============================");
	
	String letters=new String("ABCAB");
	
	System.out.println(letters.indexOf("B"));   //1
	System.out.println(letters.indexOf('b'));   //-1
	System.out.println(letters.indexOf('B'));   //1
	System.out.println(letters.indexOf("CA"));  //2
	System.out.println(letters.indexOf("S"));   //-1
	System.out.println(letters.indexOf("B",2));  //4
	
	
	System.out.println("=============================");
	

	String str=new String("Oracle"); //(012345)
	
	System.out.println(str.substring(2));   //acle to the end
	System.out.println(str.substring(2, 4));   //ac to 4 excluding end character.
	
	
	
    System.out.println("=============================");
	

	String varWithSpaces="   AB CD  ";
	
      System.out.print(":");
	System.out.print(varWithSpaces);
     System.out.println(":");
	
     
	System.out.print(":");
	System.out.print(varWithSpaces.trim());   //acle to the end
    System.out.println(":");
    
    
    
    System.out.println("=========================");

	
    String varReplace="ABCAB";
	
    System.out.println(varReplace.replace('B','b'));  //AbCAb
    System.out.println(varReplace.replace("CA","12"));  //AB12B
	System.out.println(varReplace);  //ABCAB

	System.out.println("=========================");
	
	String var="AadilAfridi";
	System.out.println(var.length());
	
	
System.out.println("=========================");

	
    String varStartWith="ABCAB";
	
    System.out.println(varStartWith.startsWith("AB")); //true
    System.out.println(varStartWith.startsWith("B")); //false
    System.out.println(varStartWith.startsWith("ab")); //false
    System.out.println(varStartWith.startsWith("A",3));//true
    System.out.println(varStartWith.startsWith("A")); //true
   // System.out.println(varStartWith.startsWith('A'));  //not applicable for string
	System.out.println(varStartWith);
	
	
	
System.out.println("=========================");

	
    String varEndsWith="ABCAB";
	
    System.out.println(varEndsWith.endsWith("AB")); //true
    System.out.println(varEndsWith.endsWith("CAB")); //true
    System.out.println(varEndsWith.endsWith("A")); //false
    System.out.println(varEndsWith.endsWith("ab")); //false
    //System.out.println(varEndsWith.endsWith('B')); ////not applicable for string
    
    
    String letterClone = "ABCAB";
    System.out.println(letterClone.substring(0, 2).startsWith(""));
    
    
System.out.println("=========================");
	 
    String chainResult="Sunday  ".replace(' ','Z').trim().concat("M n");
    System.out.println(chainResult); //true
    
    
    //Note that there’s a difference between calling a chain of methods on a String object versus doing the same and then reassigning the return value to the same variable:
    
    String day="SunDday";
    day.replace('D','Z').substring(3);
    System.out.println(day);
    
    day=day.replace('D','Z').substring(3);  // re-assign can change the behavior
    System.out.println(day);     //Zday
    
    
    System.out.println("=========================");
    
    String value="ABCAB";
    System.out.println(value.substring(0,2).startsWith("A"));
    
}

}*/



public class StringClassDemo {
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Bon");
		sb.insert(2,'r');
		//sb.insert('r',2);   //java.lang.StringIndexOutOfBoundsException
		System.out.println(sb);     //Born
		
		StringBuilder sb1=new StringBuilder("0123456789");
		//sb1.delete(2,4);      //01456789
		sb1.deleteCharAt(3);   //012456789
		System.out.println(sb1);
		
		
		// to reverse a character of StringBuilder.
		StringBuilder sb2=new StringBuilder("0123456789");
		sb2.reverse();
		System.out.println(sb2);
		
		
		      // to replace a character of StringBuilder that accepts position.
				StringBuilder sb3=new StringBuilder("0123456789");
				sb3.replace(2,4,"AADIL");
				System.out.println(sb3);   //01AADIL456789
				
				
				// to retrieve a character of StringBuilder using subString/subSequence.
				StringBuilder sb4=new StringBuilder("0123456789");
				System.out.println(sb4.subSequence(2,4));   //23
				System.out.println(sb4);   //0123456789
		//The method subsequence doesn’t modify the existing value of a StringBuilder object.      
	}
	
}
		
		
		
		
		

