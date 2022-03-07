/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cch_number.of.occurences;

import static com.mycompany.cch_number.of.occurences.NumberOfOccurences.sortArray;
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
     * Test of sortArray method, of class NumberOfOccurences.
     */
    @Test
    public void testSortArray() {
        System.out.println("sortArray");
        String input="srilanka";
        String result = sortArray(input.toCharArray());
        String expResult = "aaiklnrs";
        
        assertEquals(expResult, result);
       
    }

    /**
     * Test of characterOccurence method, of class NumberOfOccurences.
     */
    @Test
    public void testCharacterOccurence() {
        System.out.println("characterOccurence");
        String input = "SriLanka";
        System.out.println(input);
     
        NumberOfOccurences.characterOccurence(input.toLowerCase().replace(" ", ""));
        
    }
    
}
