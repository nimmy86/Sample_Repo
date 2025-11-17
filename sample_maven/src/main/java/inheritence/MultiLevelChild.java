package inheritence;

public class MultiLevelChild extends MultiLevelParent

{
	public void display2()
	{
		System.out.println("This is a method from Child class");
	}
	public static void main(String args[]) 
	{
		MultiLevelChild obj = new MultiLevelChild();
		obj.display();
		obj.display1();
		obj.display2();
	}

}
