package ab45_assignments;
import java.util.Arrays;

//Assignment 34_Find out if  given two string are  anagram of each other
//	Explanation: An anagram is a word or phrase formed by rearranging the letters of another word or phrase.

public class Assignment34_AnagramStrings { 
	
	public static boolean isAnagram(String s1, String s2) 
	{
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");
		
		if(str1.length() != str2.length())
		{
			System.out.print("is "+ "'" + s1 +" & " + s2 +"'"  + " anagram string? = ");
			return false;
		}
		else 
		{
			char [] c1 = str1.toLowerCase().toCharArray();
			char [] c2 = str2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.print("Is " +"'" + s1 +" & " + s2+"'" + " are anagram? = ");
			return Arrays.equals(c1, c2);			
		}		 
	}
	

	public static void main(String[] args) 
	{
		System.out.println(isAnagram("CAT", "act"));
		System.out.println(isAnagram("Toss", "shot"));
		System.out.println(isAnagram("Dormitory", "Dirty Room"));
		
		System.out.println(isAnagram("Prashant", "Pravin"));

	}

}
