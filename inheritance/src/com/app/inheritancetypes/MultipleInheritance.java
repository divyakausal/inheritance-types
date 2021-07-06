//Multiple Inheritance not supported in java
package com.app.inheritancetypes;
class A
{
	public void msg()
	{
		System.out.println("Class A method");
	}
}
class B
{
	public void msg()
	{
		System.out.println("Class B method");
	}
}
/*class C extends A,B //this is not possible but if write
{
	
}*/
public class MultipleInheritance {
	public static void main(String[] args)
	{
		//C c = new C();
		//c.msg();  //now which msg() method would be invoke
		
	}
} //compile time error
