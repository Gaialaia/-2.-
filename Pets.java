package OOP;
import java.time.LocalDate;

public class Pets extends Animals {

   

    public Pets(int id, String name, String type, String gender, String birthdate, String commands) {
        super(id, name, type, gender, birthdate, commands);
    
        
    }


    public String toString() {
        return "[petId=" + super.getId() + ", type=" + super.getType() + ", gender=" + super.getGender()
                + ", commands=" + super.getCommands() +", name of class=" + super.get_class_Name() + 
                ", birthdate=" + super.getBirthdate() +"]";
    
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
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    public String getBirthdate() {
        LocalDate dob = LocalDate.parse(birthdate);
        return getBirthdate();
       
        
    }

    @Override
    public String setCommands() {
        return super.setCommands();
    }

    @Override
    public String setGender() {
     
        return super.setGender();
    }

    @Override
    public int setId() {

        return super.setId();
    }

    @Override
    public String setName() {
        return super.setName();
    }

    @Override
    public String setType() {
        return super.setType();
    }

    @Override
    public LocalDate setBirthdate() {
        return setBirthdate(); // yyyy nn dd
    }


};
