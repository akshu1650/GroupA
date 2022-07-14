package HomeWork;


public class MathOperation {

	public static void main(String[] args) 
	{
		
		MathOperation mo=new MathOperation();
		mo.addition();
		sub();
	}
	
	public void addition()//non static regular method from same class
	{
		int a=90;
		int b=80;
		int sum=a+b;
		System.out.println("addition is "+sum);
	}

	public static void sub()// static method from same class
	{
		int p=100;
		int q=150;
		int subs=p-q;
		System.out.println("sub is "+subs);
	}

}

	