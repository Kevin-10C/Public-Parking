/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BetaSoftware.PublicParking.controller;

import utils.Persistence;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class TicketController {

    private Persistence persistence;
    private Persistence persistence1;
    private Persistence persistence2;
    private String driver;
    private String description;
    private String cars;

    public static String CodeNumber() {
        String code = "";
        double d;
        for (int i = 1; i <= 5; i++) {
            d = Math.random() * 10;
            code = code + ((int) d);
            if (i % 3 == 0 && i != 5) {
                code = code + "-";
            }
        }
        return code;
    }

    public TicketController(String driver, String description, String cars) {
        this.driver = driver;
        this.description = description;
        this.cars = cars;
    }

    /**
     * @return the driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the cars
     */
    public String getCars() {
        return cars;
    }

    /**
     * @param cars the cars to set
     */
    public void setCars(String cars) {
        this.cars = cars;
    }

}
