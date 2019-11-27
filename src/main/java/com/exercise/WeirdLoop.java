package com.exercise;

public class WeirdLoop {
    private static final int i = 99;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            i++;
            break;
        }
        System.out.println(i);
    }
}
