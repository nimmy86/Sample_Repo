package encapsulation;

public class Encap1 
{
private String name; 
private int age;
//setter method 

public void setter(String name, int age)
{
	this.name=name; 
	this.age=age;
}
public void getter()
{
	System.out.println("Name and Age are: " +name +" " +age);
}
}
