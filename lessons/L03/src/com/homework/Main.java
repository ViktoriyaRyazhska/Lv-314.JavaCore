package com.homework;

public class Main {

    public static void main(String[] args) {
        Employee Dima = new Employee("Dima", 1f, 4d);
        Employee Vova = new Employee("Vova", 1f, 2d);
        Employee Vika = new Employee("Vika", 1f, 3d);

        Dima.setRate(2);
        Vova.setRate(2);
        Vika.setRate(2);

        Dima.setHours(1);
        Vova.setHours(2);
        Vika.setHours(3);

        Dima.Bonuses();
        Vova.Bonuses();
        Vika.Bonuses();

        System.out.println(Dima);
        System.out.println(Vova);
        System.out.println(Vika);

        System.out.println("Employee " + Dima.getName() + " has selary " + Dima.Salary() + " + has bonuses " + Dima.Salary() * 0.1);
        System.out.println("Employee " + Vova.getName() + " has selary " + Vova.Salary() + " + has bonuses " + Vova.Salary() * 0.1);
        System.out.print("Employee " + Vika.getName() + " has selary " + Vika.Salary() + " + has bonuses ");
        System.out.printf("%.1f",Vika.Salary() * 0.1);
        System.out.println("");

        System.out.println("Total price of them " + Employee.getTotalSum());
    }
}
