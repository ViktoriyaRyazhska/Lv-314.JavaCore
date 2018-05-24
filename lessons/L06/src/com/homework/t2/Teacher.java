package com.homework.t2;

public class Teacher extends Staff {
    private final String TYPE_PERSON;

    public Teacher(String type_person) {
        this.TYPE_PERSON = type_person;
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("I am a Teacher.");
    }

    @Override
    public void salary() {
        System.out.println(50000);
    }
}
