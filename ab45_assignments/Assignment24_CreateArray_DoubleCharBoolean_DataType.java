package ab45_assignments;

import java.util.Scanner;

//Assignment 24 : To create array problem on double, char and boolean data type.

public class Assignment24_CreateArray_DoubleCharBoolean_DataType 
{	
	public static void main(String[] args) {
		
		// 1. Double Array 
        double[] doubleArray = {1.5, 2.7, 3.9, 4.2, 5.8};
        
        System.out.println("Double Array Values:");
        for (double value : doubleArray) 
        {
            System.out.println(value);
        }

        // Modify a value in the double array
        doubleArray[2] = 10.5;
        System.out.println("\nModified Double Array (Third element changed to 10.5):");
        for (double value : doubleArray) {
            System.out.println(value);
        }

        
        // 2. Char Array Example
        char[] charArray = {'A', 'B', 'C', 'D', 'E'};
        
        System.out.println("\nChar Array Values:");
        for (char value : charArray) 
        {
            System.out.println(value);
        }

        // Modify a value in the char array
        charArray[1] = 'Z';
        System.out.println("\nModified Char Array (Second element changed to Z):");
        for (char value : charArray) 
        {
            System.out.println(value);
        }

        
        // 3. Boolean Array Example
        boolean[] booleanArray = {true, false, true, true, false};
        
        System.out.println("\nBoolean Array Values:");
        // Print each value in the boolean array
        for (boolean value : booleanArray) 
        {
            System.out.println(value);
        }

        // Modify a value in the boolean array
        booleanArray[3] = false;
        System.out.println("\nModified Boolean Array (Fourth element changed to false):");
        for (boolean value : booleanArray) {
            System.out.println(value);
        }
        
        
     // 4. Taking User Input for Arrays (Optional)
        Scanner scanner = new Scanner(System.in);

        // Double Array Input Example
        System.out.println("\nEnter 2 double values for the array:");
        double[] userDoubleArray = new double[2];
        for (int i = 0; i < 2; i++) {
            userDoubleArray[i] = scanner.nextDouble();
        }
        System.out.println("User entered Double Array:");
        for (double value : userDoubleArray) {
            System.out.println(value);
        }
        
        scanner.close();
        
        
		
	} 
}
