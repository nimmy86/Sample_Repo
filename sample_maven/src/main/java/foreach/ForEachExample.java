package foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) 
	{
		int a[] = {4,6,8,10}; 
		for (int i : a)
		{
			System.out.println(i);
		}
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Orange"); 
		fruits.add("Mango");
		
		for (String s : fruits)
		{
			System.out.println(s);
		}
	}

}
