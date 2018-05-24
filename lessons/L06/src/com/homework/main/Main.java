package com.homework.main;

import com.homework.t1.Animal;
import com.homework.t1.Cat;
import com.homework.t1.Dog;

import com.homework.t2.*;

public class Main {

    public static void main(String[] args) {
        Animal[] n = new Animal[3];
        n[0] = new Cat();
        n[1] = new Dog();
        n[2] = new Dog();

        for (int i = 0; i < n.length; i++) {
            n[i].feed();
            n[i].voice();
            System.out.println();
        }

        Person[] p = new Person[3];
        p[0] = new Teacher("teacher");
        p[1] = new Student("student");
        p[2] = new Cleaner("cleaner");

        for (int i = 0; i < p.length; i++) {

            if (p[i] instanceof Staff) {
                System.out.println(p[i]);
                ((Staff)p[i]).salary();
                System.out.println();
            }
            System.out.println(p[i]);
        }


    }
}
