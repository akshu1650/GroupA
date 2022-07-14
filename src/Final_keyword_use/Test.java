package Final_keyword_use;

public class Test { // if we write final class then we cant extend super class to sub class

	int a=100;
	final int b=10;
	
	
	public static void main(String[] args) {
	
		Test t=new Test();
		t.add();
				

	}

	public final void add()
	{
		a=a+10;
		System.out.println(a);
		
		//b=b+20; //we cant update value of final variable
	}

	



}
