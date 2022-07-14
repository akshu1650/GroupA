package Generalization;

public class generalization {

	public static void main(String[] args) {
		Axis a=new Axis();
		SBI s=new SBI();
		
		a.loan();
		a.withdraw();
		a.deposite();
		
		System.out.println("===================");
		
		s.loan();
		s.withdraw();
		s.deposite();
		
		

	}

}
