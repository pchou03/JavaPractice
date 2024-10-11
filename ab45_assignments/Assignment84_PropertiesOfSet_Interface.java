package ab45_assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Assignment 82 WAP - to find the properties of Set interface -> 
//Indexing | Duplicates | Null | Hetrogenious | Dynamic size | Sorted | 
//Iteration using Iterator and ListIterator |


public class Assignment84_PropertiesOfSet_Interface {

	public static void main(String[] args) 
	{
		// Created a Set (using HashSet, LinkedHashSet, and TreeSet)
        
        // HashSet (does not maintain insertion order, no duplicates allowed)
        Set<Object> hashSet = new HashSet<>();
        
        // Adding elements to the HashSet
        hashSet.add("Apple");      // String
        hashSet.add(10);           // Integer
        hashSet.add(3.14);         // Double
        hashSet.add(true);         // Boolean
        hashSet.add(null);         // Null value
        hashSet.add("Banana");     // String
        hashSet.add(10);           // Duplicate Integer (10)

        // LinkedHashSet (maintains insertion order)
        Set<Object> linkedHashSet = new LinkedHashSet<>(hashSet);  // Copying elements from hashSet to LinkedHashSet

        // TreeSet (stores elements in a sorted order)
        Set<Object> treeSet = new TreeSet<>();  // TreeSet stores elements in natural order (only comparable types allowed)
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");

        // 1. Indexing (Not supported in Set, demonstration using for-each loop)
        System.out.println("HashSet Elements: " + hashSet);
        // HashSet doesn't support indexing, so we iterate instead.

        // 2. Duplicates
        System.out.println("\nHashSet (No Duplicates): " + hashSet);

        // 3. Null
        System.out.println("\nDoes HashSet contain null? " + hashSet.contains(null));

        // 4. Heterogeneous (Sets allow elements of different types)
        System.out.println("\nHashSet with Heterogeneous Elements: " + hashSet);

        // 5. Dynamic Size (Adding an element to grow the size)
        hashSet.add(500);
        System.out.println("\nHashSet after adding element 500: " + hashSet);

        // 6. Sorted (TreeSet maintains natural order)
        System.out.println("\nTreeSet (Sorted): " + treeSet);

        // 7. Iteration using Iterator
        System.out.println("\nIterating HashSet using Iterator:");
        Iterator<Object> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 8. Iteration using ListIterator (ListIterator only works on List, not Set)
        // Set does not support ListIterator, so we'll demonstrate using LinkedHashSet
        System.out.println("\nIterating LinkedHashSet using Iterator:");
        iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // ListIterator (not applicable to Set directly, so we demonstrate with List)
        // For demonstration, let's create a List and use ListIterator
    }
}