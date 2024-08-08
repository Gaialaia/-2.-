package OOP;
import java.time.LocalDate;

public class Pets extends Animals {


    public Pets(String name, String type, String gender, String birthdate, String commands) {
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
    public String getName() {
        return super.getName();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    public LocalDate getBirthdate() {
        LocalDate dob = LocalDate.parse(birthdate);
        return dob;

    }
    


    public String toString() {
        return super.getName() + "," + super.getType() + "," + super.getGender() + 
        "," + super.getCommands() + "," + super.get_class_Name() + ","+ getBirthdate();
    }

    @Override
    public void setCommands(String commands) {
        super.setCommands(commands);
    }




    @Override
    public void setType(String type) {
        super.setType(type);
    }



    @Override
    public void setName(String name) {
        super.setName(name);
    }


    @Override
    public void setGender(String name) {
        super.setGender(name);
    }



    @Override
    public void setBirthdate(String birthdate) {
        super.setBirthdate(birthdate);
    }



    @Override
    public void setCount(int count) {
       
        super.setCount(count);
    }


   };


    



