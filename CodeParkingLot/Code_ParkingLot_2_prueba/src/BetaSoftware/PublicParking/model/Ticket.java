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
    private String dateStar;
    private String dateStop;

    public Ticket(double price, int code, String dateStar, String dateStop) {
        this.price = price;
        this.code = code;
        this.dateStar = dateStar;
        this.dateStop = dateStop;
    }

    
    
    @Override
    public String toString() {
        return "Ticket{" + "price=" + price + ", code=" + code + ", dateStar=" + dateStar + ", dateStop=" + dateStop + '}';
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
     * @return the dateStar
     */
    public String getDateStar() {
        return dateStar;
    }

    /**
     * @param dateStar the dateStar to set
     */
    public void setDateStar(String dateStar) {
        this.dateStar = dateStar;
    }

    /**
     * @return the dateStop
     */
    public String getDateStop() {
        return dateStop;
    }

    /**
     * @param dateStop the dateStop to set
     */
    public void setDateStop(String dateStop) {
        this.dateStop = dateStop;
    }
    
    

    
}
