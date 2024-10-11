package ab45_assignments;

import java.util.Arrays;

//Assignment 35 - Copy the value of one array to another array using iteration

public class Assignment35_CopyValueOfOneArrayToAnotherArray
{
    public static void main(String[] args) 
    {
        // Initialize the source array
        int[] sourceArray = {1, 2, 3, 4, 5};
        
        // Create a destination array of the same size
        int[] destinationArray = new int[sourceArray.length];
        
        // Copy values using iteration
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }
        
        
        System.out.println(Arrays.toString(destinationArray));    //not required    
        
        // Print the destination array to verify the copy
        System.out.println("Destination Array:");
        for (int value : destinationArray) {
            System.out.print(value + " ");
        }
    }
}
