package TypesOfVariable;

public class Student {

	
	String stud_name; // gobal variable declaration written outside the bracket
	float stud_height;
	int stud_class;
	char stud_section;
	String stud_school;
	
	public void stud_info()
	{
		System.out.println("===================================");// usage /print
		System.out.println("student name is "+stud_name);
		System.out.println("student height is "+stud_height);
		System.out.println("student class is "+stud_class);
		System.out.println("student section is "+stud_section);
		System.out.println("student school is "+stud_school);
		System.out.println("===================================");
		
	}
	
}
