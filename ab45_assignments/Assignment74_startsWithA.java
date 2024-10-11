package ab45_assignments;

//Assignment 74: WAP - check in given string starts with 'A'

public class Assignment74_startsWithA {

	public static void main(String[] args) {
		String a= "Akshay";	
		boolean b2 = a.matches("A(*.)");		
		System.out.println(a + " String Start with A: " +b2);
		
		//or
		
		// Check if the string starts with 'A'
        if (a.startsWith("A")) {
            System.out.println("The string starts with 'A'.");
        } else {
            System.out.println("The string does not start with 'A'.");
        }

	}

}
