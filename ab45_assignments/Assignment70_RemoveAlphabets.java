package ab45_assignments;

//Assignment 70: WAP - In  given string remove all the alphbates used

public class Assignment70_RemoveAlphabets 
{
	    public static void main(String[] args) 
	    {
	        // Original string
	        String input = "Manish123@Tiwari456!";
	        System.out.println("Original input: "+input);
	        
	        // Remove all alphabets (both lowercase and uppercase)
	        String removeLowers = input.replaceAll("[a-z]", "");
	        String removeUppercase = input.replaceAll("[A-Z]", "");
	        String RemoveBoth = input.replaceAll("[a-zA-Z]", "");
	        
	        // Print the result
	        System.out.println("String after removing lowerCase alphabets: " + removeLowers);
	        System.out.println("String after removing upperCase alphabets: " + removeUppercase);
	        System.out.println("String after removing both alphabets: " + RemoveBoth);
	    }
	}

