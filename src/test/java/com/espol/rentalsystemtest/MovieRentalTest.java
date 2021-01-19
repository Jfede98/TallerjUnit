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
public class MovieRentalTest {
    
      Movie theManWhoKnewTooMuch, mulan, slumdogMillionaire;
    
    public MovieRentalTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        theManWhoKnewTooMuch = new Movie("The Man Who Knew Too Much", Movie.REGULAR);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getDaysRented method, of class MovieRental.
     */
    @Test
    public void testGetDaysRented() {
//        System.out.println("getDaysRented");
//        MovieRental instance = null;
//        int expResult = 0;
//        int result = instance.getDaysRented();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
           assertEquals(2, new MovieRental(theManWhoKnewTooMuch, 2).getDaysRented());
    }

    /**
     * Test of getMovie method, of class MovieRental.
     */
    @Test
    public void testGetMovie() {
//        System.out.println("getMovie");
//        MovieRental instance = null;
//        Movie expResult = null;
//        Movie result = instance.getMovie();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
          assertEquals(theManWhoKnewTooMuch, new MovieRental(theManWhoKnewTooMuch, 2).getMovie());
    }
    
}
