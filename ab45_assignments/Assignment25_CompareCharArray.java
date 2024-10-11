package ab45_assignments;

//Assignment 25: Compare two arrays of Char datatype 

public class Assignment25_CompareCharArray {

public static void main(String[] args) {
		
		// Declare and initialize two char arrays
        char[] array1 = {'A', 'B', 'C', 'D'};
        char[] array2 = {'A', 'B', 'C', 'D'};

     // If arrays are not the same length, they are not equal
        boolean flag = true;

        // Compare elements one by one
        for (int i = 0; i < array1.length; i++) 
        {
        	if (array1.length != array2.length) {
                flag = false;
            }else if (array1[i] != array2[i]) 
            {
               flag  = false;
            }
        }
        
        if (flag=false)
        {
        	System.out.println("Arrays are not equal");
        }else {
        	System.out.println("arrays are equal");
        }

	}

}
