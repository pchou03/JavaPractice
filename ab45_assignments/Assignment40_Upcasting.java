package ab45_assignments;

//Assignment 40: Write program on UpCasting

	// Base class
	class Animal {
	    public void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	// Subclass
	class Dog extends Animal {
	    @Override
	    public void sound() {
	        System.out.println("Dog barks");
	    }
	}

	// Another subclass
	class Cat extends Animal {
	    @Override
	    public void sound() {
	        System.out.println("Cat meows");
	    }
	}

	public class Assignment40_Upcasting 
	{
	    public static void main(String[] args) 
	    {
	        // Upcasting
	        Animal myDog = new Dog();  // Dog object is upcasted to Animal reference
	        Animal myCat = new Cat();  // Cat object is upcasted to Animal reference
	        
	        // Calling the method using superclass reference
	        myDog.sound(); // Output: Dog barks
	        myCat.sound(); // Output: Cat meows

	        // Demonstrating polymorphism
	        makeSound(myDog); // Output: Dog barks
	        makeSound(myCat); // Output: Cat meows
	    }
	    
	    // Method to demonstrate polymorphism
	    public static void makeSound(Animal animal) 
	    {
	        animal.sound();
	    }
	}
