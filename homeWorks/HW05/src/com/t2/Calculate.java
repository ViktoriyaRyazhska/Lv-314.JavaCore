package com.t2;

import java.io.IOException;
import static com.homework.Main.br;

public class Calculate {

    public static void tenNumbers() throws IOException {
        System.out.println("Input 10 numbers:");
        int[] arr = new int[10];

        arr[0] = Integer.parseInt(br.readLine());
        arr[1] = Integer.parseInt(br.readLine());
        arr[2] = Integer.parseInt(br.readLine());
        arr[3] = Integer.parseInt(br.readLine());
        arr[4] = Integer.parseInt(br.readLine());
        arr[5] = Integer.parseInt(br.readLine());
        arr[6] = Integer.parseInt(br.readLine());
        arr[7] = Integer.parseInt(br.readLine());
        arr[8] = Integer.parseInt(br.readLine());
        arr[9] = Integer.parseInt(br.readLine());

        boolean fiveNumbers = true;
        for (int i = 0; i < 5; i++) {
            if (arr[i] < 0) {
                fiveNumbers = false;
                break;
            }
        }
        int summ = 0;
        int product = 1;
        if (fiveNumbers) {
            for (int i = 0; i < 5; i++) {
                summ += arr[i];
            }
            System.out.println(summ);
        } else {
            for (int i = 5; i < arr.length; i++) {
                product *= arr[i];
            }
            System.out.println(product);
        }
    }
}
