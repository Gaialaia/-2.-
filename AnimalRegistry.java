package OOP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.sql.SQLException;
import java.sql.Statement;

public class AnimalRegistry {
    public static void main(String[] args) {

        String dburl = "jdbc:mysql://localhost:3306/HumanFriends";
        String username = "root";
        String password = "mysql17";

        List<Object> AnimalRegList = new ArrayList<Object>();
        Scanner AnReg = new Scanner(System.in);
        System.out.println("Enter \n add to add an animal to the registry, \n bd - to list animals ordered by birthdate, \n tr - to train animal new ccommands, \n cmd - to see what commands an animal knows ");
        String choice = AnReg.next();
    
    
        switch (choice) {
            case "add":

            Scanner AddAnimal = new Scanner(System.in);
            System.out.println("What animal do you cant to add?");
            String AnimalType = AddAnimal.next();
            String[] PetsArray = new String[] {"cat", "dog", "pugmy hog", "rabbit"};
            String[] PackAnimalsArr = new String[] {"horse", "cow", "goat", "camel", "donkey"};
            for (String a : PetsArray) { 
            for (String b : PackAnimalsArr) 
            if (AnimalType.equals(a)) {

            Pets obj = new Pets(null, null, null, null, null);
            Scanner AddName = new Scanner(System.in);
            System.out.println("Write pets name: ");
            String PetsName = AddName.nextLine();
            obj.setName(PetsName);
            AnimalRegList.add(obj.getName());
            
            obj.setType(AnimalType);
            AnimalRegList.add(obj.getType());

            Scanner AddGender = new Scanner(System.in);
            System.out.println("Write pets gender: ");
            String PetsGender = AddGender.nextLine();
            obj.setGender(PetsGender);
            AnimalRegList.add(obj.getGender());


            Scanner AddBirthdate = new Scanner(System.in);
            System.out.println("Write pets birthdate: ");
            String PetsBD = AddBirthdate.nextLine();
            obj.setBirthdate(PetsBD);
            AnimalRegList.add(obj.getBirthdate());


            Scanner AddCommands = new Scanner(System.in);
            System.out.println("Write commands: ");
            String PetsCommands = AddCommands.nextLine();
            obj.setCommands(PetsCommands);
            AnimalRegList.add(obj.getCommands());
            AnimalRegList.add(obj.getCount());
            System.out.println(AnimalRegList);
            


                try {

                    Connection myConnection = DriverManager.getConnection(dburl, username, password);
                
                    PreparedStatement ps = myConnection.prepareStatement
                    ("INSERT INTO Pets (name, type, gender, birthdate, commands) VALUES (?, ?,?,?,?)");

                    ps.setString(1, obj.getName());
                    ps.setString(2, obj.getType());
                    ps.setString(3, obj.getGender());
                    ps.setObject(4, obj.getBirthdate());
                    ps.setString(5, obj.getCommands());
                    ps.executeUpdate();
                    ps.close();

                }

                catch(Exception e) {
                System.out.println(e.getMessage());

                }



                
            }   else if (AnimalType.equals(b)) {
                
                PackAnimals obj = new PackAnimals(null, null, null, null, null);
                Scanner AddName = new Scanner(System.in);
                System.out.println("Write pack animal name: ");
                String PetsName = AddName.nextLine();
                obj.setName(PetsName);

                obj.setType(AnimalType);
    
                Scanner AddGender = new Scanner(System.in);
                System.out.println("Write pets gender: ");
                String PetsGender = AddGender.nextLine();
                obj.setGender(PetsGender);
    
    
                Scanner AddBirthdate = new Scanner(System.in);
                System.out.println("Write pets birthdate: ");
                String PetsBD = AddBirthdate.nextLine();
                obj.setBirthdate(PetsBD);
    
    
                Scanner AddCommands = new Scanner(System.in);
                System.out.println("Write commands: ");
                String PackAnimalCommands = AddCommands.nextLine();
                obj.setCommands(PackAnimalCommands);
                
    
    
                    try {

    
                        Connection myConnection = DriverManager.getConnection(dburl, username, password);
                    
                        PreparedStatement pa = myConnection.prepareStatement
                        ("INSERT INTO PackAnimals (name, type, gender, birthdate, commands, count) VALUES (?, ?,?,?,?,?)");
    
                        pa.setString(1, obj.getName());
                        pa.setString(2, obj.getType());
                        pa.setString(3, obj.getGender());
                        pa.setObject(4, obj.getBirthdate());
                        pa.setString(5, obj.getCommands());
                        pa.setInt(6, Counter.getCount());
                        pa.executeUpdate();
                        pa.close();
    
                    }
    
                    catch(Exception e) {
                    System.out.println(e.getMessage());
    
                    }

                break;

            } else  {
                System.out.println("");
            }


            break;
        }
            case "bd":

            System.out.println("Show animal data based on their birthdate:");
            System.out.println("id, name, type, gendert, birtdate, commands:");
                
            try 
                (Connection db = DriverManager.getConnection(dburl, username, password);                                                                                                                
                Statement st = db.createStatement();) {   
                String query = "Select id, name, type, gender, birthdate, commands from Pets";                                                                                                                  
                ResultSet rSet = st.executeQuery(query + " ORDER BY birthdate DESC ");                                                                                                           
    	      
                while(rSet.next()){

                    
                    System.out.print(rSet.getInt("id" ));
                    System.out.print(", " + rSet.getString("name"));
                    System.out.print(", " + rSet.getString("type"));
                    System.out.print(", "  + rSet.getString("gender"));
                    System.out.print(", "  + rSet.getString("birthdate"));
                    System.out.println(", "  + rSet.getString("commands"));
                }

                } catch (SQLException e) {
                    e.printStackTrace();
                   
                }

            break;

            case "tr":

            Scanner TrainAimal = new Scanner(System.in);
            System.out.println("Insert an animal name you want to train: ");
            String AnimalName = TrainAimal.next();
            try 
            
            (Connection db = DriverManager.getConnection(dburl, username, password);                                                                                                                
            Statement st = db.createStatement();) {   
            String query = "Select id, name, commands from Pets where name = " + " ' " + AnimalName + " ' ";                                                                                                                  
            ResultSet rSet = st.executeQuery(query);                                                                                                         
          
            while(rSet.next()){
                int id = rSet.getInt("id");
                String name = rSet.getString("name");
                String commands = rSet.getString("commands");
                System.out.format("%s, %s, %s\n", id, name, commands);
            }

            } catch (SQLException e) {
                e.printStackTrace();
               
            }

            break;         

            case "cmd":
            try 
                (Connection cmd = DriverManager.getConnection(dburl, username, password);
                Statement st = cmd.createStatement();) {
                ResultSet rSet = st.executeQuery("Select * from Pets order by id desc LIMIT 1; ");

                while(rSet.next()) {
                    System.out.print(", " + rSet.getString("name"));
                    System.out.println(", "  + rSet.getString("commands"));

                } 
                  
                }catch (SQLException e) {
                    e.printStackTrace();
                   
                }

    

            break;

            }


        }

    };

    

    





        
    

    




      

       



    



    

    

    
    

