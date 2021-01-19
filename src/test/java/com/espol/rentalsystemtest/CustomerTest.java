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
public class CustomerTest {
    
    public CustomerTest() {
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

    
        @Test
    public void testStatementRegularMovieOnly() {
        // regular movies cost $2.00 for the first 2 days, and $1.50/day thereafter
        
        // a rental earns 1 frequent-renter point no matter how many days
        Customer johnDoe = new Customer("John Doe");
        MovieRental instance = new MovieRental(new Movie("Over the moon", Movie.REGULAR),3);
        johnDoe.addMovieRental(instance);
        assertEquals("Rental Record for John Doe\n" +
                "\tOver the moon\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points",johnDoe.statement());
        
    }
   
    @Test
    public void testStatementChildrensMovieOnly() {
        // childrens' movies cost $1.50 for the first 3 days, and $1.25/day thereafter
        // a rental earns 1 frequent-renter point no matter how many days
        Customer johnDoeJr = new Customer("Johnny Doe, Jr.");
        MovieRental instance = new MovieRental(new Movie("Over the moon", Movie.CHILDRENS),4);
        johnDoeJr.addMovieRental(instance);
        assertEquals("Rental Record for Johnny Doe, Jr.\n" +
                "\tOver the moon\t2.75\n" +
                "Amount owed is 2.75\n" +
                "You earned 1 frequent renter points",johnDoeJr.statement());
    }
//    
    @Test
    public void testStatementNewReleaseOnly() {
        // new releases cost $3.00/day
        // a rental earns 1 frequent-renter point 1 day; 2 points for 2 or more days
        Customer janeDoe = new Customer("Jane Doe");
        MovieRental instance = new MovieRental(new Movie("Over the moon", Movie.NEW_RELEASE),4);
        janeDoe.addMovieRental(instance);
        assertEquals("Rental Record for Jane Doe\n" +
                "\tOver the moon\t12.0\n" +
                "Amount owed is 12.0\n" +
                "You earned 2 frequent renter points",janeDoe.statement());
    }
    @Test
    public void testGetName() {
        String name = "John Doe"; 
        assertEquals(name, new Customer(name)._name);
    }

}
