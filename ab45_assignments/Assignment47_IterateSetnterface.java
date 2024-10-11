package ab45_assignments;
import java.util.*;

//Assignment 47: Iterate SET Interface 

public class Assignment47_IterateSetnterface {
    public static void main(String[] args) {
        
    	// Create a List of integers
        Set<String> strings = new HashSet<>();
        strings.add("ABCD");
        strings.add("EFGH");
        strings.add("JKLM");
        strings.add("MNOP");
        strings.add("QRST");

        // 1. Using an enhanced for loop (foreach)
        System.out.println("\nUsing enhanced for loop (foreach):");
        for (String str : strings) 
        {
            System.out.println(str);
        }

        // 2. Using an Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }

    }
		
}
