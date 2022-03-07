/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cch_number.of.occurences;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HASHA
 */
public class NumberOfOccurencesTest {
    
    public NumberOfOccurencesTest() {
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
     * Test of main method, of class NumberOfOccurences.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NumberOfOccurences.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortArray method, of class NumberOfOccurences.
     */
    @Test
    public void testSortArray() {
        System.out.println("sortArray");
        char[] charArray = null;
        String expResult = "";
        String result = NumberOfOccurences.sortArray(charArray);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of characterOccurence method, of class NumberOfOccurences.
     */
    @Test
    public void testCharacterOccurence() {
        System.out.println("characterOccurence");
        String input = "";
        NumberOfOccurences.characterOccurence(input);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
