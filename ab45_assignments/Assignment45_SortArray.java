package ab45_assignments;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

//Assignment 45: how to sort the value of your array 

public class Assignment45_SortArray {
	
    public static void main(String[] args) 
    {
    	int[] numbers = {15,14,13,12,10,91};
    	
    	//Approach1
    	Arrays.parallelSort(numbers);
    	System.out.println("sorted array : "+ Arrays.toString(numbers));
    	
    	
    	//Approach2
    	Arrays.sort(numbers);
    	
    	String sortedArray = Arrays.toString(numbers);
    	
    	System.out.println(sortedArray);
    	
    	//or 
    	
    	for(int sortedElement: numbers)
    	{
    		System.out.println(sortedElement);
    	}
    	
    	
    	//Approach3 - https://www.youtube.com/watch?v=86B5U15c88w
    	
    	int[] arr = {15,14,13,12,10,91};
    	
    	System.out.println("Original Array 3: ");
    	for(int i=0; i<arr.length;i++) 
    	{
    		System.out.print( arr[i] + " ");
    	}
    	
    	
    	int temp=0;  //numb swap
    	
    	for(int i=0; i<arr.length;i++) 
    	{
    		for(int j=i+1; j<arr.length;j++) 
    		{
    			if (arr[j] < arr[i]) 
    			{
    				temp=arr[i];  // temp=5 
    				arr[i]=arr[j]; // i = 2
    				arr[j]=temp;	// j = 5  				
					
				}
    			
    		}
    	}
    	
    	System.out.println();
    	System.out.println("Sorted Array 3: ");
    	for(int i=0; i<arr.length;i++) 
    	{
    		System.out.print( arr[i] + " ");
    	}
    	
    	
    }
}
