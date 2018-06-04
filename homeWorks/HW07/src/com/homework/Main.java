package com.homework;

import t1.Parameterized;
import t2.Student;

import java.security.KeyStore;
import java.util.*;

import static t1.Parameterized.*;
import static t2.Student.*;

public class Main {
    public static Set<Integer> set1 = new TreeSet<>();
    public static Set<Integer> set2 = new TreeSet<>();
    public static Set<Set> set3 = new TreeSet<>();
    public static Set<Integer> set4 = new TreeSet<>();
    public static HashMap<String,String> personMap = new HashMap<>();
    public static HashSet<String> names = new HashSet<>();
    public static ArrayList<Student> sdt = new ArrayList<>();


    public static void main(String[] args) {
//        Parameterized.setAdd();
//        System.out.println(set1);
//        System.out.println(set2);
//        System.out.println();
//        union(set1,set2);
//        System.out.println();
//        intersect(set1,set2);

//        input();
//        output();
//        compare();
//        removeOrest();

        inputStudents();
        printStudents(sdt, 2);
    }

    public static void input() {
        personMap.put("Family1", "Orest");
        personMap.put("Family2", "Ivan");
        personMap.put("Family3", "Mykola");
        personMap.put("Family4", "Bohdan");
        personMap.put("Family5", "Orest");
        personMap.put("Family6", "Ivan");
        personMap.put("Family7", "Dmytro");
        personMap.put("Family8", "Ihor");
        personMap.put("Family9", "Orest");
        personMap.put("Family10", "Vlad");
    }

    public static void output() {
        for (Map.Entry<String, String> i: personMap.entrySet()) {
            System.out.println(i.getValue() + " " + i.getKey());
        }
    }

    public static void compare(){
        names.addAll(personMap.values());
        System.out.println(names);
        checkingRepetition();
    }

    public static void checkingRepetition() {
        if (personMap.size() == names.size()) {
            System.out.println("names haven't repetition");
        } else {
            System.out.println("names have repetition");
        }
    }

    public static void removeOrest() {
        String orest = "Orest";
        Iterator i = personMap.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry e = (Map.Entry) i.next();
            if (orest.equals(e.getValue())){
                i.remove();
            }
        }
        System.out.println(personMap);
    }

    public static void inputStudents() {
        sdt.add(new Student("Ivan", 1));
        sdt.add(new Student("Dima", 2));
        sdt.add(new Student("Dina", 3));
        sdt.add(new Student("Zina", 4));
        sdt.add(new Student("Ihor", 5));
    }

}

