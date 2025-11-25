package abstraction;

public class AbstractChild extends AbstractionParent
{

	public static void main(String[] args) {
		
		AbstractChild obj = new AbstractChild();
		obj.display();
		obj.print();

	}

	@Override
	public void display() {
		
		System.out.println("Display method from abstract class");
		
	}

	@Override
	public void print() {
		System.out.println("Print method from abstract class");
	}

}
