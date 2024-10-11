package ab45_assignments;

//Assignment 63: WAP for super keyword

// Parent class
class Shape 
{    
    public void area() {
        System.out.println("Calculating area of a shape.");
    }
}

//child
class Rectangle extends Shape 
{
    int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        super.area(); 			// Optional: to print the generic message from Shape
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }    
}

public class Assignment63_superKeyword
{
	public static void main(String[] args) 
    {        
        Rectangle rect = new Rectangle(5, 10);
        rect.area();
    }
	
}
