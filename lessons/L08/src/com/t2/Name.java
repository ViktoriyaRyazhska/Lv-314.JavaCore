package com.t2;

import java.io.IOException;

import static com.homework.Main.br;

public class Name {
    public static void initials() throws IOException {
        System.out.println("Input your full name:");
        String name = br.readLine();
        String[] nameAndInitials = name.split(" ");
        System.out.println(nameAndInitials[0] + " " + nameAndInitials[1].charAt(0) + ". " + nameAndInitials[2].charAt(0) + ".");
        System.out.println(nameAndInitials[1]);
        System.out.println(nameAndInitials[1] + ", " + nameAndInitials[2] + " " + nameAndInitials[0]);

    }
}
