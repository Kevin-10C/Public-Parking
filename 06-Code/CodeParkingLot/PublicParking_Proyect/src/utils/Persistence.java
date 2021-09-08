/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public interface Persistence {

    //CRUD
    public boolean create();

    public String read(String firstName, String lastName, String id, String code, String phoneNumber, String gener, String age,
            String mark, String licensePlate, String color, String observation, String description, String type,
            String dateAdmision, String departureDate, String checkInTime, String departueTime);

    public boolean update(String data);

    public boolean delete(String search);

    public String find(String searchString, String data);

}
