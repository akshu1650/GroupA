package Collection;

import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet<>();
		
		lhs.add("Anuj");
		lhs.add("Anuj");
		lhs.add(null);
		lhs.add(null);
		lhs.add(1650);
		lhs.add(16.5);
		lhs.add(true);
		lhs.add('C');
		
		System.out.println(lhs);
		
		// do all methods by your own
		// for loop
		for(int i=0; i<=lhs.size()-1; i++)
		{
			System.out.println(lhs.get(i));
		}
		// for each loop
		
		for(Object a:lhs);
		{
		System.out.println(a);
		}
		// for iterator
		

	}

}
