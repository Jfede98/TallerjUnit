/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espol.rentalsystemtest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Tommy
 */
public class Ps3GameTest {
    
    public Ps3GameTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of get_gameName method, of class Ps3Game.
     */
    @Test
    public void testGet_gameName() {
        System.out.println("get_gameName");
        Ps3Game instance = null;
        String expResult = "";
        String result = instance.get_gameName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_consoleName method, of class Ps3Game.
     */
    @Test
    public void testGet_consoleName() {
        System.out.println("get_consoleName");
        Ps3Game instance = null;
        String expResult = "";
        String result = instance.get_consoleName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharge method, of class Ps3Game.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        int _daysRented = 0;
        boolean _consoleRented = false;
        Ps3Game instance = null;
        double expResult = 0.0;
        double result = instance.getCharge(_daysRented, _consoleRented);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrequentRenterPoints method, of class Ps3Game.
     */
    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        int _daysRented = 0;
        boolean _consoleRented = false;
        Ps3Game instance = null;
        int expResult = 0;
        int result = instance.getFrequentRenterPoints(_daysRented, _consoleRented);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Ps3Game.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ps3Game instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
