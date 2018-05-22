package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void theRange() throws IOException {
        System.out.println("Input three numbers:");
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        double c = Double.parseDouble(br.readLine());

//        if ( (a > -5) && (a < 5) ) {
//            System.out.println(a + " is belong to the range [-5,5]");
//        } else {
//            System.out.println(a + " isn't belong to the range [-5,5]");
//        }
//
//        if ( (b > -5) && (b < 5) ) {
//            System.out.println(b + " is belong to the range [-5,5]");
//        } else {
//            System.out.println(b + " isn't belong to the range [-5,5]");
//        }
//
//        if ( (c > -5) && (c < 5) ) {
//            System.out.println(c + " is belong to the range [-5,5]");
//        } else {
//            System.out.println(c + " isn't belong to the range [-5,5]");
//        }
        isRange(a);
        isRange(b);
        isRange(c);
    }

    private static void isRange(double c){
        if ( (c > -5) && (c < 5) ) {
            System.out.println(c + " is belong to the range [-5,5]");
        } else {
            System.out.println(c + " isn't belong to the range [-5,5]");
        }
    }

    public static void maxAndMinNumbers() throws IOException {
        System.out.println("Input three numbers:");
        double n1 = Double.parseDouble(br.readLine());
        double n2 = Double.parseDouble(br.readLine());
        double n3 = Double.parseDouble(br.readLine());
        minMax( n1, n2, n3);
    }

    public static void minMax(double a, double b, double c) {
        if ( ( (b < a) && (b < c) ) && ( (a > b) && (a > c) ) ){
            System.out.println(b + " min");
            System.out.println(a + " max");
        } else if ( ( (c < b) && (c < a) ) && ( (a > b) && (a > c) ) ) {
            System.out.println(c + " min");
            System.out.println(a + " max");
        }

        if ( ( (a < b) && (a < c) ) && ( (b > a) && (b > c) ) ){
            System.out.println(a + " min");
            System.out.println(b + " max");
        } else if ( ( (c < b) && (c < a) ) && ( (b > a) && (b > c) ) ) {
            System.out.println(c + " min");
            System.out.println(b + " max");
        }

        if ( ( (a < b) && (a < c) ) && ( (c > a) && (c > b) ) ){
            System.out.println(a + " min");
            System.out.println(c + " max");
        } else if ( ( (b < c) && (b < a) ) && ( (c > a) && (c > b) ) ) {
            System.out.println(b + " min");
            System.out.println(c + " max");
        }
    }

    public static void errors() throws IOException {
        System.out.println("Input your error:");
        HTTPError error = null;

        switch (br.readLine()){
            case "400" :
                error = HTTPError.BAD_REQUEST;
                break;
            case "401" :
                error = HTTPError.UNAUTHORIZED;
                break;
            case "402" :
                error = HTTPError.PAYMENT_REQUIRED;
                break;
            case "403" :
                error = HTTPError.FORBIDDEN;
                break;
            case "404" :
                error = HTTPError.NOT_FOUND;
                break;
            case "405" :
                error = HTTPError.METHOD_NOT_ALLOWED;
                break;
        }
        System.out.println(error);
    }

    public static void dogs() {

    }
}
