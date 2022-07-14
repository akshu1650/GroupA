package Generalization;

public class SBI implements RBI{

	@Override
	public void loan() {
		System.out.println("loan amount is 7.5%");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw limit is 2L");
		
	}

	@Override
	public void deposite() {
	System.out.println("Deposite amount 5L");
		
	}

}
