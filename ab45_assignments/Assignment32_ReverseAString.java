package ab45_assignments;

//Assignment 32- Write a program to reverse String	ex-school

public class Assignment32_ReverseAString 
{	
	public static void main(String[] args) 
	{		
		String str = "school";
		System.out.println("Original String : "+ str);		
		String rev = "";		
		int length = str.length();
		
		for(int i = length-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println("reversed String: "+ rev);		
	}

}
