package ab45_assignments;

//Assignment 64:WAP for this keyword

public class Assignment64_thisKeyword
{
	    String name;
	    int age;

	    // Constructor 1 
	    public Assignment64_thisKeyword(String name, int age) {
	        this.name = name;  
	        this.age = age;    
	    }
	    
	    // Method to display details
	    public void displayDetails() {
	        System.out.println("Name: " + this.name);  // Using 'this' to access current object's field
	        System.out.println("Age: " + this.age);    // Using 'this' to access current object's field
	    }

	    public static void main(String[] args) 
	    {
	    	// Constructor 1 object
	    	Assignment64_thisKeyword this1 = new Assignment64_thisKeyword("Prashant", 30);
	        this1.displayDetails();
	    }
}
