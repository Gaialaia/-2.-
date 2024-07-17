package OOP;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;

abstract class Animals {

    public int id;
    public String name;
    private String class_name;
    public String type;
    public String gender;
    public String birthdate;
    public String commands;
    
    

    public Animals(int id, String name, String type, String gender, String birthdate, String commands) {
        this.id = id;
        this.name = name;
        this.type = type;
        this. gender = gender;
        this.commands = commands;
        this.birthdate = birthdate;
        
    }


    public String get_class_Name() {
        this.class_name = "Pets";
        return this.getClass().getName();


    }


    public int getId () {
        return id;
    }

    public String getName() {
        return name;
    }

    // public String getKind() {
    //     return kind;
    // }



    public String getType(){
        return type;
    }

    public String getGender() {
        return gender;
    }

    public String getCommands (){
        return commands;
    }

    public String getBirthdate() {
        LocalDate dob = LocalDate.parse(this.birthdate);
        return getBirthdate();
        
    }




    public int setId () {
        return id;
    }

    public String setName() {
        return name;
    }

    public String setType(){
        return type;
    }

    public String setGender() {
        return gender;
    }

    public String setCommands (){
        return commands;
    }

    public LocalDate setBirthdate() {
        return birthdate; // yyyy nn dd
    }



    public String toString() {
        return "Animal [animalId=" + getId()+ ", name=" + getName() + ", type=" + getType()
                + ", lastname=" + getGender() +",commands=" + getCommands() + 
                ", name of class=" + get_class_Name() + ", birthdate=" + getBirthdate() + "]";
    }


   




















    }


  



    
    


