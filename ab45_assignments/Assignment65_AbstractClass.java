package ab45_assignments;

//Assignment 65: WAP for Abstract class which has concrete and abstract methods in it 
//and access those methods

abstract class Shape2
{
	
	//concrete method with body
	public void displayShape()
	{
		System.out.println("Displaying shape");
	}
	
	//abstract method with body
	public abstract void area();	
}

class Circle extends Shape2{
	
	double radoius;
	
	//constrctor to initialize radoius
	public Circle(double radoius) 
	{
		this.radoius=radoius;
	}

	@Override
	public void area() 
	{		
		double circleArea =  Math.PI*radoius*radoius;	
		System.out.println("Area of Circle: " + circleArea);
	}	
}

public class Assignment65_AbstractClass 
{
	public static void main(String[] args) 
	{
		Circle c1= new Circle(23.2);
		c1.area();
	}
}
