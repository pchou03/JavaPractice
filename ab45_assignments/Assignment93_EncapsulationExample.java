package ab45_assignments;

//Assignment 93:WAP - for Encapsulation

class MyDetails {
 // Private variables - data is hidden from outside
 private String name;
 private int age;
 
 //constructor
 public MyDetails(String name, int age) {
	this.name = name;
	this.age = age;
}
 
 //getter, setter methods
public String getName() {
	return name;
}

public void setName(String name) { 
	this.name = name;
}

public int getAge() {
	return age;
}

// Setter method for age (to modify the age)
 public void setAge(int age) {
     if (age > 0) {  // Ensure age is a positive number
         this.age = age;
     } else {
         System.out.println("Invalid age!");
     }
 }

 // Method to display person's details
 public void displayDetails() {
     System.out.println("Name: " + getName());
     System.out.println("Age: " + getAge());
 }
}

public class Assignment93_EncapsulationExample 
{ 
	public static void main(String[] args) 
	{
     
		MyDetails dt = new MyDetails("Prashant", 25);

     // Accessing and modifying data using getter and setter methods
     System.out.println("Before change:");
     dt.displayDetails();

     // Modifying values using setter methods
     dt.setName("Kalyani");
     dt.setAge(30);

     // Displaying modified values
     System.out.println("\nAfter change:");
     dt.displayDetails();

     // Trying to set invalid age (negative)
     dt.setAge(-5);
 }
}

