package com.company;

import java.util.ArrayList;


public class NoRepeat {

    public static void main(String[] args) {
        //String to test the method
        //renamed the string variable to testString from input
        String testString = "And I think to myself: what a wonderful world!";

        //Call the method and save in variable
        String result = removeRepeats(testString);

        //Print out the results
        //Print out the original string
        System.out.println("Original string: " + testString);

        //Print out string without repeats
        System.out.println("String without repeats: " + result.toString());
    }

    public static String removeRepeats(String originalString) {

        //Initialize char array and store the string cast to the array
        char[] originalArray = originalString.toCharArray();

        ArrayList<Character> resultArray = new ArrayList<Character>();

        //Loop to Check for repeats and store non repeats in the array list
        for (int i = 0; i < originalArray.length ; i++) {
            if(!resultArray.toString().toLowerCase().contains(String.valueOf(originalArray[i]).toLowerCase()) || originalArray[i] == ' ') {
                resultArray.add(originalArray[i]);
            }
        }

        //Cast the array to a string
        StringBuilder stringBuilder = new StringBuilder();
        for(Character ch : resultArray) {
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}

