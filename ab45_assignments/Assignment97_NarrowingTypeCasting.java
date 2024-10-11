package ab45_assignments;

//Assignment 97:  WAP for Widening  Type casting Convert int to double

public class Assignment97_NarrowingTypeCasting 
{
    public static void main(String[] args) 
    {
        // int value
        int myInt =9;

        // Widening casting from  int to double (implicit casting)
        double myDouble = myInt;

        // Print the result
        System.out.println("Original int value: " + myInt);
        System.out.println("Value after Widening casting to double: " + myDouble);
    }
}

