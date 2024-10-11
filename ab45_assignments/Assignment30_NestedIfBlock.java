package ab45_assignments;

import java.util.Scanner;

//Assignment 30 - WAP in a class having multiple if blocks

public class Assignment30_NestedIfBlock {

	int marks;
	
	Assignment30_NestedIfBlock(int marks)
	{
		this.marks = marks;
	}
	
	void evaluateMarks() {
		
		if (marks >= 40) 
		{
            // Nested if blocks to check more specific ranges for grades
            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 70) {
                System.out.println("Grade: B");
            } else if (marks >= 50) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        } else 
        {
            System.out.println("Grade: F");  // If marks are below 40
        }
	}
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter marks : ");
	int studentMarks = scanner.nextInt();
	
	// Create an object of the Student class
	Assignment30_NestedIfBlock nestedIf = new Assignment30_NestedIfBlock(studentMarks);
	
	nestedIf.evaluateMarks();
	scanner.close();	
	
	}

}
