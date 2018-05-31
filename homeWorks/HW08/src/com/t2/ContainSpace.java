package com.t2;

public class ContainSpace {
    public static void containSpace(String x) {
        System.out.println(new String(x).replaceAll("\\s{2,}", " "));
    }
}
