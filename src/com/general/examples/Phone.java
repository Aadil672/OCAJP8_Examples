package com.general.examples;

	class Phone {
	    String model;
	    String company;
	    
	    /*Phone(){   //default constructor
	    	
	    }
	    */
	    Phone(String model) {
	        this.model = model;
	    }
	    
	    double weight;
	    void makeCall(String number) {
	        // code
	    }
	    void receiveCall() {
	        // code
	    }
	    
	    public static void main(String... args) {
	    	Phone ph=new Phone("MotoG5Plus");
	    	ph.makeCall("9199264472");
	    	
	    	System.out.println("makeCall and recieveCall funtion in Phone...");
			
		}
	}


