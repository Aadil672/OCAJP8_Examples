package com.malagupta.questions.sample;


class Animal {
	void jump() {
		System.out.println("Animal");
	}
}

class Cat extends Animal {
	void jump(int a) {
		System.out.println("Cat");
	}
}

class Rabbit extends Animal {
	void jump() {
		System.out.println("Rabbit");
	}
}

class Q6 {
	public static void main(String args[]) {
		Animal a=new Animal();
		a.jump();
		
		System.out.println("==============");
		
		Animal cat = new Cat();
		Rabbit rabbit = new Rabbit();
		cat.jump();
		rabbit.jump();
		cat.jump(5);
	System.out.println("----------------------");	
		
		Animal rab=new Rabbit();
		rab.jump();
		
		System.out.println("----------------------------------");
		
		System.out.println("===============");
		
		Cat c=new Cat();
		c.jump();
		c.jump(5);
	}
}





/*class Flower {
	public void fragrance() {
		System.out.println("Flower");
	}
}

class Rose {
	public void fragrance() {
		System.out.println("Rose");
	}
}

class Lily {
	public void fragrance() {
		System.out.println("Lily");
	}
}

class Bouquet {
	public void arrangeFlowers() {
		Flower f1 = new Rose();
		Flower f2 = new Lily();
		f1.fragrance();
	}
}*/



/*interface Movable {
    void move();
}

class Person implements Movable {
    public void move() { System.out.println("Person move"); }
}
class Vehicle implements Movable {
    public void move() { System.out.println("Vehicle move"); }
}
class Q6 {
	public static void main(String[] args) {
		
    // INSERT CODE HERE
	void walk(Movable movable) {
		//void walk(Person movable) {
		//void walk(Vehicle movable) { 
        movable.move();
    }
}
}*/



/*class Programmer {
	void print() {
		System.out.println("Programmer - Mala Gupta");
	}
}

class Author extends Programmer {
	void print() {
		System.out.println("Author - Mala Gupta");
	}
}

class Q6 {
	public static void main(String[] args) {

		Programmer a = new Programmer();
		// INSERT CODE HERE
		 
		Programmer b = new Author();
		//Author b = new Author(); 
		
		//Author b = new Programmer();     //error compile
		//Author b = (Author) new Programmer(); //Exception in thread "main" java.lang.ClassCastException: com.malagupta.questions.sample.Programmer cannot be cast to com.malagupta.questions.sample.Author
	//Programmer b = ((Author)new Programmer());    //down casting not allowed implicitly, Exception in thread "main" java.lang.ClassCastException: com.malagupta.questions.sample.Programmer cannot be cast to com.malagupta.questions.sample.Author
		a.print();
		b.print();
	}
}
*/



