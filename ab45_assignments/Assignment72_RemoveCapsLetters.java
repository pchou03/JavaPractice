package ab45_assignments;

//Assignment 72: WAP - In  given string remove all the capital letters

public class Assignment72_RemoveCapsLetters {
	
	public static void main(String[] args) 
    {
        // Original string
        String input = "PRASHANTchougale";
        System.out.println("Original input: "+input);
        
        // Remove all alphabets (both lowercase and uppercase)
        String removeUppercase = input.replaceAll("[A-Z]", "");
        System.out.println("String after removing upperCase alphabets: " + removeUppercase);
    }

}
