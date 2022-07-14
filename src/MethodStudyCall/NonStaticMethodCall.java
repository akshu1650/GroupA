package MethodStudyCall;

public class NonStaticMethodCall {

	public static void main(String[] args) 
	{
		//object creation should be done in main method
		//syntax for object creation
		//classname objectname = new classname();
		
		NonStaticMethodCall nsm=new NonStaticMethodCall();// created object of class
		//after creating object--> call non static method
		//syntax to call non static method--> objectname.methodname();
		
		nsm.Mymethod(); //calling non static regular method
		nsm.test();//calling non-static regular method from same class
		
		// how to call non static regular method from another class
		// we need to create object of that class
		
		NonStaticSample nss = new NonStaticSample();// object created of another class
		nss.methodology();// calling non static regular method from another class
		
		
	}

	
	public void Mymethod()// Non-static regular method
	{
		System.out.println("Hi iam regular non-static method from same class");
		// to call non static regular method we need object of class
		// how to create object--> see in main method
		
	}
	
	public void test()// Non static regular method
	{
		
		System.out.println("This test is non-static method of same class");
		
	}
	
} 