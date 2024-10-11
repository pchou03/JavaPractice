package ab45_assignments;

//Assignment 62: WAP for method overriding

//Parent class
class Vehicle 
{
 public void start() 
 {
     System.out.println("The vehicle is starting");
 }
}

//Child class
class Car extends Vehicle 
{
 @Override			// Overriding the start method in the child class
 public void start() 
 {
     System.out.println("The car is starting");
 }
}

public class Assignment62_MethodOverriding {
 public static void main(String[] args) {
     
     Vehicle vehicle = new Vehicle();
     Car car = new Car();
     
     vehicle.start();  // Output: The vehicle is starting
     car.start();      // Output: The car is starting
 }
}