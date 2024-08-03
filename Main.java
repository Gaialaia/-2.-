package OOP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset.Concurrency;


public class Main {
    public static void main(String[] args) throws SQLException {

       Pets p2 = new Pets(null, null, null, null, null);
       p2.setName("Kotty");
       p2.setType("raven");
       p2.setGender("female");
       p2.setCommands("roll over");
       p2.setBirthdate("2020-12-02");
       System.out.println(p2);
       System.out.print(p2.getCount());
       

       Pets p3 = new Pets( "Ink", "cat", "m", "2021-08-07", "splits");
      


       Pets p4 = new Pets(null, null, null, null, null);
       p4.setName("Pencil");
       p4.setType("parrot");
       p4.setGender("male");
       p4.setBirthdate("2018-05-05");
     
      //  Connection hf = DriverManager.getConnection(dburl, username, password);
      //  Statement myStatement = hf.createStatement();




      //  String sqlQuery = "INSERT INTO Pets VALUES" + "(" + "id" + "," + p4.getName() + "," + p4.getType() + ","
      //     + p4.getGender() + "," + p4.getBirthdate() + "," + p4.getCommands() + ");";

      // PreparedStatement ps = hf.prepareStatement
      // ("INSERT INTO Pets (name, type, gender, birthdate, commands) VALUES (?, ?,?,?,?)");


    
      // ps.setString(1, p2.getName());
      // ps.setString(2, p2.getType());
      // ps.setString(3, p2.getGender());
      // ps.setObject(4, p2.getBirthdate());
      // ps.setString(5, p2.getCommands());
      // ps.executeUpdate();
      // ps.close();


      Pets p5 = new Pets(null, null, null, null, null);




      PackAnimals hs = new PackAnimals(null, null, null, null, null);
      System.out.println(hs.getCount());


      System.out.println(p2.getCount());
      // System.out.println(p3.getCount());

      Pets p7 = new Pets("whiskas", "cat", "male", "2020-02-06", "per");
      System.out.println(p3.getCount());
      Pets p8 = new Pets ("whiskas", "cat", "female", "2015-02-06", "per");
      System.out.println(p8.getCount());
      PackAnimals hs1 = new PackAnimals("molly", "cow", "female", "2022-02-02", "three leg trot");
      System.out.println(hs1.getCount());

      List<Object> Petslist = new ArrayList<Object>();
      Petslist.add(p2.getName());
      Petslist.add(p2.getType());
      Petslist.add(p2.getBirthdate());
      Petslist.add(p2.getCommands());
      Petslist.add(p2.getCount());

     
      Petslist.add(p3);
      System.out.println(Petslist);



    








     


       
     

        

      



     

  


  
                                                                                                               
      
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


    




