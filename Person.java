package OOP;

import java.time.LocalDate; 

public class Person {
    //Local variable for dateOfBirth
    private LocalDate dateOfBirth;    

    public Person(int year, int month, int day) {
        //See API also: https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html#of-int-int-int-
        dateOfBirth = LocalDate.of(year, month, day);
    }

    //Getter
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
};

