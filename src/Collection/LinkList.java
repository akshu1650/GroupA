package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList<>();
		
		ll.add("Akshay");
		ll.add(1992);
		ll.add('A');
		ll.add(null);
		ll.add(14.05);
		ll.add(true);
		ll.add(null);
	
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(14.05));
		System.out.println(ll.peek());//only retrieve the element from the head
		System.out.println(ll);
		System.out.println(ll.poll());//retrieve the first element & remove it
		System.out.println(ll);
		System.out.println(ll.peekFirst());
		System.out.println(ll); 
		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println(ll.pop());//retrieve the first element & remove it
		System.out.println(ll);
		System.out.println("==========================");
		
		//For loop
		for(int i=0; i<=ll.size()-1; i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("==========================");
		
		// for each
	
		for(Object l:ll)
		{
			System.out.println(l);
		}
		
		System.out.println("==========================");
		
		//iterator
		
		Iterator it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("==========================");
	
		//List iterator
		ListIterator lit = ll.listIterator();
		while(it.hasNext())
		{
		System.out.println(lit.next());
		}
		System.out.println("==========================");
			
		while(lit.hasPrevious())
		{
		System.out.println(lit.previous());
		}
		System.out.println("==========================");
			
		//enumeration not possible in linkedlist
	
	
	
	
	
	
	
	
	
	
	}

}
