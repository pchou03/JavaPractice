package ab45_assignments;

///Assignment 94: WAP - of IIB

public class Assignment95_InstanceBlock_IIB {
	
	/*Key Points:
	1. IIB is used to initialize instance variables.
	2. The block is executed each time when object created.
	3. IIB is executed before the constructor code.
	*/
	    
	// Instance variables
    private String name;
    private int age;

    // Instance initialization block (IIB)
    {
        System.out.println("Instance Initialization Block (IIB) is executed.");
        name = "Prashant Chougale";   // Initializing instance variable
        age = 28;            // Initializing instance variable
    }

    // Constructor
    public Assignment95_InstanceBlock_IIB() {
        System.out.println("Constructor is executed.");
    }

    // Method 
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) 
    {
    	
    	System.out.println("main executed");
    	
        // Creating the first object
    	Assignment95_InstanceBlock_IIB obj1 = new Assignment95_InstanceBlock_IIB();
        obj1.displayDetails();

        System.out.println();

        // Creating the second object
        Assignment95_InstanceBlock_IIB obj2 = new Assignment95_InstanceBlock_IIB();
        obj2.displayDetails();
    }

}
