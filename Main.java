package OOP;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

       
      //  Pets pt = new Pets(0, "F", "cat", "male", "2020-02-05", "meow");
       
      //  System.out.println(pt);
      //  PackAnimals pk = new PackAnimals(0, "Clover", "horse", "male", "2019-05-03", "count");
      //  System.out.println(pk);


       Pets p2 = new Pets(0, null, null, null, null, null);
       p2.setName("Kotty");
       p2.setType("raven");
       p2.setGender("female");
       p2.setCommands("roll over");
       p2.setBirthdate("2020-12-02");

       Pets p3 = new Pets(1, "Ink", "cat", "m", "2021-08-07", "splits");
      //  System.out.println(p2.getCommands());
      //  System.out.println(p2.getBirthdate());
      //  System.out.println(p2);

      Pets [] PetsArray =  new Pets[5];
      PetsArray [0] = p2;
      PetsArray [1] = p3;

      for (int i = 0; i < PetsArray.length; i++ ) {
        String outputText = PetsArray[i].getName() + PetsArray[i].getType() + 
        PetsArray[i].getGender() + PetsArray[i].getBirthdate() + 
        PetsArray[i].getId() + PetsArray[i].getCommands() + 
        PetsArray[i].get_class_Name();

        // saveToFile("animal_registry.txt", outputText, true);


      FileWriter regWriter = new FileWriter("animal_registry.txt");
      regWriter.write(p2.toString());
      regWriter.close();



     

      regWriter.write(());
      regWriter.close();




      }




      


     


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


    }




};