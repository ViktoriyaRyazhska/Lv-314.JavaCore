package com.homework;
import com.t1.NumberOfMonth;
import com.t2.Calculate;
import com.t3.FiveNumbers;
import com.t3.OrganizingNumbers;
import com.t4.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Car[] car = new Car[4];
    public static void main(String[] args) throws IOException {



//        NumberOfMonth.mouth();
//        System.out.println();
//        Calculate.tenNumbers();
//        System.out.println();
//        FiveNumbers.fiveNumbers();
//        System.out.println();
//        OrganizingNumbers.organizingNumbers();
//        System.out.println();
        input(car);
        Car.display(car);
        Car.chooseTheCar(car);
        Car.orderedByYear(car);

    }
     static void input(Car[] car){

         car[0] = new Car("Maserati", 2018, 3.5);
         car[1] = new Car("Ferrari", 2017, 3.4);
         car[2] = new Car("Mercedes", 2016, 3.3);
         car[3] = new Car("Lamborghini", 2015, 3.2);


     }
}
