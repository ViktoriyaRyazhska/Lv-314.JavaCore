package com.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class numberOfMonth {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//    public static void main(String[] args) throws IOException {
//        mouth();
//    }

    public static void mouth() throws IOException {
        System.out.println("Input number of month:");
        String month = br.readLine();

        String thirtyOne = funcThirtyOne();
        String thirty = funcThirty();

        switch (month){
            case "1" :
                System.out.println(thirtyOne);
                break;
            case "2" :
                System.out.println(thirty);
                break;
            case "3" :
                System.out.println(thirtyOne);
                break;
            case "4" :
                System.out.println(thirty);
                break;
            case "5" :
                System.out.println(thirtyOne);
                break;
            case "6" :
                System.out.println(thirty);
                break;
            case "7" :
                System.out.println(thirtyOne);
                break;
            case "8" :
                System.out.println(thirtyOne);
                break;
            case "9" :
                System.out.println(thirty);
                break;
            case "10" :
                System.out.println(thirtyOne);
                break;
            case "11" :
                System.out.println(thirty);
                break;
            case "12" :
                System.out.println(thirtyOne);
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
