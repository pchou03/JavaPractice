package ab45_assignments;

import java.util.ArrayList;
import java.util.Iterator;

//Assignment 80: WAP - for  iteration of ArrayList using ListIterator

public class Assignment80_IterateArrayListUsingListIterator2 {

	public static void main(String[] args) {


		ArrayList<String> list= new ArrayList<>();
		
		list.add("Prashant");
		list.add("Sushant");
		list.add("Mandar");
		list.add("Eshan");
		list.add("Kedar");
		list.add("Rashmi");
		
		Iterator<String> iterator = list.iterator();	

        System.out.println("Iterating through the ArrayList using Iterator:");

        // Iterate using hasNext() and next()
        while (iterator.hasNext()) {
            String names = iterator.next();
            System.out.println(names);
        }
	}

}
