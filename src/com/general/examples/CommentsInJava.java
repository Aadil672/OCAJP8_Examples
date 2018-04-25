package com.general.examples;

public class CommentsInJava {
		
		public static void main(String...strings) {
			String name=/*Multiline comment*/ "Aadil";
			String name1="/*Multiline comment*/ Hussain";
			//String name1="Aa /*Dil 
				//	+ */" Hussain";                      //wont compile  because the value assigned to variable name is an unclosed string literal value

			System.out.println(name);
			System.out.println(name1);
		}
	}
