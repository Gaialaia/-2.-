package OOP;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
 
      
    Pets p3 = new Pets( "Ink", "cat", "m", "2021-08-07", "splits");
      
    Pets p5 = new Pets(null, null, null, null, null);


    Pets p7 = new Pets("whiskas", "cat", "male", "2020-02-06", "per");
     
    
    Pets p8 = new Pets ("whiskas", "cat", "female", "2015-02-06", "per");
      
    PackAnimals hs1 = new PackAnimals("molly", "cow", "female", "2022-02-02", "three leg trot");
      
    System.out.println("All animals:" + Animals.getCount());

    ArrayList<Pets> pets = new ArrayList<>();
    pets.add(p7);
    
      try{
        FileOutputStream writeData = new FileOutputStream("animal_reg.ser");
        ObjectOutputStream writeStream = new ObjectOutputStream(writeData);
    
        writeStream.writeObject(pets);
        writeStream.flush();
        writeStream.close();
    
    }catch (IOException e) {
        e.printStackTrace();
    }

    try{
    FileInputStream readData = new FileInputStream("animal_reg.ser");
    ObjectInputStream readStream = new ObjectInputStream(readData);

    ArrayList<Pets> pets2 = (ArrayList<Pets>) readStream.readObject();
    readStream.close();

    }catch (Exception e) {
    e.printStackTrace();
    }

  
                                                                                     
}
};





                                                                                                                 
 

     






     

     


     






    




      


     


      // ArrayList<Object> registry = new ArrayList<Object>();
      // // registry.add(p2.getId());
      // registry.add(p2.toString());
      // System.out.println();
      // System.out.println(p2.toString());


      





      
    


      // FileWriter regWriter = new FileWriter("animal_registry.txt");
      // regWriter.write(p2.toString());
      // regWriter.close();




      // PackAnimals pa = new PackAnimals(0, "Clover", "horse", 
      // "male", "ballet");

    //   System.out.println(pa);

      // pa.getCommands();


    




