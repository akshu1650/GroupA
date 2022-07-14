package ControlStatements;

public class Test_3 {

	public static void main(String[] args) {
		//A B C--->you are got excellent grade
		
		char grade='A';
		
		switch (grade) 
		{
		case 'A':System.out.println("you are got excellent marks");
		break;
		
		case 'B':System.out.println("you are got good marks");
		break;
		

		default:System.out.println("Please enter value of A-D");
		break;
		}

	}

}
    