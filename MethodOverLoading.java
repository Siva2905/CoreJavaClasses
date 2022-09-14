package myPolymorphism;

import org.junit.Test;

// method over loading is also known as static or early binding or compile time polymorphism

public class MethodOverLoading
{
	@Test
	public void overloading() 
	{
		superclass Superclass = new superclass();
		// Superclass.method1(488);
		Superclass.method1(488, "Siva");
		subclass SubClass = new subclass();
		// SubClass.method1(488, "Rao", 479);
		SubClass.method1(12, "Naga"); // Her we have given arguments as two inputs but in subclass there is no method
										// with**
		// **two arguments ,So it is clearly known that it inheriates from superclass
		// reference object         runtime object
		        superclass s     =   new subclass();// new subclass is runtime object
		        s.method1(10, "Siva");
	}
}

class superclass // Here Super Class is also known as Parent Class
{
	void method1(int num) 
	{
		System.out.println("Method1 in Super Class is :" + num);
	}

	void method1(int num, String name) 
	{
		System.out.println("Method1 in Super Class is :" + num + name);
	}
}

class subclass extends superclass // Here Sub Class is also known as Child Class
// In Subclass we are printing only input with three arguments but while using extends keyword in between subclass & superclass***
//*** the method written in superclass will also be extends to subclass
{
	void method1(int num, String name, int marks) 
	{
		System.out.println("Method1 in Sub Class is " + num + name + marks);
	}

	void method1(int num, String name) // This is called overriding i.e with same classname and with same parameters.
	{
		System.out.println("Method1 in Sub Class is :" + num + name);
	}
}