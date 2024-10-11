package ab45_assignments;

//Assignment 31 : In the given String Ex;-"My Name is Java" remove all spaces  
// involved using ReplaceAll function

public class Assignment31_RemoveSpaces 
{
	    public static void main(String[] args) 
	    {
	        // Given string
	        String input = "My Name is Java";

	        // Remove all spaces using replaceAll
	        String result = input.replaceAll("\\s", "");

	        // Print the result
	        System.out.println("String after removing spaces: " + result);
	    }
}
