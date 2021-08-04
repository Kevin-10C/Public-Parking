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
public class Ticket {

    private double price;
    private int code;
    private String checkTime;
    private String departureTime;

    public Ticket(double price, int code, String checkTime, String departureTime) {
        this.price = price;
        this.code = code;
        this.checkTime = checkTime;
        this.departureTime = departureTime;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the checkTime
     */
    public String getCheckTime() {
        return checkTime;
    }

    /**
     * @param checkTime the checkTime to set
     */
    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * @return the departureTime
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * @param departureTime the departureTime to set
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

}
