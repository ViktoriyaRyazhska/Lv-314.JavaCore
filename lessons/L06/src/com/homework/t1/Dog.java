package com.homework.t1;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Гав");
    }

    @Override
    public void feed() {
        System.out.println("Chappy");
    }
}
