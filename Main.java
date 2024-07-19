package OOP;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;  

public class Main {
    public static void main(String[] args) throws IOException {

       
      //  Pets pt = new Pets(0, "F", "cat", "male", "2020-02-05", "meow");
       
      //  System.out.println(pt);
      ;

      //  PackAnimals pk = new PackAnimals(0, "Clover", "horse", "male", "2019-05-03", "count");
      //  System.out.println(pk);


       Pets p2 = new Pets(0, null, null, null, null, null);
       p2.setName("Kotty");
       p2.setType("raven");
       p2.setGender("female");
       p2.setCommands("roll over");
       p2.setBirthdate("2020-12-02");
       System.out.println(p2.getCommands());
       System.out.println(p2.getBirthdate());
       System.out.println(p2);


      ArrayList<Object> registry = new ArrayList<Object>();
      // registry.add(p2.getId());
      registry.add(p2.toString());
      System.out.println(registry);

      File regFile = new File("/home/animal_registry.txt");

      FileWriter regWriter = new FileWriter("animal_registry.txt");
      regWriter.write(p2.toString());




      // PackAnimals pa = new PackAnimals(0, "Clover", "horse", 
      // "male", "ballet");

    //   System.out.println(pa);

      // pa.getCommands();


    }




}