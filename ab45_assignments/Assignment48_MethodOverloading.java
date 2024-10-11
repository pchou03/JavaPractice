package ab45_assignments;

	//Assignment 48: WAP of Method Overloading

public class Assignment48_MethodOverloading {
	
	public static void addition (int a, int b)
	{
		int addition = a + b ;
		System.out.println(addition);		
	}
	
	public static void addition (int a, int b, int c)
	{
		int addition = a+b+c;
		System.out.println(addition);		
	}
	
	public static void addition (double a, int b)
	{
		double addition = a+b;
		System.out.println(addition);		
	}

	public static void main(String[] args) {	
		addition(55, 45);
		addition(45.45, 45);
		addition(10, 20, 30);
	}

}
