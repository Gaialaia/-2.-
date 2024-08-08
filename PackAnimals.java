package OOP;

import java.time.LocalDate;

public class PackAnimals extends Animals {

    public PackAnimals(String name, String type, String gender, String birthdate, String commands) {
        super(name, type, gender, birthdate, commands);
       
    }

    @Override
    public String getCommands() { 
        return super.getCommands();
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    

    @Override
    public LocalDate getBirthdate() {
        LocalDate dob = LocalDate.parse(birthdate);
        return super.getBirthdate();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getType() {
        return super.getType();

    }

    @Override
    public String get_class_Name() {
        
        return super.get_class_Name();
    }

    @Override
    public void setCommands(String commands) {
        
        super.setCommands(commands);
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    public void setType(String type) {

        super.setType(type);
    }

    @Override
    public String toString() {
        return "Animal [name=" + super.getName() + ", type=" + super.getType()
        + ", lastname=" + super.getGender() +", birthdate=" + super.getBirthdate() + ",commands=" + super.getCommands() 
        + ", name of class=" + super.get_class_Name() + "]";
    }

    
    
};


