package OOP;

public class PackAnimals extends Animals {

    public PackAnimals(int id, String name, String type, String gender, String commands) {
        super(id, name, type, gender, commands);
       
    }

    @Override
    public String getCommands() {
        // TODO Auto-generated method stub
        return super.getCommands();
    }

    @Override
    public String getGender() {
        // TODO Auto-generated method stub
        return super.getGender();
    }

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return super.getType();
    }

    @Override
    public String get_class_Name() {
        // TODO Auto-generated method stub
        return super.get_class_Name();
    }

    @Override
    public String setCommands() {
        // TODO Auto-generated method stub
        return super.setCommands();
    }

    @Override
    public String setGender() {
        // TODO Auto-generated method stub
        return super.setGender();
    }

    @Override
    public int setId() {
        // TODO Auto-generated method stub
        return super.setId();
    }

    @Override
    public String setName() {
        // TODO Auto-generated method stub
        return super.setName();
    }

    @Override
    public String setType() {
        // TODO Auto-generated method stub
        return super.setType();
    }

    @Override
    public String toString() {
        return "Animal [animalId=" + getId()+ ", name=" + getName() + ", type=" + getType()
        + ", lastname=" + getGender() +",commands=" + getCommands() + ", name of class=" + get_class_Name() + "]";
    }

    
    
}
