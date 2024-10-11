package ab45_assignments;

// Assignment 58: WAP for Single level inheritance - both class in differnt program

class Student2 extends Person {
   
    String schoolName;

    // Constructor of Student class
    public Student2(String name, int age, String schoolName) {
        
        super(name, age);
        this.schoolName = schoolName;
    }

    
    public void displaySchoolInfo() {
        System.out.println("School: " + schoolName);
    }
}

public class Assignment58_SingleLevelInheritence_differentClass 
{
    public static void main(String[] args) {
        
        Student2 student = new Student2("John Doe", 20, "XYZ High School");

        
        student.displayInfo();      // Method from Person class
        student.displaySchoolInfo(); // Method from Student class
    }
}