package LogicalPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int orgNum=123;
		int revNum=0;
		
//		System.out.println(orgNum/10);
//		System.out.println(orgNum%10);
//		System.out.println(12%10);
//		System.out.println(1%10);
		
		for(int i=orgNum; i>0; i=i/10)//3,2,1
		{
			int rem= i%10;
			revNum=revNum*10+rem;
			//3=0+3
			//32=3*10+2
			//321=32*10+1
		}
		System.out.println("Orginal Number is "+orgNum);
		System.out.println("Reverse Number is "+revNum);
	
	}

}
