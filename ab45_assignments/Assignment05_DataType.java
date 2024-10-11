package ab45_assignments;

//Assignment 5: WAP on declaration and initialization of each datatype

public class Assignment05_DataType {
	
	//declaration and initialization of variable
	
	// Primitive Data Types
	byte b= 127;
	short  s= 32767;
	int i = 1234;
	long l = 9527106034l;
	
	float f = 23.5f;
	double d= 344.34;
	char c = 'M';
	
	boolean b1= true;
	boolean b2= false;
	
	
	// Reference Data Types
	String s1 = "Prashant Chougale";
	
	
	public static void main(String[] args) {
		
		// Create an instance of the class to access the instance variables
		Assignment05_DataType dt= new Assignment05_DataType();
		
		// Printing the values of each data type
		System.out.println(" byte datatype value: " +dt.b);
		System.out.println(" short datatype value: " +dt.s);
		System.out.println(" int datatype value: " +dt.i);
		System.out.println(" long datatype value: " +dt.l);
		System.out.println(" float datatype value: " +dt.f);
		System.out.println(" double datatype value: " +dt.d);
		
		System.out.println(" char datatype value: " +dt.c);
		System.out.println(" boolean datatype value: " +dt.b1);
		System.out.println(" boolean datatype value: " +dt.b2);
		System.out.println(" String datatype value: " +dt.s1);
		

	}

}
