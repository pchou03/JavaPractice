package ab45_assignments;

//Assignment 27 Print [2,4,6,8,10] array in reverse order in new array

public class Assignment27_PrintArrayInReverseOrderInNewArray {
	
	public static void main(String[] args) {
		
		
        int[] originalArray = {2, 4, 6, 8, 10};

        // Create a new array to store the reversed elements
        int[] reversedArray = new int[originalArray.length];

        // Loop to reverse the elements
        int j = 0; // Index for reversed array
        for (int i = originalArray.length - 1; i >= 0; i--) {
            reversedArray[j] = originalArray[i];
            j++; // Move to the next index in reversedArray
        }

        // Print the reversed array
        System.out.println("Reversed Array:");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
	}

}
