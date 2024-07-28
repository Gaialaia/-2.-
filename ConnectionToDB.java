package OOP;

import java.sql.*;

    public class ConnectionToDB{
        public static void main(String[] args) {
            try {

                String dburl="jdbc:mysql://localhost:3306/HumanFriends";
                String username = "root";
                String password = "mysql17";
                // step 1 : get connection                                                                                                                    
                Connection myConnection = DriverManager.getConnection(dburl, username, password);
                // create stmnt object step 2                                                                                                                 
                Statement myStatement = myConnection.createStatement();
                // step 3 execute query                                                                                                                       
                ResultSet myResultSet = myStatement.executeQuery("Select * from Pets where id = 7");
                // step 4 process the result set                                                                                                              
                while (myResultSet.next()){
                    System.out.println("horse name is "+myResultSet.getString("name") + " " + myResultSet.getString("birthdate"));

                }


            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    };


