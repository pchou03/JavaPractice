package ab45_assignments;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;

//Assignment 85 WAP - to find the properties of Queue -> 
// Indexing | Duplicates | Null | Hetrogenious | Dynamic size | Sorted | 
// Iteration using Iterator and ListIterator |

public class Assignment85_Properties_Queue_Interface {

	public static void main(String[] args) 
	{
		// Create a Queue using LinkedList (implements Queue)
        Queue<Object> queue = new LinkedList<>();
        
        // Adding elements to the Queue
        queue.add("Apple");      // String
        queue.add(10);           // Integer
        queue.add(3.14);         // Double
        queue.add(true);         // Boolean
        queue.add(null);         // Null value
        queue.add("Banana");     // String
        queue.add(10);           // Duplicate Integer (10)
        
        // Create a PriorityQueue (Sorted order)
        Queue<Object> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Apple");
        priorityQueue.add("Banana");
        priorityQueue.add("Orange");
        
        // 1. Indexing (Not supported in Queue)
        System.out.println("Queue (LinkedList) Elements: " + queue);
        // Queues do not support indexing directly.

        // 2. Duplicates
        System.out.println("\nQueue (LinkedList) with Duplicates: " + queue);

        // 3. Null
        System.out.println("\nDoes Queue (LinkedList) contain null? " + queue.contains(null));

        // 4. Heterogeneous (Queues can store different types of elements)
        System.out.println("\nQueue (LinkedList) with Heterogeneous Elements: " + queue);

        // 5. Dynamic Size (Adding another element to grow the size)
        queue.add(500);  // Adding another element to increase size
        System.out.println("\nQueue (LinkedList) after adding element 500: " + queue);

        // 6. Sorted (PriorityQueue stores elements in sorted order)
        System.out.println("\nPriorityQueue (Sorted): " + priorityQueue);

        // 7. Iteration using Iterator
        System.out.println("\nIterating Queue (LinkedList) using Iterator:");
        Iterator<Object> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 8. Iteration using ListIterator (Not applicable to Queue directly)
        // ListIterator only works with List, not Queue.
        // So we demonstrate using LinkedList as a List.
        System.out.println("\nIterating LinkedList using ListIterator:");
        ListIterator<Object> listIterator = ((LinkedList<Object>) queue).listIterator();
        while (listIterator.hasNext()) 
        {
            System.out.println(listIterator.next());
        }
    }
}