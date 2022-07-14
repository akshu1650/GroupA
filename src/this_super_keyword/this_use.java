package this_super_keyword;

public class this_use {

	int a=10; // non static global variable
	//int b=20 then we have only one b variable so confusion not takes place it will print b=20 
	public static void main(String[] args) {
		
		this_use tu=new this_use(); // created object of class
		tu.test();						
	}
		
		
	public void test()
	
	{
	int a=100; // non static local variable
	
		System.out.println("local variable is a "+a);
		System.out.println("global variable is a "+this.a);

	
		// why we are using this keyword?
		// whenever non static two variable name declare local & global is same to remove confusion we are using this keyword
		
		// how you perform global variable acess
		// if we want acess global varaible then no need to create object in main method
		// we can create using this keyword & varibale i.e (this.a) in method not in main method

	int add1=1+a; // a is value of local value
		System.out.println("value of add1 is "+add1);
			
		// I want to use global value of a
	int add2=1+this.a;
		System.out.println("value of add2 is "+add2);
					
		}
		
}
