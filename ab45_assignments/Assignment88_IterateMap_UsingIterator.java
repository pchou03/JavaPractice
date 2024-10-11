package ab45_assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//Assignment 88: WAP - for Map.Iterate through map elements using Iterator

public class Assignment88_IterateMap_UsingIterator {

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

     // 1. Iterating over Map using Iterator (entrySet)
        System.out.println("Iterating through Map using Iterator (entrySet):");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 2. Alternatively, you can iterate over keys and values using Iterator
        // Iterating over keys using Iterator
        System.out.println("\nIterating through keys using Iterator:");
        Iterator<Integer> keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            Integer key = keyIterator.next();
            System.out.println("Key: " + key);
        }

        // Iterating over values using Iterator
        System.out.println("\nIterating through values using Iterator:");
        Iterator<String> valueIterator = map.values().iterator();
        while (valueIterator.hasNext()) {
            String value = valueIterator.next();
            System.out.println("Value: " + value);
        }
	
	}
}