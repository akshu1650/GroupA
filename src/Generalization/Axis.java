package Generalization;

public class Axis implements RBI{

	@Override
	public void loan() {
		System.out.println("loan amount is 9.5%");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw limit is 7L");
		
	}

	@Override
	public void deposite() {
		System.out.println("Deposite amount 10L");
		
	}

}
