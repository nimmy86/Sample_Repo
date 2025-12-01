package List_Collection;

import java.util.HashSet;
import java.util.Set;

//All methods in Generic Set
public class GenericSetMethods {

	public static void main(String[] args) 
	{
		Set<String> a = new HashSet<String> ();
		Set<String> b = new HashSet<String> ();

		a.add("Violet");
		a.add("Indigo");
		a.add("Blue");
		a.add("Green");
		System.out.println(a);
		b.add("Yellow");
		b.add("Orange");
		b.add("Red");
		a.addAll(b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.contains("Red"));
		System.out.println(a.containsAll(b));
		System.out.println(a.isEmpty());
		System.out.println(a.remove("Indigo"));
		System.out.println(a);
		a.removeAll(b);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(b.size());
		a.clear();
		System.out.println(a);


	}

}
