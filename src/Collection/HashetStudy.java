package Collection;

import java.util.HashSet;

public class HashetStudy {

	public static void main(String[] args) {
		
		HashSet h=new HashSet<>();

		h.add("Akshay");
		h.add("Akshay");
		h.add(null);
		h.add(null);
		h.add(123);
		h.add(14.05);
		h.add(true);
		h.add('A');
		
	
	
		System.out.println(h);// doesnt allow duplicate,only 1null value,order insertion random
		System.out.println(h.size());
		System.out.println(h.contains('A'));
		System.out.println(h.isEmpty());
		System.out.println(h.clone());
		System.out.println(h.remove(123));
		System.out.println(h);
		System.out.println("===============");
	
		// for loop 
//		for(int i=0; i<=h.size()-1; i++)
//		{
//			System.out.println(h.get(i));
//		}
//		System.out.println("===============");
//		
//		// for each loop
//		for(Object as.h)
//		{
//			System.out.println(as);
//		}
//		System.out.println("===============");
//		
//		// iterator
//		Object it = h.iterator;
		
		// by specfic method also we run
		
		HashSet<Integer> ai=new HashSet<>();
		ai.add(20);
		ai.add(15);
		ai.add(10);
		System.out.println(ai);
		
	}

}
