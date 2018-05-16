package com.homework;

public class Main {

    public static void main(String[] args) {
        Employee Dima = new Employee("Dima", 1f, 4d);
        Employee Vova = new Employee("Vova", 1f, 2d);
        Employee Vika = new Employee("Vika", 1f, 3d);

        Dima.setRate(10);
        Vova.setRate(10);
        Vika.setRate(10);

        Dima.setHours(1);
        Vova.setHours(2);
        Vika.setHours(3);

        Dima.Salary();
        Vova.Salary();
        Vika.Salary();

        Dima.Bonuses();
        Vova.Bonuses();
        Vika.Bonuses();

        System.out.println(Dima);
        System.out.println(Vova);
        System.out.println(Vika);

        Dima.descrSalary();
        Vova.descrSalary();
        Vika.descrSalary();

        System.out.print("Total salary of them ");
        System.out.printf("%.2f", Employee.getTotalSum());
    }
}
