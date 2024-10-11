package ab45_assignments;

//Assignment 75: WAP - check in given string has letter 'a' in it

public class Assignment75_CheckLetter_A_PresenOrNot {

	public static void main(String[] args) {
		String a= "aks";	
		boolean b2 = a.matches("(.*)a(.*)");		
		System.out.println("In String '"+a+"' char 'a' present: " +b2);

		System.out.println("-----------------------------------");
		//or 		
		
		// Check if the string contains the letter 'a'
        if (a.contains("a")) {
            System.out.println("The string contains the letter 'a'.");
        } else {
            System.out.println("The string does not contain the letter 'a'.");
        }
	}

}
