package ab45_assignments;

//Assignment 61: WAP for this calling statement

public class Assignment61_thisCallingStatement
{
	    String name;
	    int age;

	    // Constructor 1 
	    public Assignment61_thisCallingStatement(String name, int age) {
	        this.name = name;  
	        this.age = age;    
	    }

	    // Constructor 2 
	    public Assignment61_thisCallingStatement(String name) {
	        this(name, 0);  // Calling the other constructor using 'this'
	    }

	    
	    // Method to display details
	    public void displayDetails() {
	        System.out.println("Name: " + this.name);  // Using 'this' to access current object's field
	        System.out.println("Age: " + this.age);    // Using 'this' to access current object's field
	    }

	    public static void main(String[] args) 
	    {
	    	// Constructor 1 object
	    	Assignment61_thisCallingStatement this1 = new Assignment61_thisCallingStatement("Prashant", 30);

	        // Constructor 2 object
	    	Assignment61_thisCallingStatement this2 = new Assignment61_thisCallingStatement("Bob");

	        // Displaying details of both 
	        this1.displayDetails();
	        this2.displayDetails();
	    }
}
