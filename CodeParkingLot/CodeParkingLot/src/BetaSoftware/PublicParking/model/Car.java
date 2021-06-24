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
public class Car {
    
    private int type;
    private String mark;
    private String licensePlate;
    private String color;
    private String ob;

    public Car(int type, String mark, String licensePlate, String color, String ob) {
        this.type = type;
        this.mark = mark;
        this.licensePlate = licensePlate;
        this.color = color;
        this.ob = ob;
    }

    public Car() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Car{" + "type=" + getType() + ", mark=" + getMark() + ", licensePlate=" + getLicensePlate() + ", color=" + getColor() + ", ob=" + getOb() + '}';
    }
    
    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return the licensePlate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * @param licensePlate the licensePlate to set
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the ob
     */
    public String getOb() {
        return ob;
    }

    /**
     * @param ob the ob to set
     */
    public void setOb(String ob) {
        this.ob = ob;
    }
    
    
    
}
