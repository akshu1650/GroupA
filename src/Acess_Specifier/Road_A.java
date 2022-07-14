package Acess_Specifier;

public class Road_A {

	public static void main(String[] args) {
	
	Road_A RA=new Road_A();
	RA.Junona();		// calling private non static method within the class
	RA.pombhurna();		// calling default method remains within the package
	RA.PawaniWansadi();	// calling protected method remain within the package but that class which presnt outside the package can acess it by one condition i.e inheritance operation
	RA.PadoliRajura();	// calling public method remains throughout the project
	

	}
	private void Junona()
	{
		System.out.println("Road A denote Junona");
	}
	
	void pombhurna()
	{
		System.out.println("Road B denote Pombhurna");
	}
	
	protected void PawaniWansadi()
	{
		System.out.println("Road C denote PawaniWansadi");
	}
	
	public void PadoliRajura()
	{
		System.out.println("Road D denote PadoliRajura");
	}
	
	
}
