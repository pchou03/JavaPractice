package ab45_assignments;

import java.util.Arrays;

//Assignment 78: WAP - Copy value of one array into second array in reverse order

public class Assignment78_CopyOneArrayToAnotherInReverseOrder {

	public static void main(String[] args) 
	{
		int[] array1 = {10, 20, 30, 40, 50};    
        int[] array2 = new int[array1.length];
        
        // Copy the values from array1 to array2 in reverse order
        int j = 0;  // Index for array2
        for (int i = array1.length - 1; i >= 0; i--) {
            array2[j] = array1[i];
            j++;
        }
        
        // Print both arrays to verify the copy
        System.out.println("Original Array (array1): " + Arrays.toString(array1));
        System.out.println("Reversed Copied Array (array2): " + Arrays.toString(array2));
    }

}
