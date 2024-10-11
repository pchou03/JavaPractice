package ab45_assignments;

//Que: Write five static methods and call inside main method

public class Assignment01_StaticMethod {
	
	public static void m1() 
	{
		System.out.println("inside static method 1");
	}
	
	private static void m2(int a) 
	{
		System.out.println("inside static method 2");
	}
	
	protected static void m3(String a) 
	{
		System.out.println("inside static method 3");
	}
	
	static void m4() 
	{
		System.out.println("inside static method 4");
	}
	
	public static void m5() 
	{
		System.out.println("inside static method 5");
	}

	public static void main(String[] args) {
		
		m1();
		m2(2);
		m3("Three");
		m4();
		m5();
	}

}
