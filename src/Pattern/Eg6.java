package Pattern;

public class Eg6 {

	public static void main(String[] args) {
		// *****	   
		//  ****
		//   ***
		//    **
		// 	   *
		// row-5 col-5 star-5 space-4
	
		int star=5;
		int space=0;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
		for(int j=1; j<=star; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		star--;
		space++;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
