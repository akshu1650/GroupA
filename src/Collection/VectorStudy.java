package Collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
		Vector v=new Vector<>();
		v.add("Pune");
		v.add('A');
		v.add("Pune");
		v.add(null);
		v.add(null);
		v.add(12);
		v.add(1.2f);
		v.add(1992);
	
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.indexOf("Pune"));
		System.out.println(v.elementAt(1));
		System.out.println(v.get(1));
		System.out.println(v.remove(1.2f));
		//System.out.println(v.add(1, "Pune"));
		System.out.println(v);
	
		System.out.println("=================");
		
		// by using for loop
		//for(o:v)
		
		// by using listitertor
		
		ListIterator a = v.listIterator();
		while (a.hasPrevious()); 
		{
		System.out.println(a.hasPrevious());	
		}
		System.out.println("=================");
		
		// by using enumeration
	
		Enumeration ve = v.elements();
		while (ve.hasMoreElements())
		{
		System.out.println(ve.nextElement());	
		}
		System.out.println("=================");
		
		// by using for loop
		for(int i=0; i<=v.size()-1; i++)
		{
			System.out.println(v.get(i));
		}
		
		
		
		
	}

}
