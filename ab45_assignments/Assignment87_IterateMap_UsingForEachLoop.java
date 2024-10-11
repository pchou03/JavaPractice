package ab45_assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//Assignment 87: WAP - for Map. Iterate through map elements using for each loop

public class Assignment87_IterateMap_UsingForEachLoop {

	public static void main(String[] args) 
	{
		// Create a Map (using HashMap)
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the Map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Mango");
        map.put(5, "Lemon");

        // 1. Iterate through the Map using for-each loop

        // Iterating over the entry set of the map (Map.Entry)
        System.out.println("Iterating through Map using for-each loop:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        // 2. Alternatively, you can use for-each to iterate over the keys or values:
        
        // Iterating over keys using for-each loop
        System.out.println("\nIterating through keys using for-each loop:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // Iterating over values using for-each loop
        System.out.println("\nIterating through values using for-each loop:");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }
	
	}
}