package myInterface;
 
//							Child(Subclass)								Parent 1(SuperClass 1)	Parent 2(SuperClass 2)
public class ScientificCalculator implements ArithematicOperation,TrigonametricOperations

// Multiple Inheritance = if a class able to inherit to more than one Super class (parent class) at a time is called Multiple Inheritance

{
	public void displayLogo()
	{
		System.out.println("Welcome to Casio Scientific");
	}

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Arithematic Operation form Scientific Calculator");

		return a+b;
	}

	@Override
	public int subraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int Multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int Division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public void Sinevalue() {
		// TODO Auto-generated method stub
		System.out.println("Sine Value");
		
	}

	@Override
	public void Cosinevalue() {
		// TODO Auto-generated method stub
		System.out.println("Cosine Value");

		
	}

	@Override
	public void Tanvalue() {
		// TODO Auto-generated method stub
		System.out.println("Tan Value");

		
	}


}
