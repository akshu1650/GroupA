package TypesOfVariable;

public class GlobalAndLocalVariable {

		// step-1
		int a=100;// global non static variable
		static int b=100;// global static variable
		
	
	public static void main(String[] args) 
	{
		// step-4
		GlobalAndLocalVariable gav=new GlobalAndLocalVariable();// create object of class
		System.out.println("value of a is "+gav.a);// calling non static global variable from same class
		System.out.println("value of b is "+b);// calling static global variable from same class 
	
		// step-6
		System.out.println("value of static global variable from another class "+Test.y);// calling static global variable from another class
	
		// step-7
		Test t=new Test();// created object of another class
		System.out.println("value of a is "+t.x);// calling non static global variable from another class
	
		// step-8
		int mul=b*gav.a;
		int div=b/(Test.y);
		int addition=gav.a+t.x;	
	
	}
	
	
	public void addition()
	{
		// step-2
		int p=100;
		int sum=p+10;// p is local variable known to addition method
		int sum1=a+100;// a is global variable known to whole class
	}

	public void sub()
	{
		// step-3
		int q=10;
		//int sub1=p=q;// p is a local variable from another method
		int sub=a-q;// a is global variable known to whole class
	}
		
	public static void div()
	{
		int div=100/a;// we cant call non static variable
	
	}

	public void mul()
	
	{
		int mul=1100*a;
		int mul1=100*b;// in non static method we can call static as well as non static variable
	}
	
	
	
	}
	
