package exception_handling;

public class Throw_Example {

	public static void main(String[] args) {
		
		int age = 16;
		
		if (age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException ("Not eligible");
		}

	}

}
