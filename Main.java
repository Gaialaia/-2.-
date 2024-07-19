package OOP;

public class Main {
    public static void main(String[] args) {

       
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
       p2.setBirthdate("2020-15-02");
       System.out.println(p2.getCommands());
       System.out.println(p2.getBirthdate());



      // PackAnimals pa = new PackAnimals(0, "Clover", "horse", 
      // "male", "ballet");

    //   System.out.println(pa);

      // pa.getCommands();


    }




}