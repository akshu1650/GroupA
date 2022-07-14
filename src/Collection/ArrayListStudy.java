package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		
		
		ArrayList a=new ArrayList<>();// array is implementation class implement to list class
									//it is also called 'generic array list'
									// you can insert all data type  
		//ArrayList<Integer> a=new ArrayList<>();-->'specific arraylist for integer'
		// you can insert only integer data type
		a.add("Akshay");
		a.add('A');
		a.add(123);
		a.add(123.123);
		a.add(true);
		a.add("Akshay");
		a.add(null);
		a.add(123);
		a.add(null);
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(123));
		System.out.println(a.get(1));
		System.out.println(a.indexOf(123));
		System.out.println(a.indexOf("Akshay"));
		System.out.println(a.lastIndexOf("Akshay"));
		System.out.println(a.remove(1));
		System.out.println(a);//array list
	
		System.out.println("=====================");
		
		//for loop
		for(int i=0; i<=a.size()-1; i++)
		{
			System.out.println(a.get(i));// individual elements
		}
		System.out.println("=====================");
		
		// iterator using
		
		Iterator it = a.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
		System.out.println("=====================");
		
		//list iterator
		ListIterator ltr = a.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		System.out.println("=====================");
	
		//for each loop
		
		for(Object v:a)
		{
			System.out.println(v);
		}
		System.out.println("=====================");
		
		ArrayList<Integer> ai=new ArrayList<>();
		
		ai.add(20);
		ai.add(18);
		ai.add(15);
		
		System.out.println(ai);
		
		System.out.println("=====================");
		
		for(Integer b:ai)
		{
			System.out.println(b);
		}
		
		System.out.println("=====================");
		
		ArrayList<String> as=new ArrayList<>();
		as.add("Akshay");
		as.add("Pratibha");
		as.add("Yogesh");
		
		System.out.println(as);
		
		System.out.println("=====================");
		
		for(String c:as)
		{
			System.out.println(c);
		}
	
	
	}

}
