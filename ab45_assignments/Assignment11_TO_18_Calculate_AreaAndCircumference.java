package ab45_assignments;

import java.util.Scanner;

//Assignment 11 to 18 - WAP for calculating area of a circle,rectangle,square,triangle,trapezium.
	//  also calculating circumference of circle,rectangle and square using Scanner Class (user inputs)

public class Assignment11_TO_18_Calculate_AreaAndCircumference 
{
		
		static double PI=3.14;
	
		//cicle methods
		public static double areaOfCircle(double radius)
		{
			double circleArea = PI*radius*radius;	
			return circleArea;
		}
		
		public static void circumstanceOfCircle(double radius)
		{
			double circumstanceOfCircle = 2*PI*radius;
			System.out.println(circumstanceOfCircle);
		}
		
		//Rectangle Methods
		public static double areaOfRectangle(double length, double breadth)
		{
			double areaOfRectangle = length*breadth;	
			return areaOfRectangle;
		}
		
		public static void circumstanceOfRectangle(double length, double breadth)
		{
			double circumstanceOfRectangle = 2 * (length + breadth);
			System.out.println(circumstanceOfRectangle);
		}
		
		//Square Methods
		public static double areaOfSquare(double side)
		{
			double areaOfSquare = side*side;	
			return areaOfSquare;
		}
		
		public static void circumstanceOfSquare(double side)
		{
			double circumstanceOfSquare = 4*side;
			System.out.println(circumstanceOfSquare);
		}
		
		// Method to calculate area of a triangle
	    public static double areaOfTriangle(double base, double height) {
	    	double  areaOfTriangle = 0.5 * base * height;
	        return areaOfTriangle;
	    }

	    // Method to calculate area of a trapezium
	    public static double areaOfTrapezium(double a, double b, double height) {
	        double areaOfTrapezium = 0.5 * (a + b) * height;
	    	return areaOfTrapezium;
	    }
		
		

	    public static void main(String[] args) 
	    {
	     
	    	// Circle calculations
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("\nEnter radius for circle: ");
	           double radius = sc.nextDouble();
	           System.out.println("Area of Circle: " + areaOfCircle(radius));	           
	           circumstanceOfCircle(radius);
	           
	           
	       //  Rectangle calculations
	           System.out.println("\nEnter length for rectangle: ");
	           double length = sc.nextDouble();
	           System.out.println("Enter breadth for rectangle: ");
	           double breadth = sc.nextDouble();
	           
	           System.out.println("Area of Circle: " + areaOfRectangle(length, breadth));
	           circumstanceOfRectangle(length, breadth);
	           
	       //  Square calculations
	           System.out.println("\nEnter side for Squre: ");
	           double side = sc.nextDouble();
	           System.out.println("Area of Circle: " + areaOfSquare(side));
	           circumstanceOfSquare(side);
	           
	        // Triangle calculations
	           System.out.print("\nEnter base of the triangle: ");
	           double base = sc.nextDouble();
	           System.out.print("Enter height of the triangle: ");
	           double height = sc.nextDouble();
	           System.out.println("Area of Triangle: " + areaOfTriangle(base, height));

	       // Trapezium calculations
	           System.out.print("\nEnter first parallel side of the trapezium: ");
	           double a = sc.nextDouble();
	           System.out.print("Enter second parallel side of the trapezium: ");
	           double b = sc.nextDouble();
	           System.out.print("Enter height of the trapezium: ");
	           double trapeziumHeight = sc.nextDouble();
	           System.out.println("Area of Trapezium: " + areaOfTrapezium(a, b, trapeziumHeight));

	       // Close the scanner to prevent resource leak
	           sc.close();    
	    }
}
