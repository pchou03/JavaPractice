package ab45_assignments;

//Que: Write five static methods and call inside main method

public class Assignment04_CallingMultipleStaticStatic {
	
	public static void displayMessage() 
	{
		System.out.println("Hello, this is a static method!");
	}
	
	private static void calcuateSum() 
	{
		
		double a = 5.6;
		int b = 7;
		double sum = a+b;
		System.out.println("sum of elements : "+ sum);
	}
	
	static String printName ()
	{
		String MyName = "Prashant";
		return MyName;
	}

	public static void main(String[] args) {
		
		displayMessage();
		calcuateSum();
		
		System.out.println(printName());
	}

}
