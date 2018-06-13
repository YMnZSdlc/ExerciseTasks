package com.codefights.java.arcade;

public class Intro {
    public static void main(String[] args) {

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
        int end = inputString.length();
        if (end == 1) return true;
        if (end == 2 && inputString.charAt(0) == inputString.charAt(1)) return true;
        if (inputString.charAt(0) != inputString.charAt(end - 1)) return false;
        return checkPalindrome(inputString.substring(1, end - 1));
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
