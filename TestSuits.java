package multilevelInheritanceByExtends;

import org.junit.Test;

// There are 3Types of Inheritance 1.Simple Inheritance 2.Multilevel & 3.Multiple inheritance
// Simple Inheritance--- Directly child class(subclass) will inheritate the parent class(super class)
//Multilevel ----- Child class will inheritate the properties from parent class directly as well as indirectly from Grand Parent also
//Multiple ----If once child class is trying to inheritate two parent classes at a time if possible  then it is said to be****
//***multiple Inheritance and this concept is not possible in Java.
// One more inheritance is existed i.e heirarchial where 2 or more child classes (sub classes) will inheritate the properties of parent class(super class)

// Calling one class from another class is Multilevel Inheritance
//                        A          extends    B      extends C  i.e TestReusableComponents
//              Child class(sub class)   child class(sub class)
public class TestSuits extends TestCases
{
	@Test
    public void smokesuites()
     {
    	System.out.println("-----Test Suites : Smoke-----");
    	 composeAndsendmail();
    	 replyTomail();
    	 
     }
	
	@Test
     public void regressionsuites()
     {
    	 System.out.println("-----Test Suites : Regression-----");
    	 composeAndsendmail();
    	 replyTomail();
    	 forwardmail();
    	 deletemail();
    	 
     }
}
