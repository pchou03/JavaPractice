package ab45_assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Assignment 79: WAP - for  iteration of ArrayList using iterator

public class Assignment79_IterateArrayListUsingIterator {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Mango");


        ListIterator<String> listIterator = list.listIterator();

        
        System.out.println("Iterating through the ArrayList using ListIterator (Forward):");
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }

        
        // Iterate through the ArrayList using ListIterator in backward direction
        System.out.println("\nIterating through the ArrayList using ListIterator (Backward):");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }
	}

}
