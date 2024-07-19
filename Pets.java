package OOP;
import java.time.LocalDate;

public class Pets extends Animals {

   

    public Pets(int id, String name, String type, String gender, String birthdate, String commands) {
        super(id, name, type, gender, birthdate, commands);
    
        
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

    public LocalDate getBirthdate() {
        LocalDate dob = LocalDate.parse(birthdate);
        return dob;

    }
       
        
    // public String toString() {
    //     return "[petId=" + super.getId() + ", type=" + super.getType() + ", gender=" + super.getGender()
    //             + ", commands=" + super.getCommands() +", name of class=" + super.get_class_Name() + 
    //             ", birthdate=" + super.getBirthdate() +"]";
    
    // }
    


    public String toString() {
        return super.getId()+ "," + super.getName() + "," + super.getType() + "," + super.getGender() + 
        "," + super.getCommands() + "," + super.get_class_Name() + ","+ getBirthdate();
    }

    @Override
    public void setCommands(String commands) {
        super.setCommands(commands);
    }

    

    @Override
    public void setId(int id) {
        // TODO Auto-generated method stub
        super.setId(id);
    }



    @Override
    public void setType(String type) {
        // TODO Auto-generated method stub
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



   


    

    



};
