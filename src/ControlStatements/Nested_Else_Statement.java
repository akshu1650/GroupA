package ControlStatements;

public class Nested_Else_Statement {

	public static void main(String[] args) {
		
		//if UN is valid--> then enter PWD
		//if PWD is valid--> then login sucees
		//else PWD is invalid--> enter correct PWD
		//else UN is invalid-->enter correct UN
		
		String UN="Akshu";
		String PWD="Akshu165";
		
		if(UN=="Akshu")// outer loop
		{
			System.out.println("enter PWD");// here we are checking only PWD is dependent on UN i.e if & else then else if statement does not come
		
		if(PWD=="Akshu1650")// inner loop
		{
			System.out.println("login sucess");
		}
	
		else
		{
			System.out.println("enter correct PWD");
		}
	}
		else
		{
			System.out.println("enter correct UN");
		}
		
	}
	
	

}
