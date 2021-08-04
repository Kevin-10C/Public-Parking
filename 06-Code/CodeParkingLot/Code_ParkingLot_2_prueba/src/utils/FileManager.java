/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import static java.awt.AWTEventMulticaster.add;
import static java.awt.AWTEventMulticaster.add;
import static java.awt.AWTEventMulticaster.add;
import static java.awt.AWTEventMulticaster.add;
import static java.awt.AWTEventMulticaster.add;
import static java.awt.AWTEventMulticaster.add;
import static java.awt.AWTEventMulticaster.add;
import static java.awt.AWTEventMulticaster.add;
import static java.awt.AWTEventMulticaster.add;
import static java.awt.AWTEventMulticaster.add;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class FileManager implements Persistence {

    @Override
    public boolean create() {
        File file = new File("./ DriverInformation.json");
        return true;
    }
    

    @Override
    public String read(String code, String drivers, String cars, String description) {
        try {
            //TODO read data from file "table"
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            String car = gson.toJson(cars);
            String drivers = gson.toJson(driver);
            String descriptions = gson.toJson(description);

            File file = new File("./ DriverInformation.json");
            add = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter write = new BufferedWriter(add);
            write.write("\n" + code + " " + drivers + car + descriptions);
            write.close();
            add.close();

        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                add.close();
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return "";
            
            
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
    
}
