package coreconcepts;
//Modifiers 2types= Access & Non Access 
// Access : private(can be seen with in the class ) public default(can be used with in the package) protected 
// Non access : static final abstract

//Signature of the class : Modifier(optional) Class Name {Members}


public class Bascis 
{
		// Variables // Functions [Method]
		  // Signature of the variable : Modifier(optional) DataType Name  ;- while variable already declared
	     // Modifier(optional) DataType Name = Value ;-Assigned
		      public static    String collegename="VVIT";
		      public           int    studentnumber=488; // byte short long int
		      public           double studentmarks=75.55;
		                       boolean studentresults=true;
		                       char studentgrade='A';
	                     
	// [] - Square bracket {} - flower or curly bracket () - parenthesis
	// Signature of the Function: 
	 // Modifier(optional) ReturnType Name() { Body}
	//public  static     void       addition()
		{
		//body
		}
		// Main method format : PSVM - public static void main(String[] args)
	// *************************************************************************************************//
		// ABOVE SYNTAX ARE FOR WRITING A PROGRAM
		
	public static void main(String[] args)

	{ 
		//short cut for writing System.out.println= syso Ctrl+ spacebar
		
		 System.out.println("Hi Pesarlanka Siva nageswara Rao");
		 addition();
		 addition(48,144);
		 addition("Siva",1212081);
		 addition(4,4,2);
		 int value = addition(4,4,2,4);
		 System.out.println("Sum of a b c & d number for four imputs: "+ value);


	}
	public static void addition()
	{
	int sum= 48+ 2;
	System.out.println("Sum of two number with zero inputs: " +sum);

	}
	// public static void addition()
	{
	//int sum= 48+ 48;
	//System.out.println("Sum of two number: " +sum);

	}// IN JAVA CLASS IT WONT ALLOWS ANY DUPLICATE FUNCTION IN SAME PROGRAM

	public static void addition(int a , int b)
	{
		int sum=a+b;
	System.out.println("Sum of a & b number for two imputs: " +sum);
	}
	public static void addition(int a , int b, int c)
	{
		int sum=a+b+c;
	System.out.println("Sum of a b & c number for three imputs: "+ sum);
	}
	public static void addition(String a , double b)
	{
		String sum=a+b;
	System.out.println("Sum of a & b number for two imputs with string : " +sum);
	}
	public static int addition(int a , int b, int c , int d)
	{
		int sum=a+b+c+d;
		return sum;
		}
	// WRITING THE SAME PROGRAM WITH DIFFERENT ARGUMENTS IS CALLED METHOD OVERLOADING//
	}