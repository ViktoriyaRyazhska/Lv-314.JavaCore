package com.homework.t1;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    @Override
    public void feed() {
        System.out.println("Wiskas");
    }
}
