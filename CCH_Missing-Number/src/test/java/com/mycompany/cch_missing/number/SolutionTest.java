/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cch_missing.number;

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
public class SolutionTest {
    
    public SolutionTest() {
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
     * Test of main method, of class Solution.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Solution.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortArray method, of class Solution.
     */
    @Test
    public void testSortArray() {
        System.out.println("sortArray");
        int[] numberArray = null;
        Solution.sortArray(numberArray);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertStringArrayIntoIntArray method, of class Solution.
     */
    @Test
    public void testConvertStringArrayIntoIntArray() {
        System.out.println("convertStringArrayIntoIntArray");
        String[] stringArray = null;
        int[] expResult = null;
        int[] result = Solution.convertStringArrayIntoIntArray(stringArray);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMissingNumber method, of class Solution.
     */
    @Test
    public void testFindMissingNumber() throws Exception {
        System.out.println("findMissingNumber");
        int[] numbeArray = null;
        int expResult = 0;
        int result = Solution.findMissingNumber(numbeArray);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
