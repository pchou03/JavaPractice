package ab45_assignments;
import java.util.Scanner;

//Check if given string is palindrome or not Ex:-Malayalam
	// Palindrome String -> original & reversed String is same

public class Assignment33_PalindromeString {

	public static void main (String [] argd)
	{
	
		String str = "Malayalam";
		
		String org_str = str;
		
		int len = str.length();
		
		String rev = "";
		
		//char [] a = str.toCharArray();
		//int len   =   a.length;
		
		
		for(int i = len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
			//rev = rev + a[i];
		}
		
		
		if (org_str.equals(rev))
		{
			System.out.println(str +" is a palindrome");
		}else {
			System.out.println(str +" is not a palindrome");
		}
		
		
	}

}
