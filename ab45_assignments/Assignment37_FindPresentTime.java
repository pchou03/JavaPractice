package ab45_assignments;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Assignment37_FindPresentTime {

	    public static void main(String[] args) {
	        // Get the current time
	        LocalTime currentTime = LocalTime.now();
	        
	        // Define a formatter for displaying time
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
	        
	        // Format the current time
	        String formattedTime = currentTime.format(formatter);
	        
	        // Print the current time
	        System.out.println("Current Time: " + formattedTime);
	    }
	}
