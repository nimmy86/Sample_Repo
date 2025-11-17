package inheritence;

public class HierarchialChild2 extends HierarchialParent
 {
	public void display2()
	{
		System.out.println("This is a method from child 2");
	}

	public static void main(String[] args) {
		
		HierarchialChild2 obj2 = new HierarchialChild2();
		obj2.display();
		obj2.display2();
		

	}

}
