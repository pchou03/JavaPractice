package ab45_assignments;

import java.util.Scanner;

//Assignment 91: WAP for Assert keyword

public class Assignment91_AssertExample {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to verify : ");
		int number = sc.nextInt();
		
        assert number > 0 : "Number must be positive!";

        System.out.println("The number is: " + number);

	}

}
