package com.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberOfMonth {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void mouth() throws IOException {
        System.out.println("Input number of month:");
        String month = br.readLine();

        String thirtyOne = funcThirtyOne();
        String thirty = funcThirty();

        switch (month){
            case "1" :
            case "3" :
            case "5" :
            case "7" :
            case "8" :
            case "10" :
            case "12" :
                System.out.println(thirtyOne);
                break;
            case "2" :
            case "4" :
            case "6" :
            case "9" :
            case "11" :
                System.out.println(thirty);
                break;
        }
    }

    private static String funcThirtyOne(){
        int[] thirtyOne = new int[31];
        for (int i = 1; i < 32; i++){
            thirtyOne[i-1] = i;
        }
        return Arrays.toString(thirtyOne);
    }

    private static String funcThirty(){
        int[] thirty = new int[30];
        for (int i = 1; i < 31; i++){
            thirty[i-1] = i;
        }
        return Arrays.toString(thirty);
    }
}
