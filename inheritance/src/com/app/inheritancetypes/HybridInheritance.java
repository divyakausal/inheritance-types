package com.app.inheritancetypes;

class ClassA
{
	public void classAmethod()
	{
		System.out.println("classA method");
	}
}
class ClassB extends ClassA
{
	public void show()
	{
		System.out.println("show() method of classB");
	}
	public void classBmethod()
	{
		System.out.println("classB method");
	}
}
class ClassC extends ClassA
{
	public void show()
	{
		System.out.println("show() method of classC");
	}
	public void classCmethod()
	{
		System.out.println("classC method");
	}
}
/*class ClassD extends ClassB,ClassC //not possible but if write this
{
	public void classDmethod()
	{
		System.out.println("classD method");
	}
}*/
public class HybridInheritance 
{
	public static void main(String[] args)
	{
		/*ClassD d=new ClassD();
		d.classDmethod();
		d.show(); */  //confusion happens here which method to call
	}

} //error
