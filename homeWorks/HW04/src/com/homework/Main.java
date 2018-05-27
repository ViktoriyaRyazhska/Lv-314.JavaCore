package com.homework;

import java.io.IOException;

import static com.homework.Methods.*;


public class Main {

    public static void main(String[] args) throws IOException {
        theRange();
        maxAndMinNumbers();
        errors();
        dogs();
    }

    public static void dogs() throws IOException {
        Dog[] dogs = new Dog[5];

        dogs[0] = new Dog("Rex", Breed.BEAGLE, 1);
        dogs[1] = new Dog("Rich", Breed.PUG, 2);
        dogs[2] = new Dog("Rex", Breed.BOXER, 3);
        dogs[3] = new Dog("Rich", Breed.BOXER, 4);
        dogs[4] = new Dog("Rich", Breed.BOXER, 5);

        System.out.println("We have " + Dog.sameName(dogs) + " pair(s) of dogs");
        System.out.println(dogs[Dog.oldestDog(dogs)].getName());
    }
}
