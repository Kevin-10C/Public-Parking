/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BetaSoftware.PublicParking.view;

import BetaSoftware.PublicParking.model.*;
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
        Car car;
        int type;
        String mark;
        String licensePlate;
        String color;
        String name;
        int age;
        String gender;
        String preference;
        car = new Car ();
        Driver driver = new Driver ();
        Observation ob = new Observation ();
        Place place = new Place ();
        Ticket ticket = new Ticket ();
        
        Scanner sc = new Scanner (System.in);
        System.out.println("select of the vehicle:");
        System.out.println("option 0: truck");
        System.out.println("option 1: pickup truck ");
        System.out.println("option 2: automobile");
        System.out.println("option 3: SUV");
        System.out.println("option 4: motorcycle");
        
        Car cars[] = new Car[5];
        
    for(int i=0;i<5;i++){
        System.out.println("\nEnter the car information[" + (i+1) + "]:");
        
        System.out.print("Enter brand: ");
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
        
    }
        
        int option = sc. nextInt ();
        type(option); 
       
        }                      

    private static void type(int option) {
       if (option == 0){
            System.out.println("truck");
           }else
       if (option == 1){
            System.out.println("pickup truck");
           }else
       if (option == 2){
            System.out.println("automobile");
           }else
       if (option == 3){
            System.out.println("SUV");
           }else
       if (option == 4){
            System.out.println("motorcycle");
           }else{
       System.out.println("The option is invalide");
    } 
       
    }
}