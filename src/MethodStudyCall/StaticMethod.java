package MethodStudyCall;

public class StaticMethod {

	public static void main(String[] args) 
	{
		
		sample();// calling static method from same class-->methodname();
		
		test();// calling static method from same class-->methodname();
		
		StaticStudy.mymethod();//calling static method from anotherclass-->staticstudy.mymethod();
		
		StaticStudy.display();//calling static method from anotherclass-->staticstudy.display();
		
	}	
		 
		
	public static void sample()//regular method
	
	{
		System.out.println("Hi iam regular static sample method");	
	}
	
	public static void test()//regular method
	
	{
		System.out.println("Hi iam regular static test method");
	}

}