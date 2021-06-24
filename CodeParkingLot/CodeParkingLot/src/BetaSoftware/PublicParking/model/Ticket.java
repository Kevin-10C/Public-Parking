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
    private String inspect;

    public Ticket(double price, int code, String inspect) {
        this.price = price;
        this.code = code;
        this.inspect = inspect;
    }

    @Override
    public String toString() {
        return "Ticket{" + "price=" + price + ", code=" + code + ", inspect=" + inspect + '}';
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
     * @return the inspect
     */
    public String getInspect() {
        return inspect;
    }

    /**
     * @param inspect the inspect to set
     */
    public void setInspect(String inspect) {
        this.inspect = inspect;
    }
    
    
    
}
