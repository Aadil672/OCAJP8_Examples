package com.malagupta.ocajp8;



/*class Phone
{
	private double weight;
	public void setWeight(double val){
		if(val>0 && val<1000)
			weight=val;
	}
	public double getWeight(){
		return weight;
	}
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		
	
	Phone ph=new Phone();
	ph.setWeight(-12.12);
	System.out.println(ph.getWeight());    //0.0 prints default value if we assign negative value
	
	ph.setWeight(1212);
	System.out.println(ph.getWeight());    //0.0 prints default value if we assign value greater than 1000
	
	ph.setWeight(12.12);
    System.out.println(ph.getWeight());    //12.12 prints exact value if we assign value greater than 0 and less than 1000.
}
}*/

/*
note:The terms encapsulation and information hiding are used interchangeably. 
By exposing object functionality only through methods, you can prevent your private variables from being assigned any values that don’t fit your requirements. 
One of the best ways to create a well-encapsulated class is to define its instance variables as private variables and allow access to these variables using public methods. 
*/

//Well-encapsulated classes don’t expose their instance variables outside their class. 



//Passing primitives to methods

//The value of a primitive data type is copied and passed to a method. Hence, the variable whose value was copied doesn’t change:

/*class Primitive
{
	int age;
	void modifyVal(int age)
	{
		age=age+1;
		System.out.println(age);
	}
}
public class EncapsulationDemo {
	public static void main(String[] args) {
		Primitive p=new Primitive();
		System.out.println(p.age);
		p.modifyVal(p.age);
		System.out.println(p.age);
	}
}*/

//The method modifyVal  accepts a method argument a of type int.
//In this method, the variable a is a method parameter and holds a copy of the value that’s passed to it. The method increments the value of the method parameter         a and prints its value.                  When the class Office calls the method modifyVal , it passes a copy of the value of the object field age to it. The method modifyVal never accesses the object field age. 
//Hence, after the execution of this method, the value of the method field age prints as 0 again. 
/*
 * It’s OK to define a method parameter with the same name as an instance variable (or object field). But this is not a recommended            practice.                                       Within a method, a method parameter takes precedence over an object field. When the method modifyVal refers to the variable age, it refers to the method parameter age, not the instance variable age. To access the instance variable age within the method modifyVal, 
 * the variable name age needs to be prefixed with the keyword this (this is a keyword that refers to the object itself).
 */

/*class Person {
    private String name;
    Person(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }

    public void setName(String val) {
        name = val;
    }
}

class EncapsulationDemo
{
	public static void swap(Person p1, Person p2)
	{
		Person temp=p1;
		p1=p2;
		p2=temp;
	}
	public static void main(String[] args) {
		Person person1=new Person("Aadil");
		Person person2=new Person("Hussain");
		
		System.out.println(person1.getName()+":"+person2.getName());
		
		swap(person1,person2);
		System.out.println(person1.getName()+":"+person2.getName());
	}
}

//output:
//Aadil:Hussain
//Aadil:Hussain

*/



/*class Person 
{
    public String name;
    public int height;
}

class EncapsulationDemo {
    public static void main(String args[]) {
        Person p = new Person();
        p.name = "EJava";
        anotherMethod(p);
        System.out.println(p.name);
        someMethod(p);
        System.out.println(p.name);
    }

    static void someMethod(Person p) {
        p.name = "someMethod";
        System.out.println(p.name);
    }
    static void anotherMethod(Person p) {
        p = new Person();
        p.name = "anotherMethod";
        System.out.println(p.name);
    }
}
*/




/*class EncapsulationDemo {
    public static void main(String args[]) {
        int ejg = 10;
        anotherMethod(ejg);
        System.out.println(ejg);
        someMethod(ejg);
        System.out.println(ejg);
    }
    static void someMethod(int val) {
        ++val;
        System.out.println(val);
    }
    static void anotherMethod(int val) {
        val = 20;
        System.out.println(val);
    }
}*/



/*class Course {
    void enroll(long duration) {
        System.out.println("long");
    }
    void enroll(int duration) {
        System.out.println("int");
    }
    void enroll(String s) {
        System.out.println("String");
    }
    void enroll(Object o) {
        System.out.println("Object");
    }
}

class EncapsulationDemo {
    public static void main(String args[]) {
        Course course = new Course();
        char c = 10;
        course.enroll(c);
        course.enroll("Object");
    }
}*/



class EJava {
    public EJava() {
        this(7);
        System.out.println("public");
    }
    private EJava(int val) {
        this("Sunday");
        System.out.println("private");
    }
    protected EJava(String val) {
        System.out.println("protected");
    }
}
class EncapsulationDemo {
    public static void main(String[] args) {
        EJava eJava = new EJava();
    }
}


