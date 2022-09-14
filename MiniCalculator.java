package myInterface;

//                    subclass(childclass)                superclass(parent class)
public class MiniCalculator implements ArithematicOperation
{
	public void displayLogo()
	{
		System.out.println("Welcome to Casio Mini");
	}

	@Override
	public int addition(int a, int b) 
	{
		int sum=a+b;
		return sum;
	}

	@Override
	public int subraction(int a, int b) {
		// TODO Auto-generated method stub
		int sub=a-b;
		return sub;
	}

	@Override
	public int Multiplication(int a, int b) {
		// TODO Auto-generated method stub
		int Mul=a*b;
		return Mul;
	}

	@Override
	public int Division(int a, int b) {
		// TODO Auto-generated method stub
		int Div=a/b;
		return Div;
	}

}
