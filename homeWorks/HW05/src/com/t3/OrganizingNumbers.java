package com.t3;

import java.io.IOException;
import java.util.ArrayList;

import static com.homework.Main.br;

public class OrganizingNumbers {
    public static void organizingNumbers() throws IOException {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0,1);
        for (int i = 0; i < 100; i++) {
            if (numbers.get(i) > 0) {
                numbers.add(Integer.parseInt( br.readLine() ) );
            } else {
                System.out.println("Last integer < 0");
                System.out.println(numbers);
            }
        }
    }
}
