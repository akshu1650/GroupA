package ControlStatements;

public class ElseIfStudy {

	public static void main(String[] args) {
		//if marks >=60---> then you are dist
		//else if marks >=50 then you are 1st class
		//else if marks >=40 then you are pass
		// else you are fail
		
		int marks=4;
		
		if(marks>=60)// if condition is true only if condition will execute rest of condition is skip
		{
			System.out.println("you are dist");
		}

		else if(marks>=50)
		{
			System.out.println("you are 1st class");
		}

		else if(marks>=40)
		{
			System.out.println("you are pass");
		}
	
		else
		{
			System.out.println("you are fail");
		}
	}
}		// if we want to use multiple condition for execution  then we use else if statement