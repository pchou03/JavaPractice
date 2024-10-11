package ab45_assignments;

//Assignment 96: WAP - which has SIB, IIB, Construtor and call each of them

public class Assignment96_SIB_IIB_ConstructorExample {

	/*Static block will execute first and only once
	 *Then execution will perform line by line in main method
	 *If object created then IIB will execute then constructor calling will happen
	 *No. of time you create object that many time IIB will be called
	 */
	
	
    // Static variable
    static int staticVariable;

    // Instance variables
    private String name;
    private int age;

    // Static Initialization Block (SIB)
    static 
    {
        staticVariable = 10;
        System.out.println("Static Initialization Block (SIB) executed.");
    }

    // Instance Initialization Block (IIB)
    {
        name = "Kalyani Chougale";
        age = 30;
        System.out.println("Instance Initialization Block (IIB) executed.");
    }

    // Constructor
    public Assignment96_SIB_IIB_ConstructorExample() 
    {
        System.out.println("Constructor executed.");
    }

    // Method to display object details
    public void displayDetails() {
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to run the program
    public static void main(String[] args) 
    {
        System.out.println("Creating first object...");        
        //Creating first object (which will call IIB and constructor)
        Assignment96_SIB_IIB_ConstructorExample obj1 = new Assignment96_SIB_IIB_ConstructorExample();
        obj1.displayDetails();
        
        System.out.println();

        System.out.println("Creating second object...");        
        // Creating second object (which will again call IIB and constructor)        
        Assignment96_SIB_IIB_ConstructorExample obj2 = new Assignment96_SIB_IIB_ConstructorExample();
        obj2.displayDetails();
    }
}
