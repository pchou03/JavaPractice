package ab45_assignments;

//Assignment 76: WAP - check if the given string is having exact 4 letters

public class Assignment76_CheckStringSize {

	public static void main(String[] args) {
		String a= "word";	
		boolean b2 = a.matches("....");		
		System.out.println("String '"+a+"' have only 4 words : " +b2);

		System.out.println("-----------------------------------");

		//or 
		
        if (a.length() == 4) {
            System.out.println("The string has exactly 4 letters.");
        } else {
            System.out.println("The string does not have exactly 4 letters.");
        }
	}

}
