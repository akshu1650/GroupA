package Inheritance;

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		
		Grandfather gf= new Grandfather();
		gf.experience();
		
		System.out.println("=============");

		Father f= new Father();
		f.money();
		f.experience();
		
		System.out.println("=============");
		
		Daughter d= new Daughter();
		d.experience();
		d.money();
		d.scooty();
		
		System.out.println("=============");
	}

}
