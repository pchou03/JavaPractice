package ab45_assignments;

//Assignment 71: WAP - In  given string remove all the numeric values used

public class Assignment71_RemoveNumbers 
{
	    public static void main(String[] args) 
	    {
	        
	        // Original string
	        String input = "Manish123@Tiwari456!";
	        System.out.println("Original input: "+input);
	        
	        // Remove all numeric characters (0-9)
	        String result = input.replaceAll("[0-9]", "");
	        System.out.println("String after removing numeric values: " + result);
	    }
}
