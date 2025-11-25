package interface_package;

public class InterfaceClass implements Interface1
{

	@Override
	public void display() 
	{
		System.out.println("Display Method");
	}

	@Override
	public void print() {
		System.out.println("Print Method");
		
	}
public static void main(String[] args) {
	
	InterfaceClass obj = new InterfaceClass();
	obj.print();
	obj.display();
	
}
}
