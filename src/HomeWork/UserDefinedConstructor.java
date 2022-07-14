package HomeWork;

public class UserDefinedConstructor {

	
	
		int num1;
		int num2;
		int num3;
		
		public UserDefinedConstructor()
		
	{
		num1=10;
		num2=20;
		num3=30;
		
		
			
	}
		
	public UserDefinedConstructor(int x, int y)// with two parameters
	
	{
		num1=x;
		num2=y;
		
	}
	public static void main(String[] args) 
	{
		UserDefinedConstructor udc=new UserDefinedConstructor();
		udc.sample();
		UserDefinedConstructor udc1=new UserDefinedConstructor(100,200);
		udc1.sample();
		
	}
	public void sample()
	
	{
		int sum=num1+num2+num3;
		System.out.println("summation is "+sum);
		
	
	
	}
	
}
