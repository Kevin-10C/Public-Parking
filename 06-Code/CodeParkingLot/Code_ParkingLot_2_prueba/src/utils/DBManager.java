/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.awt.List;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eliana Cuaspa Beta_Software ESPE-DCCO
 */
public class DBManager implements Persistence {

    DB dbMongo;
    DBCollection tableMongo;
    private String driver;
    private String description;
    private String cars;

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
    public String read(String code, String driver, String description, String cars) {
        BasicDBObject document = new BasicDBObject();
        document.put("Code", code);
        document.put("Driver", driver);
        document.put("Car", cars);
        document.put("Description", description);
        tableMongo.insert(document);
        return "{}";
    }

    @Override
    public boolean update(String data) {
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        DBCollection col = dbMongo.getCollection("InformationDriver");
        BasicDBObject filtro = new BasicDBObject();
        filtro.put("Code", searchString);
        DBCursor cur = col.find(filtro);
        while (cur.hasNext()) {
            BasicDBObject document = new BasicDBObject();
            document.put("Code", searchString);
            tableMongo.remove(document);
        }
        return true;
    }

    @Override
    public String find(String searchString) {
        DBCursor cursor = tableMongo.find();
        String data = "";
        while (cursor.hasNext()) {
            data = cursor.toString();
        }
        return data;
    }

    public DBManager(String driver, String description, String cars) {
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
    public String getObservation() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setObservation(String description) {
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
