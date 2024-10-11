package ab45_assignments;

import java.util.Scanner;

//Assignment 103: Logical Opeartors->  AND | OR | And with not | OR with not |

public class AssignmentS_104_ifElse4Times 
{
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks to check grade : ");
		
		
        int marks = scanner.nextInt();  // Test with any value between 0 and 100

        // If-else if ladder with 4 conditions for grade classification
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}
