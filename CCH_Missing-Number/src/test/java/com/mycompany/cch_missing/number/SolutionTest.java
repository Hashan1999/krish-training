/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cch_missing.number;

import static com.mycompany.cch_missing.number.Solution.sortArray;
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
     * Test of sortArray method, of class Solution.
     */
    @Test
    public void testSortArray() {
        System.out.println("sortArray");
        int[] numberArray = new int[]{1, 5, 7, 6, 4};
        Solution.sortArray(numberArray);
        // expected Result
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
    }

   
    /**
     * Test of findMissingNumber method, of class Solution.
     */
    @Test
    public void testFindMissingNumber() throws Exception {
        System.out.println("findMissingNumber");
        int[] numbeArray = new int[]{6,2,4,5,7};
        int expResult = 3;
        sortArray(numbeArray);
        int result = Solution.findMissingNumber(numbeArray);
        assertEquals(expResult, result);

    }

    /**
     * Test of findMissingNumber method, of class Solution.
     */
    @Test
    public void testMoreThanOneMissingnNumber() throws Exception {
        System.out.println("More Than one Missing Number");
        int[] numbeArray = new int[]{6, 2, 4, 5, 7, 9};

        System.out.println("Print There is more than one number missing");
        try {
            Solution.findMissingNumber(numbeArray);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
