package com.homework;

import com.t1.Calculates;
import com.t1.DivException;
import com.t2.ReadNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        System.out.println("Please input two numbers what would you like to divide");
        try {
            System.out.println(Calculates.div(Double.parseDouble(br.readLine()), Double.parseDouble(br.readLine())));
        } catch (DivException | IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
