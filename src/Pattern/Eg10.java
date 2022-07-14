package Pattern;

public class Eg10 {

	public static void main(String[] args) {
		// * * * * * *
		//  * * * * *
		//   * * * *
		//    * * *
		//     * *
		//      *
		//	row=6 col-11 star-6 space-0
	
			int star=6;
			int space=0;
			for(int i=1; i<=6; i++)
			{
				
				for(int j=1; j<=space; j++)
				{
					System.out.print(" ");
				}
				for(int j=1; j<=star; j++)
				{
					System.out.print("* ");
				}
				
				System.out.println();
				star--;
				space++;
			
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
