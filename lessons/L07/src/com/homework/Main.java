package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import static pt1.t1.*;
import static pt2.t2.*;

public class Main {
    static Map<Integer, String> employeeMap = new HashMap<Integer, String>();
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static LinkedList<Integer> newCollection = new LinkedList<Integer>();
    public static LinkedList<Integer> myCollection = new LinkedList<Integer>();

    public static void main(String[] args) throws IOException {
        myColl();
        remove();
        staticNumbers();
        sort();
        input(employeeMap);
        getMap(employeeMap);
        findingValueAcrossId(employeeMap);
        findingIdAcrossValue(employeeMap);
    }
}
