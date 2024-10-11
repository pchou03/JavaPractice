package ab45_assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//Assignment 82 WAP - to find the properties of List -> 
//Indexing | Duplicates | Null | Hetrogenious | Dynamic size | Sorted | 
//Iteration using Iterator and ListIterator |


public class Assignment83_PropertiesOfList {

	public static void main(String[] args) 
	{
		// Create a List (ArrayList in this case) with heterogeneous elements
        List<Object> list = new ArrayList<>();
        
        // Adding elements to the List
        list.add("Apple");      // String
        list.add(10);           // Integer
        list.add(3.14);         // Double
        list.add(true);         // Boolean
        list.add(null);         // Null value
        list.add("Banana");     // String
        list.add(10);           // Duplicate Integer (10)
        
        // 1. Indexing
        System.out.println("Element at index 0: " + list.get(0));  // Accessing element by index
        
        // 2. Duplicates
        System.out.println("\nList with Duplicates: " + list);
        
        // 3. Null
        System.out.println("\nDoes the list contain null? " + list.contains(null));
        
        // 4. Heterogeneous (List can store different types of elements)
        System.out.println("\nList with Heterogeneous Elements: " + list);
        
        // 5. Dynamic Size (Adding another element to increase size)
        list.add(500);  
        System.out.println("\nList after adding another element (500): " + list);
        
        // 6. Sorted (List is not sorted by default)
        System.out.println("\nList (Unsorted): " + list);
        
        // 7. Iteration using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // 8. Iteration using ListIterator
        System.out.println("\nIterating using ListIterator:");
        ListIterator<Object> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}