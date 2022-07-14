package Abstract_Class;

public class CC extends Sample{

	public static void main(String[] args) {
	
		CC c=new CC();// created object of class
		c.test();// method from sample
		c.test1();// method from CC
		c.demo();// own method from CC
		
	}


	@Override
	public void test1() {
	{
			System.out.println("This method is complete in concrete class");	
	}
	
	}
	
	public void demo()
	{
		System.out.println("method from CC");
	}





}
