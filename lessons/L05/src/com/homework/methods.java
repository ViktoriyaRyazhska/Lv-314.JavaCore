package com.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class methods {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int[] arr = {1, 2, 3, 10, -41, -45};
    private static Employee[] emp = new Employee[5];

    public static void arr() {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println(max);
    }

    public static void summ() {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                summ += arr[i];
            }
        }
        System.out.println(summ);
    }

    public static int negotiveQuantity() {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    private static int positivQuantity() {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        System.out.println();
        return count;
    }

    public static void nOrP() {
        int p = positivQuantity();
        int n = negotiveQuantity();
        if (n > p) {
            System.out.println(n);
        } else {
            System.out.println(p);
        }
    }

    public static void employee() throws IOException {

        emp[1] = new Employee("Dima", 1, 1000);
        emp[2] = new Employee("Serg", 1, 2000);
        emp[3] = new Employee("Vika", 2, 6000);
        emp[4] = new Employee("Vova", 2, 4000);
        emp[0] = new Employee("Sam", 3, 5000);

        System.out.println("Input number of department:");
        int number = Integer.parseInt(br.readLine());

        for (Employee i : emp) {
            if (i.getDepartmentNumber() == number){
                System.out.println(i.getName());
            }
        }
        System.out.println();
        sorting();
    }

    private static void sorting() {
        Employee tmp = null;

        for (int i = 0; i < emp.length - 1; i++) {
            for (int j = i + 1; j < emp.length; j++) {
                if (emp[i].getSalary() < emp[j].getSalary()){
                    tmp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = tmp;
                }
            }
        }

        for (Employee e: emp) {
            System.out.println(e.getName());
        }
    }
}
