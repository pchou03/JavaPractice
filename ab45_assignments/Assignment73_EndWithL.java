package ab45_assignments;

//Assignment 73: WAP - check in given string ends with 'l'

public class Assignment73_EndWithL {

	public static void main(String[] args) {
		
		String a= "School";	
		boolean b2 = a.matches("(.*)l");		
		System.out.println(a + " String ends l: " +b2);
		
		//or
		
		// Check if the string ends with 'l'
        if (a.endsWith("l")) {
            System.out.println("The string ends with 'l'.");
        } else {
            System.out.println("The string does not end with 'l'.");
        }

	}

}
