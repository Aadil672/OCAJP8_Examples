package com.general.examples;

public class JavaCertQType4 {
	
	static int c, a=10, b=21/2; 
	 static{
		 c=a;
	    }
	/*
	public static void main(String... variables) {                 // output = 10
		System.out.println(b);
	}
		*/
		/*public static void main(String[] commandArgs) {          // output = 10
			System.out.println(b);
		}*/
			
	/* private static void main(String[] commandArgs) {          // output = Error: Main method not found in class com.general.examples.JavaCertQType4, please define the main method as:
		                                                       // public static void main(String[] args) or a JavaFX application class must extend javafx.application.Application
			System.out.println(b);
		}*/
	 
			/*public static void main(String args) {                //output = Error: Main method not found in class com.general.examples.JavaCertQType4, please define the main method as:
				                                                   //public static void main(String[] args) or a JavaFX application class must extend javafx.application.Application
               System.out.println(b);
			}*/
				
		
			private static void main() {
				System.out.println(b);
			}
				public static void main(String... variables) {       //output = 10
					System.out.println(b);
					
	}
	 /*
	 private static void main() {
			System.out.println(b);
		}
			public static void main(String... variables) {             //output = AaDiL
				System.out.println("Aadil");
				
}*/
	/* public static void main(String commandArgs[]) {          // output = 10
		System.out.println(b);
	}*/

}
