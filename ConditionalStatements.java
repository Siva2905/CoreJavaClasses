package coreconcepts;

import org.junit.Test;

public class ConditionalStatements 
{
int a = 5;
int b = 2;
  // = is a assignment operator and == is relational  operator
@Test
public void comparetwonumbers()

{
	boolean result = (a==b);
	if (result == true)
	{
	System.out.println("Both Numbers are equal");
    }
}

@Test
public void comparetwonumbers_ifelse()

{
	boolean result = (a==b);
	if (result == true)
	{
	System.out.println("Both Numbers are equal");
	
    }
	else
	{
		System.out.println("both are not equal");
	}
}

// Unit Test = is for testing the developed program for identifing the bugs before releasing the code to customer .the written condition -
//- by the tester must cover the 100% 
  
@Test
public void comparetwonumbers_ifelse_Test()
{
	comparetwonumbers_ifelse (44,44);
	comparetwonumbers_ifelse (44,24);	
}

public void comparetwonumbers_ifelse(int a , int b)

{
	System.out.println("A value is : "+a);
	System.out.println("B value is : "+b);
	//boolean result = (a==b);
	if (a==b)
	{
	System.out.println("Both Numbers are equal");
	
    }
	else
	{
		System.out.println("both are not equal");
	}
}

//  Write a program using elseif condition for two numbers are equal addition , a>b sub , b>a multiplication

@Test
public void workwithelseif_Test()
{
	workwithelseif (4,4);
	workwithelseif (444,24);
	workwithelseif (44,55);	
}
public void workwithelseif(int a , int b)

{
	System.out.println("A value is : "+a);
	System.out.println("B value is : "+b);
	if (a==b)
	{
		int sum = a+b;
	System.out.println("Sum of two Numbers :"+sum);
	
    }
	else if (a>b)
	{
		int sub = a-b;
		System.out.println("Different of two numbers : "+sub);
	}

else if (a<b)
{
	int Prod = a*b;
	System.out.println("prod of two numbers : "+Prod);
}
}

//WRITING A PROGRAM IF BOTH THE INPURTS ARE GRATER THAN 10
//Write a program using elseif condition for two numbers are equal addition , a>b sub , b>a multiplication

@Test
public void condition_Test()
{

	condition(15,15);
	condition(20,15);
	condition(15,40);
	
}
public void condition(int a , int b)
{
	System.out.println("A value is :" +a );
	System.out.println("B value is :" +b );
	if ((a>10) && (b>10))
		// NESTED IF IS SAID WHEN IF CONDITION IS WRITTEN IN THE SAME LOOP WITH IF CONDITION
	{
		if (a==b)
		{
			int sum = a+b;
		System.out.println("Sum of two Numbers :"+sum);
		
	    }
		else if (a>b)
		{
			int sub = a-b;
			System.out.println("Different of two numbers : "+sub);
		}

	else if (a<b)
	{
		int Prod = a*b;
		System.out.println("prod of two numbers : "+Prod);
	}
	else
	{
		System.out.println("Both Numbers may be below 10");
	}
	}
}
}