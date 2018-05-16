package com.homework;

public class Main {

    public static void main(String[] args) {
        Employee person1 = new Employee("Dima", 1f, 4d);
        Employee person2 = new Employee("Vova", 1f, 2d);
        Employee person3 = new Employee("Vika", 1f, 3d);

        person1.setName("Denis");
        person2.setName("Igor");
        person3.setName("Ivan");

        person1.setRate(10);
        person2.setRate(10);
        person3.setRate(10);

        person1.setHours(1);
        person2.setHours(2);
        person3.setHours(3);

        person1.Salary();
        person2.Salary();
        person3.Salary();

        person1.Bonuses();
        person2.Bonuses();
        person3.Bonuses();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        person1.descrSalary();
        person2.descrSalary();
        person3.descrSalary();

        System.out.print("Total salary of them ");
        System.out.printf("%.2f", Employee.getTotalSum());
    }
}
