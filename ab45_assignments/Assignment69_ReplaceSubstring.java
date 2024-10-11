package ab45_assignments;

//Assignment 69: WAP - In "Manish Tiwari" replace 'Tiwari' with 'Kumar'

public class Assignment69_ReplaceSubstring
{
	    public static void main(String[] args) 
	    {
	        
	        // Original string
	        String name = "Manish Tiwari";
	        System.out.println("Original Name: "+name);
	        
	        // Replace "Tiwari" with "Kumar"
	        String updatedName = name.replaceAll("Tiwari", "Kumar"); //we can use-> name.replace("Tiwari", "Kumar");
	        System.out.println("Updated name: " + updatedName);
	    }
}
