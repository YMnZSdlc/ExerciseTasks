package com.codefights.java.arcade;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {

        Intro intro = new Intro();
        int[] arr = {6, 2, 3, 8, 11};
        System.out.println(intro.makeArrayConsecutive2(arr));


    }

    // 6.
    int makeArrayConsecutive2(int[] statues) {
        int result =0;
        Arrays.sort(statues);
        for (int i = 0; i <statues.length-1 ; i++) {
            if (statues[i+1]-statues[i]>1){
                result=statues[i+1]-statues[i];
                --result;
            }
        }
        return result;
    }


    // 5.
    int shapeArea(int n) {
        return n*n+(n-1)*(n-1);
    }

    // 4.
    int adjacentElementsProduct(int[] inputArray) {
        int actual = 0;
        int result = -1000;
        for (int i = 0; i < inputArray.length - 1; i++) {
            actual = inputArray[i] * inputArray[i + 1];
            if (actual > result) result = actual;
        }
        return result;
    }

    // 3.
    boolean checkPalindrome(String inputString) {
        String clean = inputString.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

    // 2. Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100, the second - from the year 101 up to and including the year 200, etc.
    int centuryFromYear(int year) {
        return (year - 1) / 100 + 1;
    }

    // 1. Write a function that returns the sum of two numbers.
    int add(int param1, int param2) {
        return param1 + param2;
    }

}
