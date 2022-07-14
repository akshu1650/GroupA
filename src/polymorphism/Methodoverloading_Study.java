package polymorphism;

public class Methodoverloading_Study {

	
	public static void main(String[] args) {
		
		Methodoverloading_Study ms=new Methodoverloading_Study();
		ms.add();// Declaring multiple methods with same method but with different arguments in same class
		ms.add(12, 12);
	
	}


	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("addition is "+sum);
	}

	public void add(int a, int b)
	{
		int sum1=a+b;
		System.out.println("addition is "+sum1);
	}








}
