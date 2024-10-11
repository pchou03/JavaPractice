package ab45_assignments;
import java.util.*;

//Assignment 46: Iterate List Interface

public class Assignment46_IterateListInterface {
    public static void main(String[] args) {
        
    	// Create a List of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // 1. Using a standard for loop (by index)
        System.out.println("Using standard for loop (by index):");
        for (int i = 0; i < numbers.size(); i++) 
        {
            System.out.println(numbers.get(i));
        }

        // 2. Using an enhanced for loop (foreach)
        System.out.println("\nUsing enhanced for loop (foreach):");
        for (Integer number : numbers) 
        {
            System.out.println(number);
        }

        // 3. Using an Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }

        // 4. Using a ListIterator (for both forward and backward iteration)
        System.out.println("\nUsing ListIterator (forward):");
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) 
        {
            System.out.println(listIterator.next());
        }

        // 5. Using Java 8 Streams (if you're using Java 8 or later)
        System.out.println("\nUsing Streams (Java 8 or later):");
        numbers.stream().forEach(System.out::println);
    }
		
}
