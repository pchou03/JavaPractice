package ab45_assignments;

//Assignment 66: WAP for interface

//Interface
interface Shape3 {
 
	// Abstract method (does not have a body)
	double area();  
 
	// Default method (with body)
	default void displayShape() 
	{
     System.out.println("This is a shape.");
	}
}

//Implementing class
class Circle2 implements Shape3 
{
	double radius;

	// Constructor to initialize radius
	public Circle2(double radius) 
	{
     this.radius = radius;
	}

 
	@Override
	public double area() 
	{
     return Math.PI * radius * radius;  // Formula for area of circle
	}
}

public class Assignment66_Interface 
{
    
	public static void main(String[] args) 
	{
		Circle2 circle2 = new Circle2(10.2);

		// Calling the displayShape method (from interface)
		circle2.displayShape();
		System.out.println("Area of Circle: " + circle2.area());
	}
}
