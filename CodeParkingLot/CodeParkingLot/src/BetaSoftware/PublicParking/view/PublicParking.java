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
        Car car;
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
       
    }; 
}