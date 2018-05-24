package com.homework.t2;

public class Student extends Person{
    private final String TYPE_PERSON;

    public Student(String TYPE_PERSON) {
        this.TYPE_PERSON = TYPE_PERSON;
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public String toString() {
        return "Student{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("I am a Student.");
    }


}
