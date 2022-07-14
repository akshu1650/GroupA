package Array;

public class Array2 {

	public static void main(String[] args) {
		
		int rollNum[]= {6,2,3,4,5,6}; // we are doing step 1 & 2 i.e declaration & initialization
		
		// Usage
		
		for(int a=0; a<=rollNum.length-1; a++)
			
		System.out.println(rollNum[a]);
		
		System.out.println("==========");
		// // how to sort given array
		// we need to use sort method
		//I Want to print sort inbuilt method
		// sort is static method--> call to static method--> classname.methodname
		
		Arrays.sort(rollNum);
		
		for(int i=0; i<=rollNum.length-1; i++)
		{
			System.out.println(rollNum[i]);
		}
			
	}

	
		
		
	}

