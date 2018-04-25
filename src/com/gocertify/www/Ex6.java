package com.gocertify.www;

public class Ex6 {
	public static void main(String args[]){
		   int x = 1, y=10;
		   //int x=0;
		      try{
		       // y /=x; 
		        y=y/x;
		        System.out.println(y);
		       }
		  // System.out.print("/ by 0");
		     catch(Exception e){
		    	 System.out.println(e);
	        System.out.print("error");
		      }
		  }

}

