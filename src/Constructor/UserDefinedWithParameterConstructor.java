package Constructor;

public class UserDefinedWithParameterConstructor {

	int p;//variable declaration
	int q;//variable declaration
	int r;//variable declaration
	
	public UserDefinedWithParameterConstructor()// user defined without parameter constructor
	{
	
	p=100;//initialize data member/variable
	q=200;//initialize data member/variable
	r=300;//initialize data member/variable
	
	}
	
	public UserDefinedWithParameterConstructor(int x) // user defined constructor with one parameter
	{
	
	p=x;
	
	}
	
	public UserDefinedWithParameterConstructor(int x, int y)// user defined with two parameter
	{
	
	p=x;
	q=y;
			
	}
	
	public UserDefinedWithParameterConstructor(int x, int y, int z)
	{
		
	p=x;
	q=y;
	r=z;
	
	}
	
	public static void main(String[] args)
	{
	UserDefinedWithParameterConstructor udc=new UserDefinedWithParameterConstructor();
	udc.addition();// calling method without parameter
	
	UserDefinedWithParameterConstructor udc1=new UserDefinedWithParameterConstructor(700);
	udc1.addition();
	
	UserDefinedWithParameterConstructor udc2=new UserDefinedWithParameterConstructor(700,800);
	udc2.addition();
	
	UserDefinedWithParameterConstructor udc3=new UserDefinedWithParameterConstructor(700,800,900);
	udc3.addition();

	}

	public void addition()// method without parameter
	{

	int sum=p+q+r;
	System.out.println("addition is "+sum);
	
	}
	
}