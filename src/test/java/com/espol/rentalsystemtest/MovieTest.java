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
 * @author Julian
 */
public class MovieTest {
    
     
    public MovieTest() {
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
    
//     @Test
//    public void testSetPriceCode() {
//        Movie theManWhoKnewTooMuch = new Movie("The Man Who Knew Too Much", Movie.REGULAR);
//        theManWhoKnewTooMuch.setPriceCode(Movie.NEW_RELEASE);
//        assertEquals(Movie.NEW_RELEASE, theManWhoKnewTooMuch.getPriceCode());
//        theManWhoKnewTooMuch.setPriceCode(Movie.REGULAR);
//        assertEquals(Movie.REGULAR, theManWhoKnewTooMuch.getPriceCode());
//    }
    
//     @Test
//    public void testGetTitle() {
//        Movie theManWhoKnewTooMuch = new Movie("The Man Who Knew Too Much", Movie.REGULAR);
//        assertEquals("The Man Who Knew Too Much", theManWhoKnewTooMuch._title);
//    }
//    
    @Test
    public void testGetPriceCode() {
        Movie theManWhoKnewTooMuch = new Movie("The Man Who Knew Too Much", Movie.REGULAR);
        assertEquals(Movie.REGULAR, theManWhoKnewTooMuch.getPriceCode());
    }
}
