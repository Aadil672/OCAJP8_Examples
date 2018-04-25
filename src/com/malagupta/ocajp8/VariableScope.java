package com.malagupta.ocajp8;
//loop variables aren’t accessible outside the loop body:
/*public class VariableScope {
	public static void main(String[] args) {
		
	
	for(int var=0;var<=5;var++)
	{
		System.out.println(var);
	}
	
	//System.out.println(var);  //can not compile, variable var is not visible outside of for loop

}
}*/


/*public class Phone{
	static boolean softKeyboard=true;
}

class VariableScope {
	public static void main(String[] args) {
		Phone.softKeyboard=false;
		
		Phone p1=new Phone();
		Phone p2=new Phone();
		
		System.out.println(p1.softKeyboard);
		System.out.println(p2.softKeyboard);
		
}
}*/

/*class Phone {
	String phoneNumber = "123456789";

	 String setNumber() {
		String phoneNumber;
		phoneNumber = "987654321";
		return phoneNumber;
	}
}

class VariableScope {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		String res=p1.setNumber();
		System.out.println(res);

		System.out.println(p1.phoneNumber);
	}
}
*/
//987654321
//123456789


/*class Exam {
	String name;

	public void setName(String newName) {
		name = newName;
	}
}

	
class VariableScope {
		public static void main(String[] args) 
		{
			Exam e1 = new Exam();
			e1.setName("OCAJP8");
			e1=null;
			e1=new Exam();
			e1.setName("PHP");
			
			System.out.println(e1);

			//System.out.println(p1.phoneNumber);
		}
	}
*/


/*class VariableScope
{
		String model;
		public static String todaysDate()
		{
			return new java.util.Date().toString();
		}
		public static void main(String[] args) {
					
			String date=todaysDate();
			System.out.println("Today's date:"+date);
	}
}

//output: Today's date:Tue Mar 06 15:15:41 IST 2018

*/


/*//calling method in instance (object way).
class Average {
	double calcAverage(int marks1, int marks2)
	{
		double avg=0;
		avg=(marks1+marks2)/2.0;
		return avg;
	}
}
public class VariableScope
	{
	public static void main(String[] args) 
	{
		Average val=new Average();
	double avg = val.calcAverage(95,97);
		
		System.out.println(avg);
		
		}
	}
*/



//calling method in static way outside driver class itself

/*class Average {
	static double calcAverage(int marks1, int marks2)
	{
		double avg=0;
		avg=(marks1+marks2)/2.0;
		return avg;
	}
}
public class VariableScope
	{
	public static void main(String[] args) 
	{
		//Average val=new Average();
		//double avg = calcAverage(95,97);
	double avg = Average.calcAverage(95,97);
		
		System.out.println(avg);
		
		}
	}*/





// calling method in static way inside class itself
/*public class VariableScope
	{
	
	static double calcAverage(int marks1, int marks2)
	{
		double avg=0;
		avg=(marks1+marks2)/2.0;
		return avg;
	}
	public static void main(String[] args) 
	{
		//Average val=new Average();
		double avg = calcAverage(95,97);
	//double avg = Average.calcAverage(95,97);
		
		System.out.println(avg);
		
		}
	}
*/






/*class VariableScope
{
	public static void main(String[] args) {
		System.out.println("Hello");
		
	}
}*/





// calling method in static way.

/*class Employee {
	public int daysOffWork(int... days) {
		int daysOff = 0;
		for (int i = 0; i < days.length; i++)
			daysOff += days[i];
		return daysOff;
	}
}
*/


/*class VariableScope
{
	public static int daysOffWork(int... days) {
		int daysOff = 0;
		for (int i = 0; i < days.length; i++)
			daysOff += days[i];
		return daysOff;
	}
	public static void main(String[] args) {
		int[] days={1,2,3,4,5};
	
		
		int result=daysOffWork(days);
		System.out.println(result);
		
	}
}*/




/*
 
//calling method in reference variable way from inside class 

class VariableScope
{
	public  int daysOffWork(int... days) {
		int daysOff = 0;
		for (int i = 0; i < days.length; i++)
			daysOff += days[i];
		return daysOff;
	}
	public static void main(String[] args) {
		int[] days={1,2,3,4,5};
		VariableScope val=new VariableScope();
		
		int result=val.daysOffWork(days);
		System.out.println(result);
		
	}
}*/



//calling method in reference variable way


/*class Employee {
public int daysOffWork(int... days) {
	int daysOff = 0;
	for (int i = 0; i < days.length; i++)
		//daysOff += days[i];
		daysOff=daysOff + days[i];
	return daysOff;
}
}

class VariableScope
{
public static void main(String[] args) {
	int[] days={1,2,3,4,5};
	Employee e=new Employee();
	
	
	int result=e.daysOffWork(days);
	System.out.println(result);
	
}
}*/
	












			
			
			
