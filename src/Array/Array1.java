package Array;

public class Array1 {

	public static void main(String[] args) {
	
	// I want print A B C D E
		
	//Array declaration
		
	char grade[]=new char[5];// creating of every array grade--> object name of array, []--> array
							// if we fixed the size of 5 then boundary value of 0-4
							// if we insert boundary upto 5 then array index out of bound exception executed
							// out of bound exception--> if we create out of boundary value then you will get out of bound exception
							// String we can write two ways i.e by using new keywords 
	
	//Array initialization
	
	grade[0]='A';// creating array of grade-->pointing out member location of various maximum index i.e 0,1,2,3,4
	grade[1]='B';
	grade[2]='C';		
	grade[3]='D';	
	grade[4]='E';	
	
	// Usage
	
	System.out.println(grade[0]);
	System.out.println(grade[1]);
	System.out.println(grade[2]);
	System.out.println(grade[3]);
	System.out.println(grade[4]);
	
	System.out.println("====");
	
	for(int a=0; a<=4; a++)// size is fixed as 5 but it will end upto 4
						  //  if we say that any of the work which is fixed that is called as static coding
						  // Static coding
	{
	System.out.println(a);
	}
		
	System.out.println("====");
	
	for(int a=0; a<=grade.length-1; a++)// length basically--> method--> to call--> object name--> (grade)
									// Maximum index = length-1
									// dynamic coding value change accordingly 
	{
	System.out.println(grade[a]);
	}
	
	System.out.println("====");
	
	// I want to print revise print
	
	for(int a=grade.length-1; a>=0; a--)
	{
	System.out.println(grade[a]);
	
	
	}
	
}
}	
