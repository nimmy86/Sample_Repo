package exception_handling;

public class Example {

	public static void main(String[] args) {
		int a = 20;
		int b = 0; 
		
		try {
		int c = a/b;
		System.out.println(c);
		}

		catch (ArithmeticException e)
		{
			System.out.println(e);
		} 
		finally 
		{
			b = 2;
			int d = a/b;
			System.out.println(d);
		}

	}

}
