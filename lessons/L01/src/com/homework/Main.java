package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        matematicalOperations();
        question();
    }

    private static void matematicalOperations() throws IOException {

        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }

    private static void question() throws IOException {
        System.out.println("How are you?");
        String answer = br.readLine();
        System.out.println("You are " + answer);
    }

}
