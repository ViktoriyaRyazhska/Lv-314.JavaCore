package com.homework;
import com.t1.Determine;
import com.t2.Name;
import com.t3.Validity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
//        Determine.determine();
//        Name.initials();
        Validity.validity("Di-ma");
        Validity.validity("Di");
        Validity.validity("Di1Di1Di1Di1Di1Di1");
        Validity.validity("Victor");
        Validity.validity("Axmed_Axmed");

    }

}
