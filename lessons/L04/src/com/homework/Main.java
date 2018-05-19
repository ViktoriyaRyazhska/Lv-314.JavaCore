package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
//        threeNumbers();
//        dayOfWeek();
//        nameOfContinent();
    }
    public static void threeNumbers() throws IOException {
        System.out.println("Введи три числа");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int addOdd = 0;

        if ( a % 2 == 0) {
            addOdd++;
        }
        if (b % 2 == 0) {
            addOdd++;
        }

        if (c % 2 == 0){
            addOdd++;
        }
        System.out.println(addOdd);
    }
    public static void dayOfWeek() throws IOException {
        System.out.println("Введіть номер дня (цифрою):");
        String week = br.readLine();
        switch (week) {
            case "1" :
                System.out.println("Monday, Понеділок, Понедельник");
                break;
            case "2" :
                System.out.println("Tuesday, Вівторок, Вторник");
                break;
            case "3" :
                System.out.println("Wednesday, Середа, Среда");
                break;
            case "4" :
                System.out.println("Thursday, Четвер, Четверг");
                break;
            case "5" :
                System.out.println("Friday, П`ятниця, Пятница");
                break;
            case "6" :
                System.out.println("Saturday, Субота, Суббота");
                break;
            case "7" :
                System.out.println("Sunday, Неділя, Воскресенье");
                break;
        }
    }

    public static void nameOfContinent() throws IOException {
        Continents continent = null;

        switch(br.readLine()) {
            case "Ukraine" :
            case "China":
                continent = Continents.EURASIA;
                break;

            case "Chad" :
            case "Angola":
                continent = Continents.AFRICA;
                break;

            case "Australia" :
            case "Tonga":
                continent = Continents.AUSTRALIA;
                break;

            case "Canada" :
            case "USA":
                continent = Continents.NORTH_AMERICA;
                break;

            case "Chile" :
            case "Peru":
                continent = Continents.SOUTH_AMERICA;
                break;

            case "Antarctica" :
                continent = Continents.ANTARCTIDA;
                break;

            default:
                System.out.println("This continent does not exist");
                break;
        }
        System.out.println(continent);
    }
}
