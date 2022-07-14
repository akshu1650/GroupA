package polymorphism;


public class Run_time_polymorphism {

	public static void main(String[] args) {
	
		Bank_A ba=new Bank_A();
		Bank_B bb=new Bank_B();
		
		ba.SBI();
		bb.SBI();
	  //bb.SBI(); based on object creation we can rebinding

	}

}
