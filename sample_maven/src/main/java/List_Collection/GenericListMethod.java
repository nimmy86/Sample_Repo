package List_Collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethod {

	public static void main(String[] args) {
		
		List <String> s = new ArrayList<String> ();
		s.add("Apple");
		s.add("Orange");
		s.add("Kiwi");
		s.add("Mango");
		System.out.println(s);
		System.out.println(s.get(0));
		System.out.println(s.set(1, "Banana"));
		System.out.println(s);
		System.out.println(s.indexOf("Kiwi"));
		s.set(3, "Banana");
		System.out.println(s);
		System.out.println(s.lastIndexOf("Banana"));



			
				

	}

}
