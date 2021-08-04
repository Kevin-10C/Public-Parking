/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BetaSoftware.PublicParking.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class CarControllerTest {
    
    public CarControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CheckInTime method, of class CarController.
     */
    @Test
    public void testCheckInTime() {
        System.out.println("CheckInTime");
        String expResult = "";
        String result = CarController.CheckInTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of DepartureTime method, of class CarController.
     */
    @Test
    public void testDepartureTime() {
        System.out.println("DepartureTime");
        String expResult = "";
        String result = CarController.DepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of calculeTime method, of class CarController.
     */
    @Test
    public void testCalculeTime0() {
        System.out.println("calculeTime");
        String checkInTime = "23:12";
        String departureTime = "23:13";
        long expResult = 1L;
        long result = CarController.calculeTime(checkInTime, departureTime);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of calculeTime method, of class CarController.
     */
    @Test
    public void testCalculeTime1() {
        System.out.println("calculeTime");
        String checkInTime = "23:15";
        String departureTime = "23:18";
        long expResult = 3L;
        long result = CarController.calculeTime(checkInTime, departureTime);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of calculeTime method, of class CarController.
     */
    @Test
    public void testCalculeTime2() {
        System.out.println("calculeTime");
        String checkInTime = "10:12";
        String departureTime = "11:00";
        long expResult = 48L;
        long result = CarController.calculeTime(checkInTime, departureTime);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of calculeTime method, of class CarController.
     */
    @Test
    public void testCalculeTime3() {
        System.out.println("calculeTime");
        String checkInTime = "23:00";
        String departureTime = "24:00";
        long expResult = 60L;
        long result = CarController.calculeTime(checkInTime, departureTime);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of calculeTime method, of class CarController.
     */
    @Test
    public void testCalculeTime4() {
        System.out.println("calculeTime");
        String checkInTime = "09:10";
        String departureTime = "09:13";
        long expResult = 3L;
        long result = CarController.calculeTime(checkInTime, departureTime);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of calculeTime method, of class CarController.
     */
    @Test
    public void testCalculeTime6() {
        System.out.println("calculeTime");
        String checkInTime = "01:12";
        String departureTime = "01:40";
        long expResult = 28L;
        long result = CarController.calculeTime(checkInTime, departureTime);
        assertEquals(expResult, result);
    }
}
