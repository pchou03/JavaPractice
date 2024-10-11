package ab45_assignments;

import java.lang.StringBuffer;

//Assignment 89: WAP - for  StringBuffer and its methods
//	append, insert, replace, delete, reverse, capacity, CharAt, length, substring etc

public class Assignment89_StringBufferMethods 
{
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello World!");

        // 1. append() - Adds the specified string to the end of the StringBuffer
        sb.append(" How are you?");
        System.out.println("After append: " + sb);

        // 2. insert() - Inserts the specified string at the specified index
        sb.insert(13, "Java ");
        System.out.println("After insert: " + sb);

        // 3. replace() - Replaces a substring within the StringBuffer with a new string
        sb.replace(13, 17, "Programming");
        System.out.println("After replace: " + sb); 

        // 4. delete() - Deletes a substring from the StringBuffer
        sb.delete(13, 25);  
        System.out.println("After delete: " + sb); 

        // 5. reverse() - Reverses the entire StringBuffer content
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. capacity() - Returns the current capacity of the StringBuffer
        System.out.println("Capacity: " + sb.capacity());  // Output: Capacity: 32 (default capacity is 16 + length of the string)

        // 7. charAt() - Returns the character at the specified index
        System.out.println("Character at index 5: " + sb.charAt(5));

        // 8. length() - Returns the current length of the StringBuffer
        System.out.println("Length: " + sb.length()); 

        // 9. substring() - Extracts a substring from the StringBuffer
        String subStr = sb.substring(2, 10);
        System.out.println("Substring (2, 10): " + subStr);  
    }
}

