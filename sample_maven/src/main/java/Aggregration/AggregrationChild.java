package Aggregration;

public class AggregrationChild {
	
String city; 
String state;
AggregrationParent ref;	
public AggregrationChild(String city, String state, AggregrationParent ref)
{
this.city = city; 
this.state = state;
this.ref = ref;

}
public void display()
{
	
	System.out.println(ref.name + " " +ref.rollnumber + " " +ref.address +" " +city +" " +state);
	}

	public static void main(String[] args) 
	
	{
		AggregrationParent obj = new AggregrationParent("Nimmy", 10, "Kate Dale");
		AggregrationChild obj1 = new AggregrationChild("Trivandrum", "Kerala", obj);
		obj1.display();
		
	}

}
