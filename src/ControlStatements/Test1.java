package ControlStatements;

public class Test1 {

	public static void main(String[] args) {
		
		int marks=800;
		
		if (marks>=60 & marks<100)
		{
			System.out.println(" you are dist");
		}

		else if(marks>=50 & marks<60)
		{
			System.out.println("you are 1st class");
		}
	
		else if(marks>=40 & marks<50)
		{
			System.out.println("you are pass");
		}
	
		else if(marks>80)
		{
			System.out.println("Invalid range marks please enter valid 0-100");
		}
	
		else 
		{
			System.out.println("you are fail");
		}
	}

}
