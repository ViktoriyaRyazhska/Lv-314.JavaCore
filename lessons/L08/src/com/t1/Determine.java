package com.t1;

import java.io.IOException;

import static com.homework.Main.br;

public class Determine {


    public static void determine() throws IOException {
        System.out.println("Input two words for determining:");
        String s1 = br.readLine();
        String s2 = br. readLine();
        System.out.println(s2.contains(s1));
    }

}
