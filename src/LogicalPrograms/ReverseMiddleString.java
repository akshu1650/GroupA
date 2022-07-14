package LogicalPrograms;

public class ReverseMiddleString {

	public static void main(String[] args) {

		//Reverse the even position string
		
		String s="I LOVE MY INDIA"; // if space is there the use split method and stored it in ref variable
		
		String ar[] =s.split(" ");// {"I", "LOVE", "MY", "INDIA"}
								//	   0	 1		2		3
	
		for(int i=0; i<=ar.length-1; i++)// Now we have to find odd index string rev
										// then we have traverse the element
		{	//if (i%2!=0) to find even index string
			if(i%2==0)// Now iam finding Odd Index i.e if modul index = 0 -->even otherwise not=0--> odd
			{
				String s1 = ar[i];// array stored kela string mady
				ar[i]=revStr(s1);// tithla element ghetla rev kela aani tyas thikani thevla
			}
		}
			for(int i=0; i<=ar.length-1; i++)
			{
				System.out.println(ar[i]+" ");
			}
	}
	public static String revStr(String input)// to do the string in rev one static method we have to write
	{
		String rev="";
		for(int i=input.length()-1; i>=0; i--)
		{
			rev=rev+input.charAt(i);
		}
	
		return rev;
	}

}
