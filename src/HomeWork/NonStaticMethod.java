package HomeWork;

public class NonStaticMethod {

	public static void main(String[] args)
	{
		NonStaticMethod nsm=new NonStaticMethod();// create object from same class
		nsm.Employeeinfo();// calling non static method from same class
		
		AnotherClass ac=new AnotherClass();// created object from another class
		ac.Methodology();// calling non static regular method from another class

	}

	public void Employeeinfo()// Non static regular method from same class
	
	{
		String name="Akshay";
		String designation="Quality Engineer";
		char grade='A';
		
		System.out.println("my name is "+name);
		System.out.println("my designation is "+designation);
		System.out.println("my grade is "+grade);
		
	}
}