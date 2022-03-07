/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cch_missing.number;

import java.util.Scanner;

/**
 *
 * @author HASHA
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String input = scan.nextLine();
        try {
           // String input = "1,2,4,5,6";
            String[] a = input.split(",");
            int[] convertedNumberArray = convertStringArrayIntoIntArray(a);
            sortArray(convertedNumberArray);

            System.out.println("Missing Number - "+findMissingNumber(convertedNumberArray));

        } catch (NumberFormatException e) {
            System.out.println("Invalid Number List!!Enter only numbers  seperating using comma");
        } catch (Exception e) { 
            System.out.println(e.getMessage());
        }

    }

    public static void sortArray(int[] numberArray) {
        int n = numberArray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numberArray[j - 1] > numberArray[j]) {
                    temp = numberArray[j - 1];
                    numberArray[j - 1] = numberArray[j];
                    numberArray[j] = temp;
                }

            }
        }
    }

    static int[] convertStringArrayIntoIntArray(String[] stringArray) {
        int[] convertedIntArray = new int[stringArray.length];
        for (int index = 0; index < stringArray.length; index++) {

            convertedIntArray[index] = Integer.parseInt(stringArray[index]);

        }
        return convertedIntArray;
    }

    static int findMissingNumber(int[] numbeArray) throws Exception {
        int missingNumbersCount = 0;
        int missingNumber = 0;
        for (int index = 0; index < numbeArray.length - 1; index++) {

            if ((numbeArray[index] + 1) == numbeArray[index + 1]) {
                continue;
            } else {
                int missingNumbersCountBetweenTwoNumber = (numbeArray[index] + 1) - numbeArray[index];
                

                if (missingNumbersCountBetweenTwoNumber != 1) {
                    missingNumbersCount += missingNumbersCountBetweenTwoNumber;
                } else {
                    missingNumber = numbeArray[index] + 1;
                    missingNumbersCount += 1;
                }

            }
        }

        if (missingNumbersCount > 1) {
            throw new Exception("More Than One Number Missing");
        } else if (missingNumbersCount < 1) {
            throw new Exception("No Number Missing");
        } else {
            return missingNumber;
        }

    }
}
