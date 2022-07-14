package HomeWork;

public class IndianPremierLeage {

	public static void main(String[] args) 
	{
		
		IndianPremierLeage ipl=new IndianPremierLeage(); // create object from same class
		ipl.playerinfo();// calling non static regular method--> without parameter
		ipl.playerinfo1("rohit sharma", 36, "right handed batting", "batting", 1, 1.75f);//calling non static regular method with parameter
		ipl.playerinfo1("ms dhoni", 40, "right hand", "wicket keeper", 1, 1.80f);//calling non static regular method with parameter
		
	}

	public void playerinfo()// non static regular method--> without parameter
	
	//Name; age; Batting; type; rank; height; 
	{
		String name="Virat kohli";
		int age=33;
		String batting="Right handed";
		String type="Batting";
		int rank=1;
		float height=1.75f;
		
		
		System.out.println("-----------------------");
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		System.out.println("My batting is "+batting);
		System.out.println("My type is "+type);
		System.out.println("My rank is "+rank);
		System.out.println("My height is "+height);
		System.out.println("------------------------");
	}
	
	public void playerinfo1(String name, int age, String batting, String type, int rank, float height) // non static regular method-->with parameter
	
	{
		System.out.println("-----------------------");
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		System.out.println("My batting is "+batting);
		System.out.println("My type is "+type);
		System.out.println("My rank is "+rank);
		System.out.println("My height is "+height);
		System.out.println("------------------------");
	}


}
