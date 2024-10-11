package ab45_assignments;

import java.util.Arrays;
import java.util.Scanner;

//Assignmnet 44_Create a array of size of 5 and just check 34  is present in array or not

public class Assignment44_CheckValuePresentInArray {
	
    public static void main(String[] args) 
    {
    	int[] numbers = new int[5];     
    	
    	 numbers [0] = 4;
    	 numbers [1] = 56;
    	 numbers [2] = 12;
    	 numbers [3] = 34;
    	 numbers [4] = 66;
    	 //numbers [5] = 67;
    	 
    	int size = numbers.length;
    	System.out.println("Array size : "+size);
    	
    	// Check if 34 is present in the array
        boolean found = false;
        for (int number : numbers) {
            if (number == 34) {
                found = true;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println("The number 34 is present in the array.");
        } else {
            System.out.println("The number 34 is not present in the array.");
        }

    }
}
