package OOP;

import java.text.ParseException;  
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;  
import java.util.Scanner;  



public class Main1 {
    // public static void main(String[] args) {
 
            //     Scanner sc = new Scanner(System.in);  
            //     // Prompt the user to enter a date  
            //     System.out.print("Enter a date (yyyy-MM-dd): ");  
            //     // Read the input using the next() method  
            //     String dateStr = sc.next();  
            //     // Parse the input string into a Date object using SimpleDateFormat  
            //     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
            //     try {  
            //         Date date = sdf.parse(dateStr);  
            //         System.out.println("Input date: " + sdf.format(date));  
            //     } catch (ParseException e) {  
            //         System.out.println("Invalid date format");  
            //     }  
            //     sc.close();  
            // }  
    
            

     public static void main(String[] args) throws Exception {
		String userGivenDate;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your DOB in YYYY-MM-DD format: ");
		userGivenDate = sc.nextLine();

		LocalDate dob = LocalDate.parse(userGivenDate); //birthdate
		System.out.println("DOB of user is " + dob);
       
		System.out.println(dob.getClass());


		sc.close();
	}

};
    
      

