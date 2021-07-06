package com.app.inheritancetypes;
class Animal
{
	public void eat()
	{
		System.out.println("Eating...");
	}
}
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Barking...");
	}
}
class Cat extends Animal
{
	public void meow()
	{
		System.out.println("Meowing...");
	}
}
public class Hierarchical 
{
	public static void main(String[] args)
	{
		Cat cat = new Cat();
		cat.meow();
		cat.eat();
		//cat.bark(); Compile time error
		
		Dog dog = new Dog();
		dog.bark();
	}	
}
/*OutPut : Meowing...
		   Eating...
		   Barking...
*/
