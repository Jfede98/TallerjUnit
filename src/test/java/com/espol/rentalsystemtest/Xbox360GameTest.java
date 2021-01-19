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
public class Xbox360GameTest {
    
    public Xbox360GameTest() {
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
     * Test of get_gameName method, of class Xbox360Game.
     */
    @Test
    public void testGet_gameName() {
        System.out.println("get_gameName");
        Xbox360Game instance = null;
        String expResult = "";
        String result = instance.get_gameName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_consoleName method, of class Xbox360Game.
     */
    @Test
    public void testGet_consoleName() {
        System.out.println("get_consoleName");
        Xbox360Game instance = null;
        String expResult = "";
        String result = instance.get_consoleName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharge method, of class Xbox360Game.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        int _daysRented = 0;
        boolean _consoleRented = false;
        Xbox360Game instance = null;
        double expResult = 0.0;
        double result = instance.getCharge(_daysRented, _consoleRented);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrequentRenterPoints method, of class Xbox360Game.
     */
    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        int _daysRented = 0;
        boolean _consoleRented = false;
        Xbox360Game instance = null;
        int expResult = 0;
        int result = instance.getFrequentRenterPoints(_daysRented, _consoleRented);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Xbox360Game.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Xbox360Game instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
