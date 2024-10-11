package ab45_assignments;

//Assignment 22: check if main method can be overloaded
	// by making sure other main methods are non static

public class Assignment22_MainMethodOverloading  
{
	public static void main(String[] args) {

		System.out.println("Static main method ");
		
		Assignment22_MainMethodOverloading objMain = new Assignment22_MainMethodOverloading();		
		objMain.main(5);
		objMain.main(8, 92);
	}
	
	/*
     // not possible with same argument	 
	public void main(String [] args) 
	{
		System.out.println("Non - Static main method ");
	}
	*/
	
	
	// Overloaded non-static main method (with an integer argument)
    public void main(int a) {
        System.out.println("This is the overloaded non-static main method with 1 argument: " + a);
    }

    // Another overloaded non-static main method (with two integer arguments)
    public void main(int a, int b) {
        System.out.println("This is the overloaded non-static main method with 2 arguments: " + a + ", " + b);
    }

}
