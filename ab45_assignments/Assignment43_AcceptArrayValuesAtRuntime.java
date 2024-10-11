package ab45_assignments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//Assignment43_ Write program Accept  the value of your array  at the runtime , 
	//if it is int data type & size of 4
	
public class Assignment43_AcceptArrayValuesAtRuntime 
{	
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int size = 4;
        int [] numbers = new int [size];
        
        for(int i=0; i<size; i++)
        {
        	System.out.println("Enter value for element " + (i+1) + " : ");
        	numbers[i]=sc.nextInt();
        }       
        
        System.out.println("You Entered following values : ");
        for(int i=0; i<size; i++)
        {
        	System.out.println("Element " + (i+1) + " : " + numbers[i]);
        }        
        
        //also can be print like        
        System.out.println("Array values you entered : "+ Arrays.toString(numbers));   
        
        sc.close();              
    }
}
