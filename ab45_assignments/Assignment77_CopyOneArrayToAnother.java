package ab45_assignments;

import java.util.Arrays;

//Assignment 77: WAP - Copy value of one array into second array

public class Assignment77_CopyOneArrayToAnother {

	public static void main(String[] args) 
	{
		int [] array1= {10, 20, 30, 40, 50};		
		int [] array2= new int [array1.length];
		
		// Copy the values from array1 to array2 using a for loop
		for (int i = 0; i < array1.length; i++) 
		{			
			array2[i] = array1[i];
		}
		
		System.out.println("Array1 elements : " + Arrays.toString(array1));
		System.out.println("Array2 elements : " + Arrays.toString(array2));
	}

}
