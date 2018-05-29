package pt1;

import java.util.Collections;

import static com.homework.Main.myCollection;
import static com.homework.Main.newCollection;

public class t1 {
    public static void myColl() {
        for (int i = 0; i < 10; i++) {
            myCollection.add((int) (Math.random() * 25));
        }
        System.out.println("myCollection" + myCollection);
        newColl();
    }

    private static void newColl() {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("newColl newCollection " + newCollection);
    }

    public static void remove() {
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) >= 20) {
                myCollection.remove(i);
                i--;
            }
        }
        System.out.println("remove myCollection " + myCollection);
    }

    public static void staticNumbers() {
        if (myCollection.size() > 8) {
            myCollection.set(2, 1);
            myCollection.set(8, -3);
            myCollection.set(5, -4);
        } else {
            System.out.println("Error");
        }
        System.out.println("myCollection " + myCollection);
    }

    public static void sort() {
        Collections.sort(myCollection);
        System.out.println(myCollection);
    }
}
