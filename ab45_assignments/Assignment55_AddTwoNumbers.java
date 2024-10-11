package ab45_assignments;

import java.util.Scanner;

//Assignment 55: WAP to add two numbers. take inputs using scanner class

public class Assignment55_AddTwoNumbers  {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();          
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();  

        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner object
        scanner.close();

	}

}
