package OOP;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AddAnimal {

    private static final String filepath=("/home/gaia/Specialization Finall Test/tests/students.txt");
 
    public static void main(String args[]) {
 
        // AddAnimal objectIO = new AddAnimal();
    }
  
    public void WriteObjectToFile(Object serObj) {
 
        try {
 
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
};