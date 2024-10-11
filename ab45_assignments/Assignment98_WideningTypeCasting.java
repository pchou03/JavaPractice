package ab45_assignments;

//Assignment 97:  WAP for Narrowing Type casting Convert double to int

public class Assignment98_WideningTypeCasting 
{
    public static void main(String[] args) 
    {
        // Double value
        double myDouble = 9.99;

        // Narrowing casting from double to int (explicit casting)
        int myInt = (int) myDouble;

        // Print the result
        System.out.println("Original double value: " + myDouble);
        System.out.println("Value after narrowing casting to int: " + myInt);
    }
}

