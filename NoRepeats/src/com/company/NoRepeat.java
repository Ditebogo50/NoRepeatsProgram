package com.company;

import java.util.ArrayList;


public class NoRepeat {

    public static void main(String[] args) {
        //String to test the method
        //renamed the string variable to testString from input
        String testString = "And I think to myself: what a wonderful world!";

        //Call the method and save in variable
        String result = removeRepeats(input);

        //Print out the results
        System.out.println(input);
        System.out.println(result.toString());
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

