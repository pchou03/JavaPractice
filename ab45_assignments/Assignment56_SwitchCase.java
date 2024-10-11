package ab45_assignments;

//Assignment 56: WAP for switch case having keywords switch, case, default and break

import java.util.Scanner;

public class Assignment56_SwitchCase 
{    
	public static void main(String[] args) 
	{       
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-5): ");
        int number = scanner.nextInt();
        
        // Switch statement to check the entered number
        switch (number) 
        {
            case 1:
                System.out.println("You selected one.");
                break; 
            case 2:
                System.out.println("You selected two.");
                break; 
            case 3:
                System.out.println("You selected three.");
                break; 
            case 4:
                System.out.println("You selected four.");
                break; 
            case 5:
                System.out.println("You selected five.");
                break; 
            default:
                System.out.println("Invalid selection! Please choose a number between 1 and 5.");
                break; 
        }      
           scanner.close();
    }
}
