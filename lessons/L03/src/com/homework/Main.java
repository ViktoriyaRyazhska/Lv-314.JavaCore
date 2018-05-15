package com.homework;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Emploee Dima = new Emploee("Dima", 10f, 10d);
        Emploee Vova = new Emploee("Vova", 10f, 20d);
        Emploee Vika = new Emploee("Vika", 10f, 30d);

        Dima.Salary();
        Vova.Salary();
        Vika.Salary();

        Dima.Bonuses();
        Vova.Bonuses();
        Vika.Bonuses();

        System.out.println(Emploee.getTotalSum());
    }
}
