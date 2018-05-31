package com.t3;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validity {
    public static void validity(String x) throws IOException {
        String pattern = "[a-zA-Z0-9_]{3,15}";
        String name = x;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(name);

        if (m.matches()) {
            System.out.println("You name is validity");
        } else {
            System.out.println("Sorry, change your name");
        }
    }
}
