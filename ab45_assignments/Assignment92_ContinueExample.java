package ab45_assignments;

//Assignment 92: WAP - for continue keyword.
//Print 1 to 10 by skipping number 4

public class Assignment92_ContinueExample 
{	
	    public static void main(String[] args) 
	    {
	        
	        for (int i = 1; i <= 10; i++) {
	            
	            if (i == 4) {
	                continue;  // Skip the rest of the loop body for i == 4
	            }
	            // Print the number if it's not 4
	            System.out.println(i);
	        }
	    }
	}
