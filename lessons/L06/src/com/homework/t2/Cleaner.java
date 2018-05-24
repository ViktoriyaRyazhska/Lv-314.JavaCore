package com.homework.t2;

public class Cleaner extends Staff {
    private final String TYPE_PERSON;

    public Cleaner(String TYPE_PERSON) {
        this.TYPE_PERSON = TYPE_PERSON;
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("I am a Cleaner.");
    }

    @Override
    public void salary() {
        System.out.println(10000);
    }
}
