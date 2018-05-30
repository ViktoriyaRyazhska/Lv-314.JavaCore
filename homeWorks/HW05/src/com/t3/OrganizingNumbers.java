package com.t3;

import java.io.IOException;
import java.util.ArrayList;

import static com.homework.Main.br;

public class OrganizingNumbers {
    public static void organizingNumbers() throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Input some positive numbers:");
        int a = 1;
        do {
            a = Integer.parseInt(br.readLine());
            numbers.add(a);
        }
        while (a > 0);
        numbers.remove(numbers.size() - 1);
        System.out.println(numbers);
    }
}
