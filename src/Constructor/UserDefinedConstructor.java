package Constructor;

public class UserDefinedConstructor {

	int a;//variable declaration
	int b;//variable declaration
	
	
	public UserDefinedConstructor()// user defined   
	without parameter
	
	{
		//UserDefinedConstructor
		//the constructor is called when an object is created
		System.out.println("hi UserDefinedConstructor is running");
		//initialize data member/variable
		a=1000;
		b=2000;
	}
	
	public static void main(String[] args) 
	{
		UserDefinedConstructor ud=new UserDefinedConstructor();// object of class is created
		ud.add();
		ud.sub();
	}

	public void add()
	{
//	int a=10;// initialize data member/variable
//	int b=20;// initialize data member/variable
	
		int sum=a+b;
		System.out.println("addition is "+sum);
	}

	public void sub()
	{
		int sub=a-b;
		System.out.println("sub is "+sub);
	}


}








