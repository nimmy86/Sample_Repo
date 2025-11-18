package polymorphism;

public class PolyChild extends Polyparent {
	
	public void display (int a, int b)
	{
	super.display(50,50);
	int c = a-b;
	System.out.println("Difference " +c);
	}

	

	
	public static void main(String[] args) {
		
		PolyChild obj = new PolyChild();
		obj.display(60, 20);
		
		
		
	}

}
