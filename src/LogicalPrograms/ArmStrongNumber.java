package LogicalPrograms;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		//123--> 1^3+2^3+3^3=3+8+27=36--> Not ArmStrongNumber
		//153--> 1^3+5^3+3^3=3+125+27=153--> ArmStrongNumber
		
		int num=153;
		int num1=0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem = i%10;
			num1=num1+(rem*rem*rem);
		}
		if(num1==num1)
		{
			System.out.println("Given Number "+num+" is Armstrongnumber");
		}
		else
		{
			System.out.println("Given Number "+num+" is not Armstrongnumber");
		}
	}

}
