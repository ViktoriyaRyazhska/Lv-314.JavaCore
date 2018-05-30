package com.homework;

import t1.*;
import t2.CalculatePay;
import t2.ContractEmployee;
import t2.Employee;
import t2.SalariedEmployee;

public class Main {
    static Bird[] bird = new Bird[4];
    static Employee[] emp = new Employee[4];
    public static void main(String[] args) {
        input(bird);
        output(bird);
        inputEmployee(emp);
        outputEmployee(emp);
    }

    private static void input(Bird[] bird) {
        bird[0] = new Eagle("gray", true, "Eagle");
        bird[1] = new Swallow("white-black", true, "Swallow");
        bird[2] = new Penguin("white-black", true, "Penguin");
        bird[3] = new Chicken("red", true, "Chicken");
    }

    private static void output(Bird[] bird) {
        for (int i = 0; i < bird.length; i++) {
            System.out.println(bird[i].getName() + " - feathers " + bird[i].getFeathers() + ", ley eggs " + bird[i].isLeyEggs() + "and is the bird flying? " + bird[i].fly() );
        }
    }

    private static void inputEmployee(Employee[] emp) {
        emp[0] = new SalariedEmployee(72, "12457", "1025897456");
        emp[1] = new SalariedEmployee(48, "45712", "9745610258");
        emp[2] = new ContractEmployee("1", "9745617801");
        emp[3] = new ContractEmployee("2", "7801974561");
    }

    private static void outputEmployee(Employee[] emp){
        for (Employee i: emp
             ) {
            System.out.println(i.getEmployeeId() + " has salary " + String.format("%.2f", ((CalculatePay)i).calculatePay()));
        }
    }
}
