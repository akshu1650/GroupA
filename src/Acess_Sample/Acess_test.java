package Acess_Sample;

import Acess_Specifier.Road_A; // we are importing from 1st package information

public class Acess_test extends Road_A {

	public static void main(String[] args) {
		
		Road_A RA=new Road_A(); 
		RA.PadoliRajura(); // calling public method visible throughtout the project

		Acess_test at=new Acess_test();
		at.PawaniWansadi(); // calling protected method in another class by using inheritance
		at.PadoliRajura();	// calling public method visible throughout the project
	}

}
