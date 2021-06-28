/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BetaSoftware.PublicParking.view;
import BetaSoftware.PublicParking.model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class PublicParking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int type = 0;
        String mark;
        String licensePlate;
        String color;
        String name;
        double price = 0;
        int code;
        int age;
        String gender;
        String preference;
        int option;
        int ticket;
        boolean scratches;
        boolean rupture;
        boolean collision;
        String dateStart = null;
        String dateStop = null;
        Date d1 = null;
        Date d2 = null;
        int street = 0;
        String jsonCar;
        String jsonDriver;
        String jsonObservation;
        String jsonTicket;
     
             
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");  
        Car cars[] = new Car[1];
        Driver drivers[] = new Driver[1];
        Observation observations[] = new Observation[1];
        Ticket tickets[] = new Ticket[1];
        GsonBuilder gsonBuilder = new GsonBuilder ();
        Gson gson = gsonBuilder.create ();
        
        
    for(int i=0;i<1;i++){
        
        ticket = (i+1);
        code = (i+1);
        System.out.println("\nEnter the car information[" + (i+1) + "]:");
         
        System.out.println("\nSelect of the vehicle:");
        System.out.println("option 0: truck");
        System.out.println("option 1: pickup truck ");
        System.out.println("option 2: automobile");
        System.out.println("option 3: SUV");
        System.out.println("option 4: motorcycle");
        System.out.print("Enter option: ");
        type = entry.nextInt();
        
        System.out.print("\nEnter Mark: ");
        mark = entry.next();
        
        System.out.print("Enter the plate(AAA-000): ");
        licensePlate = entry.next();
        
        System.out.print("Enter the color: ");
        color = entry.next();
        
        System.out.println("\n¿Does your car have any scratches?");
        System.out.print("Enter true/false: ");
        scratches = entry.nextBoolean();
            
        System.out.println("\n¿Does your car have any rupture?");
        System.out.print("Enter true/false: ");
        rupture = entry.nextBoolean();
            
        System.out.println("\n¿Does your car have any collision?");
        System.out.print("Enter true/false: ");
        collision = entry.nextBoolean();
        
        System.out.println("\nEnter customer information:");
        
        System.out.print("Enter first name: ");
        name = entry.next();
        
        System.out.print("Enter age: ");
        age = entry.nextInt();
        
        System.out.print("Enter gender: ");
        gender = entry.next();
        
        System.out.print("Enter preference(yes/no): ");
        preference = entry.next();
         
        System.out.println("\nSelect location:");
        System.out.println("Position 1 : North 50m of the entry, Martin Street");
        System.out.println("Position 2 : South 20m of the entry,Las moras Street");
        System.out.println("Position 3 : East 10m of the entry, Guayacanes Street");
        System.out.println("Position 4 : West 25m of the entry, Cabal Street");
        System.out.print("Enter the option:");
        street = entry.nextInt();
        
        System.out.print("\nEnter check in time(HH:mm): ");
        dateStart = entry.next();
   
        System.out.print("Enter departure time(HH:mm): ");
        dateStop = entry.next();
           
            try {
                d1 = format.parse(dateStart);
                d2 = format.parse(dateStop);
            }catch (ParseException e) {
        }    
        
        long diff = d2.getTime() - d1.getTime();      
        long diffMinutes = diff / (60 * 1000);         
      
        price = diffMinutes * 0.05;
            
        cars[i] = new Car(mark, licensePlate, color);
        drivers[i] = new Driver(name, age, gender, preference, ticket);
        observations[i] = new Observation(scratches, rupture, collision);
        tickets[i] = new Ticket(price, code, dateStart, dateStop);
    }
        for(int i=0;i<1;i++){
        
        if (type == 0){
        System.out.println("\nYour vehicle is a truck");
           }
        if (type == 1){
            System.out.println("\nYour vehicle is a pickup truck");
           }
        if (type == 2){
            System.out.println("\nYour vehicle is a automobile");
           }
        if (type == 3){
            System.out.println("\nYour vehicle is a SUV");
           }
        if (type == 4){
            System.out.println("\nYour vehicle is a motorcycle");
           }

        
        if (street ==1){
            System.out.println("The position of your automobile is: North 50m of the entry, Martin Street"  );  
        }
        if (street ==2){
            System.out.println("The position of your automobile is: South 20m of the entry,Las moras Street");
        }
        if (street ==3) {
            System.out.println("The position of your automobile is: East 10m of the entry, Guayacanes Street");
        }
        if (street ==4){
            System.out.println("The position of your automobile is: West 25m of the entry, Cabal Street ");
        }
         

        System.out.println("The characteristics of your vehicle are: " + cars[i]);
        System.out.println("The observations of your vehicle are: " + observations[i]);
        System.out.println("\nYour information is " + drivers[i]);
        System.out.println("Ticket: " + tickets[i]);
        
        jsonCar = gson.toJson(cars[i]);        
        jsonDriver = gson.toJson(drivers[i]);
        jsonObservation = gson.toJson(observations[i]);
        jsonTicket = gson.toJson(tickets[i]);
        System.out.println("\nJsonInformation car: ");
        
        Car car2;
        car2 = gson.fromJson(jsonCar, Car.class);
            System.out.println("mark -> "+car2.getMark());
            System.out.println("color -> "+car2.getColor());
            System.out.println("licenseplate -> "+car2.getLicensePlate());
        System.out.println("\nJsonInformation driver: ");
        
        Driver driver2;
        driver2 = gson.fromJson(jsonDriver, Driver.class);
            System.out.println("gender -> "+driver2.getGender());
            System.out.println("name -> "+driver2.getName());
            System.out.println("preference -> "+driver2.getPreference());
            System.out.println("age -> "+driver2.getAge());
        System.out.println("\nJsonInformation observation: ");
        
        Observation observation2;
        observation2 = gson.fromJson(jsonObservation,Observation.class);
            System.out.println("collision -> "+observation2.isCollision());
            System.out.println("rupture -> "+observation2.isRupture());
            System.out.println("scratches -> "+observation2.isScratches());
        System.out.println("\nJsonInformation ticket: ");
        
        Ticket ticket2;
        ticket2 = gson.fromJson(jsonTicket, Ticket.class);
            System.out.println("check in -> " + ticket2.getDateStar());
            System.out.println("departure time -> "+ticket2.getDateStop());
            System.out.println("code -> "+ticket2.getCode());
            System.out.println("price -> "+ticket2.getPrice());

          try {
            d1 = format.parse(dateStart);
            d2 = format.parse(dateStop);
        }catch (ParseException e) {
    }    
        
        long diff = d2.getTime() - d1.getTime();       
        long diffMinutes = diff / (60 * 1000);                             
        System.out.println("\nYour vehicle was in the parking lot for " + diffMinutes 
                + " minutes and have to pay a total of " + price + " dollars");
  
      
        }
       
    }                      

}