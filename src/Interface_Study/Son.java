package Interface_Study;

public class Son implements Father, Mother{ // this is all that how to achieve multiple inheritance in interface

	public static void main(String[] args) {
	
		Son s=new Son();
		s.love();
		s.nature();
		s.money();

	}

	@Override
	public void love() {
		
		System.out.println("mother interface method completed in son class");
	}

	@Override
	public void nature() {
		
		System.out.println("father interface method completed in son class");
	}

	@Override
	public void money() {
		
		Father.super.money();
		Mother.super.money();
		
	}

}
