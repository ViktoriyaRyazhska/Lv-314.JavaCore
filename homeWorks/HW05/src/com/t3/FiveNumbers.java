package com.t3;

import java.io.IOException;
import java.util.ArrayList;
import static com.homework.Main.br;

public class FiveNumbers {
    public static void fiveNumbers() throws IOException {

        /*position of second positive number*/
        System.out.println("Input 5 numbers:");
        int[] arr = new int[5];
        int negNumber = 0;
        int idx = 0;
        ArrayList <Integer> pos = new ArrayList<Integer>();
        ArrayList <Integer> neg = new ArrayList<Integer>();

        arr[0] = Integer.parseInt(br.readLine());
        arr[1] = Integer.parseInt(br.readLine());
        arr[2] = Integer.parseInt(br.readLine());
        arr[3] = Integer.parseInt(br.readLine());
        arr[4] = Integer.parseInt(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            }
            if (arr[i] < 0) {
                neg.add(arr[i]);
            }
        }

        if (pos.size() == 0) {
            System.out.println("You haven't positive numbers!");
        } else if (pos.size() == 1) {
            System.out.println("You have only one positive number");
        } else {
            System.out.println("position of second positive number: " + pos.get(1));
        }
        /*minimum and its position in the array*/
        for (int k = 0; k < neg.size() - 1; k++) {
            for (int z = 1; z < neg.size(); z++) {
                 if (neg.get(k) < neg.get(z) ) {
                    if (neg.get(k) < negNumber) {
                        negNumber = neg.get(k);
                    }
                } else {
                     negNumber = neg.get(z);
                 }
            }
        }

        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == negNumber) {
                idx = x + 1;
            }
        }

        if (neg.size() == 0) {
            System.out.println("You haven't negative numbers!");
        } else if (neg.size() == 1) {
            System.out.println("You have only one negative number");
        }
        else {
            System.out.println("Minimal negative number is " + negNumber + " and it has position " + idx);
        }
    }
}
