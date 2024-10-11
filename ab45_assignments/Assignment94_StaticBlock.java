package ab45_assignments;

///Assignment 94: WAP - of SIB

public class Assignment94_StaticBlock {
	
	/*Key Points:
	The static block is executed only once when the class is loaded into memory.
	The static block is typically used to initialize static variables or perform any setup that is needed before the class can be used.
	The static block is executed before the main() method in case the class is directly executed.
	*/
	    
	    static int counter;

	    // Static initialization block
	    static {
	        
	        System.out.println("Static block is executed.");
	        counter = 100;  // Initialize static variable
	    }

	    public static void main(String[] args) 
	    {
	        System.out.println("Counter value: " + counter);	        
	        Assignment94_StaticBlock obj = new Assignment94_StaticBlock();
	    }
}
