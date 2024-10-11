package ab45_assignments;

//Assignment 08_Write a program to have both static and Non-Static methods
// 2 static and 2 non-static & call them

public class Assignment08_Static_NonStaticMethods {
	
	static void login()
	{
		System.out.println("Inside login method");
	}

	static void registration() 
	{
		System.out.println("Inside registration method");		
	}
	
	
	void name()
	{
		System.out.println("Inside name method");
	}
	
	void email()
	{
		System.out.println("Inside email method");
	}

	public static void main(String[] args) {

		//calling non-static method
		Assignment08_Static_NonStaticMethods as5 = new Assignment08_Static_NonStaticMethods();
		
		as5.name();
		as5.email();
		
		
		//calling static method
		login();
		registration();

	}

}
