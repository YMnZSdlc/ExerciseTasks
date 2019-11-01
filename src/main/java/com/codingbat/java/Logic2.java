package com.codingbat.java;

public class Logic2 {


    public boolean makeBricks(int small, int big, int goal) {
        if (goal / 5 <= big && goal % 5 <= small)
            return true;
        else if (goal / 5 > big && goal - 5 * big <= small)
            return true;
        else return false;
    }

    public int loneSum(int a, int b, int c) {
        if (a == b && b == c) return 0;
        if (a == b) return c;
        if (b == c) return a;
        if (a == c) return b;
        return a + b + c;
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) return 0;
        else if (b == 13) return a;
        else if (c == 13) return a + b;
        else return a + b + c;
    }

    public int noTeenSum(int a, int b, int c) {

        return check(a) + check(b) + check(c);
    }

    public int check(int x) {
        if (x > 12 && x < 15) {
            return 0;
        } else if (x > 16 && x < 20) {
            return 0;
        } else return x;
    }


//    For this problem,we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more,
//    so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5,
//    so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition,
//    write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below
//    and at the same indent level as roundSum().

    public int roundSum(int a, int b, int c) {


        return 4;
    }


}
