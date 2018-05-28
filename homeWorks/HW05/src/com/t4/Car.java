package com.t4;

import java.io.IOException;
import static com.homework.Main.br;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public Car() {}

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public static void display(Car[] car) {
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
    }

    public static void chooseTheCar(Car[] car) throws IOException {
        boolean haveCar = false;

        System.out.println("Input year of car:");
        int year = Integer.parseInt(br.readLine());

        for (int i = 0; i < car.length; i++) {
            if (year == car[i].getYearOfProduction()) {
                System.out.println(car[i]);
                haveCar = true;
            }
        }
        if (haveCar) {
            System.out.println("You are lucky, above the car");
        } else {
            System.out.println("Sorry, we haven't any cars with the year of production");
        }
    }

    public static void orderedByYear(Car[] car) {
        Car x = null;
        for (int i = 0; i < car.length - 1; i++) {
            for (int j = i + 1; j < car.length; j++) {
                if (car[i].getYearOfProduction() < car[j].getYearOfProduction()) {
                    x = car[i];
                    car[i] = car[j];
                    car[j] = x;
                }
            }
        }
        for (Car cars: car) {
            System.out.println(cars.toString());
        }
    }
}
