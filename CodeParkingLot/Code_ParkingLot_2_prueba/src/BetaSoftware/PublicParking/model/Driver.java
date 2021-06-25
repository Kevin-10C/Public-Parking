/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BetaSoftware.PublicParking.model;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class Driver {
    
    private String name;  
    private int age;
    private String gender;
    private String preference;
    private int ticket;  //in the class diagram it is found as array

    public Driver(String name, int age, String gender, String preference, int ticket) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.preference = preference;
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "" + "name=" + name + ", age=" + age + ", gender=" + gender + ", preference=" + preference + ", ticket=" + ticket;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the preference
     */
    public String getPreference() {
        return preference;
    }

    /**
     * @param preference the preference to set
     */
    public void setPreference(String preference) {
        this.preference = preference;
    }

    /**
     * @return the ticket
     */
    public int getTicket() {
        return ticket;
    }

    /**
     * @param ticket the ticket to set
     */
    public void setTicket(int ticket) {
        this.ticket = ticket;
    }
    
    
    
}
