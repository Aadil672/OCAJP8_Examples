package com.malagupta.ocajp8;


/*class ConstructorDemo {
	
	ConstructorDemo(){
		System.out.println("User-defined constructor is created by user");
	}
	public static void main(String[] args) {
		new ConstructorDemo();
		
	}
	}*/


//creates an object of class Employee using the keyword new, which triggers the execution of the VAibhav class constructor. The output of the class Office is as follows:      


/*class Vaibhav {
	Vaibhav(){
		System.out.println("User-defined constructor is created by user");
	}
}

class ConstructorDemo{

	public static void main(String[] args) {
		
		Vaibhav emp=new Vaibhav();
		
	}
}*/



//Because a constructor is called as soon as an object is created, you can use it to assign default values to the instance variable of your class, as follows 


/*class Vaibhav {
	String name;
	int age;
	Vaibhav(){
		age=27;
		System.out.println("User-defined constructor is created by user");
	}
}

class ConstructorDemo{

	public static void main(String[] args) {
		
		Vaibhav emp=new Vaibhav();
		System.out.println(emp.age);
		System.out.println(emp.name);
		
	}
}*/



/*class Vaibhav {
	String name;
	int age;
	Vaibhav(String name, int age){
		this.name=name;
		this.age=age;
		System.out.println("User-defined constructor is created by user");
		System.out.println(name);
		System.out.println(age);
	}
}

class ConstructorDemo{

	public static void main(String[] args) {
		
		Vaibhav emp=new Vaibhav("Vaibhav",27);
		//System.out.println(emp.age);
		//System.out.println(emp.name);
		
	}
}*/

/*
 * Note that a constructor is called when you create an object of a class. 
 * A constructor does have an implicit return type, which is the class in which it’s defined. 
 * It creates and returns an object of its class, which is why you can’t define a return type for a constructor. 
 * Also note that you can define constructors using any of the four access levels. 
 * 
 * You can define a constructor using all four access levels: public, protected, default, and private.
 * 
 * 
 * 
 * What happens if you define a return type for a constructor? Java will treat it as another method, not a constructor,
 *  which also implies that it won’t be called implicitly when you create an object of its class:      
 */



/*class Vaibhav {
	//void Vaibhav()
	int age=27;
	int Vaibhav()
	{
		System.out.println("Vaibhav is Not a CONSTRUCTOR as it has return type");
		System.out.println("if you define a return type for a constructor? Java will treat it as another method, not a constructor,"
				+ "which also implies that it won’t be called implicitly when you create an object of its class");
		return age;
	}
}

class ConstructorDemo{

	public static void main(String[] args) {
		
		Vaibhav emp=new Vaibhav();  //it won’t be called implicitly when you create an object of its class when Constructor has return type.
		emp.Vaibhav(); 
		//int res=emp.Vaibhav();
		// System.out.println(res);
	}
}*/




//Intializer block means default constructor Vaibhav() is called when object of class Vaibhav is created.

/*class Vaibhav
{
{
	System.out.println("Vaibhab:Initializer");
}
}
class ConstructorDemo{
	public static void main(String[] args) {
		Vaibhav emp=new Vaibhav();
		
	}
	
}
*/



//If you define both an initializer and a constructor for a class, both of these will execute. 
//The initializer block will execute prior to the constructor: 

/*class Vaibhav
{
	Vaibhav(){System.out.println("Vaibhav as a constructor");}       //Constructor
{
	System.out.println("Vaibhab as an Initializer (Default Constructor)");     //Initializer block of default constructor
}

class ConstructorDemo{
	public static void main(String[] args) {
		Vaibhav emp=new Vaibhav();
		
	}
	
}*/

//output:
//Vaibhab as an Initializer (Default Constructor)
//Vaibhav as a constructor




//If a class defines multiple initializer blocks, their order of execution depends on their placement in a class. But all of them execute before the class’s constructor: 

/*class Vaibhav
{
	{
		System.out.println("Vaibhab as an Initializer block2 (Default Constructor)");   //Initializer block2 of default constructor will execute first as it is placed before block1 
	}
	Vaibhav(){System.out.println("Vaibhav as a constructor");}       //Constructor
{
	System.out.println("Vaibhab as an Initializer block1 (Default Constructor)");     //Initializer block1 of default constructor
}
}

class ConstructorDemo{
	public static void main(String[] args) {
		Vaibhav emp=new Vaibhav();
		
	}
}
*/

//output:
//Vaibhab as an Initializer block2 (Default Constructor)
//Vaibhab as an Initializer block1 (Default Constructor)
//Vaibhav as a constructor






//Default constructor.

/*In this case, which method creates the object of the class Employee? 
 * Figure 3.20 shows what happens when a class (Employee) is compiled that doesn’t define any constructor. 
 * In the absence of a user-defined constructor, Java inserts a default constructor. This constructor doesn’t accept any method arguments. 
 * It calls the constructor of the super (parent) class and assigns default values to all the instance variables. 
 */

//When the Java compiler compiles a class that doesn’t define a constructor, the compiler creates one

//The accessibility of a default constructor matches the accessibility of its class. Java creates a public default constructor for a public class. 
//It creates a default constructor with package access for a class with package-level access. 

/*class Vaibhav
{
	String name;
	int age;
	
	Vaibhav()       //Default constructor
	{
		super();
	}
}

class ConstructorDemo{
	public static void main(String[] args) {
		Vaibhav emp=new Vaibhav();
		
		
	}
	
}*/



