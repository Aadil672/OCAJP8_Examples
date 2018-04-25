package com.malagupta.ocajp8;

import java.util.ArrayList;
import java.util.ListIterator;

/*public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Afzal");
		list.add("Tahir");
		list.add("Ajmal");
		list.add("Asad");
		list.add("Arshad");
		list.add(2,"Aadil");
		//System.out.print(list);       //[Afzal, Tahir, Aadil, Ajmal, Asad, Arshad] //printing complete list
		
		for(String elements:list)
		{
			System.out.print(elements+ " ");   //accessing list elements using Enhanced for loop.  //Afzal Tahir Aadil Ajmal Asad Arshad , 
		}
		
	}

	
}*/



/*public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Afzal");
		list.add("Tahir");
		list.add("Ajmal");
		list.add("Asad");
		list.add("Arshad");
		list.add(2,"Aadil");
		//System.out.print(list);       //[Afzal, Tahir, Aadil, Ajmal, Asad, Arshad] //printing complete list
		
		ListIterator iterator=list.listIterator();
		while(iterator.hasNext())   //use hasNext() to check whether more elements exist. //The method hasNext() returns a boolean true value if more of its elements exist and false otherwise
			System.out.print(iterator.next()+ " ");    //call next() to get the next item from iterator.
		
		//accessing list elements using ListIterator //Afzal Tahir Aadil Ajmal Asad Arshad
		
	}

	
}
*/


//You can modify an ArrayList by either replacing an existing element in the ArrayList or modifying all of its existing values using set() method


/*public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Afzal");
		list.add("Tahir");
		list.add("Ajmal");
		list.add("Asad");
		list.add("Arshad");
		
		list.set(1,"Hanfu"); //Modifying the elements of an ArrayList using set() method.
		
		//System.out.print(list);       //[Afzal, Tahir, Aadil, Ajmal, Asad, Arshad] //printing complete list
		
		for(String elements:list)
		{
			System.out.print(elements+ " ");
			
		//accessing list elements using ListIterator //Afzal Hanfu Aadil Ajmal Asad Arshad
		
	}

	
}
}*/


//You can also modify the existing values of an ArrayList by accessing its individual elements. Because Strings are immutable, let’s try this with StringBuilder. Here’s the code:      


/*public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<StringBuilder> list=new ArrayList<StringBuilder>();
		list.add(new StringBuilder("Afzal"));
		list.add(new StringBuilder("Tahir"));
		list.add(new StringBuilder("Ajmal"));
		list.add(new StringBuilder("Asad"));
		list.add(new StringBuilder("Arshad"));
		
		list.add(new StringBuilder("Aadil")); //adding elements at specified position.
		
		//System.out.print(list);       //[Afzal, Tahir, Aadil, Ajmal, Asad, Arshad] //printing complete list
		
		for(StringBuilder elements:list)
		{
			elements.append(elements.length());    //access ArrayList elements and modify them
		}
		
		for(StringBuilder elements:list)
		{
			System.out.print(elements+ " ");
			
		//accessing list elements using ListIterator //Afzal Hanfu Aadil Ajmal Asad Arshad
		
	}

	
}
}
*/



//Deleting the elements of an ArrayList.//ArrayList defines two methods to remove its elements, as follows:

 //remove(int index)—This method removes the element at the specified position in this list.
 //remove(Object o)—This method removes the first occurrence of the specified element from this list, if it’s present.

/*public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<StringBuilder> list=new ArrayList<StringBuilder>();
		StringBuilder sb1=new StringBuilder("one");
		StringBuilder sb2=new StringBuilder("two");
		StringBuilder sb3=new StringBuilder("three");
		StringBuilder sb4=new StringBuilder("four");
		
		list.add(sb1);
		list.add(sb2);
		list.add(sb3);
		list.add(sb4);
		
		
		list.remove(1);
		for(StringBuilder elements:list)
		{
			System.out.println(elements);    //access ArrayList elements and modify them
		}
		
		System.out.println("====================================");
		
		list.remove(sb3);
		for(StringBuilder elements:list)
		{
			System.out.println(elements);
		}
		
        System.out.println("====================================");
		
        list.remove(new StringBuilder("four"));    //does not remove.
		for(StringBuilder elements:list)
		{
			System.out.print(elements+ " ");
		}
		
		
		}
}
*/


//addAll(int index, Collection<? extends E> c) inserts all the elements in the specified collection into this list, starting at the specified position.      
//addAll(int index, Collection<? extends E> c) inserts all the elements in the specified collection into this list, starting at the specified position.      


/*public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList<String> myList=new ArrayList<String>();     //myList
		myList.add("Afzal");
		myList.add("Tahir");
		myList.add("Aadil");
		
		ArrayList<String> yourList=new ArrayList<String>();     //yourList
		yourList.add("Ajmal");
		yourList.add("Asad");
		yourList.add("Arshad");
		for(String val:yourList)      
		{
			System.out.println(val+ " ");	
		}
		
		myList.addAll(3, yourList);      //adding all yourList to myList
		
		for(String elements:myList)      
		{
			System.out.print(elements+ " ");		
	}

	
}
}
*/

/*public class ArrayListDemo {
	public static void main(String[] args) 
	{
      ArrayList<String> myArrList=new ArrayList<String>();
        String one="One";
        String two=new String("Two");
        
        myArrList.add(one);
        myArrList.add(two);
     ArrayList<String>yourArrList=myArrList;
        one.replace("O","B");
        for(String val:myArrList)
        System.out.print(val+":");
        
        System.out.println("");
        
        for(String val:yourArrList)
        	System.out.print(val+":");
	}
}
*/


//clearing all array list...

/*public class ArrayListDemo {
	public static void main(String[] args) 
	{
		ArrayList<String> myArrList = new ArrayList<String>();
		myArrList.add("One");
		myArrList.add("Two");
		
		myArrList.clear();  //You can remove all the ArrayList elements by calling clear on it.
		
		for (String val:myArrList)    
			System.out.print(val+" ");
	}
}*/


/*public class ArrayListDemo {
	public static void main(String[] args) 
	{
		ArrayList<String> myArrList = new ArrayList<String>();
		myArrList.add("One");
		myArrList.add("Two");
		
		String valFromList=myArrList.get(1);  //You can get/retrieve value of the ArrayList elements by calling clear on it.
	     System.out.print(valFromList+" ");   //Two
	     
	     System.out.println(myArrList.size()); //2
	     
	}
}
*/


