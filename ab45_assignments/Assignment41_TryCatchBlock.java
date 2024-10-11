package ab45_assignments;

import java.util.Scanner;

//Assignment 41_Write Program  using Try and Catch block

public class Assignment41_TryCatchBlock 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numerator value : ");
		int numerator = sc.nextInt();
		System.out.println("Enter Denominator value : ");
		int Denominator = sc.nextInt();
		
		try 
		{
			int result = numerator/Denominator;
			System.out.println("The result of division is: " + result);			
		} 
		catch (Exception e) 
		{
			System.out.println("An error occurred: " + e.getMessage());			
		}
		finally 
		{			
			System.out.println("Thank you for using the Division Calculator.");
			sc.close();			
		}
		
	}

}
