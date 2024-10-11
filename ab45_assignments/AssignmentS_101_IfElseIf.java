package ab45_assignments;

//Assignment 102: Nested If program

public class AssignmentS_101_IfElseIf 
{
	public static void main(String[] args) 
	{
        // Test values
        int a = 10;
        int b = 20;
        int c = 30;

        // AND operator (&&)
        if (a < b && b < c) {
            System.out.println("AND Operator: Both conditions are true.");
        } else {
            System.out.println("AND Operator: One or both conditions are false.");
        }

        // OR operator (||)
        if (a < b || b > c) {
            System.out.println("OR Operator: At least one condition is true.");
        } else {
            System.out.println("OR Operator: Both conditions are false.");
        }

        // AND with NOT operator (!)
        if (!(a > b) && (b < c)) {
            System.out.println("AND with NOT Operator: The first condition is false, the second is true.");
        } else {
            System.out.println("AND with NOT Operator: Conditions don't match.");
        }

        // OR with NOT operator (!)
        if (!(a > b) || (b > c)) {
            System.out.println("OR with NOT Operator: At least one condition is true.");
        } else {
            System.out.println("OR with NOT Operator: Both conditions are false.");
        }
    }
}
