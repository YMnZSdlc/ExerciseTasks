package com.codingbat.java;

public class Warmup2 {

    public static void main(String[] args) {

    }

    public String stringTimes(String str, int n) {
        String strFinal = "";
        for (int i = 0; i < n; i++) {
            strFinal = strFinal + str;
        }
        ;
        return strFinal;
    }

    public String frontTimes(String str, int n) {
        String copy = "";
        String wynik = "";
        if (str.length() > 3) {
            copy = str.substring(0, 3);
        } else copy = str;
        for (int i = 0; i < n; i++) {
            wynik = wynik + copy;
        }
        return wynik;
    }

    int countXX(String str) {
        int index = 1;
        int counter = 0;
        while (index < str.length()) {
            if (str.substring(index - 1, index + 1).equals("xx")) {
                counter++;
            }
            index++;
        }
        return counter;
    }

    //Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (str.length() <= i + 1) {
            return false;
        } else if (str.charAt(i + 1) == 'x') {
            return true;
        } else {
            return false;
        }
    }

    //Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
    public String stringBits(String str) {
        if (str.length() < 1) {
            return "";
        } else if (str.length() < 2) {
            return str;
        } else {
            return str.charAt(0) + stringBits(str.substring(2));
        }
    }

    //    Given a non-empty string like "Code" return a string like "CCoCodCode".
    public String stringSplosion(String str) {
        if (str.length() < 2) return str;
        return stringSplosion(str.substring(0, str.length() - 1)) + str;
    }

    // Given a string, return the count of the number of times that a substring length 2 appears
    // in the string and also as the last 2 chars of the string,
    // so "hixxxhi" yields 1 (we won't count the end substring).
    public int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        String end = str.substring(str.length() - 2);
        int result = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, (i + 2)).equals(end)) {
                result++;
            }
        }
        return result;
    }

    // Given an array of ints, return the number of 9's in the array.
    public int arrayCount9(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num == 9) {
                result++;
            }
        }
        return result;
    }

    // Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    // The array length may be less than 4.
    public boolean arrayFront9(int[] nums) {
        int i = 1;
        for (int num : nums) {
            if (num==9 && i<=4){
                return true;
            }
            i ++;
        }
        return false;
    }

    // Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
    public boolean array123(int[] nums) {
        if (nums.length<3) return false;
        for (int i = 0; i <nums.length-2 ; i++) {
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3){
                return true;
            }
        }
        return false;
    }


//  Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
//  So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

    public int stringMatch(String a, String b) {
        int result = 0;
        int end = (a.length()<=b.length()? a.length():b.length());
        for (int i = 0; i <end-1 ; i++){
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                result++;
            }
        }
        return result;
    }




}
