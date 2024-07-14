package OOP;

public class Pets extends Animals {

    public Pets(int id, String name, String type, String gender, String commands) {
        super(id, name, type, gender, commands);
        
    }

    public String toString() {
        return "Student [petId=" + super.getId() + ", type=" + super.getType() + ", gender=" + super.getGender()
                + ", commands=" + super.getCommands() + "]";
    
    }

}
