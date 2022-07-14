package Casting_Study;

public class Explicit_class {

//	Converting higher data type info into lower data type info is called explicit casting. 
//	Explicit casting is also called narrowing casting, where memory size goes on decreasing.
//	In explicit casting data loss takes place.
	

	public static void main(String[] args) {
		
		double a=99.99;
		System.out.println(a);
		
		int b=(int) a;
		System.out.println(b);

	}

}
