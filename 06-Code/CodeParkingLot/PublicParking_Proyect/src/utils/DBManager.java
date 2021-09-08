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
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class DBManager implements Persistence {

    DB dbMongo;
    DBCollection tableMongo;
    DBCollection tableMongoCar;

    @Override
    public boolean create() {
        //TODO crate data from database colletion
        try {
            Mongo mongo = new Mongo("localhost", 27017);
            dbMongo = mongo.getDB("Driver");
            tableMongo = dbMongo.getCollection("InformationDriver");
            tableMongoCar = dbMongo.getCollection("InformationCar");
        } catch (UnknownHostException ex) {
            Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);

        }
        return true;
    }

    @Override
    public String read(String firstName, String lastName, String id, String code, String phoneNumber, String gener, String age,
            String mark, String licensePlate, String color, String observation, String description, String type,
            String dateAdmision, String departureDate, String checkInTime, String departueTime) {
        //TODO read data from database collection "table"
        BasicDBObject document = new BasicDBObject();
        BasicDBObject documentCar = new BasicDBObject();

        document.put("Code", code);
        document.put("FirstName", firstName);
        document.put("LastName", lastName);
        document.put("Id", id);
        document.put("PhoneNumber", phoneNumber);
        document.put("Gender", gener);
        document.put("Age", age);
        tableMongo.insert(document);

        documentCar.put("Code", code);
        documentCar.put("Type", type);
        documentCar.put("Brand", mark);
        documentCar.put("LicensePlate", licensePlate);
        documentCar.put("Color", color);
        documentCar.put("Observation", observation);
        documentCar.put("Description", description);
        documentCar.put("Date Admision", dateAdmision);
        documentCar.put("Departue Date", departureDate);
        documentCar.put("Check-In Time", checkInTime);
        documentCar.put("Departure Time", departueTime);
        tableMongoCar.insert(documentCar);
        return "{}";

    }

    @Override
    public boolean update(String data) {
        //TODO update data in the database collection according to the searchString
        BasicDBObject document = new BasicDBObject();
        document.put("Departue Date", "");
        BasicDBObject documentoNuevo = new BasicDBObject();
        documentoNuevo.put("Departue Date", data);
        tableMongo.findAndModify(document, documentoNuevo);
        return true;
    }

    @Override
    public boolean delete(String search) {
        //TODO delete a record from database collection according to searchString
        BasicDBObject documentUser = new BasicDBObject();
        documentUser.put("Code", search);
        tableMongo.remove(documentUser);

        BasicDBObject documentCar = new BasicDBObject();
        documentCar.put("Code", search);
        tableMongoCar.remove(documentCar);

        return true;
    }

    @Override
    public String find(String searchString, String data) {
        //TODO find a record in the database collection file according to searchString
        String dataFind;

        DBCollection col = dbMongo.getCollection("InformationDriver");
        BasicDBObject filtro = new BasicDBObject();
        filtro.put(data, searchString);
        DBCursor cur = col.find(filtro);

        dataFind = (String) cur.next().get(data);

        return dataFind;
    }

}
