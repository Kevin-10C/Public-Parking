/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BetaSoftware.PublicParking.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class CarController {

    public static String CheckInTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        String newDate = dateFormat.format(date);
        return newDate;
    }

    public static String DepartureTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        String date2 = dateFormat.format(date);
        return date2;
    }

    public static long calculeTime(String checkInTime, String departureTime) {
        Date d1 = null;
        Date d2 = null;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        try {
            d1 = format.parse(checkInTime);
            d2 = format.parse(departureTime);
        } catch (ParseException e) {
        }

        long diff = d2.getTime() - d1.getTime();
        long diffMinutes = diff / (60 * 1000);
        return diffMinutes;

    }
}
