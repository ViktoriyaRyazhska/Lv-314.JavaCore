package com.homework;

public class Main {

    public static void main(String[] args) {
//	    Person person1 = new Person("Bob", 1990);
//	    Person person2 = new Person("Ira", 1991);
//	    Person person3 = new Person("Sara", 1992);
//	    Person person4 = new Person("Nick", 1993);
//	    Person person5 = new Person("John", 1994);

	    Person person11 = new Person();
	    Person person12 = new Person();
	    Person person13 = new Person();
	    Person person14 = new Person();
	    Person person15 = new Person();

        person11.setName("Carl");
        person11.setBirthYear(1990);
        person11.setYear(2018);
        System.out.println(person11);
        System.out.println(person11.getName() + " " + person11.age() + " years old");

        person12.setName("Jack");
        person12.setBirthYear(1991);
        person12.setYear(2018);
        System.out.println(person12);
        System.out.println(person12.getName() + " " + person12.age() + " years old");

        person13.setName("Frank");
        person13.setBirthYear(1992);
        person13.setYear(2018);
        System.out.println(person13);
        System.out.println(person13.getName() + " " + person13.age() + " years old");

        person14.setName("Will");
        person14.setBirthYear(1993);
        person14.setYear(2018);
        System.out.println(person14);
        System.out.println(person14.getName() + " " + person14.age() + " years old");

        person15.setName("Sara");
        person15.setBirthYear(1994);
        person15.setYear(2018);
        System.out.println(person15);
        System.out.println(person15.getName() + " " + person15.age() + " years old");
}
}
