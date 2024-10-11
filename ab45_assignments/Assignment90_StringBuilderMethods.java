package ab45_assignments;


//Assignment 90: WAP - for  StringBuilder and its methods
//		append, insert, replace, delete, reverse, capacity, CharAt, length, substring etc

public class Assignment90_StringBuilderMethods 
{
	public static void main(String[] args) 
	{
		
	StringBuilder sb = new StringBuilder("ABCD EFGH IJKL ");

    // 1. append() - Adds the specified string to the end of the StringBuilder
    sb.append("MNOP");
    System.out.println("After append: " + sb);

    // 2. insert() - Inserts the specified string at the specified index
    sb.insert(15, "QRST ");
    System.out.println("After insert: " + sb);

    // 3. replace() - Replaces a substring within the StringBuilder with a new string
    sb.replace(15, 18, "UVW");
    System.out.println("After replace: " + sb);

    // 4. delete() - Deletes a substring from the StringBuilder
    sb.delete(15, 25);  
    System.out.println("After delete: " + sb);

    // 5. reverse() - Reverses the entire StringBuilder content
    sb.reverse();
    System.out.println("After reverse: " + sb);

    // 6. capacity() - Returns the current capacity of the StringBuilder
    System.out.println("Capacity: " + sb.capacity());  // Output: Capacity: 32 (default capacity is 16 + length of the string)

    // 7. charAt() - Returns the character at the specified index
    System.out.println("Character at index 6: " + sb.charAt(6));

    // 8. length() - Returns the current length of the StringBuilder
    System.out.println("Length: " + sb.length());

    // 9. substring() - Extracts a substring from the StringBuilder
    String subStr = sb.substring(2, 10);
    System.out.println("Substring (2, 10): " + subStr);
}
    
}

