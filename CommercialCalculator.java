package myInterface;

public class CommercialCalculator implements ArithematicOperation
{
	public void displayLogo()
	{
		System.out.println("Welcome to Casio Commercial");
	}


	@Override
	public int addition(int a, int b) 
	{
		// TODO Auto-generated method stub
		System.out.println("Arithematic Operation form Commercial Calculator");
		return a+b;
	}

	@Override
	public int subraction(int a, int b) 
	{
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int Multiplication(int a, int b) 
	{
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int Division(int a, int b) 
	{
		// TODO Auto-generated method stub
		return a/b;
	}

}
