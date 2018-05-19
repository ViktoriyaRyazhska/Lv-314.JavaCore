package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
//        threeNumbers();
//        dayOfWeek();
        nameOfContinent();
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
        System.out.println("Введіть номер дня (цифрою)");
        String week = br.readLine();
        switch (week) {
            case "1" :
                System.out.println("M, Пон, Пон");
                break;
            case "2" :
                System.out.println("T, Вів, Вто");
                break;
            case "3" :
                System.out.println("W, Сер, Сре");
                break;
            case "4" :
                System.out.println("TH, Чт, Чет");
                break;
            case "5" :
                System.out.println("F, Пя, Пя");
                break;
            case "6" :
                System.out.println("S, Сб, Сб");
                break;
            case "7" :
                System.out.println("Sund, Неділя, Воскресенье");
                break;
        }
    }

    public enum nameOfContinent(){
        System.out.println("Введіть назву країн(Армения/Ботсвана)");
        String countries = br.readLine();
        switch (countries) {
            case "Армения" :
                System.out.println("Азия");
                break;
            case "Ботсвана" :
                System.out.println("T, Вів, Вто");
                break;
            case "3" :
                System.out.println("W, Сер, Сре");
                break;
            case "4" :
                System.out.println("TH, Чт, Чет");
                break;
            case "5" :
                System.out.println("F, Пя, Пя");
                break;
            case "6" :
                System.out.println("S, Сб, Сб");
                break;
            case "7" :
                System.out.println("Sund, Неділя, Воскресенье");
                break;
    }
}
