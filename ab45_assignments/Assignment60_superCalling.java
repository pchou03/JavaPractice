package ab45_assignments;

//Assignment 60: WAP for super calling statement

//Parent class
class Animal1 {
 
 public Animal1() 
 {
     System.out.println("Animal constructor called.");
 }

 
 public void sound() 
 {
     System.out.println("Animals make a sound.");
 }
}

//Child class
class Cat1 extends Animal1 {
 
 public Cat1() {
     
     super();
     System.out.println("cat constructor called.");
 }

 // Overriding the sound method in the child class
 @Override
 public void sound() 
 {
     // Calling the parent class method using super
     super.sound();
     System.out.println("The dog barks.");
 }
 
}

public class Assignment60_superCalling
{
	public static void main(String[] args) 
	{
	     
	     Cat1 cat = new Cat1();
	     cat.sound();
	}
}
