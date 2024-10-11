package ab45_assignments;

//Assignment 26: Compare two arrays of Strig datatype


public class Assignment26_CompareStringArray {

	public static void main(String[] args) {
		
		// Declare and initialize two char arrays
        String[] array1 = {"Prashant", "Susant", "Sachin", "Kalyani"};
        String[] array2 = {"Prashant", "Sushant", "Sachin", "Kalyani"};

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
