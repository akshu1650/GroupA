package LogicalPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// Prime number--> which is not divisible by any number
		//20-->1&20--> 2---19
		int num=19;
		int count=0;
		
		for(int i=2; i<num; i++)//20-->2,4,5
		{
			if(num%i==0)
			{
				count++;
				break;
			} 
		}

		if(count==1) // maximum count-1 --> 1 no is divisible then its not prime number
		{
			System.out.println("Given Number "+num+" is not a prime number");
		}
		else
		{
			System.out.println("Given Number "+num+" is a prime number");
		}
	
	}

}
