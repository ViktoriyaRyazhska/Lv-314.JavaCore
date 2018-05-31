package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.t3.Pattern_1;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
//        System.out.println("Input your sentence:");
//        String x = br.readLine();
//        FiveWords.fiveWords(x);
//        System.out.println("Input your sentence:");
//        String y = br.readLine();
//        ContainSpace.containSpace(y);
        System.out.println("Input your sentence:");
        String z = br.readLine();
        Pattern_1.validity(z);
    }
}
