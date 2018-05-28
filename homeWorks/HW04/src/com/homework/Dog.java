package com.homework;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog() {}

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public static int sameName(Dog[] dogs) {
        int idx = 0;

        for (int i = 0; i < dogs.length - 1; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName().equals(dogs[j].getName())) {
                    idx += 1;
                    break;
                }
            }
        }
        return idx;
    }

    public static String checkingOfSameName(int x) {
        if (x == 0) {
            return "You haven't dogs with the same name";
        } else {
            return "We have dogs with the same name";
        }
    }

    public static int oldestDog(Dog[] dogs) {
        int maxQuantity = 0;
        int idx = 0;

        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i].age > maxQuantity){
                maxQuantity = dogs[i].age;
                idx = i;
            }
        }
        return idx;
    }
}
