package Inheritance;

public class Single_level_inheritance {

	public static void main(String[] args) {
		
		Mother m= new Mother();// calling non static method mother object from mother proporties
		m.love(); // object.methodname
		m.nature();
		
		Mother.hardworking();// calling static method mother object ''''
		
		System.out.println("=============");
		
		Son s= new Son();// calling object from son proporties
		s.bike();
		s.bullet();
		
		Son.car();
		
		System.out.println("=============");
		
		s.love();// calling object son from mother proporties
		s.nature();
		
		Son.hardworking();

		System.out.println("=============");
	}

		




}
