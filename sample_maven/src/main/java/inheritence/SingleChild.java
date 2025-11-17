package inheritence;

public class SingleChild extends SingleParent{
	
	public void print()
	{
		System.out.println("From the child class");
	}
	

	public static void main(String[] args) {
		SingleChild sc = new SingleChild();
		sc.display();
		sc.print();
	}

}
