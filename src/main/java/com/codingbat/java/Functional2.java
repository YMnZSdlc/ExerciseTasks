package com.codingbat.java;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {


    //    Given a list of integers, return a list of the integers, omitting any that are less than 0.
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

    public List<Integer> noNegAlt(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

    //    Given a list of non-negative integers,
    // return a list of those numbers except omitting any that end with 9. (Note: % by 10)
    public List<Integer> no9(List<Integer> nums) {
        return nums.stream()
                .filter(c -> c % 10 != 9)
                .collect(Collectors.toList());
    }

    public List<Integer> no9Alt(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }

    //    Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n < 13 || n > 19)
                .collect(Collectors.toList());
    }

    public List<Integer> noTeenAlt(List<Integer> nums) {
        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;
    }

    //    Given a list of strings, return a list of the strings, omitting any string length 4 or more.
    public List<String> noLong(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.toList());
    }

    //    Given a list of strings, return a list of the strings, omitting any string that contains a "z".
    // (Note: the str.contains(x) method returns a boolean)
    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }

    public List<String> noZAlt(List<String> strings) {
        strings.removeIf(s -> s.contains("z"));
        return strings;
    }

    //    Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
    public List<String> no34(List<String> strings) {
        strings.removeIf(s -> s.length() == 3 || s.length() == 4);
        return strings;
    }

    //    Given a list of strings, return a list where each string has "y" added at its end,
    // omitting any resulting strings that contain "yy" as a substring anywhere.
    public List<String> noYY(List<String> strings) {
        return strings.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());
    }

    public List<String> noYYAlt(List<String> strings) {
        strings.replaceAll(s -> s + "y");
        strings.removeIf(s -> s.contains("yy"));
        return strings;
    }

    //    Given a list of non-negative integers, return a list of those numbers multiplied by 2,
    // omitting any of the resulting numbers that end in 2.
    public List<Integer> two2(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .filter(m -> m % 10 != 2)
                .collect(Collectors.toList());
    }

    public List<Integer> two2Alt(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        nums.removeIf(m -> m % 10 == 2);
        return nums;
    }

    //    Given a list of integers, return a list of those numbers squared and the product added to 10,
    // omitting any of the resulting numbers that end in 5 or 6.
    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n -> n * n + 10);
        nums.removeIf(m -> m % 10 == 5 || m % 10 == 6);
        return nums;
    }

    public List<Integer> square56Alt(List<Integer> nums) {
        return nums.stream()
                .map(b -> Math.pow(b, 2) + 10)
                .map(d -> d.intValue())
                .filter(c -> !(c % 10 == 5 || c % 10 == 6))
                .collect(Collectors.toList());
    }
}
