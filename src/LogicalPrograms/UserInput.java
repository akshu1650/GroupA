package LogicalPrograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);// u have to take system in to print the value of a
										// or user kadna input ghyacha
		
		System.out.println("Enter value of a");
		int a = sc.nextInt();// which method you want that u can use like int,string,boolean,chara
							// next mady yenar int,string or boolean
		
		System.out.println("Enter value of b");
		int b = sc.nextInt();// you want b value which is user wants so stored in ref variable 
		
		int sum=a+b;
		System.out.println("Sum of value is "+sum);
	// if you want take input from user the you want to use (system.in)
	
	}

}
