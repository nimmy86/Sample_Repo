package superkeyword;

public class SuperChildMethod extends SuperMethodParent {
	

public void superdisplay()
{
	
	System.out.println("This is method from Child class.");
	super.display();
}


	public static void main(String[] args) {
		SuperChildMethod obj = new SuperChildMethod();
		obj.superdisplay();
		
		
	}
}
