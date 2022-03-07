/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cch_number.of.occurences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author HASHA
 */
public class NumberOfOccurences {

    public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        System.out.println(a.toLowerCase());
        characterOccurence(a.toLowerCase().replace(" ", ""));

//        TreeMap<Character, Integer> numberOfOccurencesMap = getNumberOfOccurences(charArray);
//        for (Map.Entry<Character, Integer> entry : numberOfOccurencesMap.entrySet()) {
//            Object key = entry.getKey();
//            Object val = entry.getValue();
//            
//            System.out.println(key.toString()+" - "+String.valueOf(val));
//            
//        }
    }

    public static String sortArray(char[] charArray) {
        int n = charArray.length;
        char tempValue = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (charArray[j - 1] > charArray[j]) {
                    tempValue = charArray[j - 1];
                    charArray[j - 1] = charArray[j];
                    charArray[j] = tempValue;
                }

            }
        }
        return String.valueOf(charArray);
    }

//    static  TreeMap<Character, Integer> getNumberOfOccurences(char[] charArray) {
//        TreeMap<Character, Integer> map = new TreeMap<>();
//        for (char character : charArray) {
//            if (map.get(character) == null) {
//                map.put(character, 1);
//            } else {
//                map.put(character, map.get(character) + 1);
//            }
//        }
//return map;
//    }
    static void characterOccurence(String input) {
        String charactersInString = "";
        int count = 0;
        char character;

        //get characters without duplicates
        for (int i = 0; i < input.length(); i++) {
            if (!charactersInString.contains(String.valueOf(input.charAt(i)))) {
                charactersInString += input.charAt(i);
            }
        }
        //Sort the String after seperate characters
        charactersInString = sortArray(charactersInString.toCharArray());
        
        for (int i = 0; i < charactersInString.length(); i++) {
            character = charactersInString.charAt(i);
            count = 0;
            for (int x = 0; x < input.length(); x++) {
                if (input.charAt(x) == character) {
                    count += 1;
                }

            }
            System.out.println(character + " - " + count);
        }
    }
}
