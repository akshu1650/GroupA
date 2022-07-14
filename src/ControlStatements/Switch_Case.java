package ControlStatements;

public class Switch_Case {

	public static void main(String[] args) {
	
		//2015--> welcome to the 1st year RAK project company
		//2016--> welcome to the 2nd year ananya project company
		//2017--> welcome to the 3rd year tecnovision company 
		
		int year=2016;
		
		switch (year) // here key is reference or choice
		{
		case 2015:System.out.println(" welcome to 1st year RAK");
		break;// break is to stop after 1st print
		
		case 2016:System.out.println(" welcome to 2nd year AEPL");
		break;
		
		case 2017:System.out.println(" welcome to 3rd year TVC");
		break;
		
		default:System.out.println("enter your current company within 2015-2017");// if user created 3 cases default gives the print statement for the 4th cases which will be shows in default
		break;
		}
		// In else if statement we are checking step by step condition & in switch we are direct jump on cases
	}

}
