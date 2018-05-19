package com.homework;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

	    Person person11 = new Person();
	    Person person12 = new Person();
	    Person person13 = new Person();
	    Person person14 = new Person();
	    Person person15 = new Person();

        person11.input();
		System.out.println(person11.output());
		person11.changeName();
        System.out.println(person11);

		person12.input();
		System.out.println(person12.output());
		person12.changeName();
        System.out.println(person12);

        person13.input();
        System.out.println(person13.output());
        person13.changeName();
        System.out.println(person13);

        person14.input();
        System.out.println(person14.output());
        person14.changeName();
        System.out.println(person14);

        person15.input();
        System.out.println(person15.output());
        person15.changeName();
        System.out.println(person15);
    }
}
