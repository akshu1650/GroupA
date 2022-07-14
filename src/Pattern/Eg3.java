package Pattern;

public class Eg3 {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
	
		// row-5 col-5 star-1
		
		int star=1;
		
		for(int i=1; i<=5; i++) // outer loop for row
		{
			for(int j=1; j<=star; j++)// this inner loop only for one star at top row
			{
				System.out.print("*");
			}
		
		System.out.println();
		star++;
		}
	
	
	
	
	
	
	
	
	
	
	}

}
