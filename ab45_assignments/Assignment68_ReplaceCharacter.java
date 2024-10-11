package ab45_assignments;

//Assignment 68: WAP - In "Manish" replace 'h' with 'z'

public class Assignment68_ReplaceCharacter 
{

    public static void main(String[] args) {
        
        // Original string
        String name = "Manish";
        System.out.println("Original Name: "+name);
        
        // Replace 'h' with 'z'
        String updatedName = name.replace('h', 'z');
        System.out.println("Updated name: " + updatedName);
    }
}

