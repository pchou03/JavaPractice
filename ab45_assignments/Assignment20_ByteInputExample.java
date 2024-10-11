package ab45_assignments;

import java.util.Scanner;

//Assignment 20 Use nextByte() give 32000 as Input, What exception is coming in OutPut

public class Assignment20_ByteInputExample 
{
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		
		
		try 
		{
			System.out.print("Enter a number 32000 as Input for (byte range): ");
			byte b = scanner.nextByte();			
			System.out.println("Entered number:" +b);
			
		} catch (Exception e) 
		{
			//e.printStackTrace();
			System.out.println("InputMismatchException: The number is out of the byte range (-128 to 127).");
		}finally {
			scanner.close();
		}
		
		
		

	}

}
