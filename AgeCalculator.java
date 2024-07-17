package OOP;


import java.time.LocalDate; 
import java.time.Period; 

public class AgeCalculator {
    // Main Function 
    public static void main(String[] args) { 
        // Birthdate 
        LocalDate birthdate = LocalDate.of(1986,2,17); 
        System.out.println(birthdate);
  
        // Current Date 
        LocalDate currentDate = LocalDate.now(); 
  
        // Calculate Age 
        int age = calculateAge(birthdate, currentDate); 
  
        // Print Age 
        System.out.println("Age: " + age + " years"); 
    } 
  
    public static int calculateAge(LocalDate birthdate, LocalDate currentDate) { 
        // Calculate period between birthdate and current date 
        Period period = Period.between(birthdate, currentDate); 
          
          return period.getYears(); 
    }

};
