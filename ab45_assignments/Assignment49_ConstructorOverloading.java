package ab45_assignments;

//Assignment49: WAP of Coustructor Overloading

public class Assignment49_ConstructorOverloading {
	
	String name;
	int age;
	String dob;
	
	public Assignment49_ConstructorOverloading() {
		name = "Pandurang";
		age = 55;
		dob = "05/10/1973";
		
	}
	
    public Assignment49_ConstructorOverloading(String name) {
		this.name =name;
		age = 29;
		dob = "20/3/1996";
	}
    
    public Assignment49_ConstructorOverloading(String name, int age) {
		this.name =name;
		this.age = age;
		dob = "26/3/1996";
	}
    
    public Assignment49_ConstructorOverloading(String name, int age, String dob) {
		this.name =name;
		this.age = age;
		this.dob = dob;
	}
    
  // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + dob);
    }

	public static void main(String[] args) {
		
		Assignment49_ConstructorOverloading person1= new Assignment49_ConstructorOverloading(); 	// Default constructor
		Assignment49_ConstructorOverloading person2= new Assignment49_ConstructorOverloading("Prashant"); 	// Constructor with 1 parameter
		Assignment49_ConstructorOverloading person3= new Assignment49_ConstructorOverloading("Kalyani", 27);	// Constructor with 2 parameter
		Assignment49_ConstructorOverloading person4= new Assignment49_ConstructorOverloading("Saaisha", 01, "07/07/2023");	// Constructor with 3 parameter
		
		
		// Displaying information for each person
		System.out.println("member 1 details : ");
		System.out.println("-------------------");
		person1.displayInfo();
		System.out.println();
		
		System.out.println("member 2 details : ");
		System.out.println("-------------------");
		person2.displayInfo();
		System.out.println();
		
		System.out.println("member 3 details : ");
		System.out.println("-------------------");
		person3.displayInfo();
		System.out.println();
		
		System.out.println("member 4 details : ");
		System.out.println("-------------------");
		person4.displayInfo();
		System.out.println();

	}

}
