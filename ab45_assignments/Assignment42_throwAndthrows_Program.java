package ab45_assignments;

import java.util.Scanner;

//Assignment 42: Write program using throw and throws

public class Assignment42_throwAndthrows_Program 
{	
	void division(int a , int b) throws ArithmeticException {
		
		if (b==0) {
			
			throw new ArithmeticException();
		}else {
			
			int Division = a/b;
			System.out.println("Division value is : " +Division);
		}
	}

	public static void main(String[] args) 
	{
		Assignment42_throwAndthrows_Program th = new Assignment42_throwAndthrows_Program();
		
		th.division(20, 0);
	}

}
