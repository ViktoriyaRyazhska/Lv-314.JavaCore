package com.homework;

public class Employee {

    private static double totalSum = 0;
    private String name;
    private float rate;
    private double hours;

    public Employee() {};

    public Employee(String name, float rate) {
        this.name = name;
        this.rate = rate;
    };
    Employee(String name, float rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    };

    @Override
    public String toString() {
        return "Employee (" +
                "name= " + name +
                ", rate= " + rate +
                ", hours= " + hours +
                ')';
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    double Salary(){
        totalSum += this.rate * this.hours;
        return this.rate * this.hours;
    }

    double Bonuses() {
        totalSum += this.rate * this.hours * 0.1;
        return this.rate * this.hours * 0.1;
    }

    public void descrSalary(){
        System.out.print("Employee " + this.getName() + " has salary " + this.rate * this.hours + " + has bonuses ");
        System.out.printf("%.2f", this.rate * this.hours * 0.1);
        System.out.println("");
    }
}