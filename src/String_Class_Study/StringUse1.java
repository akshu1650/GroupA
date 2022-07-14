package String_Class_Study;

public class StringUse1 {

	public static void main(String[] args) {
		
		
	String name="Velocity";// without using new keyword
	
	String city=new String("Pune");// withusing new keyword
	
	//length method use
	
	System.out.println(name.length());
	
	System.out.println("=========");
	
	System.out.println(city.length());
	
	System.out.println("=========");
	
	int Output = name.length();// storing output in reference variable
	
	System.out.println("length of string is "+Output);// we can reuse refernce variable
	
	System.out.println("=========");
	
	//Toupper case method
	
	String a="Akshay";
	
	System.out.println(a);
	
	System.out.println("=========");
	
	System.out.println(a.toUpperCase());
	
	System.out.println("=========");
	
	String b = a.toUpperCase();
	System.out.println(b);
	System.out.println(b.toUpperCase());
	System.out.println("=========");
	
	System.out.println(b.toLowerCase());// if we wnt print
	
	System.out.println("=========");
	
	String c = b.toLowerCase();
	System.out.println(c.toLowerCase());
	System.out.println(c);
	System.out.println("=========");
	
	//Equals()
	
	String a1 ="Velocity";// will compare same memory location
	String a2 ="Velocity";
	String a3 =new String("Velocity");
	String a4 =new String("Velocity");
	String a5 =new String("velocity");
	
	// will compare same memory location but it will not compare content "Velocity" that is why false 
	System.out.println(a1==a2);
	System.out.println(a3==a4);
	System.out.println(a2==a3);
	
	System.out.println("=========");
	System.out.println(a1.equals(a2));
	System.out.println(a1.equals(a3));
	System.out.println(a3.equals(a4));
	System.out.println(a2.equals(a1));
	System.out.println("=========");
	System.out.println(a2.equals(a5));// .Equals() will compare the content of strings 
	System.out.println(a2.equalsIgnoreCase(a5));
	System.out.println("=========");
	
	// Contains() method study
	
	String b1 ="Velocity";// characters required in proper sequence
	
	System.out.println(b1.contains("lo"));
	boolean result = b1.contains("lo");
	System.out.println("result is "+result);
	boolean rs = b1.contains("Vc");
	System.out.println("rs is "+rs);
	System.out.println("=========");
	
	// isempty() method study
	
	String m="Pune";
	String n="";
	String l=" ";
	String o=null;
	
	System.out.println(m.length());
	System.out.println(n.length());
	System.out.println(l.length());
	//System.out.println(o.length());
	
	System.out.println(m.isEmpty());
	System.out.println(n.isEmpty());
	System.out.println(l.isEmpty());
	//System.out.println(o.isEmpty());
	
	System.out.println(m.isBlank());
	System.out.println(n.isBlank());
	System.out.println(l.isBlank());
	//System.out.println(o.isBlank());
	System.out.println("=========");
	
	// charAt() method study
	
	String p="INDIA";
	
	System.out.println(p.charAt(2));
	System.out.println(p.charAt(0));
	char requiredChar = p.charAt(3);
	System.out.println(requiredChar);
//	System.out.println(p.charAt(-1));
//	System.out.println(p.charAt(9));
	
	}





}
