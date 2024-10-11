package ab45_assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Assignment 82 WAP - to find the properties of ArrayList -> 
//Indexing | Duplicates | Null | Hetrogenious | Dynamic size | Sorted | 
//Iteration using Iterator and ListIterator |


public class Assignment82_PropertiesOfArrayList {

	public static void main(String[] args) 
	{
	    // Create an ArrayList with heterogenous elements
        ArrayList<Object> list = new ArrayList<>();
        
        // Adding elements to the ArrayList
        list.add("Apple");      // String
        list.add(10);           // Integer (int)
        list.add(3.14);         // Double
        list.add(true);         // Boolean
        list.add(null);         // Null value
        list.add("Banana");     // String
        list.add(10);           // Duplicate Integer (10)
        
        // 1. Indexing    - Accessing element by index
        System.out.println("Element at index 0: " + list.get(0));  
        
        // 2. Duplicates
        System.out.println("\nList with Duplicates: " + list);
        
        // 3. Null
        System.out.println("\nDoes the list contain null? " + list.contains(null));
        
        // 4. Heterogeneous (ArrayList can store different types of elements)
        System.out.println("\nList with Heterogeneous Elements: " + list);
        
        // 5. Dynamic Size (Demonstrating dynamic resizing by adding more elements)
        list.add(500);  
        System.out.println("\nList after adding another element (500): " + list);
        
        // 6. Sorted (ArrayLists are not sorted by default)
        System.out.println("\nList (Unsorted): " + list);
        
        // 7. Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
        
        // 8. listIterator
        System.out.println("\nIterating using ListIterator:");
        ListIterator<Object> listIterator = list.listIterator();
        while (listIterator.hasNext()) 
        {
            System.out.println(listIterator.next());
        }	
        
	
	}

}
