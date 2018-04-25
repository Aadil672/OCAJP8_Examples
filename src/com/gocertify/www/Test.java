package com.gocertify.www;

class Person {

   Person(String s, int i) {
		++pid;
		name = s;
		age = i;
	}

	static int pid;
	int age;
	String name;
}

class Test {
	public static void main(String args[]) {
		Person p1 = new Person("John", 22);
		Test te = new Test();
		Person p2 = te.change(p1);
		//System.out.println(p2.pid + " " + p2.name + " " + p2.age);
		System.out.println(p1.pid + " " + p1.name + " " + p1.age);
		System.out.println(p2.pid + " " + p2.name + " " + p2.age);
	}

	private Person change(Object o) {
		Person p2 = (Person) o;
		p2.age = 25;
		return p2;
	}

}

/*//output:
1 John 25
1 John 25

Correct! When you pass an object variable into a method, you must keep in mind that you are passing the object reference, 
not the actual object itself. So here both p1 and p2 objects are modified at the same time. 
And there is no problem in casting at line 20 (actually p1 is a person).*/






