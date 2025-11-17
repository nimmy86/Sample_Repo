package inheritence;

public class HierarchialChild1 extends HierarchialParent
{
	public void display1()
	{
		System.out.println("This is the method from child 1");
	}
	public static void main(String[] args) 
	{
		HierarchialChild1 ob1 = new HierarchialChild1();
		ob1.display();
		ob1.display1();
	}

}
