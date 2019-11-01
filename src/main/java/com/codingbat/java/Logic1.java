package com.codingbat.java;

public class Logic1 {
    public static void main(String[] args) {

    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if ((isWeekend && cigars >= 40) || (cigars >= 40 && cigars <= 60)) return true;
        else return false;
    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;
        else if (you >= 8 || date >= 8) return 2;
        else return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp >= 60) {
            if (isSummer && temp <= 100) return true;
            if (!isSummer && temp <= 90) return true;
        }
        return false;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday)
            speed -= 5;
        if (speed <= 60) return 0;
        else if (speed <= 80) return 1;
        else return 2;
    }

    public int sortaSum(int a, int b) {
        a += b;
        if (a >= 10 && a < 20) return 20;
        else return a;
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day > 0 && day < 6) return "10:00";
            else return "off";
        } else {
            if (day > 0 && day < 6) return "7:00";
            else return "10:00";
        }
    }

    public boolean love6(int a, int b) {
        if ((a + b) == 6 || a == 6 || b == 6 || Math.abs(a - b) == 6) return true;
        else return false;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode && n >= 1 && n <= 10) return true;
        if (outsideMode && (n <= 1 || n >= 10)) return true;
        return false;
    }

    public boolean specialEleven(int n) {
        return (n % 11 == 0 || n % 11 == 1);
    }

    public boolean more20(int n) {
        return (n % 20 == 1 || n % 20 == 2);
    }

    public boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0) return false;
        else if (n % 3 == 0 || n % 5 == 0) return true;
        else return false;
    }

    public boolean less20(int n) {
        return (n % 20 == 19 || n % 20 == 18);
    }

    public int teenSum(int a, int b) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) return 19;
        else return a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) return false;
        if (isMorning && !isMom) return false;
        return true;
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        else if (tea >= 5 && candy >= 5) {
            if (tea >= 2 * candy || candy >= 2 * tea) return 2;
        }
        return 1;
    }

    public String fizzString(String str) {
        String result = "";
        if (str.charAt(0) == 'f')
            result += "Fizz";
        if (str.charAt(str.length() - 1) == 'b')
            result += "Buzz";
        if (result.isEmpty())
            result = str;
        return result;
    }

    public String fizzString2(int n) {
        String result = "";
        if (n % 3 == 0) result += "Fizz";
        if (n % 5 == 0) result += "Buzz";
        if (n % 3 != 0 && n % 5 != 0) result += n;
        result += '!';
        return result;
    }

    public boolean twoAsOne(int a, int b, int c) {
        return (a + b == c || b + c == a || c + a == b);
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk && c > b) return true;
        else if (b > a && c > b) return true;
        else return false;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk && a <= b && b <= c) return true;
        else if (a < b && b < c) return true;
        else return false;
    }

    public boolean lastDigit(int a, int b, int c) {
        return (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10);
    }




}
