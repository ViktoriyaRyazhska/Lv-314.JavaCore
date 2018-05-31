package com.t3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_1 {
    public static void validity(String x) {
        String pattern = "[$][0-9]+[\\.][0-9]{3}";
        String name = x;
        Pattern ptrn = Pattern.compile(pattern);
        Matcher m = ptrn.matcher(name);

        while (m.find()) {
            System.out.println(name.substring(m.start(), m.end()) + " ");
        }
    }
}
