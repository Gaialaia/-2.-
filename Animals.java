package OOP;

import java.time.LocalDate;


abstract class Animals {

    public static int id;
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


    public String getType(){
        return type;
    }

    public String getGender() {
        return gender;
    }

    public String getCommands (){
        return commands;
    }

    public LocalDate getBirthdate() {
        LocalDate dob = LocalDate.parse(this.birthdate);
        return dob;
        
    }




    public void setId (int id) {
        this.id = id;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setType (String type){
        this.type = type;
    }

    public void setGender(String gender) {
        this.gender = gender;

    }

    public void setBirthdate (String birthdate) {
       this.birthdate = birthdate;

    }

    public void setCommands (String commands){
        this.commands = commands;
    }

    public String toString() {
        return getId() + "," + getName() + "," + getType() + ","+ getGender() + "," 
        + getCommands() + "," + get_class_Name() + "," + getBirthdate();
    }
};


    // public String toString() {
    //     return "Animal [animalId=" + getId()+ ", name=" + getName() + ", type=" + getType()
    //             + ", lastname=" + getGender() +",commands=" + getCommands() + 
    //             ", name of class=" + get_class_Name() + ", birthdate=" + getBirthdate() + "]";
    // }


   




















    


  



    
    


