package this_super_keyword;

public class Super_use extends A {

	int p=300; // non static global variable from super use class
	
	public static void main(String[] args) {
		
		Super_use su=new Super_use();
		su.test();
	}

	
	public void test()
	{
		int p=10; // local variable
		System.out.println("local value of p is "+p);
		System.out.println("global value of p from same class is "+this.p);
		System.out.println("global value of p from super class  is "+super.p);
		
	}
}
 