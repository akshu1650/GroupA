package Array;

public class String_Array {

	public static void main(String[] args) {
		
		String name[]=new String[6];
		
		name[0]="Akshay";
		name[1]="Ajinkya";
		name[2]="Priya";
		
		System.out.println(name[2]); // string default value--> NULL
									// int default value--> 0
	
		for(int a=0; a<=name.length-1; a++)
		{
			System.out.println(name[a]);
		}
		
		// I want to print float & bolean type
	}

}
