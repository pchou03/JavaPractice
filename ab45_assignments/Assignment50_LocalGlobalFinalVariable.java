package ab45_assignments;

//Assignment 50: WAP which has Local, Global and Final variables in it. Print all variables value

public class Assignment50_LocalGlobalFinalVariable {

	    // Global variable (Instance variable)
	    int globalVar = 10;

	    // Final variable (constant)
	    final double PI = 3.14159;

	    // Method demonstrating local and global variables
	    public void displayVariables() {
	        // Local variable
	        int localVar = 20;

	        // Printing the values of local, global, and final variables
	        System.out.println("Local Variable: " + localVar);
	        System.out.println("Global Variable: " + globalVar);
	        System.out.println("Final Variable (PI): " + PI);
	    }

	    public static void main(String[] args) {
	        
	    	
	    	Assignment50_LocalGlobalFinalVariable obj = new Assignment50_LocalGlobalFinalVariable();

	    	System.out.println("\nBefore changing the global variable:");
	    	obj.displayVariables();
	    	
	    	// Changing the value of the global variable
	        obj.globalVar = 50;
	        System.out.println("\nAfter changing the global variable:");
	        obj.displayVariables();
	    	
	        
	    }
	

}
