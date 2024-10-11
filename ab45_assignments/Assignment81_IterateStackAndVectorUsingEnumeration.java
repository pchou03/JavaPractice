package ab45_assignments;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

//Assignment 81: WAP - for iteration of Stack and Vector using Enumeration

public class Assignment81_IterateStackAndVectorUsingEnumeration {

	public static void main(String[] args) 
	{
		// Create and populate a Stack
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana"); //also we can use add()
        stack.push("Orange");
        stack.push("Grapes");
        stack.push("Mango");

        // Create and populate a Vector
        Vector<String> vector = new Vector<>();
        vector.add("Car");
        vector.add("Bus");
        vector.add("Bicycle");
        vector.add("Motorcycle");
        vector.add("Truck");

        // Iterate through the Stack using Enumeration
        System.out.println("Iterating through the Stack using Enumeration:");
        Enumeration<String> stackEnum = stack.elements();
        while (stackEnum.hasMoreElements()) {
            String fruit = stackEnum.nextElement();
            System.out.println(fruit);
        }

        // Iterate through the Vector using Enumeration
        System.out.println("\nIterating through the Vector using Enumeration:");
        Enumeration<String> vectorEnum = vector.elements();
        while (vectorEnum.hasMoreElements()) {
            String vehicle = vectorEnum.nextElement();
            System.out.println(vehicle);
        }
	}

}
