package ab45_assignments;

	//Assignment 9: WAP in which there are 3 static methods,
	// 3 nonstatic methods & 3 constructors.. 3 static methods can be parameterized? 
	// 3 non-static methods can be parameterized? 3 Constructors can be parameterized?
	
public class Assignment09_ParameterisedMethods {
	
	
	//non-static methods
	public void login(long mobileNumber, int otp)
	{
		System.out.println("login - Mobile Number: " + mobileNumber + ", otp: " +otp);		
	}
	
	private void login(long mobileNumber, String passaword)
	{
		System.out.println("login - Mobile Number: " + mobileNumber + ", passaword: " + passaword);	
	}
	
	void login(String email, String passaword)
	{
		System.out.println("login - email id: " + email + ", passaword: " + passaword);
	}
	
	
	//static methods
	static void paymentOption(long creditCard, int pin)
	{
		System.out.println("paymentOption - creditCard id: " + creditCard + ", pin: " + pin);
	}
	
	public static void paymentOption(long debiitCard, int pin, int otp)
	{
		System.out.println("paymentOption - debiitCard id: " + debiitCard + ", pin: " + pin + ", otp: " +otp);
	}
	
	private static void paymentOption(String UPI)
	{
		System.out.println("paymentOption - UPI id: " + UPI);
	}
	
	
	//constructor
	Assignment09_ParameterisedMethods ()
	{
		System.out.println("Default Constructor");
	}
	
	Assignment09_ParameterisedMethods (int a)
	{
		System.out.println("Constructor 1: One Parameter - a = " + a);
	}
	
	Assignment09_ParameterisedMethods (int a, int b)
	{
		System.out.println("Constructor 2: two Parameters - a = " + a + ", b = " + b);
	}
	
	Assignment09_ParameterisedMethods (int a, int b, int c)
	{
		System.out.println("Constructor 3: Three Parameters - a = " + a + ", b = " + b + ", c = " + c);
	}
	
	
	
	public static void main(String[] args) {
		
		
		//call non-static methods
		Assignment09_ParameterisedMethods  pm = new Assignment09_ParameterisedMethods();
		
		System.out.println("-------------------------------------");
		pm.login(9527106034l, 25663);
		pm.login(9527106034l, "pass@123");
		pm.login("prashant@123", "pass@123");
		
		
		System.out.println();
		//call static methods
		System.out.println("--------------------------------------");
		
		paymentOption(12345678, 26256);
		paymentOption(12345678, 256256, 1234);
		paymentOption("Prashant@upi");	
		
		System.out.println();
		//call Constructor methods
		System.out.println("--------------------------------------");
		
		Assignment09_ParameterisedMethods c1= new Assignment09_ParameterisedMethods(55);
		Assignment09_ParameterisedMethods c2 = new Assignment09_ParameterisedMethods(15, 16);
		Assignment09_ParameterisedMethods c3 = new Assignment09_ParameterisedMethods(11, 12, 13);
	}
	
	
	

}
