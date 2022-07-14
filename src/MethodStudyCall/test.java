package MethodStudyCall;

public class test {

	public static void main(String[] args) 
	{
		//calling method from same class
		
		test p=new test();// create object from same class
		p.addition();//calling non static regular method from same class
		sub();// calling static regular method from same class
		
		//calling mehtod from another class
		
		test1 t1=new test1();// created object from another class
		t1.mul();// calling non static regular method from another class
		test1.div(); //calling static method from another class 
		
				
		

	}

	public void addition()// non static regular method from same class
	{
		int a=200;
		int b=300;
		int sum=a+b;
		System.out.println("addition is "+sum);
	}

	public static void sub()// static regular method from same class
	{
		int r=500;
		int b=600;
		int subs=r-b;
		System.out.println("sub is "+subs);
	}





}


