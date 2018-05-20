package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        threeNumbers();
        dayOfWeek();
        nameOfContinent();
        product();
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
    public static void product() throws IOException {
        Product[] p = new Product[4];
        p[0] = new Product("Tomat", 10.1, 103);
        p[1] = new Product("Carrot", 20.2, 102);
        p[2] = new Product("Potato", 30.3, 101);
        p[3] = new Product("Garlic", 40.4, 100);

        System.out.println(p[0]);
        System.out.println(p[1]);
        System.out.println(p[2]);
        System.out.println(p[3]);

        System.out.println(p[Product.mostExpensiveItem(p)].getName());
        System.out.println(p[Product.theBiggestQuantity(p)].getName());
    }
}