package ControlStatements;

public class Nested {

	public static void main(String[] args) {
		
		String UN="123";
		String PWD="123";
		
		if(UN=="123")//outer loop// step-1
		{
			System.out.println("enter password");//step-2
			
		if(PWD=="123")// inner loop//step-3
		{
			System.out.println("login sucesss");//step-4
		}
	
		else// inner loop//step-5
		{
			System.out.println("invalid password");//step-6
		}
	}
		else// outer loop//step-7
		{
			System.out.println("incorrect username");//step-8
		}
		
	}
}
