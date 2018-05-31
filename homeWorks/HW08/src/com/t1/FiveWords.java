package com.t1;

import java.io.IOException;

public class FiveWords {
    public static void fiveWords(String x) throws IOException {
        String words = x;
        String[] arr = words.split(" ");
        String word = "g";
        int chars = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length() > arr[j].length()) {
                    if (word.length() < arr[i].length()) {
                        word = arr[i];
                        chars = arr[i].length();
                    }
                } else {
                    if (word.length() < arr[j].length()) {
                        word = arr[j];
                        chars = arr[j].length();
                    }
                }
            }
        }

        System.out.println("The word " + word + " has " + chars + " chars");
        StringBuilder second = new StringBuilder(arr[1]);
        second.reverse();
        System.out.println(second);
    }
}
