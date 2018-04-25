package com.malagupta.ocajp8;


class Emp {
	 private String name;
	String address;
	protected String phoneNumber;
	public float experience;
}

class Programmer extends Emp {
	Programmer(String val) {
		name = val;
	}

	String getName() {
		return name;
	}
}


public class InheritanceDemo {
	public static void main(String args[]) {
		new Programmer("Harry").getName();
	}
}


