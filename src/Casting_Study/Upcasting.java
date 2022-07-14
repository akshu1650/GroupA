package Casting_Study;

public class Upcasting {

	public static void main(String[] args) {
		
		Father f =new Father();
		f.car();
		f.bike();
		
		System.out.println("=======");
		
		Son s =new Son();
		s.car();
		s.bike();
		s.education();
		
		System.out.println("=======");
		
		Father f1 = new Son();//upcasting 
							  //creating object of subclass & giving superclass reference
		f1.car();
		f1.bike();
		//f1. education();		
		

	}

}
