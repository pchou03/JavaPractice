
package ab45_assignments;

//Assignment 57 WAP for Single level inheritance - both class in same program

class Person {
    
    String name;
    int age;

    // Constructor of the Person class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method of Person class
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Student extends Person {
    
    String schoolName;

    // Constructor of Student class
    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    // Method of Student class
    public void displaySchoolInfo() {
        System.out.println("School: " + schoolName);
    }
}

public class Assignment57_SingleLevelInheritence {
    public static void main(String[] args) {
        
        Student student = new Student("John Doe", 20, "XYZ High School");

        // Calling methods from both the base class and derived class
        student.displayInfo();      // Method from Person class
        student.displaySchoolInfo(); // Method from Student class
    }
}