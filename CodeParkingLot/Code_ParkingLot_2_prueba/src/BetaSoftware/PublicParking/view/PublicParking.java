/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BetaSoftware.PublicParking.view;
import BetaSoftware.PublicParking.model.*;
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
        int entrada;
        int salida;
        String mark;
        String licensePlate;
        String color;
        String name;
        int age;
        String gender;
        String preference;
        int option;
        int ticket = 0;
        String dateStart = null;
        String dateStop = null ;
        Date d1 = null;
        Date d2 = null;
        int street = 0;
     
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");  
        Car cars[] = new Car[1];
        Driver drivers[] = new Driver[1];
        
    for(int i=0;i<1;i++){
        System.out.println("\nEnter the car information[" + (i+1) + "]:");
        ticket=(i+1);
        
        System.out.println("Select of the vehicle:");
        System.out.println("option 0: truck");
        System.out.println("option 1: pickup truck ");
        System.out.println("option 2: automobile");
        System.out.println("option 3: SUV");
        System.out.println("option 4: motorcycle");
        System.out.print("Enter option: ");
        type = entry.nextInt();
        
        System.out.print("\nEnter mark: ");
        mark = entry.next();
        
        System.out.print("Enter the plate: ");
        licensePlate = entry.next();
        
        System.out.print("Enter the color: ");
        color = entry.next();
        
        System.out.println("\nEnter customer information:");
        
        System.out.print("Enter name: ");
        name = entry.next();
        
        System.out.print("Enter age: ");
        age = entry.nextInt();
        
        System.out.print("Enter gender: ");
        gender = entry.next();
        
        System.out.print("Enter preference: ");
        preference = entry.next();
        
        System.out.print("Enter check in time: ");
        dateStart = entry.next();
   
        System.out.print("Enter departure time: ");
        dateStop = entry.next();
        
        System.out.println("Select location:");
        System.out.println("Position 1 : North 50m of the entry, Martin Street");
        System.out.println("Position 2 : South 20m of the entry,Las moras Street");
        System.out.println("Position 3 : East 10m of the entry, Guayacanes Street");
        System.out.println("Position 4 : West 25m of the entry, Cabal Street");
        System.out.print("Enter the option:");
        street = entry.nextInt();
        
        cars[i] = new Car(mark, licensePlate, color);
        drivers[i] = new Driver(name, age, gender, preference, ticket);

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
            System.out.println("The position of your automobile is: north 50m of the entry, Martin Street"  );  
        }
        if (street ==2){
            System.out.println("The position of your automobile is: south 20m of the entry,Las moras Street");
        }
        if (street ==3) {
            System.out.println("The position of your automobile is: east 10m of the entry, Guayacanes Street");
        }
        if (street ==4){
            System.out.println("The position of your automobile is: west 25m of the entry, Cabal Street ");
        }
         
        System.out.println("The characteristics of your vehicle are: " + cars[i]);
        System.out.println("\nYour information is " + drivers[i]);
               
        try {
            d1 = format.parse(dateStart);
            d2 = format.parse(dateStop);
        }catch (ParseException e) {
          e.printStackTrace();
    }    
        
        long diff = d2.getTime() - d1.getTime();
        long diffSeconds = diff / 1000;         
        long diffMinutes = diff / (60 * 1000);         
        long diffHours = diff / (60 * 60 * 1000);                      
      //System.out.println("Time in seconds: " + diffSeconds + " seconds.");         
        System.out.println("Time in minutes: " + diffMinutes);         
        System.out.println("Time in hours: " + diffHours + " hours.");  
        
        }
       
    }                      

}