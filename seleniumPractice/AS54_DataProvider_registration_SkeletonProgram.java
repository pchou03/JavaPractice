package testNgAssignmens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//Assignment 54: WAP (Skeleton program) to do registration using below fields
//				FirstName, LastName, DOB, Gender, EmailID

public class AS54_DataProvider_registration_SkeletonProgram {

	@DataProvider(name = "set1")
	public Object[][] registrationData() {
		
		Object[][] data1 = new Object[10][5];
		// row1
		data1[0][0] = "Prashant";
		data1[0][1] = "Chougale";
		data1[0][2] = "20/03/1996";
		data1[0][3] = "Male";
		data1[0][4] = "Prashant@gmail.com";
		
		// row2
		data1[1][0] = "kalyani";
		data1[1][1] = "Chougale";
		data1[1][2] = "26/03/1996";
		data1[1][3] = "Female";
		data1[1][4] = "kalyani@gmail.com";
		
		// row3
		data1[2][0] = "Saaisha";
		data1[2][1] = "Chougale";
		data1[2][2] = "07/07/2023";
		data1[2][3] = "Female";
		data1[2][4] = "Saaisha@gmail.com";
		
		// row4
		data1[3][0] = "Pandurang";
		data1[3][1] = "Chougale";
		data1[3][2] = "05/10/1973";
		data1[3][3] = "Male";
		data1[3][4] = "Pandurang@gmail.com";		
		
		// row5
		data1[4][0] = "Surekha";
		data1[4][1] = "Chougale";
		data1[4][2] = "05/10/1980";
		data1[4][3] = "Male";
		data1[4][4] = "Surekha@gmail.com";
		
		// row6
		data1[5][0] = "Amit";
		data1[5][1] = "Patil";
		data1[5][2] = "15/04/1990";
		data1[5][3] = "Male";
		data1[5][4] = "amitpatil@gmail.com";

		// row7
		data1[6][0] = "Sneha";
		data1[6][1] = "Desai";
		data1[6][2] = "18/09/1995";
		data1[6][3] = "Female";
		data1[6][4] = "snehadesai@gmail.com";

		// row8
		data1[7][0] = "Rohan";
		data1[7][1] = "Kadam";
		data1[7][2] = "21/11/1992";
		data1[7][3] = "Male";
		data1[7][4] = "rohankadam@gmail.com";

		// row9
		data1[8][0] = "Neha";
		data1[8][1] = "Shinde";
		data1[8][2] = "02/02/1988";
		data1[8][3] = "Female";
		data1[8][4] = "nehashinde@gmail.com";

		// row10
		data1[9][0] = "Rahul";
		data1[9][1] = "Jadhav";
		data1[9][2] = "28/06/1993";
		data1[9][3] = "Male";
		data1[9][4] = "rahuljadhav@gmail.com";

		return data1;

	}

	@Test(dataProvider = "set1")
	public void registrationProcess(String fname, String lname, String DOB, String sex, String email) 
	{
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(DOB);
		System.out.println(sex);
		System.out.println(email + "\n");
	}

}
