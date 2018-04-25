package com.gocertify.www;

public class S {
	public static void main(String[] args) {
		
		String s = "Java";
		s.concat(" SE 6");
		s.replace('6', '7');
		System.out.print(s);
	}
}
//Output:java
//Correct! At line 3, we created a string object and its value is 'Java'. 
//Because no new assignment was made, the new String object created with the 'concat()' method and the'replace()' method was abandoned instantly. 
//In the end, the value of 's' remains 'Java'




/*public class S{
  public static void main(String [] args){
  String s = "Java";
  s.concat(" SE 6");
  s.toLowerCase();
  System.out.print(s);
 //how many?
  }
  }*/

//output:java 
//and total 4 objects are created while code reaches to line 22 (java,SE 6, Java SE  and java) and only java String is Assigned to s.

/*
Correct! Line 3 creates a new String object and gives it the value 'Java'.  
At line 4, two more String objects are created ('SE 6' and 'Java SE 6').  At line 5, a another new String object is created ('java'). 
So four objects are created. 
Keep in mind,however, that 's' only refers to 'Java' because the other strings that were created were not specifically assigned to 's'.
*/








