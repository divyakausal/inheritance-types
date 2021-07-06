//Multilevel Inheritance Example
package com.app.inheritancetypes;
class Country
{
	public void m1()
	{
		System.out.println("India");
	}	
}
class State extends Country
{
	public void m2()
	{
		System.out.println("Maharashtra");
	}
}
class City extends State
{
	public void m3()
	{
		System.out.println("Pune");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args)
	{
		City city = new City();
		city.m1();
		city.m2();
		city.m3();
	}
}
/*OutPut:India
	     Maharashtra
	     Pune*/

