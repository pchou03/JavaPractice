package ab45_assignments;

//Assignment 6: WAP on updating the value of variable

public class Assignment06_UpdateVariableValue {
	
	//declaration and initialization of variable
	
	// Primitive Data Types
	int i = 1234;
	double d= 344.34;
	byte b= 127;
	
	public static void main(String[] args) {
		
		
		Assignment06_UpdateVariableValue dt= new Assignment06_UpdateVariableValue();
		
		//instance variable
		System.out.println("before update byte datatype value: " +dt.i);		
		dt.i=126;
		System.out.println("After update byte datatype value: " +dt.i);
		
		//local Variable
		int number = 10;
        System.out.println("Initial value of number: " + number);
        number = 20; // Update the value of the variable
        System.out.println("Updated value of number: " + number);
        number = number * 2;  // Multiply the current value by 2
        System.out.println("Value after multiplying by 2: " + number);
        number = number + 5;  // Add 5 to the current value
        System.out.println("Value after adding 5: " + number);
	}

}