//What happens if you add another constructor to the class Employee, as in the following example? 
//In this case, upon recompilation, the Java compiler will notice that you’ve defined a constructor in the class Employee. 
//It won’t add a default constructor to it, 

//When a class with a constructor is compiled, the Java compiler doesn’t add a default constructor to 


/*class Vaibhav
{
	String name;
	int age;
	
	Vaibhav(String name, int age)       //User-defined constructor
	{
		this.name=name;
		this.age=age;
		System.out.println("When a class with a constructor is compiled, the Java compiler doesn’t add a default constructor to");
	}
}

class ConstructorDemo{
	public static void main(String[] args) {
		//Vaibhav emp=new Vaibhav();                 //In the absence of a no-argument constructor, the following code will fail to compile:
		Vaibhav emp =new Vaibhav("Aadil",26);
		
		System.out.println(emp.name);
		System.out.println(emp.age);
		
	}
	
}*/



/*class Employee {
    String name;
    int age;
    Employee() {
        //this();
    	this ("Ajmal",28);
    }
    Employee (String newName, int newAge) {
        name = newName;
        age = newAge;
    }
}
class ConstructorDemo
{
	
	public static void main(String[] args) {
		Employee emp =new Employee();
		System.out.println(emp.name);
		System.out.println(emp.age);
	}
}*/



/*class Employee {
    String name;
    int age;
    Employee() {
        age=22;
    }
    public void setName(String val) 
    {
        name = val; 
    }
    public void printEmp()
    {
    	System.out.println("name:"+name + "  " + "age:"+age);
    }
}

class ConstructorDemo {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.name = "Selvan";
        e2.setName("Harry");
        e1.printEmp();
        e2.printEmp();
    }
}*/

/*
 * This is the output of the preceding code:

name = Selvan age = 22
name = Harry age = 22

Figure 3.22 defines object diagrams (a diagram with the name and type of an object, the name of the object’s fields, and their corresponding values), which will help you to better understand the preceding output.
Figure 3.22. Two objects of the class Employee

You can access the object field name of the object of the class Employee either by using its variable name or by using the method setName. The following line of code assigns a value Selvan to the field name of object e1:

e1.name = "Selvan";

The following line of code uses the method setName to assign a value of Harry to the field name of object e2:

e2.setName("Harry");

Because the constructor of the class Employee assigns a value of 22 to the variable age, objects e1 and e2 both contain the same value, 22. 
 */





//What happens if you don’t assign any value to an object field and try to print out its value? 
//All the instance variables (object fields) are assigned their default values if you try to access or read their values before writing any values to them:      


/*class Employee {
    String name;
    int age;
       public void printEmp()
    {
    	System.out.println("name:"+name + "  " + "age:"+age);
    }
}

class ConstructorDemo {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.printEmp();
        
    }
}*/

//The output of the preceding code is as follows (the default value of an object is null and int is 0):

//name = null age = 0




/*What happens if you change the access modifier of the variable name to private, as shown here (modified code in bold)? 
You won’t be able to set the value of the object field name as follows:

e1.name = "Selvan";

This line of code won’t compile. Instead, it complains that the variable name has private access in the class Employee and can’t be accessed from any other class:

Office.java:6:  name has private access in Employee
            e1.name = "Selvan";
 */

/*class Employee {
    private String name;
    int age;
    Employee() {
        age=22;
    }
    public void setName(String val) 
    {
        name = val; 
    }
    public void printEmp()
    {
    	System.out.println("name:"+name + "  " + "age:"+age);
    }
}

class ConstructorDemo {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
       // e1.name = "Selvan";      the field Employee is not visible.
        e2.setName("Harry");
        e1.printEmp();
        e2.printEmp();
    }
}*/


//name:null  age:22
//name:Harry  age:22


/*class Employee {
    private String name;
        public void setName(String val) 
    {
        name = val; 
    }
    public void printEmp()
    {
    	System.out.println("name:"+name);
    }
}

class ConstructorDemo {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        String anotherVal="New String";
        e1.setName("Method invoke");   //passing literal value as a method parameter
        e1.setName(anotherVal);        //passing variable as a method parameter.
        e1.printEmp(); 
    }
}*/

//name:Method invoke


/*class Employee {
	private String name;

	public void setName(String val) {
		name = val;
	}

	public int daysOffWork(int... days) {
		int daysOff = 0;
		for (int i = 0; i < days.length; i++)
			daysOff += days[i];
		return daysOff;
	}
}

class ConstructorDemo {
    public static void main(String args[]) {
        Employee e = new Employee();
        System.out.println(e.daysOffWork(1,2,3,4));   //10, call method daysOffWork() with 4 method arguments
        System.out.println(e.daysOffWork(1,2,3));     //6,  call method daysOffWork() with 3 method arguments
    }
    
        
}*/


/*Note:Methods that accept varargs parameters can be called with a different count of actual arguments. Also, 
a method that accepts a vararg can be invoked with an array in place of the vararg.   */ 



//Let’s add the method getName to the class Employee that returns a String value (changes in bold):                  
class Employee {
	private String name;

	public void setName(String val) {
		name = val;
	}

	public String getName() {
		return name;
	}
}
       
class ConstructorDemo {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        Employee e2=new Employee();
        String name=e1.getName();  //assigned a method's return type to variable
        //int name=e1.getName();    //you can’t assign a return value of a method to an incompatible variable, string returned to int variable
        
        e2.setName(e1.getName());  //pass method's return value to another method
    }
}


