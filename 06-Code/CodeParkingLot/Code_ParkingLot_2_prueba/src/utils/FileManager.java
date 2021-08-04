/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class FileManager implements Persistence {
private String driver;
    private String description;
    private String cars;

    @Override
    public boolean create() {
        //TODO insert data in the file table
        File file = new File("./ DriverInformation.json");
        return true;
    }

    @Override
    public String read(String code, String driver, String description, String cars) {
        FileWriter add = null;
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
        
        return true;
    }
    
   @Override
    public boolean delete(String searchString, String table) {
        return true;
    }

    @Override
    public String find(String searchString) {
        String h_entry = null;
        try (FileReader file = new FileReader("./ DriverInformation.json");
                BufferedReader br = new BufferedReader(file)) {

            String linea = br.readLine();

            while (linea != null) {

                StringTokenizer st = new StringTokenizer(linea);
                while (st.hasMoreTokens()) {

                    if (st.nextToken().equalsIgnoreCase(searchString)) {
                    }
                }
                linea = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return h_entry;
    } 
    
    public static String findCode(String code){
        String linea1 = "";
        try (FileReader file = new FileReader("./ DriverInformation.json");
                BufferedReader br = new BufferedReader(file)) {

            String linea = br.readLine();

            while (linea != null) {

                StringTokenizer st = new StringTokenizer(linea);
                while (st.hasMoreTokens()) {

                    if (st.nextToken().equalsIgnoreCase(code)) {
                        linea1 = linea;
                    }
                }
                linea = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return linea1;
    }
}