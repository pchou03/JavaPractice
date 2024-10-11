package ab45_assignments;

import java.util.Scanner;

// Assignmnet 36_In given String find how many are alphabets, 
//how many are special character, how many are numeric, how many are Spaces
	
public class Assignment36_VerifyStringcharacter 
{
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        // Input string
	        System.out.println("Enter a string: ");
	        String input = scanner.nextLine();

	        // Counters
	        int alphabetCount = 0;
	        int digitCount = 0;
	        int specialCount = 0;
	        int spaceCount = 0;

	        // Iterate through each character in the string
	        for (char ch : input.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                alphabetCount++;
	            } else if (Character.isDigit(ch)) {
	                digitCount++;
	            } else if (Character.isWhitespace(ch)) {
	                spaceCount++;
	            } else {
	                specialCount++;
	            }
	        }

	        // Display results
	        System.out.println("Alphabets: " + alphabetCount);
	        System.out.println("Digits: " + digitCount);
	        System.out.println("Special characters: " + specialCount);
	        System.out.println("Spaces: " + spaceCount);
	        
	        scanner.close();
	    }
}
