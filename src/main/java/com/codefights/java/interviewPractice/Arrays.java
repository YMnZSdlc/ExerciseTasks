package com.codefights.java.interviewPractice;

import java.util.HashSet;
import java.util.Set;

public class Arrays {



    int firstDuplicate(int[] a) {
        Set set = new HashSet();
        for (int i : a) {
            if (set.add(i)){
                return i;
            }
        }
        return -1;
    }


}
