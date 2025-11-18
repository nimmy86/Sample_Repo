package superkeyword;

public class SuperChildConstructor extends SuperConstructorParent
{

	public SuperChildConstructor() {
		
		super(6, 2);
		System.out.println("This is a default construtor");
		
	}

	public static void main(String[] args) {
		SuperChildConstructor obj = new SuperChildConstructor();
	}

}
