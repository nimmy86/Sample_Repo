package superkeyword;

public class SuperVariableChild extends SuperVariableParent 
{
String color = "Red";

public void colors()
{
	System.out.println(color);
	System.out.println(super.color);
}
	public static void main(String[] args)
	{
		SuperVariableChild obj = new SuperVariableChild();
		obj.colors();

	}

}
