/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.parking.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class InvoiceController {

    public static String Date() {
        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/YYYY");

        return formatDate.format(date);
    }

    public static float Payment(long minutes) {
        float pay;
        pay = minutes * 0.05F;
        return pay;
    }

    public InvoiceController() {
    }

}
