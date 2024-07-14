package OOP;

import java.time.LocalDate;
import java.util.Date;

abstract class Animals {

    public int id;
    public String name;
    public String type;
    public String gender;

    public String commands;

    public Animals(int id, String name, String type, String gender, String commands) {
        this.id = id;
        this.name = name;
        this.type = type;
        this. gender = gender;
        this.commands = commands;

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


    public String toString() {
        return "Animal [animalId=" + getId()+ ", name=" + getName() + ", type=" + getType()
                + ", lastname=" + getGender() +",commands=" + getCommands() + "]";
    }


   




















    }


  



    }
    


