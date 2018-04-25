package com.general.examples;

public class MultipleMainMethod 
{
	/*public static void main(String args[]) {          // working output = Spring
		System.out.println("Spring");
		
	}*/
	
	public static void main(String args) {          // Error: Main method not found in class com.general.examples.MultipleMainMethod, please define the main method as:
		                                              //  public static void main(String[] args) or a JavaFX application class must extend javafx.application.Application
		System.out.println("Aadil");
		
	}
	
	/*public static void main(String[] args) {              //working output = Fall
		System.out.println("Fall");
		
	}*/
	/*
	public static void main(String... args) {               // working output = Summer
		System.out.println("Summer");
		
	}
*/
	/*public static void main(String[] cmd) {                    //working output = Autumn
		System.out.println("Autumn");
		
	}*/

	/*public static void main() {                           //Error = Error: Main method not found in class com.general.examples.MultipleMainMethod, please define the main method as:
		                                                  //public static void main(String[] args)or a JavaFX application class must extend javafx.application.Application
	System.out.println("Winter");
		
	}*/
	
	
	/*private static void main(String[] args) {               //Error = Error: Main method not found in class com.general.examples.MultipleMainMethod, please define the main method as:
                                                            //public static void main(String[] args)or a JavaFX application class must extend javafx.application.Application
     System.out.println("Winter");

	}*/

}
