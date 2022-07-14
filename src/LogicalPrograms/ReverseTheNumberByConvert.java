package LogicalPrograms;

public class ReverseTheNumberByConvert {

	public static void main(String[] args) {
		
		int Orgnum=1234; // Convert the number to string to number
		String OrgString = Integer.toString(Orgnum);
		String RevString = "";
	
		for(int i=OrgString.length()-1; i>=0; i--)
		{
			RevString=RevString+OrgString.charAt(i);
		}
	
		int revNum = Integer.parseInt(RevString);
		System.out.println("Orginal number is "+Orgnum);
		System.out.println("Reverse number is "+revNum);
	}

}
