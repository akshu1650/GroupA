package Inheritance;

public class Hierrachical_Inheritance {

	public static void main(String[] args) {
		
		Stepmother_Mother sm= new Stepmother_Mother();
		sm.cruelness();
		
		System.out.println("=============");
		
		
		Child1 c1= new Child1();
		c1.cruelness();
		c1.innocent();
		
		System.out.println("=============");
		
		
		Child2 c2= new Child2();
		c2.cruelness();
		c2.smart();
		
		System.out.println("=============");
		
		
	}

}
