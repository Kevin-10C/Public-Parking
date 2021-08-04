/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import java.awt.List;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class DBMaganer implements Persistence  {
    
    DB dbMongo;
    DBCollection tableMongo;
    private String driver;
    private String description;
    private String cars;

    public DBMaganer(String driver, String description, String cars) {
        this.driver = driver;
        this.description = description;
        this.cars = cars;
    }
    
    

    @Override
    public boolean create() {
        try {
            Mongo mongo = new Mongo("localhost", 27017);
            dbMongo = mongo.getDB("Driver");
            tableMongo = dbMongo.getCollection("InformationDriver");
        } catch (UnknownHostException ex) {
            Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);

        }
        return true;
    }

    @Override
    public String read(String code, String drivers, String cars, String description) {
    }

    @Override
    public boolean update(String searchString, String data, String table) {
    }

    @Override
    public boolean delete(String searchString, String table) {
    }

    @Override
    public String find(String searchString) {
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
