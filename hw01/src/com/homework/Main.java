package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Perimetr();
        Name();
        Counties();
    }

    public static void Perimetr() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float r = Float.parseFloat(br.readLine());
        System.out.println("Perimetr equals" + " " + 2*3.14*r);
        System.out.println("Area equals" + " " + 3.14*r*r);
    }

    public static void Name() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where are you live, " + name + "?");
        String address = br.readLine();
        System.out.println(name + ", live in " + address);
    }

    public static void Counties() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello, please, write three counties");
        String countyOne = br.readLine();
        String countyTwo = br.readLine();
        String countyThree = br.readLine();
        System.out.println("Please, write price for one minute for countries " + countyOne + ", " + countyTwo + " and " + countyThree + ".");
        float priceOne = Float.parseFloat( br.readLine() );
        float priceTwo = Float.parseFloat( br.readLine() );
        float priceThree = Float.parseFloat( br.readLine() );
        System.out.println("Please, write how long were a conversations in countries " + countyOne + ", " + countyTwo + " and " + countyThree + ".");
        float callOne = Float.parseFloat( br.readLine() );
        float callTwo = Float.parseFloat( br.readLine() );
        float callThree = Float.parseFloat( br.readLine() );
        float costOne = priceOne * callOne;
        float costTwo = priceTwo * callTwo;
        float costThree = priceThree * callThree;
        System.out.println("For " + countyOne + " conversation cost " + costOne);
        System.out.println("For " + countyTwo + " conversation cost " + costTwo);
        System.out.println("For " + countyThree + " conversation cost " + costThree);
    }
}