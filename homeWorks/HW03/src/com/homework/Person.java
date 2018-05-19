package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() { }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int age() {
        return LocalDate.now().getYear() - this.birthYear;
    }

    public void input() throws IOException {
        System.out.println("Введіть ваше ім'я:");
        setName(br.readLine());
        System.out.println("Введіть вашу дату народження:");
        setBirthYear( Integer.parseInt( br.readLine() ) );
    }

    public String output() {
        return this.getName() + " is " + this.age() + " years old";
    }

    public void changeName() throws IOException {
        System.out.println("Введіть ваше нове ім'я:");
        setName( br.readLine() );
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
