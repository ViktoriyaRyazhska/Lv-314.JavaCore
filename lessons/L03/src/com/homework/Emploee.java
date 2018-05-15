package com.homework;

public class Emploee {
    public static double getTotalSum() {
        return totalSum;
    }

    private static double totalSum;
    private String name;
    private float rate;
    private double hours;

    public Emploee() {};

    public Emploee(String name, float rate) {
        this.name = name;
        this.rate = rate;
    };
    public Emploee(String name, float rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "name= '" + name + '\'' +
                ", rate= " + rate +
                ", hours= " + hours +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public double Salary(){
        return this.rate * this.hours;
    }

    public double Bonuses() {
        totalSum += (Salary() * 0.1) + Salary();
        return totalSum;
    }
}
