//Single Inheritance Example 
package com.app.inheritancetypes;
class Person
{	
	public void family()
	{
		System.out.println("No of People");
	}
}
class Student extends Person
{
	public void college()
	{
		System.out.println("No of Students");
	}
}
public class SingleInheritance {
	public static void main(String[] args)
	{
		Student student = new Student(); //child class Object
		student.family();
		student.college();
		
		Person person = new Person();  //Parent class Object
		person.family();
		
	}
}
/*Output: No of People
    	  No of Students
		  No of People*/

