package myPolymorphism;

import org.junit.Test;

//method over riding is also known as dynamic or late binding or run time polymorphism


public class MethodOverRiding 
{
	@Test
	public void overriding()
	{
	Parent p = new Parent();
	p.method2();
	child s = new child();
	s.method2();
	Parent s1 = new child();
	s1.method2();
	}
}

class Parent
{
	public void method1()
	{
		System.out.println("Method 1 form Parent (Super) class");
	}
	public void method2()
	{
		System.out.println("Method 2 form Parent (Super) class");
	}
}

class child extends Parent
{
	public void method2()
	{
		System.out.println("Method 2 form Child (Sub) class");
	}
}
